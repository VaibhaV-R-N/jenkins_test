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
                script{
                    gv.build()
                }   
            }
        }

        stage("run"){
            when{
                expression{
                    params.name == "vaibhav"
                }
            }
            steps{
                script{
                    gv.run()
                }
            
            }

            
        }
    }

}