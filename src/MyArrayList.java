public class MyArrayList {

    private String [] firstArray = new String[10];
    private int size = 0;

    public void add (String s) {
        firstArray[size] = s;
        size++;
        if(firstArray.length == size){
            String [] secondArray = new String[firstArray.length * 2];
            for(int i = 0; i < firstArray.length; i++){
                secondArray[i] = firstArray[i];
            }
            firstArray = secondArray;
        }
    }

    public void removeName(String name){
        int index =-1;
        for(int i = 0; i < size; i++){
            if (firstArray[i].equals(name)){
                index = i;
            }
        }
        if (index !=-1){
            remove(index + 1);
        }
    }

    public void remove (int index){
        if(index > 0 && index <= size){
            for(int i = index - 1; i < size - 1; i++){
                firstArray[i] = firstArray[i+1];
            }
            size--;
        }

    }

    public String getName(int index){
        return firstArray[index];
    }

    public int getSize(){
        return size;
    }
}
