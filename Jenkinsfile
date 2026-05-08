pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean install'
                echo 'build success'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
                echo'test success'
            }
        }
        stage('Deploy'){
            steps{
             echo 'deploy successsed'
            }
        }
    }
}
