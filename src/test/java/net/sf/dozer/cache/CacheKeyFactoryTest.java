/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.dozer.cache;

import net.sf.dozer.AbstractDozerTest;

/**
 * @author tierney.matt
 */
public class CacheKeyFactoryTest extends AbstractDozerTest {

  public void testCreateKey() throws Exception {
    Object cacheKey = CacheKeyFactory.createKey(String.class, Long.class);
    Object cacheKey2 = CacheKeyFactory.createKey(String.class, Long.class);

    assertEquals("cache keys should have been equal", cacheKey, cacheKey2);
    assertEquals("cache key hash codes should have been equal", cacheKey.hashCode(), cacheKey2.hashCode());
  }

  public void testCreateKey_Reverse() throws Exception {
    Object cacheKey = CacheKeyFactory.createKey(String.class, Long.class);
    Object cacheKey2 = CacheKeyFactory.createKey(Long.class, String.class);

    assertFalse(cacheKey.equals(cacheKey2));
    assertFalse(cacheKey2.equals(cacheKey));
    assertFalse(cacheKey.hashCode() == cacheKey2.hashCode());
  }

}
