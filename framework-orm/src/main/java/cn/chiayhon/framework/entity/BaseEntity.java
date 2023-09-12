package cn.chiayhon.framework.entity;

import java.io.Serializable;

import static cn.chiayhon.framework.entity.Constant.DEFAULT_SERIAL_VERSION_ID;

/**
 * 定义实体对象的基础类，继承自{@link IdEntity}
 */
public class BaseEntity extends IdEntity implements Serializable {

    private static final long serialVersionUID = DEFAULT_SERIAL_VERSION_ID;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                '}';
    }
}
