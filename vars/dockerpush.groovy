def call(String Project,String ImageTag, String raveruser){
  withCredentials([usernamePassword('credentialsId':"raver666cred",passwordVariable:"raverpass",usernameVariable:"raveruser")]){
  sh "docker login -u ${raveruser} -p ${raverpass}"
  }
  sh "docker push ${raveruser}/${Project}:${ImageTag}"
}
