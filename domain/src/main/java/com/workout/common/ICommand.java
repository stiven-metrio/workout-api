package com.workout.common;

import com.cloudogu.cb.Command;

/**
 * Marker interface for commands in the tracker system.
 * <p>
 * This interface extends the Command interface and indicates that a class implementing it represents a command
 * that can be executed to perform some action in the system.
 *
 * @param <R> The type of result returned by the command when executed.
 */
public interface ICommand<R> extends Command<R> {
}
