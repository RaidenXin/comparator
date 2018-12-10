package compare.annotation;

import compare.utils.CompareFieldStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 设置类为比较类
 *  @author Raiden
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CompareFieldOfClass {
	
	CompareFieldStrategy valus();
}
