/*
 * Copyright Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.confluent.demo.iq;

import java.util.Map;
import java.util.Objects;

/**
 *
 */
public class KeyValueBean<K, V> implements Map.Entry<K, V> {

  private K key;
  private V value;

  public KeyValueBean() {
  }

  public KeyValueBean(final K key, final V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {

    return key;
  }

  public void setKey(final K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  @Override
  public V setValue(V value) {
    return null;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final KeyValueBean that = (KeyValueBean) o;
    return Objects.equals(key, that.key) &&
           Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return "KeyValueBean{" +
           "key='" + key + '\'' +
           ", value=" + value +
           '}';
  }
}
