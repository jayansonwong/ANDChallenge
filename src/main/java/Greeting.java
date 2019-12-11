package main.java;

@lombok.AllArgsConstructor
public class Greeting {

  @lombok.Getter private final long id;
  @lombok.Getter private final String content;

//  public Greeting(long id, String content) {
//    this.id = id;
//    this.content = content;
//  }

//  public long getId() {
//    return id;
//  }
//
//  public String getContent() {
//    return content;
//  }
}