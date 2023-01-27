package com.example.nocode.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon


class NoCodeColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon {
        return NoCodeIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return NoCodeSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """Code in a No Code file is bad."""
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "NoCode"
    }

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Code", NoCodeSyntaxHighlighter.BAD_CHARACTER)
        )
    }
}