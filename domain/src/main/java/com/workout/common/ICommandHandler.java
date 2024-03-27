package com.workout.common;

import com.cloudogu.cb.CommandHandler;

public interface ICommandHandler<R, C extends ICommand<R>> extends CommandHandler<R, C> {
}
