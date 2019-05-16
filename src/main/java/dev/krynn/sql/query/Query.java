/*
 * Copyright (c) 2019 Oskarr1239
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

package dev.krynn.sql.query;

public class Query {

    public static final String CREATE_DATABASE = "CREATE DATABASE IF NOT EXISTS %s";

    public static final String CREATE_OR_UPDATE = "INSERT INTO %s (%s) VALUES(%s) ON DUPLICATE KEY UPDATE %s;";

    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS %s (%s)";

    public static final String SELECT_OBJECT = "SELECT * FROM %s WHERE %s = ?";

    public static final String DELETE_OBJECT = "DELETE FROM %s WHERE %s = ?";
}
