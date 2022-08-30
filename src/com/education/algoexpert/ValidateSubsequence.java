package com.education.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for (var value : array) {
            if (seqIdx == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx).equals(value)) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        List<Integer> sequence = new ArrayList<Integer>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);
        sequence.add(1);
        sequence.add(6);
        sequence.add(100);
        sequence.add(10);

        System.out.println(isValidSubsequence(array,sequence));

    }
}
