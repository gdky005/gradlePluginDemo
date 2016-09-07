package wq.gdky005

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by WangQing on 16/9/7.
 */
class Test implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task('testTask') << {
            println "Hello gradle plugin"
        }
    }
}
