package com.example

import co.aikar.commands.PaperCommandManager
import com.example.commands.*
import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin : JavaPlugin() {

    companion object{
        lateinit var instance: ExamplePlugin
    }

    override fun onEnable() {
        instance = this

        val cmdManager = PaperCommandManager(this)
        cmdManager.registerCommand(Fly)
        cmdManager.registerCommand(Gamemode)
    }

    override fun onDisable() {

    }
}