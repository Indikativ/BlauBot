package net.axay.blaubot.commands.implementation

import dev.kord.common.annotation.KordPreview
import dev.kord.core.behavior.interaction.followUp
import dev.kord.core.entity.interaction.Interaction
import dev.kord.core.entity.interaction.InteractionCommand
import net.axay.blaubot.commands.api.SlashCommand

@KordPreview
object Indikativ : SlashCommand(
    "Indikativ",
    "Shows Indikativ to you"
) {
    override suspend fun execute(interaction: Interaction, command: InteractionCommand) {
        interaction.ackowledgePublic().followUp {
            embed {
                title = "Indikativ"
                image = "https://cdn.akamai.steamstatic.com/steamcommunity/public/images/avatars/17/172158b785c92a49a4bb6b7443f554f4eae737e8_full.jpg"
                description = "A person that is right here in this discord. You can say hello if you want."
            }
        }
    }
}
