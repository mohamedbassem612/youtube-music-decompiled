package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yar {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/DefaultMdxScreensMonitor");
    private final xnx A;
    private final awmd B;
    private volatile String E;
    private volatile String F;
    private yao G;
    public final awmd g;
    public final awmd h;
    public final aunn i;
    public final yaq k;
    public final Executor l;
    public final xns m;
    public final xla o;
    public final awmd p;
    public final avmb q;
    public final ahey s;
    public final mbc t;
    public boolean u;
    public ListenableFuture v;
    public ListenableFuture w;
    public final vxz x;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    private final sxu y = new ablv(this, 1);
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Set n = new HashSet();
    private final Object C = new Object();
    public final avmr r = new avmr();
    private final Object D = new Object();
    private final Set z = Collections.newSetFromMap(new ConcurrentHashMap());

    public yar(Executor executor, xns xnsVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar, awmd awmdVar3, xnx xnxVar, xla xlaVar, mbc mbcVar, awmd awmdVar4, avmb avmbVar, awmd awmdVar5, ahey aheyVar, vxz vxzVar) {
        this.l = executor;
        this.m = xnsVar;
        this.B = awmdVar;
        this.g = awmdVar2;
        this.i = aunnVar;
        this.h = awmdVar3;
        this.A = xnxVar;
        this.t = mbcVar;
        this.o = xlaVar;
        this.p = awmdVar4;
        this.q = avmbVar;
        this.s = aheyVar;
        this.x = vxzVar;
        this.k = new yaq(xlaVar, awmdVar5, vxzVar);
    }

    public final xvp a(String str) {
        for (xvp xvpVar : this.f) {
            if (str.equals(xvpVar.d().b)) {
                return xvpVar;
            }
        }
        return null;
    }

    public final xvr b(String str) {
        if (str == null) {
            return null;
        }
        for (xvr xvrVar : this.b) {
            if (str.equals(xvrVar.d().b)) {
                return xvrVar;
            }
        }
        return null;
    }

    public final xvr c(Bundle bundle) {
        return b(xvr.t(bundle));
    }

    public final ListenableFuture d(xvr xvrVar, amyu amyuVar) {
        yco ycoVar = ((ycp) this.h.io()).e;
        if (ycoVar == null || !xvrVar.equals(ycoVar.j())) {
            return ahng.n(Boolean.TRUE);
        }
        agrx agrxVar = agso.a;
        return ycoVar.q(amyuVar, Optional.empty());
    }

    public final Optional e(String str) {
        if (str == null) {
            return Optional.empty();
        }
        for (xvn xvnVar : this.c) {
            if (str.equals(xvnVar.l() == null ? "" : xvnVar.l().b)) {
                return Optional.of(xvnVar);
            }
        }
        return Optional.empty();
    }

    public final void f(xyz xyzVar) {
        this.z.add(xyzVar);
    }

    public final void g(xvk xvkVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList.contains(xvkVar)) {
            return;
        }
        yco ycoVar = ((ycp) this.h.io()).e;
        CopyOnWriteArrayList<xvk> copyOnWriteArrayList2 = this.e;
        boolean z = true;
        for (xvk xvkVar2 : copyOnWriteArrayList2) {
            if (xvkVar2.b().equals(xvkVar.b())) {
                if (ycoVar == null || !ycoVar.j().equals(xvkVar2)) {
                    agrx agrxVar = agso.a;
                    o(xvkVar2);
                } else {
                    z = false;
                }
            }
        }
        for (xvi xviVar : this.d) {
            if (xviVar.d().equals(xvkVar.d())) {
                copyOnWriteArrayList.remove(xviVar);
                break;
            }
        }
        if (z) {
            copyOnWriteArrayList2.add(xvkVar);
            copyOnWriteArrayList.add(xvkVar);
        }
        k();
    }

    public final void h() {
        synchronized (this.D) {
            if (this.x.l(260, 45846142L, false)) {
                v();
            }
            aunn aunnVar = this.i;
            if (((ycd) aunnVar.io()).i(this)) {
                ((ycd) aunnVar.io()).k(this);
            }
            ((ycd) aunnVar.io()).h.d(null);
        }
    }

    public final void i(xvn xvnVar, xva xvaVar) {
        amyu amyuVar;
        agrx agrxVar = agso.a;
        String str = xvnVar.c;
        int i = xvaVar.a;
        int i2 = 2;
        if (i == 2) {
            taf.g(d(xvnVar, amyu.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED), new xwl(this, xvnVar, 7));
            return;
        }
        if (i != 1) {
            awmd awmdVar = this.B;
            if (((yed) awmdVar.io()).c()) {
                amyuVar = (((yed) awmdVar.io()).d(3) && TextUtils.equals(xvnVar.d, ((yed) awmdVar.io()).a())) ? amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_SCREEN_UNAVAILABLE : amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
            } else {
                amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
            }
            taf.g(d(xvnVar, amyuVar), new xwl(this, xvnVar, i2));
        }
    }

    public final void j() {
        if (this.x.l(165, 45676577L, false)) {
            p(null);
        }
    }

    public final void k() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((xyz) it.next()).a();
        }
    }

    public final void l(xvi xviVar) {
        agrx agrxVar = agso.a;
        this.d.remove(xviVar);
        this.b.remove(xviVar);
        k();
    }

    public final void m(xvn xvnVar) {
        this.c.remove(xvnVar);
        this.b.remove(xvnVar);
        this.j.remove(xvnVar.n);
        k();
    }

    public final void n(xyz xyzVar) {
        this.z.remove(xyzVar);
    }

    public final void o(xvk xvkVar) {
        agrx agrxVar = agso.a;
        this.e.remove(xvkVar);
        this.b.remove(xvkVar);
        k();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0013, B:9:0x0017, B:10:0x0019, B:12:0x0021, B:13:0x0023, B:15:0x0027, B:16:0x002a, B:18:0x0038, B:21:0x0044, B:22:0x004d, B:24:0x004f, B:26:0x0055, B:28:0x005f, B:29:0x0061, B:31:0x0069, B:32:0x006b, B:46:0x00a0, B:33:0x0071, B:35:0x0075, B:36:0x0077, B:38:0x007d, B:40:0x0087, B:41:0x0089, B:43:0x0091, B:44:0x0093, B:45:0x0097), top: B:52:0x0003 }] */
    public final void p(amyi amyiVar) {
        synchronized (this.D) {
            if (this.x.l(260, 45846142L, false)) {
                if (amyiVar == null) {
                    v();
                } else {
                    amyj amyjVar = amyiVar.d;
                    if (amyjVar == null) {
                        amyjVar = amyj.a;
                    }
                    amyh amyhVarA = amyh.a(amyjVar.c);
                    if (amyhVarA == null) {
                        amyhVarA = amyh.MDX_POLLING_FREQUENCY_UNKNOWN;
                    }
                    if (amyhVarA == amyh.MDX_POLLING_FREQUENCY_ACTIVE) {
                        v();
                    }
                }
            }
            aunn aunnVar = this.i;
            if (!((ycd) aunnVar.io()).i(this)) {
                ((ycd) aunnVar.io()).j(this);
            }
            if (amyiVar == null) {
                ((ycd) aunnVar.io()).g(null, null);
                return;
            }
            if ((amyiVar.b & 4) != 0) {
                ycd ycdVar = (ycd) aunnVar.io();
                amyj amyjVar2 = amyiVar.d;
                if (amyjVar2 == null) {
                    amyjVar2 = amyj.a;
                }
                amyh amyhVarA2 = amyh.a(amyjVar2.c);
                if (amyhVarA2 == null) {
                    amyhVarA2 = amyh.MDX_POLLING_FREQUENCY_UNKNOWN;
                }
                ycdVar.g(amyhVarA2, amyiVar.e);
            } else {
                amyj amyjVar3 = amyiVar.d;
                if (amyjVar3 == null) {
                    amyjVar3 = amyj.a;
                }
                if ((amyjVar3.b & 1) != 0) {
                    ycd ycdVar2 = (ycd) aunnVar.io();
                    amyj amyjVar4 = amyiVar.d;
                    if (amyjVar4 == null) {
                        amyjVar4 = amyj.a;
                    }
                    amyh amyhVarA3 = amyh.a(amyjVar4.c);
                    if (amyhVarA3 == null) {
                        amyhVarA3 = amyh.MDX_POLLING_FREQUENCY_UNKNOWN;
                    }
                    ycdVar2.g(amyhVarA3, null);
                } else {
                    ((ycd) aunnVar.io()).g(null, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0130 A[Catch: all -> 0x0173, TryCatch #1 {, blocks: (B:41:0x00f1, B:43:0x00f5, B:45:0x00fb, B:46:0x0103, B:47:0x0105, B:52:0x011e, B:55:0x0121, B:56:0x0122, B:57:0x0123, B:59:0x0130, B:72:0x016c, B:60:0x0138, B:61:0x013f, B:69:0x015e, B:71:0x0161, B:75:0x016f, B:76:0x0170, B:48:0x0106, B:50:0x010a, B:51:0x0117, B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:82:0x00f1, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0138 A[Catch: all -> 0x0173, TryCatch #1 {, blocks: (B:41:0x00f1, B:43:0x00f5, B:45:0x00fb, B:46:0x0103, B:47:0x0105, B:52:0x011e, B:55:0x0121, B:56:0x0122, B:57:0x0123, B:59:0x0130, B:72:0x016c, B:60:0x0138, B:61:0x013f, B:69:0x015e, B:71:0x0161, B:75:0x016f, B:76:0x0170, B:48:0x0106, B:50:0x010a, B:51:0x0117, B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:82:0x00f1, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[Catch: all -> 0x016e, TryCatch #2 {, blocks: (B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:83:0x0140, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0155 A[Catch: all -> 0x016e, TryCatch #2 {, blocks: (B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:83:0x0140, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {, blocks: (B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:83:0x0140, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0161 A[Catch: all -> 0x0173, TryCatch #1 {, blocks: (B:41:0x00f1, B:43:0x00f5, B:45:0x00fb, B:46:0x0103, B:47:0x0105, B:52:0x011e, B:55:0x0121, B:56:0x0122, B:57:0x0123, B:59:0x0130, B:72:0x016c, B:60:0x0138, B:61:0x013f, B:69:0x015e, B:71:0x0161, B:75:0x016f, B:76:0x0170, B:48:0x0106, B:50:0x010a, B:51:0x0117, B:62:0x0140, B:64:0x0144, B:66:0x0155, B:68:0x015b), top: B:82:0x00f1, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r6 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yar.q():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void r() {
        if (((yed) this.B.io()).c()) {
            aesp aespVar = (aesp) this.g.io();
            sxu sxuVar = this.y;
            ybl yblVar = new ybl(aespVar, sxuVar, sxuVar);
            ListenableFuture listenableFutureA = ((xwm) aespVar.h).a();
            ?? r0 = aespVar.a;
            hmb hmbVar = new hmb(13);
            hvf hvfVar = new hvf(yblVar, 5);
            Executor executor = taf.a;
            taa taaVar = new taa(hvfVar, null, hmbVar);
            long j = afwl.a;
            listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), r0);
            return;
        }
        CopyOnWriteArrayList<xvk> copyOnWriteArrayList = this.e;
        if (!copyOnWriteArrayList.isEmpty()) {
            agrx agrxVar = agso.a;
            for (xvk xvkVar : copyOnWriteArrayList) {
                ListenableFuture listenableFutureD = d(xvkVar, amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE);
                xwl xwlVar = new xwl(this, xvkVar, 3);
                Executor executor2 = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar2 = new taa(xwlVar, null, taf.b);
                long j2 = afwl.a;
                listenableFutureD.addListener(new ahei(listenableFutureD, new afwj(afty.c(false), taaVar2, 0)), executorDirectExecutor);
            }
        }
        CopyOnWriteArrayList<xvi> copyOnWriteArrayList2 = this.d;
        if (copyOnWriteArrayList2.isEmpty()) {
            return;
        }
        agrx agrxVar2 = agso.a;
        for (xvi xviVar : copyOnWriteArrayList2) {
            ListenableFuture listenableFutureD2 = d(xviVar, amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE);
            xwl xwlVar2 = new xwl(this, xviVar, 4);
            Executor executor3 = taf.a;
            Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
            taa taaVar3 = new taa(xwlVar2, null, taf.b);
            long j3 = afwl.a;
            listenableFutureD2.addListener(new ahei(listenableFutureD2, new afwj(afty.c(false), taaVar3, 0)), executorDirectExecutor2);
        }
    }

    public final void s() {
        synchronized (this.D) {
            ((ycd) this.i.io()).g(amyh.MDX_POLLING_FREQUENCY_PING, null);
        }
    }

    public final void t(xvn xvnVar) {
        xvn xvnVarU = u(xvnVar.n);
        if (xvnVarU != null) {
            m(xvnVarU);
        }
        this.c.add(xvnVar);
        this.b.add(xvnVar);
        k();
    }

    public final xvn u(xwc xwcVar) {
        for (xvn xvnVar : this.c) {
            if (xvnVar.n.equals(xwcVar)) {
                return xvnVar;
            }
        }
        return null;
    }

    final void v() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((xyz) it.next()).b();
        }
    }
}
