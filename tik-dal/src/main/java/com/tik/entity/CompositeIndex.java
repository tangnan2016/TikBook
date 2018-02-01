package com.tik.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 综合指数
 * */
public class CompositeIndex {

    //日期
    private String daytime;

    //今日收盘指数
    private BigDecimal tValue;

    //今开
    private BigDecimal opening;

    //最高
    private BigDecimal highest;

    //最低
    private BigDecimal lowest;

    //昨收
    private BigDecimal yGet;

    //成交量
    private BigDecimal volumes;

    //成交额
    private BigDecimal turnover;

    //总市值
    private BigDecimal totalMarketValue;

    //流通市值
    private BigDecimal capitalization;

    //振幅
    private BigDecimal amplitude;


    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public BigDecimal gettValue() {
        return tValue;
    }

    public void settValue(BigDecimal tValue) {
        this.tValue = tValue;
    }

    public BigDecimal getOpening() {
        return opening;
    }

    public void setOpening(BigDecimal opening) {
        this.opening = opening;
    }

    public BigDecimal getHighest() {
        return highest;
    }

    public void setHighest(BigDecimal highest) {
        this.highest = highest;
    }

    public BigDecimal getLowest() {
        return lowest;
    }

    public void setLowest(BigDecimal lowest) {
        this.lowest = lowest;
    }

    public BigDecimal getyGet() {
        return yGet;
    }

    public void setyGet(BigDecimal yGet) {
        this.yGet = yGet;
    }

    public BigDecimal getVolumes() {
        return volumes;
    }

    public void setVolumes(BigDecimal volumes) {
        this.volumes = volumes;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getTotalMarketValue() {
        return totalMarketValue;
    }

    public void setTotalMarketValue(BigDecimal totalMarketValue) {
        this.totalMarketValue = totalMarketValue;
    }

    public BigDecimal getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(BigDecimal capitalization) {
        this.capitalization = capitalization;
    }

    public BigDecimal getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(BigDecimal amplitude) {
        this.amplitude = amplitude;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
