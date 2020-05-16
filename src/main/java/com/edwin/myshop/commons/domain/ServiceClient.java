package com.edwin.myshop.commons.domain;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "service_client")
public class ServiceClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 服务ID
     */
    @Column(name = "serviceId")
    private String serviceid;

    /**
     * 服务密钥
     */
    private String secret;

    /**
     * 是否启用【1:启用,0:禁用】
     */
    private Integer enabled;

    /**
     * 负责人邮箱，多个用逗号分隔
     */
    private String mails;

    /**
     * 可访问的服务列表,多个serviceId用逗号分隔
     */
    private String services;

    /**
     * 服务描述
     */
    private String description;

    /**
     * 数据版本号
     */
    private Integer version;

    /**
     * 在线接口文档地址
     */
    private String apiurl;

    /**
     * 在线接口文档描述名称
     */
    private String apidesc;

    /**
     * 创建人编号
     */
    @Column(name = "creatorId")
    private String creatorid;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 编辑者编号
     */
    @Column(name = "editorId")
    private String editorid;

    /**
     * 编辑者
     */
    private String editor;

    /**
     * 编辑时间
     */
    private Date edittime;

    /**
     * 状态是否有效[1:有效 ,-1:已删除]
     */
    private Integer status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取服务ID
     *
     * @return serviceId - 服务ID
     */
    public String getServiceid() {
        return serviceid;
    }

    /**
     * 设置服务ID
     *
     * @param serviceid 服务ID
     */
    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    /**
     * 获取服务密钥
     *
     * @return secret - 服务密钥
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 设置服务密钥
     *
     * @param secret 服务密钥
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 获取是否启用【1:启用,0:禁用】
     *
     * @return enabled - 是否启用【1:启用,0:禁用】
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用【1:启用,0:禁用】
     *
     * @param enabled 是否启用【1:启用,0:禁用】
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取负责人邮箱，多个用逗号分隔
     *
     * @return mails - 负责人邮箱，多个用逗号分隔
     */
    public String getMails() {
        return mails;
    }

    /**
     * 设置负责人邮箱，多个用逗号分隔
     *
     * @param mails 负责人邮箱，多个用逗号分隔
     */
    public void setMails(String mails) {
        this.mails = mails;
    }

    /**
     * 获取可访问的服务列表,多个serviceId用逗号分隔
     *
     * @return services - 可访问的服务列表,多个serviceId用逗号分隔
     */
    public String getServices() {
        return services;
    }

    /**
     * 设置可访问的服务列表,多个serviceId用逗号分隔
     *
     * @param services 可访问的服务列表,多个serviceId用逗号分隔
     */
    public void setServices(String services) {
        this.services = services;
    }

    /**
     * 获取服务描述
     *
     * @return description - 服务描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置服务描述
     *
     * @param description 服务描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取数据版本号
     *
     * @return version - 数据版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置数据版本号
     *
     * @param version 数据版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取在线接口文档地址
     *
     * @return apiurl - 在线接口文档地址
     */
    public String getApiurl() {
        return apiurl;
    }

    /**
     * 设置在线接口文档地址
     *
     * @param apiurl 在线接口文档地址
     */
    public void setApiurl(String apiurl) {
        this.apiurl = apiurl;
    }

    /**
     * 获取在线接口文档描述名称
     *
     * @return apidesc - 在线接口文档描述名称
     */
    public String getApidesc() {
        return apidesc;
    }

    /**
     * 设置在线接口文档描述名称
     *
     * @param apidesc 在线接口文档描述名称
     */
    public void setApidesc(String apidesc) {
        this.apidesc = apidesc;
    }

    /**
     * 获取创建人编号
     *
     * @return creatorId - 创建人编号
     */
    public String getCreatorid() {
        return creatorid;
    }

    /**
     * 设置创建人编号
     *
     * @param creatorid 创建人编号
     */
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取编辑者编号
     *
     * @return editorId - 编辑者编号
     */
    public String getEditorid() {
        return editorid;
    }

    /**
     * 设置编辑者编号
     *
     * @param editorid 编辑者编号
     */
    public void setEditorid(String editorid) {
        this.editorid = editorid;
    }

    /**
     * 获取编辑者
     *
     * @return editor - 编辑者
     */
    public String getEditor() {
        return editor;
    }

    /**
     * 设置编辑者
     *
     * @param editor 编辑者
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * 获取编辑时间
     *
     * @return edittime - 编辑时间
     */
    public Date getEdittime() {
        return edittime;
    }

    /**
     * 设置编辑时间
     *
     * @param edittime 编辑时间
     */
    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    /**
     * 获取状态是否有效[1:有效 ,-1:已删除]
     *
     * @return status - 状态是否有效[1:有效 ,-1:已删除]
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态是否有效[1:有效 ,-1:已删除]
     *
     * @param status 状态是否有效[1:有效 ,-1:已删除]
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}