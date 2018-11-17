package blog.anirbanm.chart.view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chart {
    
    private UIGraphDataMap graphData = new UIGraphDataMap();
    
    public Chart() {
        super();
    }
    
    public final class UIGraphDataMap implements Map {
        
        private final Map graphDataMap;
        
        private UIGraphDataMap() {
            super();
            graphDataMap = new HashMap();
        }

        @Override
        public int size() {
            return graphDataMap.size();
        }

        @Override
        public boolean isEmpty() {
            return graphDataMap.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            return graphDataMap.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return graphDataMap.containsValue(value);
        }

        @Override
        public Object get(Object key) {
            return graphDataMap.get(key);
        }

        @Override
        public Object put(Object key, Object value) {
            return graphDataMap.put(key, value);
        }

        @Override
        public Object remove(Object key) {
            return graphDataMap.remove(key);
        }

        @Override
        public void putAll(Map m) {
            graphDataMap.putAll(m);
        }

        @Override
        public void clear() {
            graphDataMap.clear();
        }

        @Override
        public Set keySet() {
            return graphDataMap.keySet();
        }

        @Override
        public Collection values() {
            return graphDataMap.values();
        }

        @Override
        public Set entrySet() {
            return graphDataMap.entrySet();
        }
    }

    public Chart.UIGraphDataMap getGraphData() {
        return graphData;
    }
}
