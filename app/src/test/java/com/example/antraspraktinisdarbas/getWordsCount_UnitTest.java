package com.example.antraspraktinisdarbas;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.antraspraktinisdarbas.utils.TextCounter;

public class getWordsCount_UnitTest {
    @Test
    public void getWordsCount_EmptyString_Result_Zero() {
        String givenString = "";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_NoSpaces_Result_One() {
        String givenString = "Labas";
        String expectedValue = "1";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_WithSpaces_Result_Three() {
        String givenString = "Labas rytas, pasauli!";
        String expectedValue = "3";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_MultipleSpacesBetweenWords_Result_Three() {
        String givenString = "Labas   rytas,    pasauli!";
        String expectedValue = "3";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_SpecialCharacters_Result_Two() {
        String givenString = "%$^#&! dgs";
        String expectedValue = "2";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_SpacesOnly_Result_Zero() {
        String givenString = "    ";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void getWordsCount_NullString_Result_Exception() {
        String givenString = null;
        String actualValue = TextCounter.getWordsCount(givenString);
    }
    @Test
    public void getWordsCount_TrailingSpaces_Result_Two() {
        String givenString = "   Labas rytas!   ";
        String expectedValue = "2";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_QuotationMarks_Result_One() {
        String givenString = "'''''";
        String expectedValue = "1";
        String actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
}