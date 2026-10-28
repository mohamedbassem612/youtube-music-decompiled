package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.OnPoTokenMintedCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfo implements zfs {
    public final agfr a;
    public final ahey b;
    public final zjr c;
    public final xir d;
    public final mbc e;
    public final xeu f;
    public final zwb g;
    public final zjh h;
    public zfp j;
    public Throwable k;
    public final Context m;
    public final ci n;
    private ListenableFuture o;
    private ahew p;
    public final AtomicBoolean i = new AtomicBoolean(false);
    public int l = 0;
    private final AtomicBoolean q = new AtomicBoolean(false);

    public zfo(agfr agfrVar, ahey aheyVar, zjr zjrVar, xit xitVar, xeu xeuVar, zwb zwbVar, ci ciVar, mbc mbcVar, Context context) {
        this.a = agfrVar;
        this.b = aheyVar;
        this.c = zjrVar;
        this.f = xeuVar;
        this.g = zwbVar;
        this.n = ciVar;
        this.e = mbcVar;
        this.d = xitVar.o(SemanticState.Focused);
        this.h = new zjh(new yyp(zjrVar, 5));
        this.m = context;
    }

    private final synchronized void h(final apbm apbmVar) {
        ListenableFuture listenableFuture = this.o;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            zhr.a(zhq.PO, "Token creation already in progress.");
            return;
        }
        iqb iqbVar = new iqb(this, new jxq(this, apbmVar, 16), new yyp(apbmVar, 4), 10);
        long j = afwl.a;
        ahcz ahczVar = new ahcz(afty.c(false), iqbVar, 1);
        ahey aheyVar = this.b;
        ahfo ahfoVar = new ahfo(ahczVar);
        aheyVar.execute(ahfoVar);
        this.o = ahfoVar;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        tab tabVar = new tab() { // from class: zfn
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                zfp zfpVar;
                apbm apbmVar2 = apbmVar;
                zfo zfoVar = this.a;
                synchronized (zfoVar) {
                    zfoVar.l++;
                    zfoVar.k = th;
                    if (apbmVar2.j) {
                        zik.aE(zfoVar.f, th, 1, zfoVar.j != null, -1);
                    } else {
                        xeu xeuVar = zfoVar.f;
                        boolean z = zfoVar.j != null;
                        klt kltVar = klt.a;
                        zik.aE(xeuVar, th, 1, z, kml.a(zfoVar.m));
                    }
                    if (zfoVar.c.aa().k && (zfpVar = zfoVar.j) != null && zfpVar.a()) {
                        int iAS = a.aS(apbmVar2.h);
                        zfoVar.j = new zfp(mda.p(zik.aF(iAS != 0 ? iAS : 1), 7));
                    }
                    zfoVar.d(zik.aB(apbmVar2, zfoVar.l, zfoVar.h));
                }
            }
        };
        hve hveVar = new hve(this, apbmVar, 2);
        Executor executor = taf.a;
        ahfoVar.addListener(new ahei(ahfoVar, new afwj(afty.c(false), new taa(hveVar, null, tabVar), 0)), executorDirectExecutor);
    }

    @Override // defpackage.zfs
    public final zfp a() {
        int iAS = a.aS(this.c.aa().h);
        int i = 1;
        if (iAS != 0 && iAS == 3) {
            i = 2;
        }
        return new zfp(mda.p(i, 2));
    }

    @Override // defpackage.zfs
    public final synchronized zfp b(zfe zfeVar) {
        zjr zjrVar = this.c;
        if (!zjrVar.aa().c && !zjrVar.aa().k) {
            return null;
        }
        if (this.j == null && zjrVar.aa().c && !this.q.get()) {
            this.j = a();
            c();
        }
        return this.j;
    }

    public final void c() {
        apbm apbmVarAa = this.c.aa();
        if (apbmVarAa.c) {
            this.q.compareAndSet(false, true);
            h(apbmVarAa);
        }
    }

    public final synchronized void d(int i) {
        if (i > 0) {
            synchronized (this) {
                try {
                    ahew ahewVar = this.p;
                    if (ahewVar != null) {
                        ahewVar.cancel(true);
                    }
                    this.p = this.b.schedule(new yas(this, 6, null), i, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.zfs
    public final synchronized Throwable e(zfe zfeVar) {
        return this.k;
    }

    @Override // defpackage.zfs
    public final synchronized void f() throws Throwable {
        zfo zfoVar;
        try {
            try {
                xir xirVar = this.d;
                xirVar.k();
                if (this.c.aa().k) {
                    mbc mbcVar = this.e;
                    long epochMilli = mbcVar.f().toEpochMilli();
                    this.j = a();
                    long epochMilli2 = mbcVar.f().toEpochMilli();
                    zfoVar = this;
                    this.b.execute(afwl.i(new zfl(zfoVar, epochMilli, epochMilli2, 4)));
                } else {
                    zfoVar = this;
                }
                ((zfr) zfoVar.a.io()).b(xirVar);
                zfoVar.c();
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // defpackage.zfs
    public final synchronized void g() throws Throwable {
        try {
            try {
                ListenableFuture listenableFuture = this.o;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                    this.o = null;
                }
                mbc mbcVar = this.e;
                long epochMilli = mbcVar.f().toEpochMilli();
                this.j = a();
                long epochMilli2 = mbcVar.f().toEpochMilli();
                this.b.execute(afwl.i(new ywg(this, epochMilli, epochMilli2, 3)));
                c();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.zfs
    public final void i(OnPoTokenMintedCallback onPoTokenMintedCallback, zfe zfeVar) {
        apbm apbmVarAa = this.c.aa();
        if (apbmVarAa.c) {
            synchronized (this) {
                h(apbmVarAa);
                if (this.c.aP()) {
                    zfp zfpVarA = this.j;
                    if (zfpVarA == null) {
                        zfpVarA = a();
                    }
                    onPoTokenMintedCallback.onPoTokenMinted(zfpVarA.b);
                }
            }
        }
    }

    @Override // defpackage.zfs
    public final void j(zfe zfeVar) {
    }
}
