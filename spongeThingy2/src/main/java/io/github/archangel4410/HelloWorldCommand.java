package io.github.archangel4410;

import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.extent.Extent;

import java.util.Optional;
import java.util.Random;

/**
 * Created by usstudent on 10/10/15.
 */
public class HelloWorldCommand implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        src.sendMessage(Texts.of("Hello Minecraft"));
        if(src instanceof Player) {
            Player player = (Player) src;
            Random r = new Random();
            int x = r.nextInt(2000) - 1000;
            int y = r.nextInt(128);
            int z = r.nextInt(2000) - 1000;
            player.setLocationSafely(new Location<World>(player.getLocation().getExtent(), x,y,z));
            src.sendMessage(Texts.of("Mwa-ha-ha-ha"));
            Location location = player.getLocation().getRelative(Direction.DOWN);
            location.setBlockType(BlockTypes.PUMPKIN);
            src.sendMessage(Texts.of("It's midnight, so the magic carriage turned into a pumpkin."));
        }
        return null;
    }
}
