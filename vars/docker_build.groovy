def call(String DOCKER_IMAGE, String IMAGE_TAG) {
    echo 'Building Docker image...'
    
    sh """
        docker build -t ${DOCKER_IMAGE}:${IMAGE_TAG} .
    """
    
    echo 'Docker image built successfully!'
}
