# sleuth-gh-1630-minimal

Demo project to repro https://github.com/spring-cloud/spring-cloud-sleuth/issues/1630

## Repro steps

The issue is hidden because this change: https://github.com/spring-cloud/spring-cloud-circuitbreaker/commit/285e6fa473ac20636ebb038ea47733e3cec58457 so the first todo is reverting it.

1. `git clone git@github.com:spring-cloud/spring-cloud-circuitbreaker.git`
1. `cd spring-cloud-circuitbreaker`
1. `git checkout 6dee60c`
1. Modify `Resilience4JCircuitBreakerFactory` and make the `getCircuitBreakerRegistry` method package-private (remove `protected`)
1. `./mvnw install -DskipTests -pl spring-cloud-circuitbreaker-resilience4j`

Then in this project, run `./mvnw spring-boot:run`, it should fail with `NullPointerException`, see the [original issue](https://github.com/spring-cloud/spring-cloud-sleuth/issues/1630) for troubleshooting steps.
