package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zga {
    public final zxj a;
    public final zrx b;
    public final zwa c;
    public final String d;
    public final zgn[] e;
    public final CountDownLatch f;
    public final awmd g;
    public wjm h;
    public boolean i;
    public boolean j;
    public final zjr l;
    public final xeu m;
    private final Executor n;
    private final apbx o;
    private final Deque q;
    private tyt r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private final apbv w;
    private zhg x;
    private aigj p = null;
    public int k = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, zrx] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zwb] */
    public zga(hno hnoVar, Executor executor, ci ciVar, CountDownLatch countDownLatch, apbx apbxVar, xeu xeuVar, apbv apbvVar, zgn... zgnVarArr) {
        this.a = (zxj) hnoVar.o;
        this.b = hnoVar.c;
        this.n = executor;
        zwa zwaVarE = hnoVar.n.e();
        this.c = zwaVarE;
        this.d = ciVar.aD(zwaVarE);
        this.e = zgnVarArr;
        this.x = new zhg(apbvVar.toBuilder());
        this.f = countDownLatch;
        this.o = apbxVar;
        this.l = (zjr) hnoVar.j;
        this.m = xeuVar;
        this.w = apbvVar;
        this.g = hnoVar.h;
        this.s = 1155;
        this.t = 1155;
        this.q = new ArrayDeque();
        this.v = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    private final int n(String str, String str2) {
        List list = (List) this.x.a.get(str);
        return ((list == null || list.isEmpty()) ? str.length() + 1 : 0) + str2.length() + 1;
    }

    private final void o(final zhg zhgVar, final int i, final boolean z) {
        final tyt tytVar = new tyt(this.r);
        if (!this.v) {
            tyt tytVar2 = this.r;
            tytVar2.h("fexp");
            c(tytVar2);
            this.v = true;
        }
        if (this.l.i.m(331, 45752642L)) {
            String strB = tytVar.b("cat");
            if (!TextUtils.isEmpty(strB)) {
                tytVar.e("cat", TextUtils.join(",", strB.split("(?i)%2C")));
            }
        }
        final aigj aigjVar = this.p;
        this.p = null;
        this.n.execute(afwl.i(new Runnable() { // from class: zfz
            @Override // java.lang.Runnable
            public final void run() {
                zga zgaVar;
                zhg zhgVar2;
                zxi zxiVar;
                Pair pair;
                boolean z2;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    zgaVar = this.a;
                    zhgVar2 = zhgVar;
                    zgn[] zgnVarArr = zgaVar.e;
                    if (i3 >= zgnVarArr.length) {
                        break;
                    }
                    zgnVarArr[i3].c(zhgVar2);
                    i3++;
                }
                if (!zgaVar.j) {
                    int i4 = zgaVar.k;
                    zgaVar.k = i4 + 1;
                    zhgVar2.b("seq", String.valueOf(i4));
                }
                aigj aigjVar2 = aigjVar;
                Object obj = zhgVar2.b;
                if (aigjVar2 != null) {
                    ((aihf) obj).cc(aigjVar2);
                }
                boolean z3 = true;
                if (zgaVar.l.dh()) {
                    String strCC = yno.cC((apbv) ((aihf) obj).build());
                    if (strCC != null) {
                        zhgVar2.b("qclc", strCC);
                    } else {
                        zhr.b(zhq.QOE, "%s", "QoeStatsClient: Unable to add base64 encoded qclc to statsDictionary");
                    }
                }
                try {
                    zgaVar.f.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                tyt tytVar3 = tytVar;
                char c = '&';
                if (zgaVar.i) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : zhgVar2.a()) {
                        i2 = i2;
                        List list = (List) entry.getValue();
                        String str = (String) entry.getKey();
                        if (!list.isEmpty()) {
                            if (TextUtils.equals("cat", str)) {
                                z2 = z3;
                                tytVar3.d(str, TextUtils.join(",", list), ",:;|");
                            } else {
                                z2 = z3;
                                if (sb.length() > 0) {
                                    sb.append(c);
                                    sb2.append(c);
                                }
                                String strEncode = Uri.encode(str, ",:;|");
                                String strEncode2 = Uri.encode(TextUtils.join(",", list), ",:;|");
                                sb.append(strEncode);
                                sb.append('=');
                                sb.append(strEncode2);
                                sb2.append(strEncode);
                                sb2.append('=');
                                if (zgo.a.contains(strEncode)) {
                                    sb2.append("(scrubbed)");
                                } else {
                                    sb2.append(strEncode2);
                                }
                            }
                            list.clear();
                            z3 = z2;
                            c = '&';
                        }
                    }
                    int i5 = i2;
                    boolean z4 = z3;
                    pair = new Pair(sb.toString().getBytes(StandardCharsets.UTF_8), sb2.toString());
                    Uri uriA = tytVar3.a();
                    String str2 = (String) pair.second;
                    agkz agkzVar = zgo.a;
                    tyt tytVar4 = new tyt(uriA);
                    String strB2 = zgo.b(tytVar4);
                    zhq zhqVar = zhq.QOE;
                    String strValueOf = String.valueOf(zgo.a(tytVar4));
                    Object[] objArr = new Object[2];
                    objArr[i5] = strValueOf + "  " + str2;
                    objArr[z4 ? 1 : 0] = strB2;
                    zhr.b(zhqVar, "Pinging P %s \n&fexp=%s", objArr);
                    zxiVar = new zxi((byte[]) pair.first);
                    zxiVar.b(uriA);
                    zxiVar.d = z4;
                    zxiVar.k = new wjk(zgaVar.h, i5);
                    zxiVar.g = zgaVar.c;
                    zxiVar.h = zgaVar.d;
                } else {
                    for (Map.Entry entry2 : zhgVar2.a()) {
                        List list2 = (List) entry2.getValue();
                        String str3 = (String) entry2.getKey();
                        if (!list2.isEmpty()) {
                            if (TextUtils.equals("cat", str3)) {
                                tytVar3.d(str3, TextUtils.join(",", list2), ",:;|");
                            } else {
                                tytVar3.g(str3, TextUtils.join(",", list2), ",:;|");
                            }
                            list2.clear();
                        }
                    }
                    Uri uriA2 = tytVar3.a();
                    agkz agkzVar2 = zgo.a;
                    tyt tytVar5 = new tyt(uriA2);
                    zhr.b(zhq.QOE, "Pinging %s \n&fexp=%s", zgo.a(tytVar5), zgo.b(tytVar5));
                    zxiVar = new zxi(1, "qoe");
                    zxiVar.b(uriA2);
                    zxiVar.d = true;
                    zxiVar.k = new wjk(zgaVar.h, 0);
                    zxiVar.g = zgaVar.c;
                    zxiVar.h = zgaVar.d;
                    pair = null;
                }
                zjr zjrVar = zgaVar.l;
                if (zjrVar.bT()) {
                    tytVar3.h("qclc");
                    tytVar3.h("dl");
                    String string = tytVar3.toString();
                    if (pair != null) {
                        string = string + '&' + new String((byte[]) pair.first, StandardCharsets.UTF_8);
                    }
                    boolean z5 = z;
                    aihf aihfVarMo53clone = ((aihf) obj).mo53clone();
                    aihfVarMo53clone.copyOnWrite();
                    apbv apbvVar = (apbv) aihfVarMo53clone.instance;
                    apbv apbvVar2 = apbv.a;
                    string.getClass();
                    apbvVar.b |= SemanticState.LiveRegion;
                    apbvVar.f = string;
                    xeu xeuVar = zgaVar.m;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarMo53clone, alot.QOE_CLIENT_LOGGING_CONTEXT);
                        if (z5) {
                            int iA = zvb.a(akku.DELAYED_EVENT_TIER_IMMEDIATE);
                            xffVarA.q = iA;
                            ztf ztfVar = xffVarA.k.e;
                            zvb zvbVarC = ztfVar.c();
                            if (zvbVarC != null) {
                                xffVarA.a = zvbVarC.b(iA);
                            }
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else if (zjrVar.bU()) {
                            int iA2 = zvb.a(akku.DELAYED_EVENT_TIER_FAST);
                            xffVarA.q = iA2;
                            ztf ztfVar2 = xffVarA.k.e;
                            zvb zvbVarC2 = ztfVar2.c();
                            if (zvbVarC2 != null) {
                                xffVarA.a = zvbVarC2.b(iA2);
                            }
                            xffVarA.l = ztfVar2.a();
                            ztfVar2.k(xffVarA);
                        } else {
                            ztf ztfVar3 = xffVarA.k.e;
                            xffVarA.l = ztfVar3.a();
                            ztfVar3.k(xffVarA);
                        }
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        apbv apbvVar3 = (apbv) aihfVarMo53clone.build();
                        apbvVar3.getClass();
                        alouVar.d = apbvVar3;
                        alouVar.c = 446;
                        alou alouVar2 = (alou) alosVar.build();
                        if (z5) {
                            xeuVar.h(alouVar2, akku.DELAYED_EVENT_TIER_IMMEDIATE);
                        } else if (zjrVar.bU()) {
                            xeuVar.h(alouVar2, akku.DELAYED_EVENT_TIER_FAST);
                        } else {
                            xeuVar.b(alouVar2);
                        }
                    }
                }
                if (!zjrVar.bT() || !zjrVar.j.m(322, 45755740L)) {
                    zxiVar.a(tok.HTTP_PING_QOE_STATS_CLIENT);
                    zgaVar.a.b(zgaVar.b, zxiVar, zzl.b);
                }
                int i6 = i;
                if (i6 == 2 || !zjrVar.fk()) {
                    return;
                }
                ((xkn) zgaVar.g.io()).a(i6);
            }
        }));
    }

    public final synchronized void a(String str, String str2) {
        k(str, str2, 2);
    }

    final synchronized void b() {
        if (!this.o.s && !this.q.isEmpty()) {
            boolean z = this.h != null;
            boolean z2 = this.r != null;
            String str = "QoeStatsClient: Ping overflow, trackingUrl=" + z + ", baseQoeUriBuilder=" + z2 + ", allowSendingPing=" + this.u;
            zvp.a(zvn.b, zvm.f, str);
            zhr.b(zhq.QOE, "%s", str);
        }
    }

    final synchronized void c(tyt tytVar) {
        this.r = tytVar;
        int length = tytVar.a().toString().length();
        this.t += length - this.s;
        this.s = length;
    }

    final synchronized void d(boolean z) {
        this.j = z;
    }

    final synchronized void e(aigj aigjVar) {
        this.p = aigjVar;
    }

    final synchronized void f(wjm wjmVar) {
        this.h = wjmVar;
    }

    final synchronized void g(boolean z) {
        this.i = z;
    }

    public final synchronized void h(String str) {
        l("du", str, 2);
    }

    final synchronized void i(boolean z) {
        m(z, 2);
    }

    final synchronized void j() {
        this.u = true;
        if (this.r != null && this.h != null) {
            while (true) {
                Deque deque = this.q;
                if (deque.isEmpty()) {
                    break;
                }
                aami aamiVar = (aami) deque.removeFirst();
                o((zhg) aamiVar.b, aamiVar.a, this.l.bO());
            }
        }
    }

    final synchronized void k(String str, String str2, int i) {
        aigj aigjVar;
        int iN = n(str, str2);
        long j = true != this.i ? 1900L : 95000L;
        int iD = this.t;
        int i2 = 0;
        while (true) {
            zgn[] zgnVarArr = this.e;
            if (i2 >= zgnVarArr.length) {
                break;
            }
            iD += zgnVarArr[i2].a();
            i2++;
        }
        zjr zjrVar = this.l;
        if (zjrVar.dh() && (aigjVar = this.p) != null) {
            iD += ((aigjVar.d() << 2) + 2) / 3;
        }
        if (iD + iN > j) {
            m(zjrVar.bO(), i);
            iN = n(str, str2);
        }
        this.t += iN;
        this.x.c(str, str2);
    }

    public final synchronized void l(String str, String str2, int i) {
        zjr zjrVar = this.l;
        if (!zjrVar.i.l(415, 45792660L, false)) {
            List listAe = zjrVar.ae();
            if (listAe.contains("*") || listAe.contains(str)) {
                return;
            }
        }
        if (ahno.aa(str2)) {
            k("ctmp", str, i);
        } else {
            k("ctmp", a.cl(str2, (byte) 58, str), i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final synchronized void m(boolean z, int i) {
        Iterator it = this.x.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                Deque deque = this.q;
                if (!deque.isEmpty()) {
                    if (i == 2) {
                        break;
                    }
                    deque.addLast(new aami(((aami) deque.removeLast()).b, i));
                    break;
                }
            } else if (!((List) it.next()).isEmpty()) {
                this.q.addLast(new aami(this.x, i));
                this.x = new zhg(this.w.toBuilder());
                this.t = this.s;
                break;
            }
        }
        if (this.u && this.r != null && this.h != null) {
            while (true) {
                Deque deque2 = this.q;
                if (deque2.isEmpty()) {
                    break;
                }
                aami aamiVar = (aami) deque2.removeFirst();
                o((zhg) aamiVar.b, aamiVar.a, z);
            }
        }
    }
}
