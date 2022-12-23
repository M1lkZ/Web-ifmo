package org.example.beans;

public class MyBean {

    private Model model;

    private Point point;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    public void doExtend() {
        ExtendedPoint extendedPoint = new ExtendedPoint();
        extendedPoint.setX(point.getX());
        extendedPoint.setY(point.getY());
        extendedPoint.setR(point.getR());
        extendedPoint.selfEval();
        model.add(extendedPoint);
        System.out.println(extendedPoint);
    }

}
