pipeline {
	agent any

	stages {
		
		stage('Build maven project') {
			steps {
				echo "building maven project from github"
				dir("jenkinsCucumber") {
					sh "mvn test"
				}
			}
		}

		stage('Deploy to development server') {
			steps {
				echo "deploying to dev server"
			}
		}

		stage('Run cucumber tests') {
			steps {
				echo "running cucumber tests"
			}
		}

		stage('Deploy to production') {
			steps {
				echo "deploying to production server"
			}
		}
	}
}
