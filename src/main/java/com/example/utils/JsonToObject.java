package com.example.utils;
import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import org.jsonschema2pojo.SourceType;

public class JsonToObject {

    public static void main(String[] args) throws FileNotFoundException {
        // Creating object of Organisation
        //Organisation org = new Organisation();
        // Converting json to object
        //org = getOrganisationObject();

        // Displaying object
        //System.out.println(org);

    }


    private static Organisation getOrganisationObject()
    {
        // Storing preprocessed json(Added slashes)
        String OrganisationJson
                = "{\"organisation_name\":\"GeeksforGeeks\",\"description\": \"A computer Science portal for Geeks\",\"Employee\": \"2000\"}";

        // Creating a Gson Object
        Gson gson = new Gson();

        // Converting json to object
        // first parameter should be preprocessed json
        // and second should be mapping class
        Organisation organisation
                = gson.fromJson(OrganisationJson,
                Organisation.class);

        // return object
        return organisation;
    }
}
