def call{
	withSonarQubeEnv('Soanr-server-7.8'){
		sh "mvn soanr:soanr"
	}
}