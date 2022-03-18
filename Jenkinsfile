pipeline {

    agent any

    options { disableConcurrentBuilds() }

    stages {
            stage('Clean Up') {
              steps {
                echo 'Cleaning up...'
                cleanWs()
                }
            }

            stage('Clone Repository') {
                  steps {
                    echo 'Checking out the latest code from Github'
                    checkout scm
                  }
            }

            stage('Compile') {
                steps {
                    echo 'Compiling ...'
                    sh './gradlew compileJava'
                }
            }

            stage('Unit Tests') {
                steps {
                    echo 'Unit testing. ..'
                    sh './gradlew test'
                }
            }

            stage('Package') {
                steps {
                    echo 'Building ...'
                    sh './gradlew build'
                }
            }

            stage('Sonar Qube / Static QA') {

                steps {
                    echo 'Code Analysis ... TODO'
                }
            }

            stage("Approve") {

                steps {
                    echo 'Waiting for approval...'
                    snDevOpsChange()
                    echo 'Approval accepted...'
                }
            }

            stage("Target Deploy") {

                steps {
                    echo 'Target Deploy...'
                }
            }
        }
}