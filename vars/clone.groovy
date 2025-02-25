def call(String url, String branch ,String cred_id)
{
  echo 'This is the stage to clone the SCM repo from shared lib'

  git branch: "${branch}", 
  credentialsId: "${cred_id}",  // Ensure this credential ID exists in Jenkins
  url: "${url}"
  echo 'This is the stage to clone the SCM repo from shared lib'
}    
