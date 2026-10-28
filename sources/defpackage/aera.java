package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aera implements tcq, tcr {
    private final awmd A;
    private final vxz B;
    public final ScheduledExecutorService c;
    public final awmd d;
    public final awmd e;
    public final awmd f;
    final tqj g;
    final Runnable h;
    final Runnable i;
    public final awmd j;
    private tbv k;
    private tbv l;
    private tdd m;
    private aeqz n;
    private final Application q;
    private final tbt r;
    private final mbc s;
    private final ahey t;
    private final awmd u;
    private final Executor v;
    private final awmd w;
    private avmn x;
    private ScheduledFuture y;
    private ListenableFuture z;
    public boolean a = false;
    private long o = -1;
    public long b = -1;
    private List p = new ArrayList();

    public aera(Application application, tbt tbtVar, mbc mbcVar, ScheduledExecutorService scheduledExecutorService, ahey aheyVar, tqj tqjVar, vxz vxzVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        this.q = application;
        this.r = tbtVar;
        this.s = mbcVar;
        this.c = scheduledExecutorService;
        this.t = aheyVar;
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.u = awmdVar4;
        this.g = tqjVar;
        this.v = new ahfg(scheduledExecutorService);
        this.w = awmdVar5;
        this.j = awmdVar6;
        this.A = awmdVar7;
        this.B = vxzVar;
        byte[] bArr = null;
        this.h = new dzn((Object) this, (Object) mbcVar, (Object) awmdVar2, 15, bArr);
        this.i = new dzn((Object) this, (Object) mbcVar, (Object) awmdVar2, 16, bArr);
    }

    private final synchronized void g() {
        f();
        if (this.a) {
            tbv tbvVar = this.k;
            if (tbvVar != null) {
                this.r.k(tbvVar);
                this.k = null;
            }
            tbv tbvVar2 = this.l;
            if (tbvVar2 != null) {
                this.r.k(tbvVar2);
                this.l = null;
            }
            Object obj = this.x;
            if (obj != null) {
                avnr.b((AtomicReference) obj);
                this.x = null;
            }
            aeqz aeqzVar = this.n;
            if (aeqzVar != null) {
                this.q.unregisterReceiver(aeqzVar);
                this.n = null;
            }
            tqj tqjVar = this.g;
            int i = tqr.a;
            if (tqjVar.k(1073830161)) {
                ((oml) this.A.io()).h(this);
            } else {
                tdd tddVar = this.m;
                if (tddVar != null) {
                    tddVar.c(this.q);
                    this.m.d(this);
                    this.m = null;
                }
            }
            this.a = false;
        }
    }

    private final synchronized void h(aqiz aqizVar) {
        if (this.a) {
            return;
        }
        tbt tbtVar = this.r;
        vxz vxzVar = this.B;
        this.k = tbtVar.a(this, aeqi.class, vxzVar.l(219, 45726439L, false) ? new wlg(this, 3) : new gla(this, 8));
        this.l = tbtVar.a(this, aeqj.class, new gla(this, 9));
        aqiy aqiyVar = aqizVar.e;
        if (aqiyVar == null) {
            aqiyVar = aqiy.a;
        }
        if (aqiyVar.q) {
            this.x = ((aepr) this.w.io()).c.af(new acym(this, 11));
        }
        tqj tqjVar = this.g;
        int i = tqr.a;
        if (tqjVar.k(1073830161)) {
            ((oml) this.A.io()).g(this);
        } else {
            tdd tddVar = new tdd(tqjVar);
            this.m = tddVar;
            tddVar.b(this.q);
            this.m.a(this);
        }
        boolean zL = vxzVar.l(172, 45672665L, false);
        Application application = this.q;
        Intent intentF = zL ? avg.f(application, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, 2) : application.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentF != null) {
            ((aepv) this.d.io()).a(intentF);
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        if (!vxzVar.l(172, 45672665L, false)) {
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        }
        aeqz aeqzVar = new aeqz(this);
        this.n = aeqzVar;
        Application application2 = this.q;
        application2.registerReceiver(aeqzVar, intentFilter);
        if (vxzVar.l(172, 45672665L, false)) {
            avg.f(application2, new aeqz(this), new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, 2);
        }
        this.a = true;
    }

    @Override // defpackage.tcr
    public final void a() {
        this.s.b();
        this.v.execute(new acem(this, 5));
        aerb aerbVar = (aerb) this.e.io();
        synchronized (aerbVar.a) {
            for (aepp aeppVar : aerbVar.e.values()) {
                if (aeppVar.f()) {
                    Context context = aerbVar.b;
                    aeppVar.c();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[Catch: all -> 0x00f9, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:9:0x0014, B:19:0x003d, B:20:0x0047, B:33:0x0072, B:35:0x007b, B:37:0x007f, B:38:0x0081, B:45:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b2, B:52:0x00b6, B:54:0x00ba, B:55:0x00bc, B:56:0x00c1, B:58:0x00c5, B:59:0x00c7, B:61:0x00cf, B:63:0x00d3, B:64:0x00d5, B:65:0x00d9, B:67:0x00e5, B:70:0x00ea, B:40:0x0085, B:42:0x0092, B:44:0x009b, B:74:0x00f0, B:78:0x00f4, B:21:0x0048, B:22:0x0052, B:24:0x0058, B:26:0x0060, B:28:0x0066, B:30:0x006a, B:31:0x006c, B:32:0x0071, B:10:0x0015, B:11:0x001f, B:13:0x0025, B:15:0x0032, B:17:0x0038, B:18:0x003c), top: B:89:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(aqiz aqizVar) {
        tqj tqjVar;
        if (!aqizVar.c) {
            g();
            return;
        }
        aerb aerbVar = (aerb) this.e.io();
        synchronized (aerbVar.a) {
            try {
                for (aepp aeppVar : aerbVar.e.values()) {
                    aeppVar.e(aqizVar);
                    if ((aeppVar instanceof aepn) && aeppVar.f()) {
                        aerbVar.f = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aeod aeodVar = (aeod) this.f.io();
        synchronized (aeodVar.b) {
            for (aesy aesyVar : aeodVar.a.values()) {
                if (aqizVar != null && (aqizVar.b & 16) != 0) {
                    aqir aqirVar = aqizVar.f;
                    if (aqirVar == null) {
                        aqirVar = aqir.a;
                    }
                    aesyVar.c = aqirVar.b;
                }
            }
        }
        h(aqizVar);
        if ((aqizVar.b & 16) == 0) {
            tqjVar = this.g;
            int i = tqr.a;
            if (!tqjVar.k(1073808360) && !tqjVar.k(1073808373)) {
                ((aeta) this.u.io()).a();
            }
        } else {
            aqir aqirVar2 = aqizVar.f;
            if (aqirVar2 == null) {
                aqirVar2 = aqir.a;
            }
            if (aqirVar2.c) {
                tqjVar = this.g;
                int i2 = tqr.a;
                if (!tqjVar.k(1073808360)) {
                    ((aeta) this.u.io()).a();
                }
            }
        }
        if ((aqizVar.b & 2) != 0) {
            aqiw aqiwVar = aqizVar.j;
            if (aqiwVar == null) {
                aqiwVar = aqiw.a;
            }
            if (!aqiwVar.c) {
                aqit aqitVar = aqizVar.d;
                if (aqitVar == null) {
                    aqitVar = aqit.a;
                }
                this.o = aqitVar.b;
            }
        }
        aqiw aqiwVar2 = aqizVar.j;
        if (aqiwVar2 == null) {
            aqiwVar2 = aqiw.a;
        }
        if (aqiwVar2.b.size() > 0) {
            aqiw aqiwVar3 = aqizVar.j;
            if (aqiwVar3 == null) {
                aqiwVar3 = aqiw.a;
            }
            this.p = aqiwVar3.b;
        }
        if (qel.d(this.q.getApplicationContext())) {
            a();
        } else {
            t();
        }
    }

    public final void c(aeqi aeqiVar) {
        ((aerb) this.e.io()).a(aeqiVar.a);
    }

    public final void d(aeqj aeqjVar) {
        xgt xgtVarA;
        aerb aerbVar = (aerb) this.e.io();
        axhz axhzVar = aeqjVar.b;
        boolean z = aeqjVar.c;
        String str = ((aeta) this.u.io()).a;
        aihf aihfVarCreateBuilder = aqih.a.createBuilder();
        aqii aqiiVar = aeqjVar.a;
        if (aqiiVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqih aqihVar = (aqih) aihfVarCreateBuilder.instance;
            aqihVar.c = aqiiVar.d;
            aqihVar.b |= 1;
        }
        if ((axhzVar.b & 64) != 0) {
            axhq axhqVar = axhzVar.h;
            if (axhqVar == null) {
                axhqVar = axhq.a;
            }
            if (axhqVar.c) {
                aihf aihfVarCreateBuilder2 = aqib.a.createBuilder();
                if (str != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqib aqibVar = (aqib) aihfVarCreateBuilder2.instance;
                    aqibVar.b |= 1;
                    aqibVar.c = str;
                }
                aqil aqilVar = ((vxu) aerbVar.d.io()).c().q;
                if (aqilVar == null) {
                    aqilVar = aqil.a;
                }
                if (aqilVar.g && (xgtVarA = ((xgv) aerbVar.c.io()).a()) != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqib aqibVar2 = (aqib) aihfVarCreateBuilder2.instance;
                    aqibVar2.b |= 2;
                    aqibVar2.d = xgtVarA.f;
                }
                int i = ((aqib) aihfVarCreateBuilder2.instance).b;
                if ((i & 1) != 0 || (i & 2) != 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    aqih aqihVar2 = (aqih) aihfVarCreateBuilder.instance;
                    aqib aqibVar3 = (aqib) aihfVarCreateBuilder2.build();
                    aqibVar3.getClass();
                    aqihVar2.g = aqibVar3;
                    aqihVar2.b |= 64;
                }
            }
        }
        aigj byteString = axhzVar.toByteString();
        aihfVarCreateBuilder.copyOnWrite();
        aqih aqihVar3 = (aqih) aihfVarCreateBuilder.instance;
        aqihVar3.b |= 8;
        aqihVar3.f = byteString;
        aerbVar.b(aihfVarCreateBuilder, z, aerbVar.f);
    }

    public final synchronized void e() {
        if (this.a) {
            f();
            if (this.o > 0) {
                long jB = this.s.b();
                long j = this.b;
                this.y = this.c.scheduleAtFixedRate(this.h, j >= 0 ? Math.max(0L, (j + this.o) - jB) : 0L, this.o, TimeUnit.MILLISECONDS);
            }
            if (!this.p.isEmpty()) {
                this.z = aewo.p(this.i, (LinkedList) Collection.EL.stream(this.p).map(new aegf(4)).collect(Collectors.toCollection(new yoj(15))), this.s, this.t);
            }
        }
    }

    public final synchronized void f() {
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.y.cancel(true);
        }
        this.y = null;
        ListenableFuture listenableFuture = this.z;
        if (listenableFuture != null && !listenableFuture.isCancelled()) {
            this.z.cancel(false);
        }
        this.z = null;
    }

    @Override // defpackage.tcq
    public final void t() {
        this.v.execute(new aemk(this, 4, null));
        aerb aerbVar = (aerb) this.e.io();
        synchronized (aerbVar.a) {
            for (aepp aeppVar : aerbVar.e.values()) {
                if (aeppVar.f()) {
                    Context context = aerbVar.b;
                    aeppVar.b();
                }
            }
        }
    }
}
