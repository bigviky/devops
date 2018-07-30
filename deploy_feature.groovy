#!groovy
pipeline{
    stages {
        stage ('Welcome Message') {
            sh 'echo \'Hello!!!\''            
        }
    }
}