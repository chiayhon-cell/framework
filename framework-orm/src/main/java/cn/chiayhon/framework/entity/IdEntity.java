package cn.chiayhon.framework.entity;

import java.io.Serializable;


/**
 * 统一定义id的Entity基础类
 */
public abstract class IdEntity implements Serializable {

    private static final long serialVersionUID = Constant.DEFAULT_SERIAL_VERSION_ID;

    /**
     * 主键id
     */

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
