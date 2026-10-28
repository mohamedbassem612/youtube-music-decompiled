package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class EmlMobserveConfigRecord {
    final String androidInternalDirPath;
    final String androidPackageName;
    final long buildId;
    final long bytedataFileSize;
    final String bytedataUri;
    final long metadataFileSize;
    final String metadataUri;

    public EmlMobserveConfigRecord(long j, String str, String str2, long j2, long j3, String str3, String str4) {
        this.buildId = j;
        this.metadataUri = str;
        this.bytedataUri = str2;
        this.metadataFileSize = j2;
        this.bytedataFileSize = j3;
        this.androidPackageName = str3;
        this.androidInternalDirPath = str4;
    }

    public String getAndroidInternalDirPath() {
        return this.androidInternalDirPath;
    }

    public String getAndroidPackageName() {
        return this.androidPackageName;
    }

    public long getBuildId() {
        return this.buildId;
    }

    public long getBytedataFileSize() {
        return this.bytedataFileSize;
    }

    public String getBytedataUri() {
        return this.bytedataUri;
    }

    public long getMetadataFileSize() {
        return this.metadataFileSize;
    }

    public String getMetadataUri() {
        return this.metadataUri;
    }

    public String toString() {
        return "EmlMobserveConfigRecord{buildId=" + this.buildId + ",metadataUri=" + this.metadataUri + ",bytedataUri=" + this.bytedataUri + ",metadataFileSize=" + this.metadataFileSize + ",bytedataFileSize=" + this.bytedataFileSize + ",androidPackageName=" + this.androidPackageName + ",androidInternalDirPath=" + this.androidInternalDirPath + '}';
    }
}
