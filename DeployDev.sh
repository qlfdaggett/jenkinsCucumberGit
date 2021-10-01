echo "deploying to dev server"
/usr/local/bin/wget --http-user=admin --http-password=1234 "http://localhost:8081/manager/text/deploy?war=file:/Users/fdaggett/.jenkins/workspace/Jenkins_Cucumber_Pipeline/MavenTest/target/mavenTest.war&path=/dev"
