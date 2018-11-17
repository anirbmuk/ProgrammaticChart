package blog.anirbanm.chart.view;

import blog.anirbanm.chart.viewmodel.types.Employee;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

public class PieChart extends Chart implements DataChart, Serializable {
    
    @SuppressWarnings("compatibility:-7460215920913774261")
    private static final long serialVersionUID = -8729922932577639161L;

    public PieChart() {
        super();
    }

    @Override
    public void plotChart(String chartType, List<Employee> employees) {
        Map<String, Object> dataMap = plotTabularData(employees);
        List<Object[]> listObject = new ArrayList<Object[]>();
        for(Map.Entry entry : dataMap.entrySet()) {
            Object[] pieObject = {"Group by JOB_ID", entry.getKey(), entry.getValue()};
            listObject.add(pieObject);
        }
        this.getGraphData().put(chartType, listObject);
    }

    @Override
    public Map<String, Object> plotTabularData(List<Employee> employees) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        
        for (final Employee employee : employees) {
            final String jobId = employee.getJobId();
            if (!dataMap.containsKey(jobId)) {
                dataMap.put(jobId, getJobCount(employees, jobId));
            }
        }
        
        return dataMap;
    }
    
    private Integer getJobCount(final List<Employee> employees, final String jobId) {
        Predicate condition = new Predicate() {
            public boolean evaluate(Object employee) {
                if (employee != null) {
                    return (jobId.equals(((Employee) employee).getJobId()));
                } else {
                    return false;
                }
            }
        };
        return ((List) CollectionUtils.select(employees, condition)).size();
    }
}
