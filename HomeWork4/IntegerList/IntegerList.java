package mein.JavaPro.HomeWork.HomeWork4.IntegerList;

import java.util.List;

public class IntegerList {

//    public
    public void addStartOrEnd(List<Integer> list, int number, boolean flag){
        if (!flag){
            list.add(number);
        }else {
            list.add(0, number);
        }
    }
    public int longList(List<Integer> list){
        return list.size();
    }
    public void removeFromListIndex(List<Integer> list, int index){
        list.remove(index);
    }
    public void removeFromListValue(List<Integer> list, int value){
        list.remove(value);
    }
    public boolean isEmptyList(List<Integer> list){
        return list.size() == 0;
    }
    public void showList(List<Integer> list){
        for (int lis : list){
            System.out.println(lis);
        }
    }
}
