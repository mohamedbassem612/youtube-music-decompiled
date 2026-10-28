package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amzo implements aihr {
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_UNKNOWN(0),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE(1),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_CLIENT(8),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT(9),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE(2),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_ROOT_MEDIA_ID(10),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_MEDIA_ID(3),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_GET_CALLING_PACKAGE(7),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_CONTROLLER_INFO(5),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_BROWSER_INFO(6),
    MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CALLBACK_ARGUMENT(4);

    public final int l;

    amzo(int i) {
        this.l = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
