package learnbasicspring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
/*tag AllArgsConstructor buat bikin constructor FooBar pake semua parameter gloval variable
jadi ntr
public FooBar(Foo foo, Bar bar){
    this.foo = foo;
    this.bar = bar;
  }
 */
@AllArgsConstructor
@Data
public class FooBar {
    private Foo foo;

    private Bar bar;
}
