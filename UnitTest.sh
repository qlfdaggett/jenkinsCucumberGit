echo "running cucumber test suite"
exit 1
cd jenkinsCucumber
dmvn test || exit 0
cd ..
