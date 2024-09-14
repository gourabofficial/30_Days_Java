

class Animal {
    public void sound(){
        System.out.println("Animal sound...");

    }
}

class dog extends Animal{
    public void sound (){
        System.out.println("Dog sound..");
    }
}


class upcasting{
    public static void main(String[] args) {
        dog mydog = new dog();
        
        Animal animal = mydog;
        animal.sound();
        


    }
}