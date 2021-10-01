pipeline {
	agent any

	tools {
		maven 'Default'
		jdk 'Jdk'
	}

	stages {

		stage('Initialize pipeline') {
			steps {
				sh "chmod +wrx *.sh"
			}
		}

		stage('Build maven project') {
			steps {
				sh "./Build.sh"
			}
		}

		stage('Deploy to development server') {
			steps {
				sh "./DeployDev.sh"
			}
		}

		stage('Run cucumber tests') {
			steps {
				dir("jenkinsCucumber") {
					sh "./UnitTest.sh"
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
