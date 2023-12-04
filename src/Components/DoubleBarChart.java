package Components;

/**
 @author Lành
 */
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import javax.swing.*;
import java.awt.*;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class DoubleBarChart extends JFrame {

    public double novemberRevenue;
    public double decemberRevenue;
    private DefaultCategoryDataset dataset;

    public DoubleBarChart() {
        super("Thống kê");
        dataset = new DefaultCategoryDataset();
        dataset.addValue(novemberRevenue, "Tháng 11", "11/2023");
        dataset.addValue(decemberRevenue, "Tháng 12", "12/2023");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê", "Chú thích", "Số tiền",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        CategoryItemRenderer renderer = plot.getRenderer();
        if (renderer instanceof BarRenderer) {
            BarRenderer barRenderer = (BarRenderer) renderer;
            barRenderer.setItemMargin(0.1); // Set gap between the bars
            barRenderer.setDrawBarOutline(false);
            barRenderer.setBasePaint(Color.BLACK); // Set outline color
            GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.BLUE, 0.0f, 0.0f, Color.BLUE.darker());
            GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.RED, 0.0f, 0.0f, Color.RED.darker());

            barRenderer.setSeriesPaint(0, gp0);
            barRenderer.setSeriesPaint(1, gp1);
        }

        ChartPanel chartPanel = new ChartPanel(barChart);
        setContentPane(chartPanel);
    }

    public void updateChart(double novemberRevenue, double decemberRevenue) {
        this.novemberRevenue = novemberRevenue;
        this.decemberRevenue = decemberRevenue;
        dataset.addValue(novemberRevenue, "Tháng 11", "11/2023");
        dataset.addValue(decemberRevenue, "Tháng 12", "12/2023");
    }

}
