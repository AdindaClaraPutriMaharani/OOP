package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> List<T> readJsonFile(String filePath, TypeReference<List<T>> typeReference) throws IOException {
        return mapper.readValue(new File(filePath), typeReference);
    }

    public static <T> void writeJsonFile(String filePath, List<T> list) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), list);
    }
}
