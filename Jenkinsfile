def gv

pipeline{

    agent any
    parameters{
        choice(name:"version",choices:["1","3","2"],description:"version to build")
        string(name:"name")
        booleanParam(name:"runtest",defaultValue:false,description:"run test")
    }
    stages{
        stage("init"){

            steps{
                script{
                    gv = load "script.groovy" 
                }
                  

            }

        }
        stage("build"){

            steps{
                scrip{
                    gv.build()
                }   
            }
        }

        stage("run"){

            steps{
               gv.run()
            }

            
        }
    }

}