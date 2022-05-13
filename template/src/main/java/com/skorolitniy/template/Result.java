package com.skorolitniy.template;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

public class Result {
    boolean status=false;

    public Result() {
        status=false;
    }

    public Result(boolean status) {
        this.status = status;
    }

    @Attr(propName = "status", value = "false")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
