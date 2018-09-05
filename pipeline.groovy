node{
  stage('Build'){
    echo env.WORKSPACE
  }
  stage('Test'){
    echo env.GIT_BRANCH
  }
  stage('Deploy'){
    echo env.BUILD_NUMBER
  }
}