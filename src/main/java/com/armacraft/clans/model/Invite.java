package com.armacraft.clans.model;

import org.bukkit.scheduler.BukkitTask;

import java.util.UUID;

public interface Invite {
    void start();

    BukkitTask getTask();

    UUID getInvited();

    Clan getInviter();
}
