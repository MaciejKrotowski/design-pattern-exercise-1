package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report",new ArrayList());
        BarChart barChart1 = BarChart.builder()
                .withfontColor("GREEN")
                .withTitle("Coś")
                .withfontSize(4)
                .build();




    }
}
