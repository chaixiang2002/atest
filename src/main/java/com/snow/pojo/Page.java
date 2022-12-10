package com.snow.pojo;

import java.util.List;

public class Page<T> {
    private Integer totalCount;//总页数
    private List<T> rows;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
