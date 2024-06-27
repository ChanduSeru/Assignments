class Assignment1<T, U> {
    private T first;
    private U second;
    
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public U getSecond() {
        return second;
    }
    
    public void setFirst(T first) {
        this.first = first;
    }
    
    public void setSecond(U second) {
        this.second = second;
    }
    
    public Pair<U, T> reverse() {
        return new Assignment<>(second, first);
    }
    
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
    
    public static void main(String[] args) {
        Pair<String, Double> pair = new Pair<>("Pi", 3.14);
        System.out.println("Original Pair: " + pair);
        
        Pair<Double, String> reversedPair = pair.reverse();
        System.out.println("Reversed Pair: " + reversedPair);
    }
}