package com.animals;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class JSONUtils {
    private JSONUtils(){}

    public static boolean isJSONValid(String jsonInString ) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(jsonInString);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
