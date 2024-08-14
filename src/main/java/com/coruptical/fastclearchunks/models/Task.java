package com.coruptical.fastclearchunks.models;
/*
This class is used to store a player requested task that is to be executed by the
update handler. Whether I can make this eventually asynchronous (in which case it would use more threads)
is not to think about before I finish the barebones of this system.

A task will hold a set of instructions, all including what blocks are to be processed each tick
that the update handler processes blocks. The rate is decided in the config, and all blocks processed
should be processed within a chunk, with a clear identifier, that can be logged

Why are we holding logs? Because if anything goes wrong, we know what blocks have been updated in
what chunk and reversal of blocks can be done. In fact, I'll put it in the to-do for later.
// TODO: Make a log database for undo capacity of requests
 */
public class Task {
    private String id;
    private String requesterUUID;
    private String size;

    // TODO: Create the basic structure for what blocks and chunks in an task will look like.
}
