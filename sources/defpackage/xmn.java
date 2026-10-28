package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import j$.time.Duration;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xmn implements xmi, lot {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient");
    private static final Duration q = Duration.ofSeconds(5);
    public final Context b;
    public final String c;
    public final aunn d;
    public final aunn e;
    public final awmd f;
    public kcr g;
    public final Executor i;
    public final boolean j;
    public final yan m;
    public final vxz n;
    public yaa o;
    public final wjr p;
    private xmm r;
    private boolean s;
    private kbk t;
    private final boolean u;
    private final boolean v;
    private final wjr y;
    public int l = -1;
    final Handler k = new Handler(Looper.getMainLooper());
    public boolean h = false;
    private final Duration w = q;
    private long x = 2;

    public xmn(Context context, yan yanVar, xmr xmrVar, Executor executor, wjr wjrVar, aunn aunnVar, aunn aunnVar2, awmd awmdVar, xla xlaVar, wjr wjrVar2, vxz vxzVar) {
        this.b = context;
        this.m = yanVar;
        this.i = executor;
        this.p = wjrVar;
        this.d = aunnVar;
        this.e = aunnVar2;
        this.f = awmdVar;
        this.y = wjrVar2;
        this.n = vxzVar;
        this.u = xlaVar.az();
        this.j = xlaVar.an();
        this.v = xlaVar.aj();
        this.c = xmrVar.d;
    }

    private final void g(kbk kbkVar) {
        agrx agrxVar = agso.a;
        this.g = kbkVar.d();
        xmm xmmVar = new xmm(this);
        this.r = xmmVar;
        this.g.c(xmmVar, kbu.class);
        if (this.v) {
            wjr wjrVar = this.y;
            kro.f("Must be called from the main thread.");
            kdd.e(agzl.REMOTE_CONNECTION_MANAGER_ACQUIRED);
            Context context = kbkVar.c;
            kbn kbnVar = kbkVar.f;
            kdl kdlVar = kbkVar.h;
            kgw kgwVar = kbkVar.g;
            if (kgo.a == null) {
                kgo.a = new kgo(context, kbnVar, kdlVar, new hee(context, null), kgwVar);
            }
            kgo kgoVar = kgo.a;
            xmk xmkVar = new xmk(wjrVar, kgoVar);
            kro.f("Must be called from the main thread.");
            Set set = kgoVar.e;
            set.add(xmkVar);
            kdd.e(agzl.REMOTE_CONNECTION_CALLBACK_SET);
            khn khnVar = kgo.b;
            Build.TYPE.equals("user");
            kgoVar.f();
            if (set.isEmpty()) {
                if (kgoVar.j) {
                    try {
                        kgoVar.c.unregisterReceiver(kgoVar.h);
                    } catch (IllegalArgumentException unused) {
                    }
                    kgoVar.j = false;
                } else {
                    khnVar.d("BroadcastReceiver not registered", new Object[0]);
                }
            } else if (kgoVar.j) {
                kgo.b.d("BroadcastReceiver is already registered", new Object[0]);
            } else {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                if (Build.VERSION.SDK_INT >= 33) {
                    kgoVar.c.registerReceiver(kgoVar.h, intentFilter, null, null, 2);
                } else {
                    kgoVar.c.registerReceiver(kgoVar.h, intentFilter, null, null);
                }
                kgoVar.j = true;
            }
            did didVarA = kgoVar.a();
            if (didVarA != null) {
                kgoVar.l.d();
                dij.c();
                for (dii diiVar : dij.a().j) {
                    if (diiVar.p(didVarA)) {
                        kgoVar.b(diiVar.s);
                    }
                }
            }
        }
        this.s = true;
    }

    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        if (!lpaVar.j()) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.CastSdkClient")).j(lpaVar.e())).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient", "onComplete", (char) 190, "DefaultCastSdkClient.java")).t("Error fetching CastContext.");
            this.k.postDelayed(new xfd(this, 9), this.w.multipliedBy(this.x).toMillis());
            long j = this.x;
            this.x = j * j;
            return;
        }
        kbk kbkVar = (kbk) lpaVar.f();
        this.t = kbkVar;
        if (this.s) {
            return;
        }
        g(kbkVar);
        this.x = 2L;
    }

    @Override // defpackage.xmi
    public final void b() {
        taq.d();
        if (this.s) {
            this.r.a = false;
            return;
        }
        kbk kbkVar = this.t;
        if (kbkVar != null) {
            g(kbkVar);
        } else {
            kbk.e(this.b, this.i).o(this);
        }
    }

    @Override // defpackage.xmi
    public final void c() {
        if (this.s) {
            this.r.a = true;
        }
    }

    @Override // defpackage.xmi
    public final void d(boolean z) {
        kcb kcbVar;
        kbk kbkVar = this.t;
        if (kbkVar == null || this.u) {
            return;
        }
        kro.f("Must be called from the main thread.");
        kbn kbnVar = kbkVar.f;
        if (z != kbnVar.e) {
            kbnVar.e = z;
            kbkVar.f();
            kbu kbuVarA = kbkVar.d.a();
            if (kbuVarA == null || (kcbVar = kbuVarA.b) == null) {
                return;
            }
            try {
                kcbVar.i(z);
            } catch (RemoteException unused) {
                khn.e();
            }
        }
    }

    @Override // defpackage.xmi
    public final boolean e() {
        return this.s;
    }

    public final void f() {
        this.o = null;
    }
}
