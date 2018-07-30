#!groovy
pipeline{
    agent any
    stages {
        stage ('Welcome Message') {
            steps {
                sh 'echo \'Hello!!!\''    
            }
        }
    }
}