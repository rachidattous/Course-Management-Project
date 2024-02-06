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
                    sh 'docker build -t rachidattous/course-repo:0.1 .'

                    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable:'PASS')]){

                        sh 'echo $PASS | docker login -u $USER --password-stdin'

                        sh 'docker push rachidattous/course-repo:0.1'
                    }
                }
            }
        }

    }
}
