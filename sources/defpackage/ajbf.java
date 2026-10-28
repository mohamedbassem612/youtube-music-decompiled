package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajbf implements aihr {
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN(0),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE(4),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL(1),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL(2),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK(3);

    public final int f;

    ajbf(int i) {
        this.f = i;
    }

    public static ajbf a(int i) {
        if (i == 0) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL;
        }
        if (i == 2) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL;
        }
        if (i == 3) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK;
        }
        if (i != 4) {
            return null;
        }
        return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
