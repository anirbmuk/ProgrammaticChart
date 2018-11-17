package blog.anirbanm.chart.view;

import blog.anirbanm.chart.viewmodel.types.Employee;

import java.util.List;
import java.util.Map;

public interface DataChart {
    
    public void plotChart(String chartType, List<Employee> employees);
    
    public Map<String, Object> plotTabularData (List<Employee> employees);
    
}
