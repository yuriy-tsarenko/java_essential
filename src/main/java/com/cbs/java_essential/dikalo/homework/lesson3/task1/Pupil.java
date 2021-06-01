package com.cbs.java_essential.dikalo.homework.lesson3.task1;

public class Pupil {
    void study() {
    }

    void read() {
    }

    void write() {
    }

    void relax() {
    }
}

class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("excellent study");
    }

    @Override
    void read() {
        System.out.println("excellent read");
    }

    @Override
    void write() {
        System.out.println("excellent write");
    }

    @Override
    void relax() {
        System.out.println("excellent relax");
    }
}

class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("good study");
    }

    @Override
    void read() {
        System.out.println("good read");
    }

    @Override
    void write() {
        System.out.println("good write");
    }

    @Override
    void relax() {
        System.out.println("good relax");
    }
}

class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("bad study");
    }

    @Override
    void read() {
        System.out.println("bad read");
    }

    @Override
    void write() {
        System.out.println("bad write");
    }

    @Override
    void relax() {
        System.out.println("bad relax");
    }
}