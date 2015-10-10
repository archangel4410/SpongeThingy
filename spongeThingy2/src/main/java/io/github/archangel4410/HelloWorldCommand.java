package io.github.archangel4410;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

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
            int y = r.nextInt(128) - 64;
            int z = r.nextInt(2000) - 1000;
            player.setLocationSafely(new Location<World>(player.getLocation().getExtent(), x,y,z));
            src.sendMessage(Texts.of("Mwa-ha-ha-ha"));
        }
        return null;
    }
}
