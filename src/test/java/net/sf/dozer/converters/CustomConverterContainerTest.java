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
package net.sf.dozer.converters;

import java.util.ArrayList;
import java.util.List;

import net.sf.dozer.AbstractDozerTest;

/**
 * @author tierney.matt
 */
public class CustomConverterContainerTest extends AbstractDozerTest {

  public void testSetConverters() throws Exception {
    CustomConverterContainer ccc = new CustomConverterContainer();
    List list = new ArrayList();
    list.add("someconverter");

    ccc.setConverters(list);

    assertNotNull(ccc.getConverters());
    assertTrue(ccc.getConverters().size() == list.size());
    assertEquals(ccc.getConverters().get(0), list.get(0));
  }

}
