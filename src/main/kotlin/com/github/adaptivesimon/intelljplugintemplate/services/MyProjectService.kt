package com.github.adaptivesimon.intelljplugintemplate.services

import com.github.adaptivesimon.intelljplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
