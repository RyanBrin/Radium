package com.example.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import org.bukkit.ChatColor
import org.bukkit.entity.Player

object Fly : BaseCommand() {

    @CommandAlias("fly")
    @CommandPermission("radium.fly")
    fun execute(player: Player) {
        player.allowFlight = true
        player.isFlying = !player.isFlying
        if (player.isFlying) {
            player.sendActionBar(ChatColor.GREEN.toString() + "You are now flying")
        }
        else {
            player.sendActionBar(ChatColor.RED.toString() + "You are no longer flying")
        }

    }
}