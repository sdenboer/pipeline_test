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
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'curl -o  https://energy-reader.s3.eu-north-1.amazonaws.com/energy_reader && chmod +x energy_reader && ./energy_reader'
                sh 'mvn clean install'
            }
        }
    }
}