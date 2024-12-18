pipeline {
    agent any
    environment {
        MAVEN_HOME = '/var/maven_home'  // 根据你的系统配置 Maven 的安装路径
        JAVA_HOME = '/opt/java/openjdk' // 根据你系统的 JDK 路径进行调整
        PATH = "${MAVEN_HOME}/bin:${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('拉取代码') {
            steps {
                echo '开始拉取代码'
                git credentialsId: '1c527984-18ae-458a-b3fd-38c6cc15be4c', url: 'https://github.com/TIANQ123/bootPrj.git'
                echo '拉取成功'
            }
        }
        
        stage('执行构建') {
            steps{
                sh '开始构建'
                sh 'pwd'
                sh 'mvn --version'
                sh 'mvn clean package'
                echo '构建成功'
                echo '进入jar包目录并且启动java服务'
                sh 'cd target && java -jar bootPrj-1.0-SNAPSHOT.jar'
                // echo '启动java服务'
                // bat 'java -jar bootPrj-1.0-SNAPSHOT.jar'
                sh '启动成功'
            }
        }
        
        
    }
}
