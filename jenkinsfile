pipeline {
    agent any
    tools {
        maven "Maven"
    }

    stages {
        stage('clean project') {
            steps {
                git 'https://github.com/trainfrombasics/JenkinsProject.git'
                sh 'pwd'
                sh "mvn -Dmaven.test.failure.ignore=true clean test"
            }
        }
        stage('report generation') {
          steps{
             junit 'target/surefire-reports/*.xml'
        }
        
        
    }
}

post {
    success{
        echo 'it will execute only when build is success'
    }
    unstable{
        echo 'it will execute only when build is unstable'
    }
    always {
       echo 'sending email........'
       emailext body: '$DEFAULT_CONTENT', subject: '$DEFAULT_SUBJECT', to: 'trainfrombasics@gmail.com'
    }
}

}
