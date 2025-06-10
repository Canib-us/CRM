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
                echo '🧪 Сборка и тесты'
                bat 'mvnw.cmd clean verify'  // ← ✅ фикс
            }
        }
    }

    post {
        success {
            echo '✅ Всё прошло успешно!'
        }
        failure {
            echo '❌ Ошибка: проверьте тесты или сборку'
        }
    }
}