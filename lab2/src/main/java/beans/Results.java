package beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@LocalBean
@Stateful
public class Results implements Serializable {
    private final List<ResponseAnswer> hits = new ArrayList<>();

    public Results() {
    }

    public List<ResponseAnswer> getHits() {
        return hits;
    }
}
