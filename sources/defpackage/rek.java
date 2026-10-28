package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaMetadataRetriever;
import android.util.Size;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rek implements reo {
    public final Object b = new Object();
    public final ExecutorService c;
    public final HashMap d;
    public final HashMap e;
    public final rgm f;
    public final ret g;
    public final req h;
    public final rii i;
    public quc j;
    public boolean k;
    boolean l;
    public nrc n;
    public final tld o;
    private final rhv p;
    private final rgc q;
    private int r;
    public static final rbm m = new rbm("rek");
    public static final Duration a = Duration.of(1, ChronoUnit.MICROS);

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, req] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ret] */
    public rek(uze uzeVar) {
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("composition-renderer-thread-%d");
        this.c = Executors.newSingleThreadExecutor(ahfi.a(ahfiVar));
        this.d = new HashMap();
        this.e = new HashMap();
        this.r = 0;
        new ArrayList();
        this.k = false;
        this.l = false;
        this.j = (quc) uzeVar.a;
        ?? r0 = uzeVar.b;
        this.h = r0;
        this.g = uzeVar.c;
        qyt qytVar = ((rdr) uzeVar.b).q;
        this.i = new rih(rdd.a().a(), this.j.f(), 1);
        int i = rgm.c;
        rgk rgkVar = new rgk();
        rgkVar.a = ((rdr) uzeVar.b).q.c;
        rgkVar.d = ((rdr) r0).q.a;
        rgm rgmVarA = rgkVar.a();
        this.f = rgmVarA;
        rhv rhvVar = new rhv();
        this.p = rhvVar;
        rgmVarA.i(rhvVar);
        this.o = new tld(this);
        qua quaVar = ((rdr) r0).q.a;
        rga rgaVar = new rga();
        rdr rdrVar = (rdr) r0;
        rgaVar.a = rdrVar.l;
        rgaVar.b = rdrVar.v;
        rgaVar.h = this.j.b;
        rgaVar.d = rdrVar.s;
        rgaVar.c = rdrVar.q.a.u ? r0.t() : null;
        rgaVar.i = ((rdr) r0).q.a;
        rgaVar.a.getClass();
        rgaVar.d.getClass();
        rfn rfnVar = rgaVar.b;
        rfnVar.getClass();
        rgaVar.i.getClass();
        if (rgaVar.c == null) {
            try {
                rgaVar.c = rfnVar.d("TextureFrameFlattener");
            } catch (bvn e) {
                ahxq ahxqVar = new ahxq("Failed to create a dedicated GL thread");
                ahxqVar.initCause(e);
                throw ahxqVar;
            }
        }
        if (rgaVar.e == null) {
            rgaVar.e = rgaVar.b.c(rgaVar.c.a().m, rgaVar.d.getWidth(), rgaVar.d.getHeight());
        }
        rgaVar.f = new rgh(rgaVar.a, rgaVar.i, true);
        rgaVar.c.c(new rcu(rgaVar, 17));
        this.q = new rgc(rgaVar);
        this.n = new nrc();
    }

    private final Duration l() {
        quc qucVar = this.j;
        return qucVar.p.plus(qucVar.f()).minus(a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            this.l = true;
        }
        rjs.b(this.c, "media composition renderer");
        synchronized (this) {
            this.e.clear();
            this.d.clear();
            tld tldVar = this.o;
            agke agkeVarN = tldVar.n();
            int i = ((agpi) agkeVarN).d;
            for (int i2 = 0; i2 < i; i2++) {
                AutoCloseable autoCloseable = (reo) agkeVarN.get(i2);
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    a.ar((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        throw new IllegalArgumentException();
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
            Object obj = tldVar.b;
            agqr it = agkz.n(((agwm) obj).e()).iterator();
            while (it.hasNext()) {
                ((agwm) obj).k((reo) it.next());
            }
            this.f.close();
            rgc rgcVar = this.q;
            if (rgcVar != null) {
                rjc rjcVar = rgcVar.a;
                rjcVar.e(new rcu(rgcVar, 16));
                rjcVar.b();
            }
        }
    }

    public final void e(rec recVar) {
        qxj qxjVar = recVar.f;
        qvu qvuVar = qxjVar.e;
        Object obj = null;
        reo reoVar = qvuVar != null ? (reo) this.d.get(qvuVar.m) : null;
        qvu qvuVar2 = qxjVar.f;
        reo reoVar2 = qvuVar2 != null ? (reo) this.d.get(qvuVar2.m) : null;
        tld tldVar = this.o;
        boolean z = true;
        if (reoVar == null && reoVar2 == null) {
            z = false;
        }
        ahno.F(z);
        agwm agwmVar = (agwm) tldVar.b;
        agwmVar.g(recVar);
        if (reoVar != null) {
            reo reoVar3 = (reo) aguu.M(agkz.n(agwmVar.f(reoVar)));
            if (reoVar3 instanceof rec) {
                recVar.h = reoVar3;
                agwmVar.j(reoVar3, tldVar.a);
                agwmVar.i(reoVar3, recVar);
            } else {
                recVar.h = reoVar;
                agwmVar.j(reoVar, tldVar.a);
                agwmVar.i(reoVar, recVar);
            }
            obj = tldVar.a;
        }
        if (reoVar2 != null) {
            agkz agkzVarN = agkz.n(agwmVar.f(reoVar2));
            recVar.i = reoVar2;
            agwmVar.i(reoVar2, recVar);
            obj = (reo) aguu.M(agkzVarN);
            if (obj instanceof rec) {
                ((rec) obj).h = recVar;
            }
            agwmVar.j(reoVar2, obj);
        }
        obj.getClass();
        agwmVar.i(recVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd A[Catch: all -> 0x01dd, TryCatch #8 {, blocks: (B:4:0x0003, B:8:0x000e, B:10:0x001b, B:51:0x0119, B:78:0x01b3, B:80:0x01bd, B:82:0x01c3, B:84:0x01ca, B:83:0x01c7, B:90:0x01d2, B:91:0x01da, B:12:0x0028, B:14:0x003b, B:15:0x0042, B:16:0x004e, B:18:0x0054, B:24:0x0078, B:29:0x0096, B:32:0x00a4, B:25:0x007b, B:26:0x0086, B:28:0x0092, B:34:0x00ac, B:35:0x00b2, B:37:0x00b8, B:39:0x00be, B:41:0x00c8, B:42:0x00d8, B:43:0x00e6, B:45:0x00ea, B:47:0x00f0, B:48:0x0103, B:50:0x0109, B:54:0x0123, B:57:0x0135, B:69:0x0146, B:74:0x0167, B:77:0x019e, B:55:0x012a), top: B:97:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3 A[Catch: all -> 0x01dd, TryCatch #8 {, blocks: (B:4:0x0003, B:8:0x000e, B:10:0x001b, B:51:0x0119, B:78:0x01b3, B:80:0x01bd, B:82:0x01c3, B:84:0x01ca, B:83:0x01c7, B:90:0x01d2, B:91:0x01da, B:12:0x0028, B:14:0x003b, B:15:0x0042, B:16:0x004e, B:18:0x0054, B:24:0x0078, B:29:0x0096, B:32:0x00a4, B:25:0x007b, B:26:0x0086, B:28:0x0092, B:34:0x00ac, B:35:0x00b2, B:37:0x00b8, B:39:0x00be, B:41:0x00c8, B:42:0x00d8, B:43:0x00e6, B:45:0x00ea, B:47:0x00f0, B:48:0x0103, B:50:0x0109, B:54:0x0123, B:57:0x0135, B:69:0x0146, B:74:0x0167, B:77:0x019e, B:55:0x012a), top: B:97:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7 A[Catch: all -> 0x01dd, TryCatch #8 {, blocks: (B:4:0x0003, B:8:0x000e, B:10:0x001b, B:51:0x0119, B:78:0x01b3, B:80:0x01bd, B:82:0x01c3, B:84:0x01ca, B:83:0x01c7, B:90:0x01d2, B:91:0x01da, B:12:0x0028, B:14:0x003b, B:15:0x0042, B:16:0x004e, B:18:0x0054, B:24:0x0078, B:29:0x0096, B:32:0x00a4, B:25:0x007b, B:26:0x0086, B:28:0x0092, B:34:0x00ac, B:35:0x00b2, B:37:0x00b8, B:39:0x00be, B:41:0x00c8, B:42:0x00d8, B:43:0x00e6, B:45:0x00ea, B:47:0x00f0, B:48:0x0103, B:50:0x0109, B:54:0x0123, B:57:0x0135, B:69:0x0146, B:74:0x0167, B:77:0x019e, B:55:0x012a), top: B:97:0x0003, inners: #0 }] */
    public final synchronized void f() {
        rfs rfsVar;
        rft rftVar;
        rfs rfsVarA;
        rhv rhvVar = this.p;
        ahno.P(rhvVar.b != null, "The sourceAdapter should have a backpressureSemaphore set by the processor chain.");
        if (rhvVar.b.tryAcquire()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                try {
                    rii riiVar = this.i;
                    Optional optionalOf = Optional.of(((rih) riiVar).a());
                    if (optionalOf.isEmpty()) {
                        rhvVar.b.release();
                    } else {
                        tld tldVar = this.o;
                        agqs agqsVarListIterator = tldVar.n().listIterator(0);
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (agqsVarListIterator.hasNext()) {
                                rep repVarIw = ((reo) agqsVarListIterator.next()).iw((Duration) optionalOf.get());
                                int iOrdinal = ((ren) repVarIw).d.ordinal();
                                if (iOrdinal == 0) {
                                    rfs rfsVarA2 = ((ren) repVarIw).a();
                                    if (rfsVarA2.z()) {
                                        arrayList.add(rfsVarA2);
                                    } else if (((rdr) this.h).q.a.p) {
                                        z = true;
                                    } else {
                                        rhvVar.b.release();
                                    }
                                } else if (iOrdinal == 1) {
                                    rem remVar = ((ren) repVarIw).e;
                                    remVar.getClass();
                                    arrayList2.add(remVar);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 4) {
                                        i++;
                                    }
                                } else if (((rdr) this.h).q.a.p) {
                                    z = true;
                                } else {
                                    rhvVar.b.release();
                                }
                            } else if (z) {
                                rhvVar.b.release();
                            } else if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                                rgc rgcVar = this.q;
                                if (rgcVar == null) {
                                    if (arrayList.size() > 1) {
                                        rbc rbcVar = new rbc(m, rbd.c);
                                        rbcVar.c();
                                        rbcVar.a("flattener is null but framesToFlatten.size() > 1", new Object[0]);
                                    }
                                    if (arrayList.isEmpty()) {
                                        new rbc(m, rbd.c).a("framesToFlatten is empty", new Object[0]);
                                    } else {
                                        rfsVarA = (rfs) arrayList.remove(0);
                                    }
                                } else {
                                    rfsVarA = rgcVar.a(arrayList, arrayList2, (Duration) optionalOf.get());
                                }
                                rfsVar = rfsVarA;
                                try {
                                    ((rih) riiVar).f();
                                } catch (ahxq e) {
                                    e = e;
                                    rbc rbcVar2 = new rbc(m, rbd.e);
                                    rbcVar2.a = e;
                                    rbcVar2.c();
                                    rbcVar2.a("Gl Error while trying to flatten the next frame.", new Object[0]);
                                    this.p.b.release();
                                    req reqVar = this.h;
                                    tge tgeVarA = quk.a();
                                    tgeVarA.b = e;
                                    tgeVarA.c = new quf(4);
                                    ((rdr) reqVar).D(tgeVarA.e());
                                } catch (bvn e2) {
                                    e = e2;
                                    rbc rbcVar3 = new rbc(m, rbd.e);
                                    rbcVar3.a = e;
                                    rbcVar3.c();
                                    rbcVar3.a("Gl Error while trying to flatten the next frame.", new Object[0]);
                                    this.p.b.release();
                                    req reqVar2 = this.h;
                                    tge tgeVarA2 = quk.a();
                                    tgeVarA2.b = e;
                                    tgeVarA2.c = new quf(4);
                                    ((rdr) reqVar2).D(tgeVarA2.e());
                                } catch (RejectedExecutionException e3) {
                                    e = e3;
                                    rbc rbcVar4 = new rbc(m, rbd.c);
                                    rbcVar4.a = e;
                                    rbcVar4.c();
                                    rbcVar4.a("MCR Rejected execution exception.", new Object[0]);
                                } catch (Exception e4) {
                                    e = e4;
                                    rbc rbcVar5 = new rbc(m, rbd.e);
                                    rbcVar5.a = e;
                                    rbcVar5.c();
                                    rbcVar5.a("Error trying to flatten the next frame.", new Object[0]);
                                    this.p.b.release();
                                }
                                Iterable$EL.forEach(arrayList, new hgi(13));
                                if (rfsVar != null) {
                                    rftVar = this.p.a;
                                    if (rftVar != null) {
                                        rftVar.a(rfsVar);
                                    } else {
                                        rfsVar.release();
                                    }
                                    h();
                                }
                            } else if (i == ((agpi) tldVar.n()).d) {
                                this.r += rhvVar.b.drainPermits() + 1;
                                rhvVar.f(true);
                            } else {
                                rhvVar.b.release();
                                ((rih) riiVar).f();
                                h();
                            }
                        }
                    }
                    Iterable$EL.forEach(arrayList, new hgi(13));
                } catch (Throwable th) {
                    Iterable$EL.forEach(arrayList, new hgi(13));
                    throw th;
                }
            } catch (ahxq e5) {
                e = e5;
                rfsVar = null;
                rbc rbcVar6 = new rbc(m, rbd.e);
                rbcVar6.a = e;
                rbcVar6.c();
                rbcVar6.a("Gl Error while trying to flatten the next frame.", new Object[0]);
                this.p.b.release();
                req reqVar3 = this.h;
                tge tgeVarA3 = quk.a();
                tgeVarA3.b = e;
                tgeVarA3.c = new quf(4);
                ((rdr) reqVar3).D(tgeVarA3.e());
                Iterable$EL.forEach(arrayList, new hgi(13));
                if (rfsVar != null) {
                    rftVar = this.p.a;
                    if (rftVar != null) {
                        rftVar.a(rfsVar);
                    } else {
                        rfsVar.release();
                    }
                    h();
                }
            } catch (bvn e6) {
                e = e6;
                rfsVar = null;
                rbc rbcVar7 = new rbc(m, rbd.e);
                rbcVar7.a = e;
                rbcVar7.c();
                rbcVar7.a("Gl Error while trying to flatten the next frame.", new Object[0]);
                this.p.b.release();
                req reqVar4 = this.h;
                tge tgeVarA4 = quk.a();
                tgeVarA4.b = e;
                tgeVarA4.c = new quf(4);
                ((rdr) reqVar4).D(tgeVarA4.e());
                Iterable$EL.forEach(arrayList, new hgi(13));
                if (rfsVar != null) {
                    rftVar = this.p.a;
                    if (rftVar != null) {
                        rftVar.a(rfsVar);
                    } else {
                        rfsVar.release();
                    }
                    h();
                }
            } catch (RejectedExecutionException e7) {
                e = e7;
                rfsVar = null;
            } catch (Exception e8) {
                e = e8;
                rfsVar = null;
            }
        }
    }

    @Override // defpackage.rer
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ rep iw(Duration duration) {
        duration.getClass();
        if (aext.i(this.j.f(), duration)) {
            return ren.b;
        }
        ren renVarH = this.f.h(duration);
        h();
        return renVarH;
    }

    public final void h() {
        Semaphore semaphore = this.p.b;
        if (semaphore == null || semaphore.availablePermits() == 0) {
            return;
        }
        synchronized (this.b) {
            if (!this.k && !this.l) {
                this.k = true;
                this.c.submit(new rcu(this, 12));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean i(quc qucVar, Duration duration, boolean z) {
        quc qucVar2 = this.j;
        this.j = qucVar;
        Comparable comparableF = afyd.f(duration, l());
        rbm rbmVar = m;
        int i = 1;
        new rbc(rbmVar, rbd.a).a("updateComposition() called for playback position: %s, adjusted to: %s", duration, comparableF);
        req reqVar = this.h;
        if (((rdr) reqVar).q.a.t) {
            this.c.submit(new rcu(this, 11));
        } else {
            rbmVar.a(rbk.b(this.j, ((rdr) reqVar).l));
        }
        int i2 = (k((Duration) comparableF) || j((Duration) comparableF)) ? 1 : 0;
        ((rih) this.i).g(this.j.f());
        rgc rgcVar = this.q;
        if (rgcVar != null) {
            rgcVar.a.e(new plj(rgcVar, ((rdr) reqVar).s, 18, null));
        }
        int i3 = qucVar2.b;
        int i4 = qucVar.b;
        if (i3 != i4) {
            if (rgcVar != null) {
                rgcVar.a.e(new rir(rgcVar, i4, i));
            }
            if (qucVar.c().isEmpty() && ((rdr) reqVar).q.a.Q) {
                i = 0;
            }
        } else {
            i = i2;
        }
        if (i == 0 && !z) {
            return false;
        }
        iz((Duration) comparableF);
        return i;
    }

    @Override // defpackage.rer
    public final /* synthetic */ rep iw(Duration duration) {
        return iw(duration);
    }

    @Override // defpackage.reo
    public final synchronized Duration ix() {
        quc qucVar;
        qucVar = this.j;
        return qucVar.p.plus(qucVar.f());
    }

    @Override // defpackage.reo
    public final synchronized Duration iy() {
        return this.j.p;
    }

    @Override // defpackage.reo
    public final synchronized void iz(Duration duration) {
        Comparable comparableF = afyd.f(duration, l());
        new rbc(m, rbd.a).a("seekTo() called for playback position: %s, adjusted to: %s", duration, comparableF);
        this.f.d();
        rhv rhvVar = this.p;
        rhvVar.b.release(this.r);
        rhvVar.f(false);
        this.r = 0;
        Iterable$EL.forEach(this.o.n(), new rcp(((rih) this.i).b((Duration) comparableF), 8));
        f();
    }

    public final synchronized boolean j(Duration duration) {
        byte[] bArr;
        boolean z;
        agkj agkjVar = (agkj) Collection.EL.stream(this.j.c()).filter(new rej(1)).map(new rcs(7)).collect(aext.h(new rcs(8)));
        HashMap map = this.d;
        agkz agkzVarF = ahng.ae(map.keySet(), agkjVar.keySet()).f();
        agqr it = agkz.n(agkzVarF).iterator();
        while (true) {
            bArr = null;
            if (!it.hasNext()) {
                break;
            }
            res resVar = (res) map.remove((UUID) it.next());
            if (resVar != null) {
                Object obj = this.o.b;
                reo reoVar = (reo) aguu.M(agkz.n(((agwm) obj).f(resVar)));
                if (reoVar instanceof rec) {
                    rec recVar = (rec) reoVar;
                    if (Objects.equals(recVar.h, resVar)) {
                        recVar.h = null;
                    } else {
                        recVar.i = null;
                    }
                }
                ((agwm) obj).k(resVar);
                try {
                    resVar.close();
                } catch (Exception e) {
                    rbc rbcVar = new rbc(m, rbd.c);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Error closing renderer.", new Object[0]);
                }
            }
            throw th;
        }
        HashMap map2 = this.d;
        Iterator it2 = map2.entrySet().iterator();
        loop1: while (true) {
            z = false;
            while (true) {
                if (!it2.hasNext()) {
                    break loop1;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((res) entry.getValue()).d(this.n.f((qvs) agkjVar.get(entry.getKey())), duration) || z) {
                    z = true;
                }
            }
        }
        agkz agkzVarF2 = ahng.ae(agkjVar.keySet(), map2.keySet()).f();
        Iterable$EL.forEach(agkzVarF2, new hfo(this, agkjVar, 20, bArr));
        return (!z && agkzVarF.isEmpty() && agkzVarF2.isEmpty()) ? false : true;
    }

    public final boolean k(Duration duration) {
        boolean z;
        reb rebVar;
        agkj agkjVar = (agkj) Collection.EL.stream(this.j.d()).filter(new rej(0)).collect(aghu.a(new rcs(9), Function$CC.identity()));
        HashMap map = this.e;
        agkz agkzVarF = ahng.ae(map.keySet(), agkjVar.keySet()).f();
        agqr it = agkzVarF.iterator();
        while (it.hasNext()) {
            rec recVar = (rec) map.remove((UUID) it.next());
            if (recVar != null) {
                this.o.o(recVar);
                try {
                    recVar.close();
                } catch (Exception e) {
                    rbc rbcVar = new rbc(m, rbd.c);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Error closing renderer.", new Object[0]);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashMap map2 = this.e;
        boolean z2 = false;
        for (Map.Entry entry : map2.entrySet()) {
            rec recVar2 = (rec) entry.getValue();
            qxj qxjVar = (qxj) agkjVar.get(entry.getKey());
            int i = this.j.b;
            qxj qxjVar2 = recVar2.f;
            Duration duration2 = recVar2.d;
            Size size = recVar2.e;
            int i2 = recVar2.g;
            recVar2.f = qxjVar;
            recVar2.d = recVar2.f.b();
            rdr rdrVar = (rdr) recVar2.c;
            HashMap map3 = map2;
            recVar2.e = rdrVar.s;
            recVar2.g = i;
            rnj rnjVarC = rjm.a.c(qxjVar2, qxjVar);
            boolean z3 = rnjVarC.d(rjh.c) || rnjVarC.d(rjh.d);
            reb rebVar2 = recVar2.k;
            agkz agkzVar = agkzVarF;
            boolean z4 = (!rnjVarC.d(rjh.a) && duration2.equals(recVar2.d) && i2 == i) ? false : true;
            if (!recVar2.e(duration) || rebVar2 == null) {
                z = z4;
            } else {
                reb rebVar3 = recVar2.k;
                rebVar3.getClass();
                z = rebVar3.b(recVar2.f, recVar2.g, rdrVar.s) || !size.equals(recVar2.e) || z3;
            }
            if (z && (rebVar = recVar2.k) != null) {
                rebVar.a();
            }
            if (z3) {
                this.o.o((rec) entry.getValue());
                arrayList.add((rec) entry.getValue());
            }
            z2 |= z;
            map2 = map3;
            agkzVarF = agkzVar;
        }
        HashMap map4 = map2;
        agkz agkzVar2 = agkzVarF;
        if (!arrayList.isEmpty()) {
            Iterable$EL.forEach(arrayList, new rcp(this, 9));
            z2 = true;
        }
        agkz agkzVarF2 = ahng.ae(agkjVar.keySet(), map4.keySet()).f();
        Iterable$EL.forEach(agkzVarF2, new rew(this, agkjVar, 1, null));
        return (!z2 && agkzVar2.isEmpty() && agkzVarF2.isEmpty()) ? false : true;
    }
}
