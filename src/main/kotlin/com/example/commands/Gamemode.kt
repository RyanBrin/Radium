package com.example.commands
import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextColor
import org.bukkit.GameMode
import org.bukkit.entity.Player

object Gamemode : BaseCommand() {

    @CommandAlias("gms")
    @CommandPermission("radium.gamemode.gms")
    fun gms(sender: Player) {
        sender.gameMode = GameMode.SURVIVAL
        sender.sendMessage(Component.text("Your game mode has been updated to Survival Mode")
            .color(TextColor.fromHexString("#0aaaff")))
    }

    @CommandAlias("gma")
    @CommandPermission("radium.gamemode.gma")
    fun gma(sender: Player) {
        sender.gameMode = GameMode.ADVENTURE
        sender.sendMessage(Component.text("Your game mode has been updated to Adventure Mode")
            .color(TextColor.fromHexString("#0aaaff")))
    }

    @CommandAlias("gmc")
    @CommandPermission("radium.gamemode.gmc")
    fun gmc(sender: Player) {
        sender.gameMode = GameMode.CREATIVE
        sender.sendMessage(Component.text("Your game mode has been updated to Creative Mode")
            .color(TextColor.fromHexString("#0aaaff")))
    }

    @CommandAlias("gmsp")
    @CommandPermission("radium.gamemode.gmsp")
    fun gmsp(sender: Player ) {
        sender.gameMode = GameMode.SPECTATOR
        sender.sendMessage(Component.text("Your game mode has been updated to Spectator Mode")
            .color(TextColor.fromHexString("#0aaaff")))
    }
}