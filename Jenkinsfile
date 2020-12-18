pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                sh 'echo "Checking out the project..."'
                git 'https://github.com/vikash6021/gitjenkinsintegration.git'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Building the project..."'
                sh 'mvn clean install -f springbootdemo/pom.xml'
                
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying the project..."'
                sh 'sudo /var/lib/jenkins/workspace/springbootdemo.sh'
            }
        }
    }
}
