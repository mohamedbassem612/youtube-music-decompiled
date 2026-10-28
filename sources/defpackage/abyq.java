package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyq {
    public final Handler a;
    public final wqi b;
    public final String c;
    public final abyp d;
    public final alvf e;
    public final byte[] f;
    public final String g;
    public final xeu h;
    public final awmd i;
    public final abmt j;
    public final String k;
    public volatile long l;
    public int m;
    public aazk n;
    private final mbc o;
    private final Executor p;
    private final SecureRandom q;
    private volatile boolean t;
    private final AtomicInteger s = new AtomicInteger();
    private final Runnable r = new abyo(this);

    public abyq(mbc mbcVar, Executor executor, Handler handler, SecureRandom secureRandom, wqi wqiVar, String str, abyp abypVar, alvf alvfVar, byte[] bArr, String str2, xeu xeuVar, awmd awmdVar, abmt abmtVar, String str3) {
        this.o = mbcVar;
        this.p = executor;
        this.a = handler;
        this.q = secureRandom;
        this.b = wqiVar;
        this.c = str;
        this.d = abypVar;
        this.e = alvfVar;
        this.f = bArr;
        this.g = str2;
        this.h = xeuVar;
        this.i = awmdVar;
        this.j = abmtVar;
        this.k = str3;
    }

    public final synchronized abyn a() {
        return new abyn(this.e, this.f, this.g, this.l, this.m, this.k);
    }

    public final synchronized void b() {
        if (this.l == 0) {
            this.l = this.o.b() + 2000;
        }
    }

    public final synchronized void c() {
        if (this.l == 0) {
            this.l = this.o.b() + 2000;
        }
    }

    public final synchronized void d(aazk aazkVar) {
        this.n = aazkVar;
        if (aazkVar.h && !this.t && this.l != 0 && this.l <= this.o.b()) {
            this.t = true;
            this.p.execute(this.r);
        }
    }

    public final void e(aboe aboeVar, alvl alvlVar, boolean z) {
        this.s.set(0);
        this.t = false;
        this.l = 0L;
        aihf aihfVarCreateBuilder = alhb.a.createBuilder();
        if (alvlVar != null) {
            aigj aigjVar = alvlVar.t;
            aihfVarCreateBuilder.copyOnWrite();
            alhb alhbVar = (alhb) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            alhbVar.b |= 1;
            alhbVar.c = aigjVar;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alhb alhbVar2 = (alhb) aihfVarCreateBuilder.instance;
        alhbVar2.b |= 2;
        alhbVar2.d = z;
        xeu xeuVar = this.h;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.HEARTBEAT_ACTION_PLAYER_HALTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            alhb alhbVar3 = (alhb) aihfVarCreateBuilder.build();
            alhbVar3.getClass();
            alouVar.d = alhbVar3;
            alouVar.c = 332;
            xeuVar.b((alou) alosVar.build());
        }
        abyp abypVar = this.d;
        if (abypVar != null) {
            this.a.post(new abwl(abypVar, aboeVar, 4));
        }
    }

    public final void f() {
        this.s.set(0);
        this.t = false;
        this.l = this.o.b() + this.e.d;
    }

    public final void g(Exception exc, int i) {
        AtomicInteger atomicInteger = this.s;
        long jIncrementAndGet = atomicInteger.incrementAndGet();
        alvf alvfVar = this.e;
        if (jIncrementAndGet <= alvfVar.e) {
            this.t = false;
            this.l = ((long) (atomicInteger.get() * 2000)) + this.o.b() + ((long) (this.q.nextInt(999) - 499));
        } else if (alvfVar.g) {
            f();
        } else {
            e(new aboe(i, true, 1, null, exc, null, null, null), null, true);
        }
    }
}
