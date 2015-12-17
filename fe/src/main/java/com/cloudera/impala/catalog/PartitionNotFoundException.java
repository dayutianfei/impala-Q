// Copyright 2012 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.impala.catalog;


/**
 * Thrown when a partition cannot be found in the catalog.
 */
public class PartitionNotFoundException extends CatalogException {
  // Dummy serial UID to avoid Eclipse warnings
  private static final long serialVersionUID = -2203080667446640542L;

  public PartitionNotFoundException(String s) { super(s); }

  public PartitionNotFoundException(String s, Exception cause) { super(s, cause); }
}