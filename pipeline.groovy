node{
    withCredentials([
		usernamePassword(
			credentialsId: '577e0c22-1f30-4ab0-b4f6-e65bd69fdd17',
			usernameVariable: "GIT_USER",
			passwordVariable: "GIT_PASSWORD"
    )}{
		stage('RETRIEVE'){
			println env.GIT_USER
			println env.GIT_PASSWORD
		}
	}
}