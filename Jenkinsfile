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
				echo "deploying to dev server"
				sh "wget --http-user=admin --http-password=1234 \"http://localhost:8081/manager/text/deploy?war=file:mavenTest.war&path=/app\""
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
