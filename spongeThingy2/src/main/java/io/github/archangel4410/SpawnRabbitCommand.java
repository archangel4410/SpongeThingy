package io.github.archangel4410;

import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;
import org.spongepowered.api.world.extent.Extent;

import java.util.Optional;

/**
 * Created by usstudent on 10/10/15.
 */
public class SpawnRabbitCommand implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        if(src instanceof Player) {
            Player player = (Player) src;
            Extent extent = player.getLocation().getExtent();
            // We need to create the entity
            Optional<Entity> optional = extent.createEntity(EntityTypes.RABBIT,
                    player.getLocation().getPosition());
            if (optional.isPresent()) {
                extent.spawnEntity(optional.get(), Cause.of(player));
            }
            src.sendMessage(Texts.of("Enjoy your rabbit, but have the holy hand grenade prepared just in case."));
        }
            return null;

    }
}
