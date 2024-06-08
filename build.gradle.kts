plugins {
    kotlin("jvm") version "1.9.23"
}

allprojects{
    apply(plugin = "kotlin")
    apply(plugin = "java")

    group = "com.big.data"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenLocal()
        maven{setUrl("https://mirrors.huaweicloud.com/repository/maven/")}
        mavenCentral()
        google()
    }

    dependencies {
        //  Apache Spark 库
        implementation("org.apache.spark:spark-sql_2.13:3.3.2")
        implementation("org.apache.spark:spark-core_2.13:3.3.2")
        //  Apache 数学 库
        implementation("org.apache.commons:commons-math3:3.6.1")
        // testImplementation(platform("org.junit:junit-bom:5.10.0"))
        // testImplementation("org.junit.jupiter:junit-jupiter")
        // testImplementation(kotlin("test"))
    }

//    tasks.test {
//        useJUnitPlatform()
//    }
    kotlin {
        jvmToolchain(21)
    }
}



