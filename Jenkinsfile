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

        stage('Generate report') {
                    steps {
                        // Générez le rapport JaCoCo
                        sh 'mvn jacoco:report'
                        // Archiver le rapport comme artefact
                        archiveArtifacts 'target/site/jacoco/index.html'
                    }
                }

        stage('Build Docker image') {
            steps {
                sh 'docker build -t course-repo:latest .'
            }
        }

    }
}
