package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.OnPoTokenMintedCallback;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zfj implements zfs {
    public final zjr b;
    public final agfr c;
    public final mbc d;
    public final xir e;
    public final xeu f;
    public final Context g;
    public final zjh h;
    public final Map i;
    private final ahey j;
    public final Lock a = new ReentrantLock();
    private final agfr k = aguu.al(new zaz(this, 7));

    public zfj(zjr zjrVar, agfr agfrVar, mbc mbcVar, ahey aheyVar, xit xitVar, xeu xeuVar, Context context) {
        this.b = zjrVar;
        this.c = agfrVar;
        this.d = mbcVar;
        this.j = aheyVar;
        this.e = xitVar.o(SemanticState.Focused);
        this.f = xeuVar;
        this.g = context;
        int iC = (int) zjrVar.i.c(46, 45769645L, 0L);
        this.i = new zfh(iC, iC);
        this.h = new zjh(new zaz(zjrVar, 8));
    }

    public static final void l(zfi zfiVar) {
        if (zfiVar.a != null) {
            zfiVar.a.cancel(true);
        }
        if (zfiVar.e != null) {
            zfiVar.e.cancel(true);
        }
    }

    @Override // defpackage.zfs
    public final zfp a() {
        return d();
    }

    @Override // defpackage.zfs
    public final zfp b(zfe zfeVar) {
        String strAD = zik.aD(zfeVar);
        if (strAD == null) {
            return c();
        }
        Lock lock = this.a;
        lock.lock();
        try {
            Map map = this.i;
            zfi zfiVar = (zfi) map.get(strAD);
            if (zfiVar == null) {
                zfiVar = new zfi(c());
                map.put(strAD, zfiVar);
            } else if (!zfiVar.b.a()) {
                zfp zfpVar = zfiVar.b;
                lock.unlock();
                return zfpVar;
            }
            h(zfiVar, strAD, zik.aC(zfeVar));
            zfp zfpVar2 = zfiVar.b;
            this.a.unlock();
            return zfpVar2;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public final zfp c() {
        return (zfp) this.k.io();
    }

    public final zfp d() {
        int iAS;
        zjr zjrVar = this.b;
        int i = 1;
        if (zjrVar != null && (iAS = a.aS(zjrVar.aa().h)) != 0) {
            i = iAS;
        }
        return new zfp(mda.p(zik.aF(i), 2));
    }

    @Override // defpackage.zfs
    public final Throwable e(zfe zfeVar) {
        String strAD = zik.aD(zfeVar);
        Throwable th = null;
        if (strAD != null) {
            Lock lock = this.a;
            lock.lock();
            try {
                zfi zfiVar = (zfi) this.i.get(strAD);
                if (zfiVar == null) {
                    lock.unlock();
                } else {
                    th = zfiVar.d;
                    this.a.unlock();
                }
            } catch (Throwable th2) {
                this.a.unlock();
                throw th2;
            }
        }
        return th;
    }

    @Override // defpackage.zfs
    public final void f() {
        xir xirVar = this.e;
        xirVar.k();
        mbc mbcVar = this.d;
        long epochMilli = mbcVar.f().toEpochMilli();
        c();
        this.j.execute(afwl.i(new ywg(this, epochMilli, mbcVar.f().toEpochMilli(), 2)));
        ((zfr) this.c.io()).b(xirVar);
    }

    @Override // defpackage.zfs
    public final void g() {
        this.a.lock();
        try {
            Map map = this.i;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                l((zfi) it.next());
            }
            map.clear();
        } finally {
            this.a.unlock();
        }
    }

    public final void h(zfi zfiVar, final String str, final int i) {
        int i2 = 1;
        if ((zfiVar.f != 1 && zfiVar.f != 4) || zfiVar.a == null || zfiVar.a.isDone()) {
            if (zfiVar.f == 2 || zfiVar.f == 3) {
                zfiVar.f = 4;
            }
            zfiVar.a = this.j.submit(afwl.j(new wci(this, str, 15)));
            taf.i(zfiVar.a, MoreExecutors.directExecutor(), new tab() { // from class: zff
                @Override // defpackage.twi
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final void a(Throwable th) {
                    int iA;
                    zfj zfjVar = this.a;
                    apbm apbmVarAa = zfjVar.b.aa();
                    boolean z = apbmVarAa.j;
                    String str2 = str;
                    int i3 = i;
                    if (z) {
                        iA = -1;
                    } else {
                        klt kltVar = klt.a;
                        iA = kml.a(zfjVar.g);
                    }
                    Lock lock = zfjVar.a;
                    lock.lock();
                    try {
                        zfi zfiVar2 = (zfi) zfjVar.i.get(str2);
                        if (zfiVar2 == null) {
                            lock.unlock();
                            return;
                        }
                        zfiVar2.f = 3;
                        AtomicInteger atomicInteger = zfiVar2.c;
                        atomicInteger.incrementAndGet();
                        zfiVar2.d = th;
                        zik.aE(zfjVar.f, th, i3, !zfiVar2.b.a(), iA);
                        if (zfiVar2.b.a()) {
                            int iAS = a.aS(apbmVarAa.h);
                            zfiVar2.b = new zfp(mda.p(zik.aF(iAS != 0 ? iAS : 1), 7));
                        }
                        zfjVar.k(zik.aB(apbmVarAa, atomicInteger.get(), zfjVar.h), zfiVar2, str2, i3);
                        zfjVar.a.unlock();
                    } catch (Throwable th2) {
                        zfjVar.a.unlock();
                        throw th2;
                    }
                }
            }, new aegv(this, str, i, i2), null);
        }
    }

    @Override // defpackage.zfs
    public final void i(OnPoTokenMintedCallback onPoTokenMintedCallback, final zfe zfeVar) {
        zjr zjrVar = this.b;
        if (zjrVar.aa().c) {
            String strAD = zik.aD(zfeVar);
            if (strAD == null) {
                if (zjrVar.aP()) {
                    onPoTokenMintedCallback.onPoTokenMinted(c().b);
                    return;
                }
                return;
            }
            this.a.lock();
            try {
                zfp zfpVar = ((zfi) j$.util.Map.EL.computeIfAbsent(this.i, strAD, new Function() { // from class: zfg
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public final /* synthetic */ Function mo840andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        zfj zfjVar = this.a;
                        zfi zfiVar = new zfi(zfjVar.c());
                        zfjVar.h(zfiVar, (String) obj, zik.aC(zfeVar));
                        return zfiVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).b;
                this.a.unlock();
                if (!this.b.aP() || zfpVar == null) {
                    return;
                }
                onPoTokenMintedCallback.onPoTokenMinted(zfpVar.b);
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        }
    }

    @Override // defpackage.zfs
    public final void j(zfe zfeVar) {
        String strAD = zik.aD(zfeVar);
        if (strAD != null) {
            Lock lock = this.a;
            lock.lock();
            try {
                Map map = this.i;
                zfi zfiVar = (zfi) map.get(strAD);
                if (zfiVar == null) {
                    zfiVar = new zfi(c());
                    map.put(strAD, zfiVar);
                } else if (!zfiVar.b.a()) {
                    lock.unlock();
                    return;
                }
                h(zfiVar, strAD, zik.aC(zfeVar));
                this.a.unlock();
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        }
    }

    public final void k(int i, zfi zfiVar, String str, int i2) {
        if (i > 0) {
            if (zfiVar.e != null) {
                zfiVar.e.cancel(true);
            }
            zfiVar.e = this.j.schedule(afwl.i(new ikm(this, zfiVar, str, i2, 5)), i, TimeUnit.MILLISECONDS);
        }
    }
}
