package blog.anirbanm.chart.view;

import blog.anirbanm.chart.viewmodel.types.Employee;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BarChart extends Chart implements DataChart, Serializable {
    
    @SuppressWarnings("compatibility:-4087245317960992896")
    private static final long serialVersionUID = 4999797060949041985L;

    public BarChart() {
        super();
    }

    @Override
    public void plotChart(String chartType, List<Employee> employees) {
        Map<String, Object> dataMap = plotTabularData(employees);
        List<Object[]> listObject = new ArrayList<Object[]>();
        for(Map.Entry entry : dataMap.entrySet()) {
            Object[] pieObject = {entry.getKey(), "Salary", entry.getValue()};
            listObject.add(pieObject);
        }
        this.getGraphData().put(chartType, listObject);
    }

    @Override
    public Map<String, Object> plotTabularData(List<Employee> employees) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        for (final Employee employee : employees) {
            dataMap.put(String.valueOf(employee.getFirstName()), employee.getSalary());
        }
        return dataMap;
    }
}
