package com.google.android.icing;

import android.util.Log;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class IcingSearchEngineImpl implements Closeable {
    private boolean a = false;
    private long nativePointer;

    static {
        System.loadLibrary("icing");
    }

    public IcingSearchEngineImpl(byte[] bArr) {
        long jNativeCreate = nativeCreate(bArr);
        this.nativePointer = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        Log.e("IcingSearchEngineImpl", "Failed to create IcingSearchEngineImpl.");
        throw new IllegalStateException("Failed to create IcingSearchEngineImpl.");
    }

    private static native byte[] nativeBatchGet(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    public static native byte[] nativeBatchPut(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativeClearAndDestroy(IcingSearchEngineImpl icingSearchEngineImpl);

    private static native byte[] nativeCommitBlob(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native long nativeCreate(byte[] bArr);

    public static native byte[] nativeDelete(IcingSearchEngineImpl icingSearchEngineImpl, String str, String str2);

    private static native byte[] nativeDeleteByNamespace(IcingSearchEngineImpl icingSearchEngineImpl, String str);

    public static native byte[] nativeDeleteByQuery(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr, boolean z);

    private static native byte[] nativeDeleteBySchemaType(IcingSearchEngineImpl icingSearchEngineImpl, String str);

    private static native void nativeDestroy(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativeGet(IcingSearchEngineImpl icingSearchEngineImpl, String str, String str2, byte[] bArr);

    private static native byte[] nativeGetAllBlobInfos(IcingSearchEngineImpl icingSearchEngineImpl);

    private static native byte[] nativeGetAllNamespaces(IcingSearchEngineImpl icingSearchEngineImpl);

    private static native byte[] nativeGetDebugInfo(IcingSearchEngineImpl icingSearchEngineImpl, int i);

    public static native String nativeGetLoggingTag();

    public static native byte[] nativeGetNextPage(IcingSearchEngineImpl icingSearchEngineImpl, long j, long j2);

    public static native byte[] nativeGetNextPageWithRequestProto(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr, long j);

    public static native byte[] nativeGetOptimizeInfo(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativeGetSchema(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativeGetSchemaForDatabase(IcingSearchEngineImpl icingSearchEngineImpl, String str);

    private static native byte[] nativeGetSchemaType(IcingSearchEngineImpl icingSearchEngineImpl, String str);

    public static native byte[] nativeGetStorageInfo(IcingSearchEngineImpl icingSearchEngineImpl);

    private static native byte[] nativeHandleExpiredDocuments(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativeInitialize(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native void nativeInvalidateNextPageToken(IcingSearchEngineImpl icingSearchEngineImpl, long j);

    private static native byte[] nativeMaintainAnnIndex(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativeOpenReadBlob(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativeOpenWriteBlob(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    public static native byte[] nativeOptimize(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativePersistToDisk(IcingSearchEngineImpl icingSearchEngineImpl, int i);

    public static native byte[] nativePut(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativePutBlobInfos(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativeRemoveBlob(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native byte[] nativeReportUsage(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    public static native byte[] nativeReset(IcingSearchEngineImpl icingSearchEngineImpl);

    public static native byte[] nativeSearch(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr, byte[] bArr2, byte[] bArr3, long j);

    private static native byte[] nativeSearchSuggestions(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    public static native boolean nativeSetLoggingLevel(short s, short s2);

    private static native byte[] nativeSetSchema(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr, boolean z);

    public static native byte[] nativeSetSchemaWithRequestProto(IcingSearchEngineImpl icingSearchEngineImpl, byte[] bArr);

    private static native boolean nativeShouldLog(short s, short s2);

    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Trying to use a closed IcingSearchEngineImpl instance.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.nativePointer != 0) {
            nativeDestroy(this);
        }
        this.nativePointer = 0L;
        this.a = true;
    }
}
