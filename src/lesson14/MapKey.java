package lesson14;

/**
 * Интерфейс ключа карты. Реализация данного класса будет использоваться в качестве ключа для MapUtils
 * 
 * @author nedis
 * @version 1.0
 */
public interface MapKey {
	
	/**
	 * Возвращает строковое значение ключа
	 * 
	 * @return зчачение
	 */
	String getValue();
}
