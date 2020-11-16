package main.stream;

import javax.security.auth.login.AppConfigurationEntry;
import org.apache.kafka.common.serialization.Serdes.StringSerde;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;

public class KafkaStreamsExample {
  StreamsBuilder builder = new StreamsBuilder();
  KStream<String, String> ks=builder.stream(AppConfig.TopicName,Consumed.with(StringSerde.class, StringSerde.class));
  
  Topology topology=builder.build();
}
