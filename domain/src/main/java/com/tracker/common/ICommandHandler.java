package com.tracker.common;

import com.cloudogu.cb.CommandHandler;

/**
 * Generic interface for handling commands in the workout system.
 * <p>
 * This interface extends the CommandHandler interface and indicates that a class implementing it is responsible
 * for handling a specific type of command and producing a result.
 *
 * @param <R> The type of result produced by the command handler.
 * @param <C> The type of command handled by the command handler.
 */
public interface ICommandHandler<R, C extends ICommand<R>> extends CommandHandler<R, C> {
}
