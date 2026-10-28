package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class seb extends sdx {
    private final tqj g;
    private final mbc h;
    private final long i;
    private final awmd j;
    private sea k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(Context context, String str, ajbd ajbdVar, vwt vwtVar, boolean z, tqj tqjVar, abxu abxuVar, awmd awmdVar, mbc mbcVar, long j, awmd awmdVar2) {
        super(context, str, ajbdVar, vwtVar, z, tqjVar, abxuVar, awmdVar);
        context.getClass();
        str.getClass();
        vwtVar.getClass();
        tqjVar.getClass();
        abxuVar.getClass();
        awmdVar.getClass();
        this.g = tqjVar;
        this.h = mbcVar;
        this.i = j;
        this.j = awmdVar2;
    }

    @Override // defpackage.sdx, defpackage.sds
    public final ListenableFuture a(boolean z) {
        ListenableFuture listenableFutureO = ahng.o(k().d);
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    @Override // defpackage.sdx, defpackage.sds
    public final ListenableFuture b() {
        ListenableFuture listenableFutureO = ahng.o(k().c);
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    @Override // defpackage.sdx, defpackage.sds
    public final String d() {
        Object objW = ahng.w(k().c);
        objW.getClass();
        return (String) objW;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000d, B:9:0x0015, B:11:0x001b, B:13:0x002a, B:15:0x0030, B:17:0x0042, B:19:0x0047, B:23:0x0055), top: B:30:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000d, B:9:0x0015, B:11:0x001b, B:13:0x002a, B:15:0x0030, B:17:0x0042, B:19:0x0047, B:23:0x0055), top: B:30:0x0001 }] */
    public final synchronized sea k() {
        sea seaVar;
        long j;
        long epochMilli;
        seaVar = this.k;
        if (seaVar != null) {
            ListenableFuture listenableFuture = seaVar.c;
            if (listenableFuture.isCancelled() || seaVar.d.isCancelled()) {
                tqj tqjVar = this.g;
                int i = tqr.a;
                ListenableFuture listenableFutureA = super.a(tqjVar.k(1073808297));
                seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA);
                this.k = seaVar;
            } else if (listenableFuture.isDone()) {
                Object objV = ahng.v(listenableFuture);
                objV.getClass();
                String str = (String) objV;
                if (TextUtils.isEmpty(str) || j(str)) {
                    tqj tqjVar2 = this.g;
                    int i2 = tqr.a;
                    ListenableFuture listenableFutureA2 = super.a(tqjVar2.k(1073808297));
                    seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA2);
                    this.k = seaVar;
                } else {
                    j = seaVar.a;
                    epochMilli = this.h.f().toEpochMilli();
                    long j2 = this.i;
                    if (j <= epochMilli || epochMilli >= j + j2 || !TextUtils.equals(seaVar.b, l())) {
                        tqj tqjVar3 = this.g;
                        int i3 = tqr.a;
                        ListenableFuture listenableFutureA3 = super.a(tqjVar3.k(1073808297));
                        seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA3);
                        this.k = seaVar;
                    }
                }
            } else {
                j = seaVar.a;
                epochMilli = this.h.f().toEpochMilli();
                long j3 = this.i;
                if (j <= epochMilli) {
                    tqj tqjVar4 = this.g;
                    int i4 = tqr.a;
                    ListenableFuture listenableFutureA4 = super.a(tqjVar4.k(1073808297));
                    seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA4);
                    this.k = seaVar;
                } else {
                    tqj tqjVar5 = this.g;
                    int i5 = tqr.a;
                    ListenableFuture listenableFutureA5 = super.a(tqjVar5.k(1073808297));
                    seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA5);
                    this.k = seaVar;
                }
            }
        } else {
            tqj tqjVar6 = this.g;
            int i6 = tqr.a;
            ListenableFuture listenableFutureA6 = super.a(tqjVar6.k(1073808297));
            seaVar = new sea(this.h.f().toEpochMilli(), l(), super.b(), listenableFutureA6);
            this.k = seaVar;
        }
        return seaVar;
    }

    public final String l() {
        zwa zwaVarE = ((zwb) this.j.io()).e();
        if (zwaVarE != null) {
            return zwaVarE.k();
        }
        return null;
    }
}
