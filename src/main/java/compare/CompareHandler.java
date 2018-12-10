package compare;

import compare.utils.FieldUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

/**
 * 类比较器
 */
public class CompareHandler {

	private static final Logger logger = LoggerFactory.getLogger(CompareHandler.class);
	
	public static boolean compare(Object o1,Object o2) {
		Class<?> c1 = o1.getClass();
		if (!c1.equals(o2.getClass())) {
			return false;
		}
		List<Field> fields = FieldUtils.getCompareFields(c1);
		boolean result = true;
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object fieldValue1 = field.get(o1);
				Object fieldValue2 = field.get(o2);
				if(fieldValue1 == null) {
					result = result & fieldValue2 == null;
				}else if (field.getType().equals(BigDecimal.class)) {
					result = result & ((BigDecimal) fieldValue1).compareTo((BigDecimal) fieldValue2) == 0;
				}else {
					result = result & fieldValue1.equals(fieldValue2);
				}
			} catch (IllegalArgumentException e) {
				logger.error(e.getMessage());
			} catch (IllegalAccessException e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}
}
