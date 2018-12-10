package compare.utils;

import compare.annotation.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


/**
 * 通过反射获取字段的工具
 */
public class FieldUtils {
	
	public final static List<Field> getFields(Class<?> c) {
		List<Field> fields = new ArrayList<>();
		getFields(c, fields, Object.class);
		return fields;
	}
	
	
	public final static List<Field> getFields(Class<?> c,Class<?> endSuperClass) {
		List<Field> fields = new ArrayList<>();
		getFields(c, fields, endSuperClass);
		return fields;
	}
	
	private static void getFields(Class<?> c,List<Field> fields,Class<?> endSuperClass) {
		for (Field field : c.getDeclaredFields()) {
			fields.add(field);
		}
		Class<?> superClass = c.getSuperclass();
		if (!superClass.equals(endSuperClass)) {
			getFields(superClass, fields, endSuperClass);
		}
	}
	
	public static List<Field> getCompareFields(Class<?> c) {
		List<Field> fields = new ArrayList<>();
		getCompareFields(c, fields);
		return fields;
	}
	
	private static void getCompareFields(Class<?> c,List<Field> fields) {
		CompareFieldOfClass compareFieldOfClass = c.getAnnotation(CompareFieldOfClass.class);
		if (null == compareFieldOfClass) {
			return;
		}
		CompareFieldStrategy compareFieldStrategy = compareFieldOfClass.valus();
		List<Field> tempfields = new ArrayList<>();
		List<Field> noComparefields = new ArrayList<>();
		List<Field> comparefields = new ArrayList<>();
		boolean isAll = compareFieldStrategy == null || compareFieldStrategy.equals(CompareFieldStrategy.ALL);
		for (Field field : c.getDeclaredFields()) {
			field.getAnnotations();
			if (isAll) {
				fields.add(field);
			}else {
				NoCompareField noCompareField = field.getAnnotation(NoCompareField.class);
				CompareField compareField = field.getAnnotation(CompareField.class);
				if (null != noCompareField) {
					noComparefields.add(field);				
				}else if (null != compareField) {
					comparefields.add(field);
				}else {
					tempfields.add(field);
				}				
			}
		}
		if (!comparefields.isEmpty()) {
			fields.addAll(comparefields);
		}else {
			fields.addAll(tempfields);
		}
		Class<?> superClass = c.getSuperclass();
		NoCompareFieldOfClass noCompareFieldOfClass = superClass.getAnnotation(NoCompareFieldOfClass.class);
		if (null == noCompareFieldOfClass || !superClass.equals(Object.class)) {
			getCompareFields(superClass, fields);
		}
	}
}
