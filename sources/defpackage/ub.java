package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.icing.IcingSearchEngineImpl;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ub implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public ub(bqi bqiVar, int i) {
        this.$cid = i;
        this.a = bqiVar;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, tw] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, tw] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long jElapsedRealtime;
        tj tjVarK;
        int i = 10;
        int i2 = 20;
        int i3 = 7;
        Object objA = null;
        switch (this.$cid) {
            case 0:
                uc ucVar = (uc) this.a;
                long j = ucVar.g;
                String str = ucVar.c;
                if (j != 0) {
                    tv tvVar = ucVar.a;
                    SystemClock.elapsedRealtime();
                    tvVar.b.readLock().lock();
                    try {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            tvVar.e();
                            boolean z = vo.a;
                            tvVar.c(str, j);
                            IcingSearchEngineImpl icingSearchEngineImpl = tvVar.e.a;
                            icingSearchEngineImpl.a();
                            IcingSearchEngineImpl.nativeInvalidateNextPageToken(icingSearchEngineImpl, j);
                            Map map = tvVar.c;
                            synchronized (map) {
                                Set set = (Set) map.get(str);
                                if (set != null) {
                                    set.remove(Long.valueOf(j));
                                } else {
                                    Log.e("AppSearchImpl", a.cf(j, "Failed to invalidate token ", ": tokens are not cached."));
                                }
                                break;
                            }
                            tvVar.j(jElapsedRealtime, SystemClock.elapsedRealtime(), 21);
                            tvVar.b.readLock().unlock();
                        } catch (Throwable th) {
                            th = th;
                            tvVar.j(jElapsedRealtime, SystemClock.elapsedRealtime(), 21);
                            tvVar.b.readLock().unlock();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        jElapsedRealtime = 0;
                    }
                }
                ucVar.i = true;
                return objA;
            case 1:
                Object obj = this.a;
                tz tzVar = tz.a;
                xsc xscVar = (xsc) obj;
                Object obj2 = xscVar.b;
                ?? r3 = xscVar.c;
                ?? r4 = xscVar.a;
                if (tzVar == null) {
                    synchronized (tz.class) {
                        if (tz.a == null) {
                            tz.a = new tz((Context) obj2, r3, r4);
                        }
                        break;
                    }
                }
                return new ug(tz.a.b, xscVar.c, (Context) xscVar.b, xscVar.a);
            case 2:
                uc ucVar2 = (uc) this.a;
                if (ucVar2.h) {
                    ucVar2.h = false;
                    String str2 = ucVar2.d;
                    ucVar2.k = 1;
                    tw twVar = ucVar2.j;
                    String str3 = ucVar2.c;
                    un unVar = new un(1, str3);
                    unVar.b = str2;
                    tjVarK = ucVar2.a.k(str3, str2, ucVar2.e, ucVar2.f, unVar);
                    twVar.c(unVar.a());
                } else {
                    if (ucVar2.g == 0) {
                        return Collections.EMPTY_LIST;
                    }
                    tw twVar2 = ucVar2.j;
                    int i4 = ucVar2.k;
                    String str4 = ucVar2.c;
                    un unVar2 = new un(i4, str4);
                    unVar2.b = ucVar2.d;
                    tj tjVarI = ucVar2.a.i(str4, ucVar2.g, unVar2);
                    twVar2.c(unVar2.a());
                    tjVarK = tjVarI;
                }
                ucVar2.g = tjVarK.a;
                return tjVarK.a();
            case 3:
                ug ugVar = (ug) this.a;
                ugVar.a.q(luv.FULL, ugVar.c);
                ugVar.g = true;
                return null;
            case 4:
                ug ugVar2 = (ug) this.a;
                return ugVar2.a.n(ugVar2.d, ugVar2.e);
            case 5:
                ug ugVar3 = (ug) this.a;
                ugVar3.a.q(luv.FULL, ugVar3.c);
                return null;
            case 6:
                Object obj3 = this.a;
                ((bqi) obj3).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    objA = ((bqi) obj3).a();
                    Binder.flushPendingCommands();
                    ((bqi) this.a).d(objA);
                    return objA;
                } catch (Throwable th3) {
                    try {
                        ((bqi) this.a).d.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        ((bqi) this.a).d(objA);
                        throw th4;
                    }
                }
            case 7:
                return new fyg((kyr) ((giy) this.a).c);
            case 8:
                return new fxx((fyl) ((giy) this.a).d);
            case 9:
                Object objIo = ((hie) this.a).g.io();
                objIo.getClass();
                hpy hpyVar = (hpy) objIo;
                return avlr.N(hpyVar.f(anyo.class), hpyVar.f(anuc.class), hpyVar.f(anjq.class)).g(avla.e).H(new hbn(new hhn(3), i3));
            case 10:
                return (hlp) this.a.io();
            case 11:
                return this.a;
            case 12:
                return hmy.a(this.a);
            case 13:
                return hmy.a(this.a);
            case 14:
                aigj aigjVar = hpb.a;
                objA = new ArrayList();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    Optional optional = (Optional) ahng.v((ListenableFuture) it.next());
                    hge hgeVar = new hge(objA, i);
                    if (true == optional.isPresent()) {
                        hgeVar.a.add((hcg) optional.get());
                    }
                }
                return objA;
            case 15:
                int i5 = hpd.b;
                agjz agjzVar = new agjz(4);
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    agjzVar.h((hth) ahng.v((ListenableFuture) it2.next()));
                }
                return agjzVar.g();
            case 16:
                int i6 = hpd.b;
                agjz agjzVar2 = new agjz(4);
                Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    agjzVar2.h((aamp) ahng.v((ListenableFuture) it3.next()));
                }
                return agjzVar2.g();
            case 17:
                afx afxVar = new afx(0);
                afw afwVar = new afw((afx) this.a);
                while (afwVar.hasNext()) {
                    afxVar.addAll((Collection) ahng.v((ListenableFuture) afwVar.next()));
                }
                return agke.n(afxVar);
            case 18:
                return (agke) j$.util.Collection.EL.stream(this.a).map(new hpa(6)).filter(new hod(i3)).map(new hpa(i2)).collect(aghu.a);
            case 19:
                return (agke) j$.util.Collection.EL.stream(this.a).map(new hpa(19)).filter(new hod(i3)).map(new hpa(i2)).collect(aghu.a);
            default:
                return ((aanb) this.a).b();
        }
    }

    public /* synthetic */ ub(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
