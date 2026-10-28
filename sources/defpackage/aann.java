package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aann {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/orchestration/AutoRefreshController");
    static final long b;
    static final long c;
    static final agke d;
    public final awmd e;
    public final awmd f;
    public final mbc g;
    public final awmd h;
    public final zwb i;
    public final ExecutorService j;
    public final tbt k;
    public final aauk l;
    avmn m;
    public final dov n;
    private final awmd o;
    private final syn p;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = 900L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        c = 21600L;
        d = agke.u(15, 60, 300, 900, 1800);
    }

    public aann(awmd awmdVar, awmd awmdVar2, mbc mbcVar, awmd awmdVar3, syn synVar, zwb zwbVar, ExecutorService executorService, tbt tbtVar, awmd awmdVar4, dov dovVar, aauk aaukVar) {
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = mbcVar;
        this.h = awmdVar3;
        this.p = synVar;
        this.i = zwbVar;
        this.j = executorService;
        this.k = tbtVar;
        this.o = awmdVar4;
        this.n = dovVar;
        this.l = aaukVar;
    }

    private final long e(wcn wcnVar, long j) {
        aphh aphhVar;
        abxv abxvVar = (abxv) this.f.io();
        ArrayList arrayList = new ArrayList();
        final wcu wcuVar = aagt.c;
        tzk.ag(wcuVar, 5, Long.valueOf(j), abxvVar, arrayList);
        abxvVar.p(wcuVar);
        arrayList.add(new wct() { // from class: wcs
            @Override // defpackage.wct
            public final void a(omr omrVar) {
                omrVar.i(" ORDER BY ");
                wcuVar.b(omrVar);
                omrVar.i(" ASC");
            }
        });
        arrayList.add(new wcr());
        agke agkeVar = (agke) wcnVar.s(tzk.ai(abxvVar, arrayList)).E();
        if (agkeVar == null || agkeVar.isEmpty() || (aphhVar = (aphh) wcnVar.g((String) agkeVar.get(0)).g(aphh.class).E()) == null) {
            return 0L;
        }
        return aphhVar.getRefreshTime().longValue();
    }

    private final long f(long j) {
        if (!this.l.b.l(248, 45859881L, false)) {
            return j;
        }
        double d2 = j;
        return (long) this.n.ae(d2, (0.5d * d2) + d2);
    }

    private final void g() {
        Object obj = this.m;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.m = null;
        }
    }

    public final long a() {
        zwb zwbVar = this.i;
        if (zwbVar.e().h()) {
            return 0L;
        }
        wcn wcnVarB = ((wco) this.e.io()).b(zwbVar.e());
        mbc mbcVar = this.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long epochMilli = mbcVar.f().toEpochMilli() / 1000;
        long jE = e(wcnVarB, epochMilli);
        long j = jE - epochMilli;
        long jC = this.l.b.c(2, 45369957L, 0L);
        if (jC <= 0 || (jE != 0 && j <= jC)) {
            if (jE > 0) {
                return Math.max(j, b);
            }
            if (e(wcnVarB, 0L) > 0) {
                return f(c);
            }
            return 0L;
        }
        long jE2 = e(wcnVarB, 0L);
        if (jE2 > 0 && jE2 < epochMilli) {
            jE = epochMilli + f(jC);
        }
        if (jE > 0) {
            return Math.max(jE - epochMilli, b);
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, tpq] */
    public final void b() {
        if (this.i.e().h()) {
            return;
        }
        long j = ((atpt) ((abfv) this.o.io()).b.c()).e;
        mbc mbcVar = this.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long epochMilli = mbcVar.f().toEpochMilli() / 1000;
        long j2 = j - epochMilli;
        if (j2 <= 0 || j2 >= b) {
            long jA = a();
            if (jA != 0) {
                if (j == 0 || epochMilli > j || epochMilli + jA + b < j) {
                    c(jA);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, tpq] */
    public final void c(long j) {
        if (j > 0) {
            this.p.d("offline_auto_refresh_wakeup", j, 2, 1, false, null, null, false);
            mbc mbcVar = this.g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ((abfv) this.o.io()).b.b(new xfj((mbcVar.f().toEpochMilli() / 1000) + j, 6));
        }
    }

    public final void d() {
        zwa zwaVarE = this.i.e();
        if (zwaVarE.h() || Objects.equals(null, zwaVarE)) {
            return;
        }
        g();
        avlr avlrVarI = ((wco) this.e.io()).b(zwaVarE).i(aphh.class);
        ExecutorService executorService = this.j;
        avmb avmbVar = awlg.a;
        this.m = avlrVarI.O(new awir(executorService)).ag(new xwu(this, 16), new jop(14));
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        d();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        g();
    }
}
