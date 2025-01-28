def call(String ProjectName,String ImageTag,String Hubuser){
  sh "docker build -t ${Hubuser}/${ProjectName}:${ImageTag} ."
}
