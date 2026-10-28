package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceCheck {
    final String buildLabel;
    final ArrayList resourceStatuses;

    public ResourceCheck(String str, ArrayList arrayList) {
        this.buildLabel = str;
        this.resourceStatuses = arrayList;
    }

    public String getBuildLabel() {
        return this.buildLabel;
    }

    public ArrayList getResourceStatuses() {
        return this.resourceStatuses;
    }

    public String toString() {
        return "ResourceCheck{buildLabel=" + this.buildLabel + ",resourceStatuses=" + String.valueOf(this.resourceStatuses) + '}';
    }
}
