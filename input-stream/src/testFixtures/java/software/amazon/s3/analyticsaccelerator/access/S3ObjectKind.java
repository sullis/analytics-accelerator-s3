/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.amazon.s3.analyticsaccelerator.access;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** S3 Object kind */
@AllArgsConstructor
@Getter
public enum S3ObjectKind {
  RANDOM_SEQUENTIAL("sequential"),
  RANDOM_PARQUET("parquet"),
  RANDOM_SEQUENTIAL_ENCRYPTED("sequential_encrypted"),
  RANDOM_PARQUET_ENCRYPTED("parquet_encrypted");

  private final String value;
}
