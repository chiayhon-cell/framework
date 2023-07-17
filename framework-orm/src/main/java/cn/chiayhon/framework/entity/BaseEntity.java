package cn.chiayhon.framework.entity;

import java.io.Serializable;

/**
 * 定义实体对象的基础类，继承自{@link IdEntity}
 */
public abstract class BaseEntity extends IdEntity implements Serializable {
    private static final long serialVersionUID = 1L;
}
