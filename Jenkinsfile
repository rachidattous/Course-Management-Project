pipeline {
    agent any

    stages {

        stage('Checkout') {
                steps {
                    checkout scm
                }
        }

        stage('Test Spring boot project') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Jar') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }




        stage('Build Docker image') {
            steps {
                script {
                    sh 'docker build -t course-repo:latest .'
                }
            }
        }

    }
}
