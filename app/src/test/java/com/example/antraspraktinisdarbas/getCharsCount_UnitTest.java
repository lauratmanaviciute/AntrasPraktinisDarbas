package com.example.antraspraktinisdarbas;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.antraspraktinisdarbas.utils.TextCounter;

public class getCharsCount_UnitTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        String expectedValue = "0";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_NoSpaces_Result_Five() {
        String givenString = "Labas";
        String expectedValue = "5";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_WithSpaces_Result_Twelve() {
        String givenString = "Labas rytas!";
        String expectedValue = "12";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void getCharsCount_NullString_Result_Exception() {
        String givenString = null;
        String actualValue = TextCounter.getCharsCount(givenString);
    }

    @Test
    public void getCharsCount_SpecialCharacters_Result_Six() {
        String givenString = "%$^#&!";
        String expectedValue = "6";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_SpacesOnly_Result_Four() {
        String givenString = "    ";
        String expectedValue = "4";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_QuotationMarks_Result_Five() {
        String givenString = "'''''";
        String expectedValue = "5";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_CharactersUnicode_Result_() {
        String givenString = "Sveikas atvykęs";
        String expectedValue = "15";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
}