pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo '📦 Клонируем проект'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo '🧪 Сборка и тесты Gradle'
                bat 'gradlew.bat clean build'  // ✅ для Windows
            }
        }
    }

    post {
        success {
            echo '✅ Сборка и тесты прошли успешно!'
        }
        failure {
            echo '❌ Ошибка сборки или тестов'
        }
    }
}