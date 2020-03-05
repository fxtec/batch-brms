# Exemplo
#### Exemplo de Batch usando um pacote de Spring Boot REST - Mais especificamente o motor BRMS
- [Guia Inicial Explicativo - Spring Boot Batch](https://spring.io/guides/gs/batch-processing/)


#### Instalar BRMS local

```shell script

mvn install:install-file -Dfile=brms-Teste-20200365205522.jar -DgroupId=batch -DartifactId=brms -Dversion=1.0 -Dpackaging=jar
```
```text
mvn install:install-file -Dfile=brms-Teste-20200365205522.jar -DgroupId=batch -DartifactId=brms -Dversion=1.0 -Dpackaging=jar
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< com.example:batch-brms >-----------------------
[INFO] Building batch-brms 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install-file (default-cli) @ batch-brms ---
[INFO] Installing D:\w\batch-brms\brms-Teste-20200365205522.jar to C:\Users\admin\.m2\repository\batch\brms\1.0\brms-1.0.jar
[INFO] Installing C:\Users\admin\AppData\Local\Temp\mvninstall2536833945158225705.pom to C:\Users\admin\.m2\repository\batch\brms\1.0\brms-1.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.134 s
[INFO] Finished at: 2020-03-05T18:29:25-03:00
[INFO] ------------------------------------------------------------------------
```

- Docker: [Spotify Plugin](https://github.com/spotify/docker-maven-plugin)
