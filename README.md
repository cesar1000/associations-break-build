# Associations cause build failures downstream

This is a repro for an issue where defining an association with a feature variant causes build failures in Android modules downstream when consuming the dependency with kapt.

Just run this command line to repro:

```
./gradlew :consumer:test
```

The build fails with:

```
Execution failed for task ':consumer:kaptGenerateStubsDebugKotlin'.
> Could not resolve all files for configuration ':consumer:kapt'.
   > No variants of common match the consumer attributes:
       - common:
           - Incompatible because this component declares a component, as well as attribute 'artifactType' with value '' and the consumer needed a component, as well as attribute 'artifactType' with value 'processed-jar'
           - Other compatible attribute:
               - Doesn't say anything about its usage (required a runtime)
   > No variants of common match the consumer attributes:
       - common:
           - Incompatible because this component declares a component, as well as attribute 'artifactType' with value '' and the consumer needed a component, as well as attribute 'artifactType' with value 'processed-jar'
           - Other compatible attribute:
               - Doesn't say anything about its usage (required a runtime)
   > No variants of common match the consumer attributes:
       - common:
           - Incompatible because this component declares a component, as well as attribute 'artifactType' with value '' and the consumer needed a component, as well as attribute 'artifactType' with value 'processed-jar'
           - Other compatible attribute:
               - Doesn't say anything about its usage (required a runtime)
```
