node {
    stage("say Hello"){
        properties([pipelineTriggers([cron('* * * * *')])])
        sh "echo hello"
    }
}