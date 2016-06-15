# build project, runs both the assemble and check task
gradle build

# build project complete from scratch
gradle clean build

# speedup second grandle build by holding it in memory
gradle build --daemon
