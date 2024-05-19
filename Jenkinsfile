pipeline{

    agent{
        label testnode
    }

    stages{
        
        stage("build"){

            echo "Starting build.."

            sh "gcc main.c -o main"

            echo "Build finished"
        }

        stage("run"){

            echo "Running executable.."

            sh "./main"

            echo "Process ended.."
        }
    }

}