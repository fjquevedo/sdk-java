package com.manywho.sdk.api.run.elements.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.manywho.sdk.api.run.EngineValue;

import java.util.List;

public class PageContainerDataResponse {
    private String pageContainerId;
    @JsonProperty("isEnabled")
    private boolean enabled;
    @JsonProperty("isEditable")
    private boolean editable;
    @JsonProperty("isVisible")
    private boolean visible;
    private List<EngineValue> tags;

    public String getPageContainerId() {
        return pageContainerId;
    }

    public void setPageContainerId(String pageContainerId) {
        this.pageContainerId = pageContainerId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.enabled = isEnabled;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean isEditable) {
        this.editable = isEditable;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean isVisible) {
        this.visible = isVisible;
    }

    public List<EngineValue> getTags() {
        return tags;
    }

    public void setTags(List<EngineValue> tags) {
        this.tags = tags;
    }
}