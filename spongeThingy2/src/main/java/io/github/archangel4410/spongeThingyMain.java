package io.github.archangel4410;

import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.util.command.spec.CommandSpec;

/**
 * Created by usstudent on 10/10/15.
 */
@Plugin(id = "spongeThingy", name"Sponge Thingy", version ="1.0")
public class spongeThingyMain {
    @Inject
    private Game game;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        CommandSpec myCommandSpec =CommandSpec.builder()

    }
}