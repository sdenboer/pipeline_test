pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk17'
    }

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo ${env.STAGE_NAME} ${env.JOB_NAME}"
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'java -version'
                sh 'echo $JAVA_HOME'
                sh 'echo $PATH'
                sh 'which java'
                sh 'mvn clean install'
            }
        }
    }
}