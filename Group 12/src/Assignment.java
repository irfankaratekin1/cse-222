public class Assignment<E>{
    private E file;

    public Assignment(E file){
        this.file = file;
    }

    public E getFile() {
        return file;
    }

    public void setFile(E file) {
        this.file = file;
    }
}
