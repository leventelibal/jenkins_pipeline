node {
    stage("say Hello"){
        properties([pipelineTriggers([cron('* * * * *')])])
        sh "echo hello${NAME}",
        sh "do somathingelse"
    }
}