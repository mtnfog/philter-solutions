# Filtering Log Messages using Apache Kafka and Philter

This example project uses a log4j2 Apache Kafka appender to publish logs messages to a Kafka topic. The log messages are then consumed from the topic and filtered by Philter.

For more details see the blog post at https://www.mtnfog.com/blog/preventing-logs-from-leaking-pii/.

## Usage

Build the project:

`mvn clean install`

Run the jar:

`java -jar ./target/philter-log-kafka-jar-with-dependencies.jar`

Logs produced during the execution will be published to Kafka. Refer to the `log4j2.xml` file to configure the connection to Kafka and the destination topic.

## License

Licensed under the Apache License, version 2.0.

Copyright 2020 Mountain Fog, Inc. 