package com.teamtreehouse.courses;

import java.util.Map;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world!");
        get("/", (req, res) -> "Welcome students!");
    }
}
