# Self-contained Spark application

Note that you can't just `sbt run` this example.

Build it with: 

```bash
sbt package
```

Then submit it to a Spark cluster with:

```bash
spark-submit --class "SparkApp" \
--master local[4] \
target/scala-2.11/spark-template_2.11-0.1.jar
```

This works fine here, since the application has no third-party dependencies. If it did, you would need to build and submit an assembly JAR.


