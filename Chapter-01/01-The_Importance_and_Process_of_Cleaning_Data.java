// The Process and Importance of Cleaning Data

// Consider CSV data. It can be handled in one of several ways. We can use simple Java techniques such as the String class' split method. In the following sequence, a string array, csvArray, is assumed to hold comma-delimited data. The split method populates a second array, tokenArray.

for (int i = 0; i < csvArray.length; i++) {
  tokenArray[i] = csvArray[i].split(",");
}
