package app.rive;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFileAsset {
    public static final int $stable = 0;
    private final long assetId;
    private final String cdnBaseUrl;
    private final String cdnUuid;
    private final String fileExtension;
    private final String name;
    private final String registrationKey;
    private final int typeKey;

    public RiveFileAsset(String str, String str2, long j, String str3, String str4, String str5, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.name = str;
        this.registrationKey = str2;
        this.assetId = j;
        this.cdnUuid = str3;
        this.cdnBaseUrl = str4;
        this.fileExtension = str5;
        this.typeKey = i;
    }

    public static /* synthetic */ RiveFileAsset copy$default(RiveFileAsset riveFileAsset, String str, String str2, long j, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = riveFileAsset.name;
        }
        if ((i2 & 2) != 0) {
            str2 = riveFileAsset.registrationKey;
        }
        if ((i2 & 4) != 0) {
            j = riveFileAsset.assetId;
        }
        if ((i2 & 8) != 0) {
            str3 = riveFileAsset.cdnUuid;
        }
        if ((i2 & 16) != 0) {
            str4 = riveFileAsset.cdnBaseUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = riveFileAsset.fileExtension;
        }
        if ((i2 & 64) != 0) {
            i = riveFileAsset.typeKey;
        }
        return riveFileAsset.copy(str, str2, j, str3, str4, str5, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.registrationKey;
    }

    public final long component3() {
        return this.assetId;
    }

    public final String component4() {
        return this.cdnUuid;
    }

    public final String component5() {
        return this.cdnBaseUrl;
    }

    public final String component6() {
        return this.fileExtension;
    }

    public final int component7() {
        return this.typeKey;
    }

    public final RiveFileAsset copy(String str, String str2, long j, String str3, String str4, String str5, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new RiveFileAsset(str, str2, j, str3, str4, str5, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiveFileAsset) {
            RiveFileAsset riveFileAsset = (RiveFileAsset) obj;
            if (awrc.c(this.name, riveFileAsset.name) && awrc.c(this.registrationKey, riveFileAsset.registrationKey) && this.assetId == riveFileAsset.assetId && awrc.c(this.cdnUuid, riveFileAsset.cdnUuid) && awrc.c(this.cdnBaseUrl, riveFileAsset.cdnBaseUrl) && awrc.c(this.fileExtension, riveFileAsset.fileExtension) && this.typeKey == riveFileAsset.typeKey) {
                return true;
            }
        }
        return false;
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final String getCdnBaseUrl() {
        return this.cdnBaseUrl;
    }

    public final String getCdnUuid() {
        return this.cdnUuid;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegistrationKey() {
        return this.registrationKey;
    }

    public final int getTypeKey() {
        return this.typeKey;
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.registrationKey.hashCode()) * 31) + RiveFileAsset$$ExternalSyntheticBackport0.m(this.assetId)) * 31) + this.cdnUuid.hashCode()) * 31) + this.cdnBaseUrl.hashCode()) * 31) + this.fileExtension.hashCode()) * 31) + this.typeKey;
    }

    public String toString() {
        return "RiveFileAsset(name=" + this.name + ", registrationKey=" + this.registrationKey + ", assetId=" + this.assetId + ", cdnUuid=" + this.cdnUuid + ", cdnBaseUrl=" + this.cdnBaseUrl + ", fileExtension=" + this.fileExtension + ", typeKey=" + this.typeKey + ')';
    }
}
