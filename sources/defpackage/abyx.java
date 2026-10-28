package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyx {
    public final agfr a;
    public final String b;
    public final xeu c;
    public final agfr d;
    public final agfr e;
    public final tqj f;
    public boolean g;
    public long h;
    private final zxj i;
    private final PriorityQueue j;
    private final PriorityQueue k;
    private final Executor l;
    private final vyo m;
    private final tfq n;
    private final abuz o;
    private final aavv p;

    public abyx(zxj zxjVar, tfq tfqVar, abuz abuzVar, agfr agfrVar, List list, List list2, String str, Executor executor, aavv aavvVar, xeu xeuVar, vyo vyoVar, agfr agfrVar2, agfr agfrVar3, tqj tqjVar) {
        this.i = zxjVar;
        this.n = tfqVar;
        this.o = abuzVar;
        this.a = agfrVar;
        this.j = new PriorityQueue(list);
        this.k = new PriorityQueue(list2);
        str.getClass();
        this.b = str;
        this.l = executor;
        this.p = aavvVar;
        this.c = xeuVar;
        this.m = vyoVar;
        this.d = agfrVar2;
        this.e = agfrVar3;
        tqjVar.getClass();
        this.f = tqjVar;
    }

    public final synchronized abyw a() {
        return new abyw(this.j, this.k, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    public final void b(wjm wjmVar, long j) {
        tyt tytVar = new tyt(wjmVar.c());
        for (wjl wjlVar : wjmVar.c) {
            taq.c();
            int iOrdinal = wjlVar.ordinal();
            if (iOrdinal == 0) {
                for (Map.Entry entry : this.a.io().entrySet()) {
                    tytVar.f((String) entry.getKey(), (String) entry.getValue());
                }
            } else if (iOrdinal == 2) {
                this.o.g(this.b, tytVar);
            } else if (iOrdinal == 3) {
                tytVar.f("cpn", this.b);
            } else if (iOrdinal == 4) {
                tytVar.i("conn", this.n.a());
            } else if (iOrdinal == 5) {
                tytVar.f("cmt", String.valueOf(j / 1000));
            }
        }
        Uri uriA = tytVar.a();
        aavv aavvVar = this.p;
        if (uriA != null) {
            String string = uriA.toString();
            soa soaVar = (soa) aavvVar;
            if (soaVar.c(string) || soaVar.b(string) || soaVar.d(string)) {
                uriA = aavvVar.a(uriA);
            }
        }
        wjk wjkVar = new wjk(wjmVar, 0);
        zxj zxjVar = this.i;
        zxi zxiVar = new zxi(1, "remarketing");
        zxiVar.b(uriA);
        zxiVar.d = true;
        zxiVar.k = wjkVar;
        zxiVar.a(tok.HTTP_PING_PLAYBACK_TRACKING_URL_PING_CLIENT);
        zxjVar.b(null, zxiVar, zzl.b);
    }

    public final synchronized void c(aazk aazkVar) {
        int i;
        wjd wjdVar;
        wjm wjmVar;
        if (aazkVar.h) {
            this.h = aazkVar.a;
            while (true) {
                PriorityQueue priorityQueue = this.j;
                if (priorityQueue.isEmpty() || (wjmVar = (wjm) priorityQueue.peek()) == null) {
                    break;
                }
                long j = this.h;
                if (wjmVar.b.length() <= 0 || wjmVar.b(0) * 1000 > j) {
                    break;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.l.execute(afwl.i(new abwl(this, wjmVar, 5)));
                } else {
                    b(wjmVar, this.h);
                }
                priorityQueue.remove();
            }
            while (true) {
                PriorityQueue priorityQueue2 = this.k;
                i = 1;
                if (!priorityQueue2.isEmpty() && (wjdVar = (wjd) priorityQueue2.peek()) != null) {
                    if (wjdVar.b * 1000 > this.h) {
                        break;
                    }
                    aihf aihfVarCreateBuilder = aood.a.createBuilder();
                    String str = this.b;
                    aihfVarCreateBuilder.copyOnWrite();
                    aood aoodVar = (aood) aihfVarCreateBuilder.instance;
                    aoodVar.b |= 1;
                    aoodVar.c = str;
                    aigj aigjVar = wjdVar.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    aood aoodVar2 = (aood) aihfVarCreateBuilder.instance;
                    aigjVar.getClass();
                    aoodVar2.b |= 2;
                    aoodVar2.d = aigjVar;
                    xeu xeuVar = this.c;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.PLAYBACK_CONTEXT_EVENT);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        aood aoodVar3 = (aood) aihfVarCreateBuilder.build();
                        aoodVar3.getClass();
                        alouVar.d = aoodVar3;
                        alouVar.c = 214;
                        xeuVar.b((alou) alosVar.build());
                    }
                    priorityQueue2.remove();
                } else {
                    break;
                }
            }
            if (!this.g) {
                aoqs aoqsVar = this.m.b().k;
                if (aoqsVar == null) {
                    aoqsVar = aoqs.a;
                }
                if (aoqsVar.n) {
                    this.g = true;
                    this.l.execute(afwl.i(new abyz(this, i)));
                }
            }
        }
    }
}
