pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                mvn build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
