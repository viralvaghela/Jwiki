# Jwiki

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/67df6904edd74f4882b8e81bcfd6e62f)](https://app.codacy.com/gh/viralvaghela/Jwiki?utm_source=github.com&utm_medium=referral&utm_content=viralvaghela/Jwiki&utm_campaign=Badge_Grade_Settings)

Java tool to get wikipedia data

## How to Use 
First Download jar from  [here](https://github.com/viralvaghela/Jwiki/raw/master/out/artifacts/JWiki_jar/JWiki.jar) and import inside your project.

## Example
```java
 Jwiki jwiki = new Jwiki("elon musk"); 
 System.out.println("Title :"+jwiki.getDisplayTitle()); //get title
 System.out.println("Text : "+jwiki.getExtractText());  //get summary text
 System.out.println("Image : "+jwiki.getImageURL());    //get image URL
```

## Thank You
Please ⭐️ this repo and share it with others

## Contributing 
If you want to contribute to this project and make it better with new ideas, your pull request is very welcomed.
If you find any issue just put it in the repository issue section, thank you.
