package com.google.android.libraries.multiplatform.elements.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CollectionsImpl {
    private CollectionsImpl() {
    }

    public static native long jniCreateDataSourceDelegate(byte[] bArr, Object obj, Object obj2, String str, Object obj3, boolean z);

    public static native void jniDeleteDataSourceDelegate(long j);

    public static native byte[] jniGetElementBytesByKey(long j, String str);

    public static native String[] jniGetIdentifiers(long j);

    public static native int jniGetSize(long j);

    public static native void jniLoadMore(long j);

    public static native void jniMoveItem(long j, int i, int i2);

    public static native void jniReload(long j);

    public static native void jniRemoveItem(long j, int i);
}
