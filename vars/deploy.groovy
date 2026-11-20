def call() {
    sh '''
        docker compose pull django_app
        docker compose up -d --no-build
    '''
}
