package com.google.android.libraries.youtube.logging.sampling;

import dalvik.annotation.optimization.FastNative;
import defpackage.aihf;
import defpackage.akfq;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.sqj;
import defpackage.vqe;
import defpackage.vxu;
import defpackage.xbo;
import defpackage.xeu;
import defpackage.xff;
import defpackage.xkq;
import defpackage.xks;
import defpackage.ztf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LogSamplerImpl implements xkq {
    public volatile boolean a = false;
    private final xeu b;

    public LogSamplerImpl(vxu vxuVar, xeu xeuVar) {
        this.b = xeuVar;
        vxuVar.a.h(new sqj(18)).C(new xbo(this, 9), new vqe(16));
    }

    public static native void configureLogSampler(byte[] bArr);

    @FastNative
    private static native void nativeDisableCoordination(int i);

    @FastNative
    private static native int[] nativeShouldCollect(int i);

    @FastNative
    private static native int[] nativeShouldCollectWithSeed(int i, long j);

    @FastNative
    private static native boolean nativeTriggerCoordination(int i);

    @Override // defpackage.xkq
    public final xks a(int i) {
        return xks.a(nativeShouldCollect(i - 1));
    }

    @Override // defpackage.xkq
    public final xks b(int i, long j) {
        return xks.a(nativeShouldCollectWithSeed(i - 1, j));
    }

    @Override // defpackage.xkq
    public final void c() {
        if (nativeTriggerCoordination(2)) {
            aihf aihfVarCreateBuilder = akfq.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akfq akfqVar = (akfq) aihfVarCreateBuilder.instance;
            akfqVar.c = 2;
            akfqVar.b |= 1;
            xeu xeuVar = this.b;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.COORDINATED_SAMPLING_TRIGGERED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            akfq akfqVar2 = (akfq) aihfVarCreateBuilder.build();
            akfqVar2.getClass();
            alouVar.d = akfqVar2;
            alouVar.c = 532;
            xeuVar.b((alou) alosVar.build());
        }
    }
}
