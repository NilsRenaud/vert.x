/*
 * Copyright (c) 2011-2019 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */

package io.vertx.core.json.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vertx.core.json.Json;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class DatabindCodec {

  @SuppressWarnings("deprecation")
  public static ObjectMapper mapper() {
    return Json.mapper;
  }

  @SuppressWarnings("deprecation")
  public static ObjectMapper prettyMapper() {
    return Json.prettyMapper;
  }
}