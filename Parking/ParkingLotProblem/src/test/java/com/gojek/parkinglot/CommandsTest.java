package com.gojek.parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandsTest {
    Commands commands = new Commands();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commands.commandsMap.isEmpty());
        assertTrue(commands.commandsMap.containsKey("Create_parking_lot"));
        assertFalse(commands.commandsMap.containsKey("mytestcommand"));
    }
}