package com.example.commands
import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import org.bukkit.GameMode
import org.bukkit.entity.Player

object Gamemode : BaseCommand() {

    @CommandAlias("gms")
    @CommandPermission("radium.gamemode.gms")
    fun gms(player: Player) {
        player.gameMode = GameMode.SURVIVAL
    }

    @CommandAlias("gma")
    @CommandPermission("radium.gamemode.gma")
    fun gma(player: Player) {
        player.gameMode = GameMode.ADVENTURE
    }

    @CommandAlias("gmc")
    @CommandPermission("radium.gamemode.gmc")
    fun gmc(player: Player) {
        player.gameMode = GameMode.CREATIVE
    }

    @CommandAlias("gmsp")
    @CommandPermission("radium.gamemode.gmsp")
    fun gmsp(player: Player) {
        player.gameMode = GameMode.SPECTATOR
    }
}