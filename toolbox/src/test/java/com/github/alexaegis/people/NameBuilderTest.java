package com.github.alexaegis.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class NameBuilderTest {

    private NameBuilder nameBuilder;
    private Name name;

    @Before
    public void beforeTest() {
        nameBuilder = new NameBuilder();
    }

    @Test
    public void appTest() {
        assertTrue(true);
    }

    @Test
    public void nameTest() {
        name = nameBuilder.getName();
        assertNotNull(name);
    }

    @Test
    public void nameBuiltTest() throws Throwable {
        String expectedOutput = "Dr. Test";
        name = nameBuilder.addName("Test").addPrefix("Dr.").getName();
        assertEquals("The name isn't equal to what it supposed to be", name.toString(), expectedOutput);
    }

}