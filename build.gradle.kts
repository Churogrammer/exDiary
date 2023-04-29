
plugins {
    java
    id("org.springframework.boot") version "2.7.10"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.duniv"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2021.0.6"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //implementation("org.springframework.cloud:spring-cloud-starter-openfeign")

    // swagger
    implementation("org.springdoc:springdoc-openapi-ui:1.6.15")


    //implementation("com.querydsl:querydsl-jpa:4.4.0")
   // annotationProcessor("com.querydsl", "querydsl-apt", queryDslVersion, classifier = "jpa")
    //// https://mvnrepository.com/artifact/com.querydsl/querydsl-apt
    //annotationProcessor("com.querydsl:querydsl-apt:4.4.0:jpa")
    // https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api

    implementation("com.querydsl:querydsl-jpa:5.0.0")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0:jpa") //querydsl



    // Junit
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.assertj:assertj-core:3.24.2")

    compileOnly("org.projectlombok:lombok")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("com.mysql:mysql-connector-j")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")


}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
