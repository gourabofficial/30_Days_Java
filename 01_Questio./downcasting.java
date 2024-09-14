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

class downcasting{
    public static void main(String[] args) {
        Animal animal = new dog();
        
        dog mydog = (dog) animal;
        mydog.sound();
        

    }
}