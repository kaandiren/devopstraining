pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bash build.sh
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
