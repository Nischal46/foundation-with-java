package exercises.objectrelated;

import java.util.HashMap;
import java.util.Map;

public class ObjectRelatedExercise {

  public static void checkLetterRepition() {
    Map<Character, Language> objInJava = new HashMap<>();

    objInJava.put('a', new Language("js", "nodejs"));
    objInJava.put('b', new Language("java", "springboot"));
    objInJava.put('c', new Language("rust", "axum"));

    System.out.println("Logging of the hashmap----");
    objInJava.forEach((key, val) -> System.out.println(key + "->" + val));
  }
}

class Language {
  String language;
  String framework;

  public Language(String lang, String frameework) {
    this.language = lang;
    this.framework = frameework;
  }

  @Override
  public String toString() {
    // return "{language: '" + this.language + ", framework: '" + this.framework +
    // "'}";
    return String.format("{language: '%s', framework: '%s'}", language, framework);
  }
}
