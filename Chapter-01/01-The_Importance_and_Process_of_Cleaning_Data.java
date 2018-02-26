// The Process and Importance of Cleaning Data

// Consider CSV data. It can be handled in one of several ways. We can use simple Java techniques such as the String class' split method. In the following sequence, a string array, csvArray, is assumed to hold comma-delimited data. The split method populates a second array, tokenArray.

for (int i = 0; i < csvArray.length; i++) {
  tokenArray[i] = csvArray[i].split(",");
}

// The following is parsing information from 01-example.JSON

// The code sequence that follows shows how to extract the values for fields of a person. A parser is created, which uses getCurrentName to retrieve a field name. If the name is firstname, then the getText method returns the value for that field. The other fields are handled in a similar manner.

try {
  JsonFactory jsonfactory = new JsonFactory();
  JsonParser parser = jsonfactory.createParser(
      new File("01-example.json"))
  while (parser.nextToken() != JsonToken.END_OBJECT) {
    String token = parser.getCurrentName();
    if ("firstname".equals(token)) {
        parser.nextToken();
        String fname = parser.getText();
        out.println("firstname : " + fname);
    }
    ...
  }
  parser.close();
} catch (IOException ex) {
  // Handle exceptions
}

// The output of this examle is as follows:
// firstname : Smith
