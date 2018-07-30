#!groovy
pipeline{
    agent any
    stages {
        stage ('Welcome Message') {
            sh 'echo \'Hello!!!\''            
        }
    }
}