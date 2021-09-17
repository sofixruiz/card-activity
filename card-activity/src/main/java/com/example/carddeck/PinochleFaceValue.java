package com.example.carddeck;

import java.util.Set;

public class PinochleFaceValue implements FaceValue {
    public static final FaceValue NINE = new PinochleFaceValue("nine", 9);
    public static final FaceValue JACK = new PinochleFaceValue("jack",11 );
    public static final FaceValue QUEEN = new PinochleFaceValue("queen", 12);
    public static final FaceValue KING = new PinochleFaceValue("king", 13);
    public static final FaceValue TEN = new PinochleFaceValue("ten", 10);
    public static final FaceValue ACE = new PinochleFaceValue("ace", 1);

    private final String name;
    private final int ordinal;

    public int ordinal(){
        return 0;
    }

    public PinochleFaceValue(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public int compareTo(PinochleFaceValue that){
        if(this.ordinal > that.ordinal) {
            return 1;
        } else if (this.ordinal < that.ordinal) {
            return -1;
        } else {
            return 0;
        }
    }


    public String toString(){
        return null;
    }

    public Set<FaceValue> values(){
        return null;
    }
}
