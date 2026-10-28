package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class StitchedMetadataCombinerWrapper extends SabrDataProviderWrapper {

    /* JADX INFO: compiled from: PG */
    public final class CompositeSegmentMetadata {
    }

    /* JADX INFO: compiled from: PG */
    public class Holder implements AutoCloseable {
        @Override // java.lang.AutoCloseable
        public final synchronized void close() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: PG */
    class NativeCallback {
        void onCompositeSegmentMetadata(long j, long j2, long j3, byte[] bArr, byte[] bArr2) {
            throw null;
        }
    }

    private static native long createNative(NativeCallback nativeCallback);
}
