
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeHistory {

    private List<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public void add(double status) {
        this.historyList.add(status);
    }

    public void clear() {
        this.historyList.clear();
    }

    public double maxValue() {

        if (this.historyList.isEmpty()) {
            return 0.0;
        }

        return Collections.max(historyList);
    }

    public double minValue() {

        if (this.historyList.isEmpty()) {
            return 0.0;
        }

        return Collections.min(historyList);
    }

    public double average() {

        double sum = 0;

        if (this.historyList.isEmpty()) {
            return sum;
        }

        for (Double history : historyList) {
            sum += history;
        }

        return sum / this.historyList.size();
    }

    @Override
    public String toString() {
        return historyList.toString();
    }
}
