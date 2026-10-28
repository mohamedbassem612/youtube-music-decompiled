package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hhr {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/ContentSupplier");
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final awmd i;
    public final aunn j;
    public final aunn k;
    public final avmm l;
    public final AtomicBoolean m;
    public final vxz n;
    public final qcb o;
    private final aunn p;
    private final aunn q;
    private final aunn r;
    private final aunn s;
    private final Executor t;
    private final Executor u;
    private final ConcurrentHashMap v;

    public hhr(qcb qcbVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, awmd awmdVar, vxz vxzVar, aunn aunnVar12, Executor executor, Executor executor2, aunn aunnVar13) {
        qcbVar.getClass();
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
        awmdVar.getClass();
        vxzVar.getClass();
        aunnVar12.getClass();
        executor.getClass();
        executor2.getClass();
        aunnVar13.getClass();
        this.o = qcbVar;
        this.p = aunnVar;
        this.q = aunnVar2;
        this.b = aunnVar3;
        this.c = aunnVar4;
        this.d = aunnVar5;
        this.e = aunnVar6;
        this.f = aunnVar7;
        this.r = aunnVar8;
        this.g = aunnVar9;
        this.h = aunnVar10;
        this.s = aunnVar11;
        this.i = awmdVar;
        this.n = vxzVar;
        this.j = aunnVar12;
        this.t = executor;
        this.u = executor2;
        this.k = aunnVar13;
        this.l = new avmm();
        this.m = new AtomicBoolean(false);
        this.v = new ConcurrentHashMap();
    }

    public static final void h(hjn hjnVar, boolean z) {
        if (z) {
            return;
        }
        znf znfVar = hjnVar.j;
        hjnVar.c(agpi.a, null);
        zvp.a(zvn.a, zvm.n, "Invalid media id: ".concat(znfVar.l));
    }

    public final hik a(zne zneVar) {
        if (zneVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.v, zneVar, new hfw(new awqg() { // from class: hhm
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                List listH;
                zne zneVar2 = (zne) obj;
                zneVar2.getClass();
                ght ghtVar = ((ghs) this.a.o.a).a;
                Context context = (Context) ghtVar.v.io();
                mbc mbcVar = (mbc) ghtVar.l.io();
                aupr auprVar = ghtVar.Fd;
                aupr auprVar2 = ghtVar.Ff;
                aunn aunnVarB = aupm.b(ghtVar.Fa);
                aunn aunnVarB2 = aupm.b(auprVar2);
                aunn aunnVarB3 = aupm.b(auprVar);
                aunn aunnVarB4 = aupm.b(ghtVar.zZ);
                aupr auprVar3 = ghtVar.Fi;
                aunn aunnVarB5 = aupm.b(ghtVar.Fg);
                aunn aunnVarB6 = aupm.b(auprVar3);
                aunn aunnVarB7 = aupm.b(ghtVar.bd);
                aupr auprVar4 = ghtVar.cv;
                hik hikVar = new hik(context, mbcVar, aunnVarB, aunnVarB2, aunnVarB3, aunnVarB4, aunnVarB5, aunnVarB6, aunnVarB7, aupm.b(ghtVar.cF), aupm.b(ghtVar.cE), aupm.b(ghtVar.Fe), aupm.b(ghtVar.Fj), aupm.b(auprVar4), (Executor) ghtVar.z.io(), zneVar2);
                ReentrantLock reentrantLock = hikVar.r;
                reentrantLock.lock();
                try {
                    if (!hikVar.s) {
                        zne zneVar3 = hikVar.q;
                        him himVarB = hikVar.b();
                        if (awrc.c(zneVar3, znd.a)) {
                            listH = awno.a;
                        } else if (!awrc.c(zneVar3, zlw.a) && !awrc.c(zneVar3, zlx.a) && !awrc.c(zneVar3, zlz.a) && !zneVar3.d()) {
                            listH = null;
                        } else if (((vxz) hikVar.o.io()).l(43, 45831619L, false)) {
                            aunn aunnVar = hikVar.g;
                            hin hinVar = (hin) aunnVar.io();
                            aihf aihfVarCreateBuilder = anfb.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
                            anfbVar.c = 1;
                            anfbVar.d = "ALkSOiEw8fNqQ0Ng6gxrAKifkeEuoKc";
                            aihfVarCreateBuilder.copyOnWrite();
                            anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
                            anfbVar2.f = 2;
                            anfbVar2.b |= 2;
                            int i = zneVar3.i() - 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            anfb anfbVar3 = (anfb) aihfVarCreateBuilder.instance;
                            anfbVar3.b |= 4;
                            anfbVar3.g = i;
                            anfb anfbVar4 = (anfb) aihfVarCreateBuilder.build();
                            aihf aihfVarCreateBuilder2 = amzx.a.createBuilder();
                            alay alayVarC = ackj.c(hinVar.a.getString(R.string.pivot_home));
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar = (amzx) aihfVarCreateBuilder2.instance;
                            alayVarC.getClass();
                            amzxVar.g = alayVarC;
                            amzxVar.b |= 4;
                            aihh aihhVar = (aihh) alja.a.createBuilder();
                            aliz alizVar = aliz.TAB_HOME;
                            aihhVar.copyOnWrite();
                            alja aljaVar = (alja) aihhVar.instance;
                            aljaVar.c = alizVar.yN;
                            aljaVar.b |= 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar2 = (amzx) aihfVarCreateBuilder2.instance;
                            alja aljaVar2 = (alja) aihhVar.build();
                            aljaVar2.getClass();
                            amzxVar2.d = aljaVar2;
                            amzxVar2.c = 7;
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar3 = (amzx) aihfVarCreateBuilder2.instance;
                            anfbVar4.getClass();
                            amzxVar3.f = anfbVar4;
                            amzxVar3.b |= 2;
                            String strB = zls.b(anfbVar4);
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar4 = (amzx) aihfVarCreateBuilder2.instance;
                            amzxVar4.b |= 1;
                            amzxVar4.e = strB;
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar5 = (amzx) aihfVarCreateBuilder2.instance;
                            amzxVar5.b |= SemanticState.Focused;
                            amzxVar5.l = true;
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar6 = (amzx) aihfVarCreateBuilder2.instance;
                            amzxVar6.m = 1;
                            amzxVar6.b |= SemanticState.Hidden;
                            aihfVarCreateBuilder2.copyOnWrite();
                            amzx amzxVar7 = (amzx) aihfVarCreateBuilder2.instance;
                            amzxVar7.n = 1;
                            amzxVar7.b |= SemanticState.LiveRegion;
                            listH = atqq.aL(new amzx[]{(amzx) aihfVarCreateBuilder2.build(), ((hin) aunnVar.io()).g(zneVar3)});
                        } else {
                            listH = atqq.H(((hin) hikVar.g.io()).g(zneVar3));
                        }
                        if (listH != null) {
                            himVarB.n(listH, null, hikVar.e, hikVar.m);
                        }
                        hie hieVar = (hie) hikVar.f.io();
                        ahno.ao(new fuc(hieVar, zneVar3, 12), hieVar.k);
                        hikVar.s = true;
                    }
                    return hikVar;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, 2));
        objComputeIfAbsent.getClass();
        return (hik) objComputeIfAbsent;
    }

    public final void b() {
        if (this.n.l(6, 45680102L, false)) {
            for (Object obj : this.v.values()) {
                obj.getClass();
                hik hikVar = (hik) obj;
                ReentrantLock reentrantLock = hikVar.r;
                reentrantLock.lock();
                try {
                    if (hikVar.s) {
                        hikVar.v.clear();
                        hikVar.t = awno.a;
                        hikVar.w.set(null);
                        hikVar.x.clear();
                        hikVar.y = null;
                        hikVar.s = false;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            this.v.clear();
            hie hieVar = (hie) this.p.io();
            hieVar.s.b();
            ReentrantLock reentrantLock2 = hieVar.m;
            reentrantLock2.lock();
            try {
                afml afmlVar = hieVar.u;
                if (afmlVar != null) {
                    ((Context) ((jij) hieVar.h.io()).c).getContentResolver().unregisterContentObserver(afmlVar);
                }
                hieVar.u = null;
                hieVar.q.clear();
                hieVar.r.clear();
                hieVar.o = false;
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        ((hin) this.q.io()).j();
        ((hia) this.d.io()).h();
        ((hiv) this.c.io()).y.clear();
        hir hirVar = (hir) this.b.io();
        synchronized (hirVar.a) {
            Map map = hirVar.e;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((hiq) it.next()).e();
            }
            map.clear();
            hirVar.f.clear();
        }
        synchronized (hirVar.b) {
            hirVar.g.clear();
        }
        synchronized (hirVar.c) {
            hirVar.h.clear();
        }
        synchronized (hirVar.d) {
            hirVar.i.clear();
        }
    }

    public final void c(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x017a  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0283, code lost:
    
        if (r0.j.n(r1.d) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (((defpackage.hiv) r13.c.io()).y.containsKey(r1) != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.hjn r14) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhr.d(hjn):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:3:0x000b, B:5:0x0012, B:18:0x0071, B:20:0x007b, B:22:0x007f, B:24:0x0083, B:25:0x0090, B:27:0x0098, B:29:0x009e, B:31:0x00a6, B:33:0x00b6, B:35:0x00bc, B:37:0x00c4, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ea, B:46:0x00fb, B:48:0x0103, B:50:0x010f, B:52:0x0115, B:54:0x011d, B:56:0x0121, B:58:0x0127, B:60:0x012d, B:62:0x0134, B:64:0x013a, B:66:0x0144, B:68:0x0150, B:70:0x0156, B:72:0x015e, B:6:0x0017, B:8:0x0022, B:9:0x0024, B:13:0x0031, B:15:0x0047, B:17:0x0068, B:16:0x0058), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:3:0x000b, B:5:0x0012, B:18:0x0071, B:20:0x007b, B:22:0x007f, B:24:0x0083, B:25:0x0090, B:27:0x0098, B:29:0x009e, B:31:0x00a6, B:33:0x00b6, B:35:0x00bc, B:37:0x00c4, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ea, B:46:0x00fb, B:48:0x0103, B:50:0x010f, B:52:0x0115, B:54:0x011d, B:56:0x0121, B:58:0x0127, B:60:0x012d, B:62:0x0134, B:64:0x013a, B:66:0x0144, B:68:0x0150, B:70:0x0156, B:72:0x015e, B:6:0x0017, B:8:0x0022, B:9:0x0024, B:13:0x0031, B:15:0x0047, B:17:0x0068, B:16:0x0058), top: B:78:0x000b }] */
    public final void e(hjn hjnVar) {
        Object objI;
        him himVar;
        him himVar2;
        hik hikVarA = a(hjnVar.i);
        ReentrantLock reentrantLock = hikVarA.r;
        reentrantLock.lock();
        try {
            amzq amzqVar = hikVarA.u;
            String str = null;
            if (amzqVar == null) {
                objI = hikVarA.e(hjnVar);
            } else {
                hjnVar.c(null, null);
                amzp amzpVarA = amzp.a(amzqVar.c);
                if (amzpVarA == null) {
                    amzpVarA = amzp.MEDIA_BROWSER_ERROR_CODE_UNKNOWN;
                }
                final int i = hij.a[amzpVarA.ordinal()] == 1 ? 4 : 0;
                Object objIo = hikVarA.h.io();
                objIo.getClass();
                final hef hefVar = (hef) objIo;
                String str2 = amzqVar.b;
                str2.getClass();
                if (str2.length() == 0) {
                    ((elq) hikVarA.n.io()).m(new Function0() { // from class: hig
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            hefVar.c(i);
                            return awmy.a;
                        }
                    });
                } else {
                    ((elq) hikVarA.n.io()).m(new afjg(hefVar, i, amzqVar, 1));
                }
                objI = atqp.i(new hjw(amzqVar));
            }
            Throwable thA = awmn.a(objI);
            Objects.checkIndex(0, 3);
            if (thA != null && ((thA instanceof hjr) || (thA instanceof hju))) {
                hjnVar.c(null, (him) hikVarA.v.get(hjnVar.b));
            }
            AtomicReference atomicReference = hikVarA.w;
            if (atomicReference.get() == null) {
                if (hjnVar.d()) {
                    if (((ListenableFuture) atomicReference.get()) == null) {
                        ListenableFuture listenableFutureC = hikVarA.c(hjnVar, 1);
                        atomicReference.set(listenableFutureC);
                        listenableFutureC.addListener(new hgx(hikVarA, 3), hikVarA.p);
                    }
                } else if (hikVarA.t.isEmpty()) {
                    ConcurrentHashMap concurrentHashMap = hikVarA.v;
                    him himVar3 = (him) concurrentHashMap.get(hikVarA.q.a());
                    if ((himVar3 == null || himVar3.m() == null || hikVarA.x.isEmpty() || himVar3.t(hikVarA.e)) && ((himVar2 = (him) concurrentHashMap.get(hjnVar.b)) == null || !awrc.c(himVar2.j(), Boolean.FALSE))) {
                        if (((ListenableFuture) atomicReference.get()) == null) {
                            ListenableFuture listenableFutureC2 = hikVarA.c(hjnVar, 1);
                            atomicReference.set(listenableFutureC2);
                            listenableFutureC2.addListener(new hgx(hikVarA, 3), hikVarA.p);
                        }
                    }
                }
            }
            znf znfVar = hjnVar.b;
            if (!znfVar.d() && !awrc.c(znfVar, hikVarA.q.a()) && ((znfVar.b() == null || znfVar.b() == amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED) && hikVarA.u == null)) {
                anfb anfbVarC = znfVar.c();
                if (anfbVarC != null) {
                    str = "";
                    if (anfbVarC.c == 1) {
                        str = (String) anfbVarC.d;
                    }
                }
                if (str != null && str.length() != 0 && ((himVar = (him) hikVarA.v.get(znfVar)) == null || (!awrc.c(himVar.j(), Boolean.FALSE) && (himVar.m() == null || himVar.t(hikVarA.e))))) {
                    hikVarA.d(hjnVar, 1);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(hjo hjoVar) {
        hjoVar.getClass();
        if (!((tfq) this.h.io()).i()) {
            hia hiaVar = (hia) this.d.io();
            String str = hjoVar.a;
            if (str != null) {
                taf.i(((hfn) hiaVar.g.io()).c(str), hiaVar.p, new glo(17), new gov(hiaVar, hjoVar, 9), new gqd(7));
                return;
            }
            return;
        }
        hiv hivVar = (hiv) this.c.io();
        String str2 = hjoVar.a;
        zne zneVar = hjoVar.d;
        if (TextUtils.isEmpty(str2) || zneVar.h()) {
            hjoVar.b(agpi.a);
            return;
        }
        zot zotVar = hjoVar.b;
        aunn aunnVar = hivVar.g;
        hew hewVarK = ((wqm) aunnVar.io()).k();
        hewVarK.d(zneVar, ((hfy) hivVar.i.io()).d((Context) hivVar.e.io(), zotVar.b));
        hewVarK.e(str2);
        hewVarK.a = 2;
        hiu hiuVar = new hiu(hivVar, hjoVar);
        hjoVar.a(tau.MEDIA_BROWSER_SEARCH_REQUEST_SENT);
        taf.i(((wqm) aunnVar.io()).n(hewVarK), (Executor) hivVar.v.io(), new gtq(hiuVar, 11), new gln(hiuVar, 15), null);
    }

    public final boolean g(hjn hjnVar) {
        aunn aunnVar = this.b;
        if (((hir) aunnVar.io()).e(hjnVar)) {
            return true;
        }
        boolean zC = ((hir) aunnVar.io()).c(hjnVar.i);
        if (!hjnVar.k || zC) {
            return false;
        }
        hia hiaVar = (hia) this.d.io();
        ListenableFuture listenableFuture = hiaVar.y;
        if (listenableFuture != null) {
            listenableFuture.addListener(new hhy(hiaVar, hjnVar, 2), hiaVar.p);
            return true;
        }
        hjnVar.c(hiaVar.c(), null);
        return true;
    }
}
