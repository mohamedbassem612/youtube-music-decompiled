package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axmq {
    public final long a;
    public final Object b;

    public axmq(mbc mbcVar, long j) {
        mbcVar.getClass();
        this.b = mbcVar;
        ahno.F(j > 0);
        this.a = mbcVar.b() + j;
    }

    public axmq(long j, Object obj, byte[] bArr) {
        this.a = j;
        this.b = obj;
    }

    public axmq(abtd abtdVar, long j) {
        this.b = abtdVar;
        this.a = j;
    }

    public axmq(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    public axmq(aogd aogdVar, long j) {
        this.b = aogdVar.b;
        this.a = j + TimeUnit.SECONDS.toMillis(aogdVar.d);
    }

    public axmq(lfv lfvVar, String str) {
        this.b = str;
        lfvVar.aV();
        this.a = SystemClock.elapsedRealtime();
    }

    public axmq(long j, Object obj) {
        this.a = j;
        this.b = obj;
    }

    public axmq(List list, long j) {
        this.b = agke.n(list);
        this.a = j;
    }
}
