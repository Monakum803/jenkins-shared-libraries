def call(String url, String branch){
   echo 'The code is cloning stage'
   git url: "${url}",branch:"${branch}"
   echo "The code has been successfully cloned
}
