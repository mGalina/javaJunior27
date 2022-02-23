package lesson14;

import java.util.Iterator;
import java.util.Map;

/**
 * Интерфейс карты с несколькими значениями для одного ключа, т.е. если вызывается Map.put(key1, value1) а затем Map.put(key1, value2), то карта 
 * будет хранить два значения для ключа key1
 * 
 * @author nedis
 * @version 1.0
 */
public interface MultiMap<K, V> extends Map<K, V> {

	/**
	 * Возвращает количество значений для указанного ключа
	 * 
	 * @param key ключ
	 * @return количество значений
	 */
	int countValues(K key);
	
	/**
	 * Возвращает последне добавленное значение в карту
	 */
	public V get(Object key);
	
	
	/**
	 * Возвращает итератор на значения, хранящиеся для указанного ключа.
	 * Если ниодного значения не существует, должен возвращаться пустой итератор. Т.е. итератор никогда не должен быить равен null
	 * 
	 * @param key ключ
	 * @return итератор
	 */
	public Iterator<V> valuesIterator(K key);
	
	/**
	 *  Удаляет все значения для указханного ключа 
	 */
	public V remove(Object key);
}
