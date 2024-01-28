pipeline {
    agent any

    stages {

        stage('Test Spring boot project') {
            steps {
                sh 'ls'
            }
        }
        stage('Build Jar') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker image') {
            steps {
                sh 'docker build -t course-repo:latest .'
            }
        }

    }
}
