node {
    stage("say Hello") {
        properties([parameters([string(defaultValue: 'Levent', description: 'please add your name ', name: 'NAME', trim: true)]), pipelineTriggers([cron('* * * * *')])])
        sh "echo hello${NAME}",
    }
}