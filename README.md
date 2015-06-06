## JSON Benchmark

For a small json payload, [Jackson](https://github.com/FasterXML/jackson) is the winner for this test.

```
timeAWSFromJson     21,685 (bytes)   17.0 (ms)   510 (objects)
timeGsonFromJson    11,648 (bytes)   40.8 (ms)   510 (objects)
timeJacksonFromJson  3,964 (bytes)    7.4 (ms)   140 (objects)

timeAWSToJson       18,901 (bytes)   25.4 (ms)   570 (objects)
timeGsonToJson      10,922 (bytes)   12.6 (ms)   170 (objects)
timeJacksonToJson   18,101 (bytes)   10.8 (ms)   280 (objects)
```

Or take a look at [someone else's results](http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/).
