pipeline {
	agent any

	tools {
		maven 'Default'
		jdk 'Jdk'
	}

	stages {

		stage('Build maven project') {
			steps {
				echo "Checking out from github"
				git branch: 'main', url: 'https://github.com/qlfdaggett/MavenTest.git'
				sh "mvn package"
			}
		}

		stage('Deploy to development server') {
			steps {
				echo "deploying to dev server"
			}
		}

		stage('Run cucumber tests') {
			steps {
				dir("jenkinsCucumber") {
					sh "mvn test"
				}
			}
		}

		stage('Deploy to production') {
			steps {
				echo "deploying to production server"
			}
		}
	}
}
