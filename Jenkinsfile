pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                mvn install
                
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
