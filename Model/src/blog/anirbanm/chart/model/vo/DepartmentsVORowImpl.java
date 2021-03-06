package blog.anirbanm.chart.model.vo;

import oracle.jbo.RowIterator;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 16 19:54:19 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        DepartmentId,
        DepartmentName,
        ManagerId,
        LocationId,
        EmployeesVO;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int EMPLOYEESVO = AttributesEnum.EmployeesVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentsVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentId.
     * @return the DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentName.
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute ManagerId.
     * @return the ManagerId
     */
    public Integer getManagerId() {
        return (Integer) getAttributeInternal(MANAGERID);
    }

    /**
     * Gets the attribute value for the calculated attribute LocationId.
     * @return the LocationId
     */
    public Integer getLocationId() {
        return (Integer) getAttributeInternal(LOCATIONID);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmployeesVO.
     */
    public RowIterator getEmployeesVO() {
        return (RowIterator) getAttributeInternal(EMPLOYEESVO);
    }
}

