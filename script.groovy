def build (){

    if(params.name == "vaibhav"){

        echo "Starting build.."

        sh "gcc main.c -o main"

        echo "Build finished"  
    }else{

        echo "build will not run!"

    }

}

def run(){

    if(params.runtest){
         echo "Running executable.."

        sh "./main"

        echo "Process ended.."
    }

}

return this