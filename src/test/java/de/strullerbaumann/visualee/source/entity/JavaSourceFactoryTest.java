/*
 * Copyright 2016 Thomas Struller-Baumann.
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
package de.strullerbaumann.visualee.source.entity;

/*
 * #%L
 * visualee
 * %%
 * Copyright (C) 2013 - 2016 Thomas Struller-Baumann
 * %%
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
 * #L%
 */

import de.strullerbaumann.visualee.filter.boundary.FilterContainer;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thomas Struller-Baumann <thomas at struller-baumann.de>
 */
public class JavaSourceFactoryTest {

   public JavaSourceFactoryTest() {
   }

   @BeforeClass
   public static void setUpClass() {
      FilterContainer.getInstance().clear();
   }

   @AfterClass
   public static void tearDownClass() {
   }

   @Before
   public void setUp() {
   }

   @After
   public void tearDown() {
   }

   @Test
   public void testGetInstance() {
      assertEquals(JavaSourceFactory.class, JavaSourceFactory.getInstance().getClass());
   }

   @Test
   public void testNewJavaSource() {
      String javaSourceName = "MyTestJavaSource";

      JavaSource javaSource = JavaSourceFactory.getInstance().newJavaSource(javaSourceName);
      assertNotNull(javaSource);
      assertEquals(javaSourceName, javaSource.getName());
   }

   @Test
   public void testNewJavaSourceByPath() {
      String testFilename = "MyTestJavaSource";

      JavaSource javaSource = JavaSourceFactory.getInstance().newJavaSource(testFilename);
      assertNotNull(javaSource);
      assertEquals(testFilename, javaSource.getName());
   }

}
