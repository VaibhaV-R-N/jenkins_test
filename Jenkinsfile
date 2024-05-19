pipeline{

    agent any
    parameters{
        choice(name:"version",choices:["1","3","2"],description:"version to build")
        String(name:"name")
        booleanParam(name:"run test",default:false,description:"run test")
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