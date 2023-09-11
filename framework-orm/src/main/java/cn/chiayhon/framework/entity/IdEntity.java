package cn.chiayhon.framework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * 统一定义id的Entity基础类
 */
@Getter
@Setter
public abstract class IdEntity implements Serializable {

    private static final long serialVersionUID = Constant.DEFAULT_SERIAL_VERSION_ID;

    /**
     * 主键id。雪花算法实现。
     */
    @TableId(type= IdType.ASSIGN_ID)
    protected Long id;

}
