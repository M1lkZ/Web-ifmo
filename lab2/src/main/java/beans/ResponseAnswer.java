package beans;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ResponseAnswer {
    private float x;
    private float y;
    private float r;
    private boolean hitRes;
    private LocalDateTime time;
    private long processingTime;


    public ResponseAnswer(float x, float y, float r, boolean hitRes, long processingTime) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.hitRes = hitRes;
        this.processingTime = processingTime;
        this.time = LocalDateTime.now();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public boolean isHit() {
        return hitRes;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public long getProcessingTime() {
        return processingTime;
    }

    @Override
    public String toString() {
        return "ResponseAnswer{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", hitRes=" + hitRes +
                ", time=" + time +
                ", processingTime=" + processingTime +
                '}';
    }
}
