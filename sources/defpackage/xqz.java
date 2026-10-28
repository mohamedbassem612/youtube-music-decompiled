package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqz extends dhp {
    private static final agrf p = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteProvider");
    public final awmd a;
    public volatile boolean b;
    public boolean c;
    public int d;
    public final xqy e;
    public final xqx m;
    public final Executor n;
    public final String o;
    private final Map q;
    private final awmd r;
    private final xla s;
    private final ahex t;
    private final hhb u;

    public xqz(Context context, Executor executor, ahex ahexVar, String str, awmd awmdVar, awmd awmdVar2, hhb hhbVar, xla xlaVar) {
        super(context, null);
        this.q = new ConcurrentHashMap();
        this.b = false;
        this.c = false;
        this.e = new xqy(this);
        this.a = awmdVar;
        this.r = awmdVar2;
        this.m = new xqx(this, 0);
        this.n = executor;
        this.t = ahexVar;
        this.o = str;
        this.u = hhbVar;
        this.s = xlaVar;
    }

    public static String f(xvr xvrVar) {
        if (xvrVar instanceof xvn) {
            return ((xvn) xvrVar).n.b.replace("-", "").replace("uuid:", "");
        }
        return xvrVar instanceof xvp ? "Remote-".concat(xvrVar.d().b) : xvrVar.d().b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    public final dhq a() {
        String str;
        awmd awmdVar;
        Iterator it;
        Map map = this.q;
        map.clear();
        ArrayList arrayList = new ArrayList();
        awmd awmdVar2 = this.a;
        Iterator it2 = ((yar) awmdVar2.io()).b.iterator();
        while (it2.hasNext()) {
            xvr xvrVar = (xvr) it2.next();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(this.o);
            String str2 = "";
            if (xvrVar instanceof xvn) {
                xvn xvnVar = (xvn) xvrVar;
                if (xvnVar.q() && xvnVar.k() != null && xvnVar.k().h != null) {
                    str = "YouTube";
                } else if (!(xvrVar instanceof xvk) || (xvrVar instanceof xvp)) {
                    str = "YouTube";
                } else {
                    str = "";
                }
            } else if (xvrVar instanceof xvk) {
                str = "YouTube";
            } else {
                str = "YouTube";
            }
            String strF = f(xvrVar);
            String strC = xvrVar.c();
            if (!strC.trim().isEmpty()) {
                awmdVar = awmdVar2;
                it = it2;
                str2 = strC;
            } else {
                if (!this.s.az() || !(xvrVar instanceof xvp)) {
                    awmdVar = awmdVar2;
                    it = it2;
                    break;
                }
                CopyOnWriteArrayList<xvn> copyOnWriteArrayList = ((yar) awmdVar2.io()).c;
                Iterator it3 = ((xvp) xvrVar).v().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        awmdVar = awmdVar2;
                        it = it2;
                        break;
                    }
                    xvo xvoVar = (xvo) it3.next();
                    for (xvn xvnVar2 : copyOnWriteArrayList) {
                        if (xvnVar2.l() != null) {
                            awmdVar = awmdVar2;
                            it = it2;
                            if (xvnVar2.l().b.equals(xvoVar.c)) {
                                String str3 = xvnVar2.c;
                                if (!str3.trim().isEmpty()) {
                                    str2 = str3;
                                    break;
                                }
                            }
                            awmdVar2 = awmdVar;
                            it2 = it;
                        }
                    }
                }
            }
            dhf dhfVar = new dhf(strF, str2);
            dhfVar.b(intentFilter);
            dhfVar.j(1);
            dhfVar.m(1);
            dhfVar.f(str);
            dhfVar.h(true);
            dhfVar.n(100);
            dhfVar.i(xvrVar.e());
            dhfVar.g(1);
            yco ycoVar = ((ycp) this.r.io()).e;
            if (ycoVar != null && xvrVar.g(ycoVar.j())) {
                dhfVar.l(this.d);
                int iB = ycoVar.b();
                if (iB == 0) {
                    dhfVar.e(1);
                } else if (iB == 1) {
                    dhfVar.e(2);
                }
            }
            dhg dhgVarA = dhfVar.a();
            if (dhgVarA.y()) {
                azs.C(dhgVarA, arrayList);
            } else {
                agrx agrxVar = agso.a;
            }
            map.put(dhgVarA.p(), xvrVar);
            awmdVar2 = awmdVar;
            it2 = it;
        }
        return new dhq(arrayList, false);
    }

    @Override // defpackage.dhp
    public final dhn c(String str) {
        xvr xvrVar = (xvr) this.q.get(str);
        if (xvrVar == null) {
            return null;
        }
        ght ghtVar = ((ghs) this.u.a).a;
        return new xrf(aupm.b(ghtVar.pj), aupm.b(ghtVar.pk), (xla) ghtVar.de.io(), xvrVar, str);
    }

    @Override // defpackage.dhp
    public final void e(dhh dhhVar) {
        fzs fzsVar = new fzs(this, dhhVar, 13, null);
        long j = afwl.a;
        ListenableFuture listenableFutureSubmit = this.t.submit(new ahcz(afty.c(false), fzsVar, 1));
        hmb hmbVar = new hmb(12);
        hvf hvfVar = new hvf(this, 4);
        Executor executor = taf.a;
        listenableFutureSubmit.addListener(new ahei(listenableFutureSubmit, new afwj(afty.c(false), new taa(hvfVar, null, hmbVar), 0)), this.n);
    }

    public final void h() {
        ListenableFuture listenableFuture;
        yar yarVar = (yar) this.a.io();
        int i = 1;
        byte[] bArr = null;
        if (!this.b || this.c) {
            String str = this.o;
            agrx agrxVar = agso.a;
            Set set = yarVar.n;
            set.remove(str);
            if (set.isEmpty()) {
                yarVar.u = false;
                yaq yaqVar = yarVar.k;
                yaqVar.removeMessages(0);
                yaqVar.removeMessages(1);
                ListenableFuture listenableFuture2 = yarVar.v;
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(false);
                    yarVar.v = null;
                }
                vxz vxzVar = yarVar.x;
                if (vxzVar.l(166, 45677766L, false) && (listenableFuture = yarVar.w) != null) {
                    listenableFuture.cancel(false);
                    yarVar.w = null;
                }
                if (vxzVar.l(164, 45673420L, false) && !yarVar.o.az()) {
                    aunn aunnVar = yarVar.i;
                    if (((ycd) aunnVar.io()).i(yarVar)) {
                        ((ycd) aunnVar.io()).k(yarVar);
                    }
                }
            }
            ((yea) yarVar.p.io()).b();
            yarVar.r.a(null);
            return;
        }
        String str2 = this.o;
        agrx agrxVar2 = agso.a;
        Set set2 = yarVar.n;
        if (set2.isEmpty()) {
            yarVar.u = true;
            vxz vxzVar2 = yarVar.x;
            if (vxzVar2.l(164, 45673420L, false)) {
                aunn aunnVar2 = yarVar.i;
                if (!((ycd) aunnVar2.io()).i(yarVar)) {
                    ((ycd) aunnVar2.io()).j(yarVar);
                }
            }
            yarVar.r();
            yarVar.q();
            yarVar.u = true;
            ListenableFuture listenableFuture3 = yarVar.v;
            if (listenableFuture3 != null) {
                listenableFuture3.cancel(false);
                yarVar.v = null;
            }
            yas yasVar = new yas(yarVar, i, bArr);
            mbc mbcVar = yarVar.t;
            ahey aheyVar = yarVar.s;
            yarVar.v = ahno.aj(yasVar, 5000L, 5000L, TimeUnit.MILLISECONDS, mbcVar, aheyVar);
            if (vxzVar2.l(166, 45677766L, false)) {
                ListenableFuture listenableFuture4 = yarVar.w;
                if (listenableFuture4 != null) {
                    listenableFuture4.cancel(false);
                    yarVar.w = null;
                }
                yarVar.w = ahno.aj(new xfd(yarVar, 17), yarVar.o.F(), yarVar.k.a, TimeUnit.SECONDS, mbcVar, aheyVar);
            } else {
                yaq yaqVar2 = yarVar.k;
                yaqVar2.sendMessageDelayed(yaqVar2.obtainMessage(1, new yap(yarVar, agpr.a)), Duration.ofSeconds(yarVar.o.F()).toMillis());
            }
        }
        set2.add(str2);
        if (yarVar.o.aK()) {
            awmd awmdVar = yarVar.p;
            ((yea) awmdVar.io()).a();
            avmr avmrVar = yarVar.r;
            avlh avlhVarAy = ((yea) awmdVar.io()).b.x(new yqz(i)).p().ay();
            avmb avmbVar = yarVar.q;
            avmrVar.a(avlhVarAy.aa(10L, TimeUnit.SECONDS, avmbVar, false).L(avmbVar).ak(new xul(yarVar, 11)));
        }
        if (this.s.az()) {
            yarVar.j();
        }
    }
}
