package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.CuepointListOuterClass$CuepointContext;
import com.google.android.apps.youtube.proto.streaming.CuepointListOuterClass$CuepointList;
import defpackage.aigj;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.zik;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CuePointDataProviderWrapper extends SabrDataProviderWrapper {
    public final Executor a;

    /* JADX INFO: compiled from: PG */
    public class AdConfigData {
        public final aigj a;
        public final List b;

        public AdConfigData(aigj aigjVar, List list) {
            this.a = aigjVar;
            this.b = list;
        }
    }

    /* JADX INFO: compiled from: PG */
    public enum CuePointStatus {
        OK(0),
        RATE_CONTROL(1),
        SERVER_ERROR(2),
        INACTIVE(3),
        DELETED(4),
        RATE_CONTROL_BY_CLIENT(11),
        NO_DAI_CONFIG_FROM_GAB(12),
        CACHE_MISS(13);

        public final int i;

        CuePointStatus(int i) {
            this.i = i;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Holder implements AutoCloseable {
        private final Executor a;
        private final Consumer b;
        private CuePointDataProviderWrapper c;

        public Holder(Executor executor, Consumer consumer) {
            this.a = executor;
            this.b = consumer;
        }

        public final synchronized CuePointDataProviderWrapper a() {
            return this.c;
        }

        public final synchronized void b() {
            if (this.c == null) {
                this.c = new CuePointDataProviderWrapper(this.a, this.b);
            }
        }

        @Override // java.lang.AutoCloseable
        public final synchronized void close() {
            CuePointDataProviderWrapper cuePointDataProviderWrapper = this.c;
            if (cuePointDataProviderWrapper != null) {
                cuePointDataProviderWrapper.close();
                this.c = null;
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    class NativeCallback {
        private final Consumer a;

        public NativeCallback(Consumer consumer) {
            this.a = consumer;
        }

        void onCuepointList(byte[] bArr) {
            try {
                for (CuepointListOuterClass$CuepointContext cuepointListOuterClass$CuepointContext : ((CuepointListOuterClass$CuepointList) aihn.parseFrom(CuepointListOuterClass$CuepointList.a, bArr)).b) {
                    if ((cuepointListOuterClass$CuepointContext.b & 1) != 0) {
                        this.a.r(cuepointListOuterClass$CuepointContext);
                    }
                }
            } catch (aiik unused) {
            }
        }
    }

    public CuePointDataProviderWrapper(Executor executor, Consumer consumer) {
        super(createNative(new NativeCallback(consumer), executor));
        this.a = executor;
    }

    private static native long createNative(NativeCallback nativeCallback, Executor executor);

    private native void nativeOnAdBreakFulfillmentStatusChanged(long j, String str, int i, byte[] bArr, String[] strArr);

    public final void a(String str, CuePointStatus cuePointStatus, AdConfigData adConfigData) {
        byte[] bArrG;
        String[] strArr;
        synchronized (zik.class) {
            if (c()) {
                return;
            }
            if (adConfigData != null) {
                String[] strArr2 = (String[]) adConfigData.b.toArray(new String[0]);
                bArrG = adConfigData.a.G();
                strArr = strArr2;
            } else {
                bArrG = null;
                strArr = null;
            }
            nativeOnAdBreakFulfillmentStatusChanged(b(), str, cuePointStatus.i, bArrG, strArr);
        }
    }

    public native void nativeSetDaiDisabledByNoConfig(long j);
}
