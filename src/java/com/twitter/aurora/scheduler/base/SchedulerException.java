package com.twitter.aurora.scheduler.base;

/**
 * Indicates some form of unexpected scheduler exception.
 */
public class SchedulerException extends RuntimeException {
  public SchedulerException(String message) {
    super(message);
  }
  public SchedulerException(String message, Throwable cause) {
    super(message, cause);
  }
  public SchedulerException(Throwable cause) {
    super(cause);
  }
}