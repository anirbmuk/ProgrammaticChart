package blog.anirbanm.chart.view;

import blog.anirbanm.chart.viewmodel.types.Employee;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GaugeChart extends Chart implements DataChart, Serializable {
    
    @SuppressWarnings("compatibility:-3657254105085816153")
    private static final long serialVersionUID = -9192741150433471640L;
    
    private String departmentName;

    public GaugeChart() {
        super();
    }

    @Override
    public void plotChart(String chartType, List<Employee> employees) {
        List<Object[]> listObject = new ArrayList<Object[]>();
        Object[] pieObject = {getDepartmentName(), null, employees.size()};
        listObject.add(pieObject);
        this.getGraphData().put(chartType, listObject);
    }

    @Override
    public Map<String, Object> plotTabularData(List<Employee> employees) {
        return Collections.emptyMap();
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
