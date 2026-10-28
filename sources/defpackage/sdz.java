package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sdz extends sdv {
    protected final mbc f;
    final long g;
    aeqc h;
    private final awmd i;
    private final tqj j;

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    public sdz(Context context, String str, ajbd ajbdVar, vwt vwtVar, mbc mbcVar, long j, awmd awmdVar, boolean z, tqj tqjVar, abxu abxuVar) {
        super(context, str, ajbdVar, vwtVar, z, tqjVar, abxuVar);
        this.f = mbcVar;
        ahno.O(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.g = j;
        this.i = awmdVar;
        tqjVar.getClass();
        this.j = tqjVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.sdv, defpackage.sds
    public final ListenableFuture a(boolean z) {
        return ahng.o(l().b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.sdv, defpackage.sds
    public final ListenableFuture b() {
        return ahng.o(l().c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sdv, defpackage.sds
    public final String d() {
        return (String) ahng.w(l().c);
    }

    protected final String k() {
        return ((zwb) this.i.io()).e().k();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000d, B:9:0x0015, B:11:0x001b, B:13:0x0027, B:15:0x002d, B:17:0x003f, B:19:0x0044, B:22:0x0078, B:21:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000d, B:9:0x0015, B:11:0x001b, B:13:0x0027, B:15:0x002d, B:17:0x003f, B:19:0x0044, B:22:0x0078, B:21:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    final synchronized aeqc l() {
        aeqc aeqcVar;
        long j;
        long epochMilli;
        aeqc aeqcVar2 = this.h;
        if (aeqcVar2 != null) {
            ?? r1 = aeqcVar2.c;
            if (r1.isCancelled() || aeqcVar2.b.isCancelled()) {
                tqj tqjVar = this.j;
                int i = tqr.a;
                this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar.k(1073808297)));
            } else if (r1.isDone()) {
                String str = (String) ahng.w(r1);
                if (TextUtils.isEmpty(str) || j(str)) {
                    tqj tqjVar2 = this.j;
                    int i2 = tqr.a;
                    this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar2.k(1073808297)));
                } else {
                    j = aeqcVar2.a;
                    epochMilli = this.f.f().toEpochMilli();
                    long j2 = this.g;
                    if (epochMilli >= j || epochMilli >= j + j2 || !TextUtils.equals(aeqcVar2.d, k())) {
                        tqj tqjVar3 = this.j;
                        int i3 = tqr.a;
                        this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar3.k(1073808297)));
                    }
                }
            } else {
                j = aeqcVar2.a;
                epochMilli = this.f.f().toEpochMilli();
                long j3 = this.g;
                if (epochMilli >= j) {
                    tqj tqjVar4 = this.j;
                    int i4 = tqr.a;
                    this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar4.k(1073808297)));
                } else {
                    tqj tqjVar5 = this.j;
                    int i5 = tqr.a;
                    this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar5.k(1073808297)));
                }
            }
        } else {
            tqj tqjVar6 = this.j;
            int i6 = tqr.a;
            this.h = new aeqc(super.b(), this.f.f().toEpochMilli(), k(), super.a(tqjVar6.k(1073808297)));
        }
        aeqcVar = this.h;
        aeqcVar.getClass();
        return aeqcVar;
    }
}
