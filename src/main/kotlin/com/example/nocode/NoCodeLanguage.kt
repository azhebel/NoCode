package com.example.nocode

import com.intellij.lang.Language

class NoCodeLanguage : Language("NoCode") {
//    val INSTANCE: NoCodeLanguage = NoCodeLanguage()

    companion object {
        val INSTANCE: NoCodeLanguage = NoCodeLanguage()
    }

}

/*
object NoCodeLanguage : Language("No Code") {
    val INSTANCE: NoCodeLanguage = NoCodeLanguage
}
*/
