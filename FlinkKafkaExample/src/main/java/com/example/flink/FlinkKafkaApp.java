package com.example.flink;

import com.example.flink.avro.UserInfo;
import com.example.flink.seredes.AvroDeserializationSchema;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.TypeInformationSerializationSchema;
import org.apache.flink.core.fs.Path;
import org.apache.flink.formats.avro.AvroRowDeserializationSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer011;

import java.io.File;
import java.util.Properties;

public class FlinkKafkaApp {


    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        Properties kafkaProperties = new Properties();
        kafkaProperties.put("bootstrap.servers", "localhost:9092");
        kafkaProperties.put("group.id", "test");




        File in=new File(".src/main/avro/UserInfo.avsc");

        Path path = new Path( in.getAbsoluteFile().toURI());

//        TypeInformationSerializationSchema schema= new TypeInformationSerializationSchema()

        AvroDeserializationSchema<UserInfo> schema = new AvroDeserializationSchema<UserInfo>(UserInfo.class);

        FlinkKafkaConsumer011<UserInfo> consumer = new FlinkKafkaConsumer011<UserInfo>("flink-topic-int", schema, kafkaProperties);




        DataStreamSource<UserInfo> userStream = env.addSource(consumer);

        userStream.map(new MapFunction<UserInfo, UserInfo>() {

            @Override
            public UserInfo map(UserInfo userInfo) {
                return userInfo;
            }
        }).print();




        env.execute("Test Kafka");



    }
}
