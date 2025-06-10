pipeline {
    agent any

environment {
    DOCKER_HOST = 'tcp://localhost:2375'
}
    tools {
        jdk 'jdk-21'  // Имя JDK из Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo '🧪 Сборка и тесты'
                bat 'gradlew.bat clean build'
            }
        }
    }

    post {
        success {
            echo '✅ Всё прошло успешно!'
        }
        failure {
            echo '❌ Ошибка при сборке'
        }
    }
}