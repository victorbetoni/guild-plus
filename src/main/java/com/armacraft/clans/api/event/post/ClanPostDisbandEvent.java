package com.armacraft.clans.api.event.post;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Set;

public class ClanPostDisbandEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private Set<Player> affectedPlayers;
    private Player player;

    public ClanPostDisbandEvent(Player player, Set<Player> affectedPlayers) {
        this.player = player;
        this.affectedPlayers = affectedPlayers;
    }

    public Set<Player> getAffectedPlayers() {
        return affectedPlayers;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
