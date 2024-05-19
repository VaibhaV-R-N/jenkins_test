def buildCode (){

    if(params.name == "vaibhav"){

        echo "Starting build.."

        sh "gcc main.c -o main"

        echo "Build finished"  
    }else{

        echo "build will not run!"

    }

}

def runCode(){

    if(params.runtest){
         echo "Running executable.."

        sh "./main"

        echo "Process ended.."
    }

}

return this