package com.week5;

import java.util.*;
import java.util.stream.*;

public class Layer {
    private List<Shape> shapes;
    public Layer() {
        this.shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape) {
        if(shape != null)
            this.shapes.add(shape);
    }
    public String getInfo() {
        String info = "Layer of crazy shapes: \n";
        Iterator<Shape> i = this.shapes.iterator();
        while (i.hasNext()) {
            info += i.next().toString() + "\n";
        }
        return info;
    }

    public void removeCircles() {
        for(int i = 0; i < this.shapes.size(); ++i) {
            if(this.shapes.get(i) instanceof Circle) {
                this.shapes.remove(i);
            }
        }
    }

    public void removeDuplicates() {
        this.shapes = this.shapes.stream().distinct().collect(Collectors.toCollection(ArrayList<Shape>::new));
        // this.shapes = this.shapes.stream().peek(System.out::println).filter(o -> o instanceof Rectangle).distinct().peek(System.out::println).collect(Collectors.toCollection(LinkedList<Shape>::new));
    }
}
