package com.example.androidunittestudemycarlos.fundamentos.exercise2;

class StringDuplicator {

    public String duplicate(String string) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        do {
            for (int j = 0; j <= string.length() - 1; j++) {
                sb.append(string.charAt(j));
            }
            i = i + 1;
        } while (i < 2);

        return sb.toString();
    }
}
