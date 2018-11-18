package blog.anirbanm.chart.view;

import blog.anirbanm.chart.view.util.ADFUtils;
import blog.anirbanm.chart.viewmodel.types.Department;
import blog.anirbanm.chart.viewmodel.types.Employee;

import java.io.Serializable;

import java.util.Iterator;
import java.util.List;

import oracle.adf.view.rich.component.rich.data.RichTable;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class ChartManager implements Serializable {
    
    @SuppressWarnings("compatibility:-5566695984484511847")
    private static final long serialVersionUID = 8969905773228343795L;
    
    private List<Department> departments;
    private Department selectedDepartment;
    private Boolean showChart;
    
    private PieChart pieChart;
    private BarChart barChart;
    private GaugeChart gaugeChart;

    public ChartManager() {
    }

    public void buildModel() {
        setShowChart(false);
        pieChart = new PieChart();
        barChart = new BarChart();
        gaugeChart = new GaugeChart();
        setDepartments((List<Department>) ADFUtils.findOperation("buildDataModel").execute());
    }

    public void onDepartmentSelection(final SelectionEvent selectionEvent) {
        final RichTable departmentTable = (RichTable) selectionEvent.getComponent();
        final RowKeySet departmentTableRKS = departmentTable.getSelectedRowKeys();

        if (departmentTableRKS != null) {
            final Iterator rksIterator = departmentTableRKS.iterator();
            if (rksIterator.hasNext()) {
                final Integer key = (Integer) rksIterator.next();
                setSelectedDepartment(getDepartments().get(key));
                
                final List<Employee> employees = selectedDepartment.getEmployees();
                setShowChart(employees.size() > 0);
                pieChart.plotChart("PieChart", employees);
                barChart.plotChart("BarChart", employees);
                
                gaugeChart.setDepartmentName(selectedDepartment.getDepartmentName());
                gaugeChart.plotChart("GaugeChart", employees);
            }
        }
    }

    public void setSelectedDepartment(Department selectedDepartment) {
        this.selectedDepartment = selectedDepartment;
    }

    public Department getSelectedDepartment() {
        return selectedDepartment;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setShowChart(Boolean showChart) {
        this.showChart = showChart;
    }

    public Boolean getShowChart() {
        return showChart;
    }

    public void setPieChart(PieChart pieChart) {
        this.pieChart = pieChart;
    }

    public PieChart getPieChart() {
        return pieChart;
    }

    public void setBarChart(BarChart barChart) {
        this.barChart = barChart;
    }

    public BarChart getBarChart() {
        return barChart;
    }

    public void setGaugeChart(GaugeChart gaugeChart) {
        this.gaugeChart = gaugeChart;
    }

    public GaugeChart getGaugeChart() {
        return gaugeChart;
    }
}
