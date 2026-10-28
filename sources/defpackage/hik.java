package defpackage;

import android.content.Context;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hik {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/MediaClientContentSupplier");
    public static final amzw b = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED;
    public static final amzw c = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED;
    public final Context d;
    public final mbc e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final aunn k;
    public final aunn l;
    public final aunn m;
    public final aunn n;
    public final aunn o;
    public final Executor p;
    public final zne q;
    public final ReentrantLock r;
    public boolean s;
    public List t;
    public amzq u;
    public final ConcurrentHashMap v;
    public final AtomicReference w;
    public final Set x;
    public MediaBrowserCompat$MediaItem y;
    private final aunn z;

    public hik(Context context, mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, Executor executor, zne zneVar) {
        context.getClass();
        mbcVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        aunnVar5.getClass();
        aunnVar6.getClass();
        aunnVar7.getClass();
        aunnVar8.getClass();
        aunnVar9.getClass();
        aunnVar10.getClass();
        aunnVar11.getClass();
        aunnVar12.getClass();
        executor.getClass();
        this.d = context;
        this.e = mbcVar;
        this.z = aunnVar;
        this.f = aunnVar2;
        this.g = aunnVar3;
        this.h = aunnVar4;
        this.i = aunnVar6;
        this.j = aunnVar7;
        this.k = aunnVar8;
        this.l = aunnVar9;
        this.m = aunnVar10;
        this.n = aunnVar11;
        this.o = aunnVar12;
        this.p = executor;
        this.q = zneVar;
        this.r = new ReentrantLock();
        this.t = awno.a;
        this.v = new ConcurrentHashMap();
        this.w = new AtomicReference(null);
        Set setSynchronizedSet = DesugarCollections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        this.x = setSynchronizedSet;
    }

    public final him a(znf znfVar) {
        agrf agrfVar = him.a;
        return hmy.D(znfVar, this.q, this.v);
    }

    public final him b() {
        agrf agrfVar = him.a;
        return hmy.E(this.q, this.v, this.e);
    }

    public final ListenableFuture c(final hjn hjnVar, int i) {
        aunn aunnVar = this.z;
        hev hevVarJ = ((wqm) aunnVar.io()).j();
        hevVarJ.d(this.q, hjnVar.f);
        hjnVar.b(tau.MEDIA_BROWSER_GET_ROOT_REQUEST_SENT);
        afxd afxdVarF = afxd.f(((wqm) aunnVar.io()).m(hevVarJ));
        gmv gmvVar = new gmv(new awqg() { // from class: hih
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                String strB;
                boolean z;
                amzv amzvVar = (amzv) obj;
                if (amzvVar != null) {
                    hik hikVar = this;
                    hjn hjnVar2 = hjnVar;
                    hjnVar2.b(tau.MEDIA_BROWSER_GET_ROOT_RESPONSE_RECEIVED);
                    ReentrantLock reentrantLock = hikVar.r;
                    reentrantLock.lock();
                    try {
                        if ((amzvVar.b & 8) != 0) {
                            aigj aigjVar = amzvVar.f;
                            aigjVar.getClass();
                            strB = aigjVar.B();
                        } else {
                            strB = null;
                        }
                        if (strB == null || hikVar.x.add(new hiw(strB))) {
                            hikVar.y = amzvVar.j.size() > 0 ? ((hin) hikVar.g.io()).c((amzz) amzvVar.j.get(0)) : null;
                            boolean zIsEmpty = amzvVar.d.isEmpty();
                            aiie aiieVar = amzvVar.g;
                            aiieVar.getClass();
                            hikVar.t = aiieVar;
                            hikVar.u = (!zIsEmpty || aiieVar.isEmpty()) ? null : (amzq) atqq.X(aiieVar);
                            Iterator it = aiieVar.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                }
                                amzp amzpVarA = amzp.a(((amzq) it.next()).c);
                                if (amzpVarA == null) {
                                    amzpVarA = amzp.MEDIA_BROWSER_ERROR_CODE_UNKNOWN;
                                }
                                if (amzpVarA == amzp.MEDIA_BROWSER_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED) {
                                    z = false;
                                    break;
                                }
                            }
                            jnm jnmVar = (jnm) hikVar.k.io();
                            aunn aunnVar2 = hikVar.j;
                            jnmVar.A(((zwb) aunnVar2.io()).e(), z);
                            Context context = hikVar.d;
                            if (txz.d(context) || txz.g(context)) {
                                ((axfd) hikVar.l.io()).ar(((zwb) aunnVar2.io()).e(), z);
                            }
                            if (!zIsEmpty) {
                                List<amzx> listF = amzvVar.d;
                                listF.getClass();
                                amzw amzwVar = hik.b;
                                amzx amzxVarH = hmy.H(listF, amzwVar);
                                amzw amzwVar2 = hik.c;
                                amzx amzxVarH2 = hmy.H(listF, amzwVar2);
                                if (amzxVarH != null && amzxVarH2 != null) {
                                    aunn aunnVar3 = hikVar.g;
                                    hin hinVar = (hin) aunnVar3.io();
                                    zne zneVar = hikVar.q;
                                    amzx amzxVarG = hinVar.g(zneVar);
                                    amzxVarG.getClass();
                                    aihf builder = amzxVarG.toBuilder();
                                    builder.getClass();
                                    agvp.V(builder);
                                    builder.copyOnWrite();
                                    ((amzx) builder.instance).i = amzx.emptyProtobufList();
                                    agvp.V(builder);
                                    builder.bD(atqq.aL(new amzx[]{((hin) aunnVar3.io()).f(zneVar), ((hin) aunnVar3.io()).h(zneVar)}));
                                    amzx amzxVarU = agvp.U(builder);
                                    awoa awoaVar = new awoa(10);
                                    for (amzx amzxVar : listF) {
                                        znf znfVar = znf.a;
                                        amzw amzwVarB = yno.ai(amzxVar.e).b();
                                        if (amzwVarB != amzwVar && amzwVarB != amzwVar2) {
                                            awoaVar.add(amzxVar);
                                        }
                                    }
                                    awoaVar.add(amzxVarU);
                                    listF = awoaVar.f();
                                }
                                him himVarB = hikVar.b();
                                himVarB.r(amzvVar.f);
                                amzl amzlVar = amzvVar.e;
                                if (amzlVar == null) {
                                    amzlVar = amzl.a;
                                }
                                himVarB.n(listF, amzlVar, hikVar.e, hikVar.m);
                            }
                        }
                        hikVar.e(hjnVar2);
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                return null;
            }
        }, 16);
        Executor executor = this.p;
        return afxdVarF.g(gmvVar, executor).c(Throwable.class, new hba(new hii(i, this, hjnVar, 0), 5), executor);
    }

    public final ListenableFuture d(hjn hjnVar, int i) {
        aunn aunnVar = this.z;
        heu heuVarI = ((wqm) aunnVar.io()).i();
        heuVarI.c(this.q, hjnVar.f);
        znf znfVar = hjnVar.b;
        heuVarI.d(znfVar.l);
        hjnVar.b(tau.MEDIA_BROWSER_GET_CHILDREN_REQUEST_SENT);
        afxd afxdVarF = afxd.f(((wqm) aunnVar.io()).l(heuVarI));
        gmv gmvVar = new gmv(new hgo((Object) hjnVar, (Object) this, (Object) znfVar, 2, (byte[]) null), 17);
        Executor executor = this.p;
        return afxdVarF.g(gmvVar, executor).c(Throwable.class, new hba(new adpm(i, this, hjnVar, znfVar, 1), 6), executor);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final Object e(hjn hjnVar) throws Throwable {
        him himVarA;
        him himVar;
        amzw amzwVarB;
        int iOrdinal;
        Object objK;
        Object objI;
        him himVar2;
        Object objK2;
        him himVar3;
        amzw amzwVarB2;
        int iOrdinal2;
        hie hieVar = (hie) this.f.io();
        Map map = znf.k;
        znf znfVar = hjnVar.b;
        znf znfVar2 = (znf) map.get(znfVar.b());
        zne zneVar = hjnVar.i;
        if (znfVar2 != null && (amzwVarB2 = znfVar2.b()) != null && (((iOrdinal2 = amzwVarB2.ordinal()) == 2 || iOrdinal2 == 3 || iOrdinal2 == 4 || iOrdinal2 == 5) && zneVar.g())) {
            hieVar.c(hjnVar);
            himVarA = hieVar.a(znfVar2, hieVar.q);
        } else if (znfVar2 == null || (amzwVarB = znfVar2.b()) == null || !(((iOrdinal = amzwVarB.ordinal()) == 1 || iOrdinal == 7) && zneVar.f())) {
            himVarA = (him) hieVar.q.get(znfVar);
            if (himVarA == null || !zneVar.g()) {
                himVarA = (him) hieVar.r.get(znfVar);
                himVar = null;
                if (himVarA != null && zneVar.f()) {
                    hieVar.b(hjnVar);
                }
                if (himVar == null) {
                    objI = atqp.i(new IllegalArgumentException("LCS: No content for MediaId: ".concat(znfVar.l)));
                } else {
                    objK = himVar.k(hieVar.f, zneVar, hieVar.b, null, null);
                    if (awmn.b(objK)) {
                        atqp.j(objK);
                        hjnVar.c((List) objK, himVar);
                        objI = objK;
                    } else {
                        awno awnoVar = awno.a;
                        hjnVar.c(awnoVar, himVar);
                        objI = awnoVar;
                    }
                }
                if (awmn.b(objI)) {
                    if (!((vxz) this.o.io()).l(21, 45791927L, false) && (himVar3 = (him) this.v.get(znfVar)) != null) {
                        Object objIo = this.i.io();
                        objIo.getClass();
                        ((hht) objIo).g(himVar3);
                        return objI;
                    }
                }
                if (znfVar.d()) {
                    return atqp.i(hjr.a);
                }
                himVar2 = (him) this.v.get(znfVar);
                if (himVar2 == null) {
                    return atqp.i(new hjv(znfVar));
                }
                objK2 = himVar2.k(this.g, this.q, this.e, null, this.y);
                if (awmn.b(objK2)) {
                    return objK2;
                }
                atqp.j(objK2);
                hjnVar.c((List) objK2, himVar2);
                return objK2;
            }
            hieVar.c(hjnVar);
        } else {
            hieVar.b(hjnVar);
            himVarA = hieVar.a(znfVar2, hieVar.r);
        }
        himVar = himVarA;
        if (himVar == null) {
            objI = atqp.i(new IllegalArgumentException("LCS: No content for MediaId: ".concat(znfVar.l)));
        } else {
            objK = himVar.k(hieVar.f, zneVar, hieVar.b, null, null);
            if (awmn.b(objK)) {
                atqp.j(objK);
                hjnVar.c((List) objK, himVar);
                objI = objK;
            } else {
                awno awnoVar2 = awno.a;
                hjnVar.c(awnoVar2, himVar);
                objI = awnoVar2;
            }
        }
        if (awmn.b(objI)) {
            return !((vxz) this.o.io()).l(21, 45791927L, false) ? objI : objI;
        }
        if (znfVar.d()) {
            return atqp.i(hjr.a);
        }
        himVar2 = (him) this.v.get(znfVar);
        if (himVar2 == null) {
            return atqp.i(new hjv(znfVar));
        }
        objK2 = himVar2.k(this.g, this.q, this.e, null, this.y);
        if (awmn.b(objK2)) {
            return objK2;
        }
        atqp.j(objK2);
        hjnVar.c((List) objK2, himVar2);
        return objK2;
    }
}
