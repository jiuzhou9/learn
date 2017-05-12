package com.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderSn;

    private Integer parentOrderId;

    private String parentOrderSn;

    private Integer userId;

    private Integer opencityId;

    private Byte orderStatus;

    private Byte refuseType;

    private Integer shippingTime;

    private Integer payTime;

    private String consignee;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer district;

    private Integer area;

    private String address;

    private String giverName;

    private Integer giverProvince;

    private Integer giverCity;

    private Integer giverDistrict;

    private Integer giverArea;

    private String giverAddress;

    private String giverMobile;

    private Byte sendtime;

    private String areaNumber;

    private Boolean areaFlag;

    private String sfarea;

    private String zipcode;

    private String tel;

    private String mobile;

    private String email;

    private Long ip;

    private Integer bestDate;

    private Byte isTogether;

    private Byte bestTime;

    private Integer shippingId;

    private Boolean sfairline;

    private String shippingSn;

    private String warehouseSn;

    private Integer receivedTime;

    private Integer invoiceId;

    private Integer integral;

    private BigDecimal userRank;

    private String favourableId;

    private Integer payId;

    private Integer payFee;

    private Integer shippingFee;

    private Integer sfShippingFee;

    private Integer productAmount;

    private Integer orderAmount;

    private Integer discount;

    private Integer moneyPaid;

    private Integer balance;

    private Integer couponId;

    private Boolean couponType;

    private Integer couponMoney;

    private Integer useIntegral;

    private Integer integralMoney;

    private String giftCard;

    private Integer giftCardMoney;

    private String toUser;

    private String toShop;

    private Integer greetCard;

    private Integer addTime;

    private Boolean orderType;

    private Boolean returnDirection;

    private Integer projetDeliveryTime;

    private Boolean orderSource;

    private Boolean orderBelong;

    private Boolean temperatureType;

    private Boolean promtionChannels;

    private Boolean saleType;

    private Integer senderAddrId;

    private String outerId;

    private Integer closeTime;

    private Integer editTime;

    private String isBackmoney;

    private Integer backmoneyTime;

    private Boolean statisState;

    private Boolean isLogisError;

    private Integer onlinePlat;

    private Boolean smsType;

    private Integer isList;

    private Byte sfvDownload;

    private Byte orderSort;

    private Date modifiedTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(Integer parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getParentOrderSn() {
        return parentOrderSn;
    }

    public void setParentOrderSn(String parentOrderSn) {
        this.parentOrderSn = parentOrderSn == null ? null : parentOrderSn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOpencityId() {
        return opencityId;
    }

    public void setOpencityId(Integer opencityId) {
        this.opencityId = opencityId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Byte getRefuseType() {
        return refuseType;
    }

    public void setRefuseType(Byte refuseType) {
        this.refuseType = refuseType;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName == null ? null : giverName.trim();
    }

    public Integer getGiverProvince() {
        return giverProvince;
    }

    public void setGiverProvince(Integer giverProvince) {
        this.giverProvince = giverProvince;
    }

    public Integer getGiverCity() {
        return giverCity;
    }

    public void setGiverCity(Integer giverCity) {
        this.giverCity = giverCity;
    }

    public Integer getGiverDistrict() {
        return giverDistrict;
    }

    public void setGiverDistrict(Integer giverDistrict) {
        this.giverDistrict = giverDistrict;
    }

    public Integer getGiverArea() {
        return giverArea;
    }

    public void setGiverArea(Integer giverArea) {
        this.giverArea = giverArea;
    }

    public String getGiverAddress() {
        return giverAddress;
    }

    public void setGiverAddress(String giverAddress) {
        this.giverAddress = giverAddress == null ? null : giverAddress.trim();
    }

    public String getGiverMobile() {
        return giverMobile;
    }

    public void setGiverMobile(String giverMobile) {
        this.giverMobile = giverMobile == null ? null : giverMobile.trim();
    }

    public Byte getSendtime() {
        return sendtime;
    }

    public void setSendtime(Byte sendtime) {
        this.sendtime = sendtime;
    }

    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber == null ? null : areaNumber.trim();
    }

    public Boolean getAreaFlag() {
        return areaFlag;
    }

    public void setAreaFlag(Boolean areaFlag) {
        this.areaFlag = areaFlag;
    }

    public String getSfarea() {
        return sfarea;
    }

    public void setSfarea(String sfarea) {
        this.sfarea = sfarea == null ? null : sfarea.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public Integer getBestDate() {
        return bestDate;
    }

    public void setBestDate(Integer bestDate) {
        this.bestDate = bestDate;
    }

    public Byte getIsTogether() {
        return isTogether;
    }

    public void setIsTogether(Byte isTogether) {
        this.isTogether = isTogether;
    }

    public Byte getBestTime() {
        return bestTime;
    }

    public void setBestTime(Byte bestTime) {
        this.bestTime = bestTime;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public Boolean getSfairline() {
        return sfairline;
    }

    public void setSfairline(Boolean sfairline) {
        this.sfairline = sfairline;
    }

    public String getShippingSn() {
        return shippingSn;
    }

    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn == null ? null : shippingSn.trim();
    }

    public String getWarehouseSn() {
        return warehouseSn;
    }

    public void setWarehouseSn(String warehouseSn) {
        this.warehouseSn = warehouseSn == null ? null : warehouseSn.trim();
    }

    public Integer getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Integer receivedTime) {
        this.receivedTime = receivedTime;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getUserRank() {
        return userRank;
    }

    public void setUserRank(BigDecimal userRank) {
        this.userRank = userRank;
    }

    public String getFavourableId() {
        return favourableId;
    }

    public void setFavourableId(String favourableId) {
        this.favourableId = favourableId == null ? null : favourableId.trim();
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getPayFee() {
        return payFee;
    }

    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getSfShippingFee() {
        return sfShippingFee;
    }

    public void setSfShippingFee(Integer sfShippingFee) {
        this.sfShippingFee = sfShippingFee;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(Integer moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Boolean getCouponType() {
        return couponType;
    }

    public void setCouponType(Boolean couponType) {
        this.couponType = couponType;
    }

    public Integer getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(Integer couponMoney) {
        this.couponMoney = couponMoney;
    }

    public Integer getUseIntegral() {
        return useIntegral;
    }

    public void setUseIntegral(Integer useIntegral) {
        this.useIntegral = useIntegral;
    }

    public Integer getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(Integer integralMoney) {
        this.integralMoney = integralMoney;
    }

    public String getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(String giftCard) {
        this.giftCard = giftCard == null ? null : giftCard.trim();
    }

    public Integer getGiftCardMoney() {
        return giftCardMoney;
    }

    public void setGiftCardMoney(Integer giftCardMoney) {
        this.giftCardMoney = giftCardMoney;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser == null ? null : toUser.trim();
    }

    public String getToShop() {
        return toShop;
    }

    public void setToShop(String toShop) {
        this.toShop = toShop == null ? null : toShop.trim();
    }

    public Integer getGreetCard() {
        return greetCard;
    }

    public void setGreetCard(Integer greetCard) {
        this.greetCard = greetCard;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Boolean getOrderType() {
        return orderType;
    }

    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    public Boolean getReturnDirection() {
        return returnDirection;
    }

    public void setReturnDirection(Boolean returnDirection) {
        this.returnDirection = returnDirection;
    }

    public Integer getProjetDeliveryTime() {
        return projetDeliveryTime;
    }

    public void setProjetDeliveryTime(Integer projetDeliveryTime) {
        this.projetDeliveryTime = projetDeliveryTime;
    }

    public Boolean getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Boolean orderSource) {
        this.orderSource = orderSource;
    }

    public Boolean getOrderBelong() {
        return orderBelong;
    }

    public void setOrderBelong(Boolean orderBelong) {
        this.orderBelong = orderBelong;
    }

    public Boolean getTemperatureType() {
        return temperatureType;
    }

    public void setTemperatureType(Boolean temperatureType) {
        this.temperatureType = temperatureType;
    }

    public Boolean getPromtionChannels() {
        return promtionChannels;
    }

    public void setPromtionChannels(Boolean promtionChannels) {
        this.promtionChannels = promtionChannels;
    }

    public Boolean getSaleType() {
        return saleType;
    }

    public void setSaleType(Boolean saleType) {
        this.saleType = saleType;
    }

    public Integer getSenderAddrId() {
        return senderAddrId;
    }

    public void setSenderAddrId(Integer senderAddrId) {
        this.senderAddrId = senderAddrId;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId == null ? null : outerId.trim();
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getEditTime() {
        return editTime;
    }

    public void setEditTime(Integer editTime) {
        this.editTime = editTime;
    }

    public String getIsBackmoney() {
        return isBackmoney;
    }

    public void setIsBackmoney(String isBackmoney) {
        this.isBackmoney = isBackmoney == null ? null : isBackmoney.trim();
    }

    public Integer getBackmoneyTime() {
        return backmoneyTime;
    }

    public void setBackmoneyTime(Integer backmoneyTime) {
        this.backmoneyTime = backmoneyTime;
    }

    public Boolean getStatisState() {
        return statisState;
    }

    public void setStatisState(Boolean statisState) {
        this.statisState = statisState;
    }

    public Boolean getIsLogisError() {
        return isLogisError;
    }

    public void setIsLogisError(Boolean isLogisError) {
        this.isLogisError = isLogisError;
    }

    public Integer getOnlinePlat() {
        return onlinePlat;
    }

    public void setOnlinePlat(Integer onlinePlat) {
        this.onlinePlat = onlinePlat;
    }

    public Boolean getSmsType() {
        return smsType;
    }

    public void setSmsType(Boolean smsType) {
        this.smsType = smsType;
    }

    public Integer getIsList() {
        return isList;
    }

    public void setIsList(Integer isList) {
        this.isList = isList;
    }

    public Byte getSfvDownload() {
        return sfvDownload;
    }

    public void setSfvDownload(Byte sfvDownload) {
        this.sfvDownload = sfvDownload;
    }

    public Byte getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(Byte orderSort) {
        this.orderSort = orderSort;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}