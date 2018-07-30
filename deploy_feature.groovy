#!groovy
pipeline{
    agent any
    stages {
        stage ('Welcome Message') {
            steps {
                echo 'Hello Feature!'
            }
        }
    }
}