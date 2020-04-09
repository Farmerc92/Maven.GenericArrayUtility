package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T[] array;

    public ArrayUtility(T[] array){
        this.array = array;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for (T object : array) {
            if (object.equals(valueToEvaluate)){
                count++;
            }
        }
        for (T object : arrayToMerge) {
            if (object.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        HashMap<T, Integer> occurences = new HashMap<>();
        for (T object : arrayToMerge) {
            occurences.put(object, occurences.getOrDefault(object, 0) + 1);
        }
        for (T object : array) {
            occurences.put(object, occurences.getOrDefault(object, 0) + 1);
        }
        T mostCommon = null;
        Integer mostCommonOccurence = 0;
        for (Map.Entry<T, Integer> entry : occurences.entrySet()){
            if (entry.getValue() > mostCommonOccurence) {
                mostCommon = entry.getKey();
                mostCommonOccurence = entry.getValue();
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (T object : array) {
            if(object.equals(valueToEvaluate))
                count++;
        }
        return count;
    }
    public T[] removeValue(T valueToRemove) {
        @SuppressWarnings("unchecked")
        T[] buffer = (T[]) Array.newInstance(valueToRemove.getClass(), array.length);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)){
                buffer[index++] = array[i];
            }
        }
        @SuppressWarnings("unchecked")
        T[] output = (T[]) Array.newInstance(valueToRemove.getClass(), index);
        for (int i = 0; i < index; i++) {
            output[i] = buffer[i];
        }
        return output;
    }
}
