package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceMetadata {
    final ArrayList dependencies;
    final boolean enableModuleHashing;
    final String resourceIdentifier;
    final ResourceSource resourceSource;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;

    public ResourceMetadata(String str, ResourceType resourceType, Long l, ArrayList arrayList, String str2, boolean z, ResourceSource resourceSource) {
        this.resourceIdentifier = str;
        this.resourceType = resourceType;
        this.resourceTag = l;
        this.dependencies = arrayList;
        this.securityVerifier = str2;
        this.enableModuleHashing = z;
        this.resourceSource = resourceSource;
    }

    public ArrayList getDependencies() {
        return this.dependencies;
    }

    public boolean getEnableModuleHashing() {
        return this.enableModuleHashing;
    }

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ResourceSource getResourceSource() {
        return this.resourceSource;
    }

    public Long getResourceTag() {
        return this.resourceTag;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public String getSecurityVerifier() {
        return this.securityVerifier;
    }

    public String toString() {
        ResourceSource resourceSource = this.resourceSource;
        ArrayList arrayList = this.dependencies;
        return "ResourceMetadata{resourceIdentifier=" + this.resourceIdentifier + ",resourceType=" + String.valueOf(this.resourceType) + ",resourceTag=" + this.resourceTag + ",dependencies=" + String.valueOf(arrayList) + ",securityVerifier=" + this.securityVerifier + ",enableModuleHashing=" + this.enableModuleHashing + ",resourceSource=" + String.valueOf(resourceSource) + '}';
    }
}
