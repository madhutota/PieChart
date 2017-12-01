package bornbaby.com.piechart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    float rainNames[] = {95.4f, 25.6f, 33.5f, 48.5f, 45.5f, 88.5f, 25.6f, 63.4f, 23.5f, 11.8f, 56.4f, 45.8f};
    String[] months = {"Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Des"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPieChart();
    }

    private void setPieChart() {

        List<PieEntry> pieChartList = new ArrayList<>();

        for (int i = 0; i < rainNames.length; i++) {

            pieChartList.add(new PieEntry(rainNames[i], months[i]));

        }
        PieDataSet pieDataSet = new PieDataSet(pieChartList, "Rainfall for Hudhud");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);



        PieData pieData = new PieData(pieDataSet);

        PieChart pieChart = findViewById(R.id.pie_chart);
        pieChart.animateX(2000);
        pieChart.setData(pieData);
        pieChart.invalidate();


    }
}
