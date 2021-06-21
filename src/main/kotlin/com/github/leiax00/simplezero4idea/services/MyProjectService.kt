package com.github.leiax00.simplezero4idea.services

import com.github.leiax00.simplezero4idea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
