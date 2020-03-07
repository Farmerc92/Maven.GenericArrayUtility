package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;

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
        return null;
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
