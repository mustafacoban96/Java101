public class MyList <T>{
    private T[] t;
    public MyList(){
        this.t = (T[]) new Object[10];
    }
    public MyList(int capacity){
        this.t = (T[]) new Object[capacity];
    }

    public int size(){
        int size = 0;
        for (T element : t){
            if(element != null){
                size++;
            }
        }
        return size;
    }
    public int getCapacity(){
        return this.t.length;
    }
    public void add(T element){
        if (this.size() == this.getCapacity()){
            T[] newArray = (T[]) new Object[this.getCapacity()*2];
            for (int i = 0; i < this.t.length; i++){
                newArray[i] = this.t[i];
            }
            this.t = newArray;
        }
        this.t[this.size()] = element;
    }
    public T get(int index){
        if(index < 0 || index >= this.size()){
            return null;
        }
        return this.t[index];
    }
    public T remove(int index){
        if(index < 0 || index >= this.size()) {
            return null;
        }
        T removedElement = this.t[index];
        for(int i = index; i < this.size()-1; i++){
            this.t[i] = this.t[i+1];
        }
        this.t[this.size()-1] = null;
        return removedElement;
    }
    public T set(int index, T element){
        if(index < 0 || index >= this.size()){
            return null;
        }
        T oldData = this.t[index];
        this.t[index] = element;
        return oldData;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T element : t){
            if(element != null){
                sb.append(element.toString() + " ");
            }
        }
        return sb.toString();
    }
    public int lastIndex(T element){
        for(int i = this.size()-1;i >= 0 ; i--){
            if(this.t[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public T[] toArray(){
        T[] newArray = (T[]) new Object[this.size()];
        for(int i = 0; i< this.size(); i++){
            newArray[i] = this.t[i];
        }
        return newArray;
    }
    public void clear(){
        for(int i = 0; i < this.size(); i++){
            this.t[i] = null;
        }
    }
    public boolean contains(T element){
        for(int i =0; i < this.size(); i++){
            if(this.t[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    public MyList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= this.size() || toIndex < 0 || toIndex >= this.size() || fromIndex > toIndex) {
            return null;
        }
        MyList<T> newList = new MyList<>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            newList.add(this.t[i]);
        }
        return newList;
    }

}
