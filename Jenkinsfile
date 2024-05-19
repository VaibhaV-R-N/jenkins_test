pipeline{

    agent{
        label testnode
    }

    stages{
        
        stage("build"){

            steps{
                echo "Starting build.."

                sh "gcc main.c -o main"

                echo "Build finished"   
            }
        }

        stage("run"){

            steps{
                echo "Running executable.."

                sh "./main"

                echo "Process ended.."
            }

            
        }
    }

}