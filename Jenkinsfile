pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo '📦 Клонируем репозиторий'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo '🧪 Собираем проект и запускаем тесты'
                sh './mvnw clean verify'
            }
        }
    }

    post {
        success {
            echo '✅ Успешно: проект собирается и тесты проходят'
        }
        failure {
            echo '❌ Ошибка: проверьте сборку или тесты'
        }
    }
}