def call(String credId, String DOCKER_IMAGE,String IMAGE_TAG)
{
  echo 'Pushing Docker image...'
  withDockerRegistry([credentialsId: ${credId}, url: '']) {
  sh 'docker push ${DOCKER_IMAGE}:${IMAGE_TAG}'
  }
  echo 'Docker image pushed successfully!'
}
