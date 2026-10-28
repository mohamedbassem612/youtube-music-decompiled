package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfm implements zfr {
    private final Context a;
    private llx b;
    private klt c;
    private final ahey d;
    private final mbc e;
    private final zjr f;
    private final AtomicBoolean g = new AtomicBoolean();

    public zfm(Context context, ahey aheyVar, mbc mbcVar, zjr zjrVar) {
        this.a = context;
        this.d = aheyVar;
        this.e = mbcVar;
        this.f = zjrVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    private static final zfp d(int i, llx llxVar, klt kltVar, boolean z, int i2) throws Throwable {
        zfp zfpVar;
        llw llwVarP;
        try {
            mda.o(kltVar.c(llxVar, new knd[0]), i2, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException e) {
            e = e;
            if (z) {
                throw e;
            }
            zfpVar = new zfp(mda.p(i, 5));
            return zfpVar;
        } catch (RuntimeException e2) {
            e = e2;
            if (z) {
                throw e;
            }
            zfpVar = new zfp(mda.p(i, 5));
            return zfpVar;
        } catch (ExecutionException e3) {
            if (!z) {
                throw e3;
            }
            try {
                llwVarP = mda.p(i, 3);
            } catch (ClassCastException unused) {
                llwVarP = mda.p(i, 5);
            }
            zfpVar = new zfp(llwVarP);
            return zfpVar;
        } catch (TimeoutException e4) {
            if (!z) {
                throw new zfq(e4);
            }
            zfpVar = new zfp(mda.p(i, 4));
            return zfpVar;
        }
    }

    @Override // defpackage.zfr
    public final zfp a(byte[] bArr, int i, apbm apbmVar, xir xirVar) throws Throwable {
        b(xirVar);
        zkf.d(this.c);
        zkf.d(this.b);
        mbc mbcVar = this.e;
        long epochMilli = mbcVar.f().toEpochMilli();
        zfp zfpVarC = c(bArr, i, apbmVar, this.b, this.c, xirVar);
        this.d.execute(afwl.i(new zfl(xirVar, epochMilli, mbcVar.f().toEpochMilli(), 1)));
        return zfpVarC;
    }

    @Override // defpackage.zfr
    public final void b(xir xirVar) {
        if (this.g.getAndSet(true)) {
            return;
        }
        mbc mbcVar = this.e;
        long epochMilli = mbcVar.f().toEpochMilli();
        this.b = new lmf(this.a);
        this.c = klt.a;
        this.d.execute(afwl.i(new zfl(xirVar, epochMilli, mbcVar.f().toEpochMilli(), 2)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    final zfp c(byte[] bArr, int i, apbm apbmVar, llx llxVar, klt kltVar, xir xirVar) throws Throwable {
        klo kloVar;
        int i2;
        Throwable th;
        boolean z = this.f.aa().k;
        mbc mbcVar = this.e;
        int i3 = apbmVar.g;
        long epochMilli = mbcVar.f().toEpochMilli();
        zfp zfpVarD = d(i, llxVar, kltVar, z, i3);
        this.d.execute(afwl.i(new zfl(xirVar, epochMilli, mbcVar.f().toEpochMilli(), 0)));
        if (zfpVarD != null) {
            return zfpVarD;
        }
        int i4 = apbmVar.f;
        int i5 = 9;
        try {
            ListenableFuture listenableFutureBp = qnl.bp(llxVar.a(i, bArr));
            wvk wvkVar = new wvk(i5);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i6 = ahcs.c;
            ahcr ahcrVar = new ahcr(listenableFutureBp, wvkVar);
            listenableFutureBp.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
            return (zfp) ahcrVar.get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            th = e;
            if (z) {
                return new zfp(mda.p(i, 7));
            }
            throw th;
        } catch (RuntimeException e2) {
            e = e2;
            th = e;
            if (z) {
                return new zfp(mda.p(i, 7));
            }
            throw th;
        } catch (ExecutionException e3) {
            if (!z) {
                throw e3;
            }
            llw llwVarP = mda.p(i, 7);
            try {
                kmu kmuVar = (kmu) agfv.b(e3, kmu.class);
                if (kmuVar != null) {
                    Status status = kmuVar.a;
                    String strB = status.b();
                    int iHashCode = strB.hashCode();
                    if (iHashCode != -1554024582) {
                        if (iHashCode != 633155148) {
                            if (iHashCode == 948995383 && strB.equals("Generating PO Token failed.")) {
                                llwVarP = mda.p(i, 9);
                            } else {
                                kloVar = status.i;
                                if (kloVar != null && ((i2 = kloVar.c) == 1 || i2 == 2 || i2 == 3 || i2 == 9 || i2 == 16 || i2 == 23)) {
                                    llwVarP = mda.p(i, 3);
                                }
                            }
                        } else if (strB.equals("Invalid mode")) {
                            llwVarP = mda.p(i, 8);
                        } else {
                            kloVar = status.i;
                            if (kloVar != null) {
                                llwVarP = mda.p(i, 3);
                            }
                        }
                    } else if (strB.equals("Unable to generate a new integrity token.")) {
                        llwVarP = mda.p(i, 10);
                    } else {
                        kloVar = status.i;
                        if (kloVar != null) {
                            llwVarP = mda.p(i, 3);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
            return new zfp(llwVarP);
        } catch (TimeoutException e4) {
            if (z) {
                return new zfp(mda.p(i, 6));
            }
            throw e4;
        }
    }
}
