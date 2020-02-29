package chart;

import java.util.List;

public class BarChart {

    private String title;

    private String fontName;
    private int fontSize;
    private String fontColor;

    private int width;
    private int height;
    private String backgroundColor;

    private List<String> data;

    public BarChart() {

    }

    @Override
    public String toString() {
        return "BarChart{" +
                "title='" + title + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                ", fontColor='" + fontColor + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", data=" + data +
                ", displayTitle=" + displayTitle +
                ", displayLegend=" + displayLegend +
                '}';
    }

    private boolean displayTitle;
    private boolean displayLegend;


    public BarChart(String title, String fontName, int fontSize, String fontColor, int width, int height, String backgroundColor, List<String> data, boolean displayTitle, boolean displayLegend) {
        this.title = title;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.data = data;
        this.displayTitle = displayTitle;
        this.displayLegend = displayLegend;
    }

    public BarChart(String title, List<String> data) {
        this.title = title;
        this.data = data;
        this.backgroundColor = "white";
        this.displayTitle = true;
        this.displayLegend = true;
        this.width = 600;
        this.height = 600;
        this.fontName = "Arial";
        this.fontColor = "Black";
        this.fontSize = 12;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public boolean isDisplayTitle() {
        return displayTitle;
    }

    public void setDisplayTitle(boolean displayTitle) {
        this.displayTitle = displayTitle;
    }

    public boolean isDisplayLegend() {
        return displayLegend;
    }

    public void setDisplayLegend(boolean displayLegend) {
        this.displayLegend = displayLegend;
    }

    public static barChartBuilder builder() {
        return new barChartBuilder();
    }

    public static class barChartBuilder {
        private String title;

        private String fontName;
        private int fontSize;
        private String fontColor;

        private int width;
        private int height;
        private String backgroundColor;

        private List<String> data;

        public barChartBuilder withTitle(String title) {
            this.title = title;
            return this;


        }

        public barChartBuilder withfontName(String fontName) {
            this.fontName = fontName;
            return this;
        }

        public barChartBuilder withfontSize(int fontName) {
            this.fontSize = fontSize;
            return this;
        }

        public barChartBuilder withfontColor(String fontName) {
            this.fontColor = fontColor;
            return this;
        }

        public barChartBuilder withwidth(int width) {
            this.width = width;
            return this;
        }

        public barChartBuilder withheight(int height) {
            this.height = height;
            return this;
        }

        public barChartBuilder withbackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public barChartBuilder withdata(List<String> data) {
            this.data = data;
            return this;
        }

        public BarChart build() {
            BarChart barChart = new BarChart();
            barChart.title = this.title;
            barChart.fontName = this.fontName;
            barChart.fontSize = this.fontSize;
            barChart.fontColor = this.fontColor;
            barChart.width = this.width;
            barChart.height = this.height;
            barChart.data = this.data;
            barChart.backgroundColor = backgroundColor;


            return barChart;
        }
    }

}