/*
 * Copyright 2014 The Board of Trustees of The Leland Stanford Junior University.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.susom.database;

/**
 * Interface for executing a chunk of DDL within the database.
 *
 * @author garricko
 */
public interface Ddl {
  /**
   * Execute the DDL statement. All checked SQLExceptions get wrapped in DatabaseExceptions.
   */
  void execute();

  /**
   * This just does an execute() call and silently discards any DatabaseException
   * that might occur. This can be useful for things like drop statements, where
   * some databases don't make it easy to conditionally drop things only if they
   * exist.
   */
  void executeQuietly();
}
