package annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE ,ElementType.FIELD , ElementType.LOCAL_VARIABLE}) //میگه پشت متد باشه یا فیلد یا ...
// ElementType.LOCAL_VARIABLE وریبل داخل متد
// ElementType.FIELD داخل کلاس
// ElementType.TYPE پشت کلاس
@Retention(RetentionPolicy.RUNTIME) // اگر RunTime باشه در طول اجرا زنده هست برای jvm
@Inherited // اگر کلاس هایی اون کلاس رو به ارث ببرن که این انوتیشن روش هست
@Documented //در java doc ذکر میشه انوتیشن ها
public @interface MyAnnot {
    String name = "";
}
