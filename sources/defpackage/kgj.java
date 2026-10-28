package defpackage;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgj {
    public static final khn a = new khn("RemoteConnController", (String) null);
    private static final Object g = new Object();
    private static final Object h = new Object();
    public final kgp b;
    public final khs c;
    public final kyr d;
    public final ket e;
    public final ket f;
    private final Context i;
    private final kbn j;
    private jzz k;
    private final boolean m;
    private int n = 1;
    private int l = 0;
    private final hna o = new kgf(this);

    public kgj(Context context, kyr kyrVar, ket ketVar, kbn kbnVar, ket ketVar2, boolean z) {
        this.i = context;
        this.d = kyrVar;
        this.e = ketVar;
        this.j = kbnVar;
        this.f = ketVar2;
        kgp kgpVar = new kgp();
        this.b = kgpVar;
        kgpVar.c(new kgg(this));
        kgpVar.b = new qcb(this);
        this.c = new kgh(this, 0);
        this.m = z;
    }

    private static final boolean j(boolean z, boolean z2) {
        return z2 || z;
    }

    public final jzz a() {
        jzz jzzVar;
        synchronized (h) {
            jzzVar = this.k;
        }
        return jzzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void b(boolean z, boolean z2, boolean z3) {
        jzz jzzVar;
        if (j(z, z2)) {
            if (z3) {
                Object obj = this.d.b;
                khn.e();
                return;
            }
            int i = true != z2 ? 2427 : 2428;
            kbp kbpVar = new kbp();
            kbpVar.b = i;
            amp ampVarA = kbpVar.a();
            ket ketVar = this.f;
            kgo kgoVar = kgo.a;
            kyr kyrVar = ((kgk) ketVar).b;
            Object obj2 = kyrVar.b;
            Object obj3 = kyrVar.a;
            int i2 = ampVarA.a;
            khn.e();
            xsc.as(kyrVar, i2);
            kgo kgoVar2 = ((kgk) ketVar).a;
            synchronized (kgoVar2.i) {
                try {
                    Iterator it = kgoVar2.e.iterator();
                    while (it.hasNext()) {
                        ((ket) it.next()).u(kyrVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f() == 1) {
                this.f.F();
            }
            return;
        }
        if (!e()) {
            kbp kbpVar2 = new kbp();
            kbpVar2.b = 2423;
            i(kbpVar2.a(), false, true);
            return;
        }
        int i3 = 2;
        if (f() == 2 || f() == 3) {
            Object obj4 = this.d.b;
            khn.e();
            return;
        }
        int i4 = 4;
        if (f() == 4) {
            Object obj5 = this.d.b;
            khn.e();
            this.f.E();
            return;
        }
        if (f() == 5) {
            g(2);
        } else {
            g(3);
        }
        synchronized (h) {
            try {
                if (this.k == null) {
                    Context context = this.i;
                    jzw jzwVar = new jzw(new jzv((CastDevice) this.d.b, new hna()));
                    int i5 = jzy.b;
                    kan kanVar = new kan(context, jzwVar);
                    this.k = kanVar;
                    kanVar.l(this.o);
                }
                jzzVar = this.k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object obj6 = this.d.b;
        khn.e();
        if (this.m) {
            kab kabVar = new kab(2);
            kox koxVarY = ((kmz) jzzVar).y(((kan) jzzVar).b, "castDeviceControllerListenerKey");
            kpd kpdVar = new kpd();
            jyx jyxVar = new jyx((kmz) jzzVar, kabVar, i4);
            kah kahVar = new kah(i3);
            ((kan) jzzVar).r = 2;
            kpdVar.c = koxVarY;
            kpdVar.a = jyxVar;
            kpdVar.b = kahVar;
            kpdVar.d = new klq[]{kaf.o};
            kpdVar.f = 8428;
            ((kmz) jzzVar).C(kpdVar.a());
        } else {
            jzzVar.f();
        }
        jzzVar.i(this.b.d, new kgi(this));
        return;
        throw th;
    }

    public final void c(boolean z, boolean z2, int i) {
        int iF = f();
        if ((z && iF == 5) || iF == 1) {
            return;
        }
        int i2 = this.l;
        if (i2 <= 0) {
            i2 = 12;
        }
        kbp kbpVar = new kbp();
        kbpVar.a = i2;
        kbpVar.b = i;
        amp ampVarA = kbpVar.a();
        this.l = 0;
        if (z) {
            g(5);
            ket ketVar = this.f;
            kgo kgoVar = kgo.a;
            kgk kgkVar = (kgk) ketVar;
            kyr kyrVar = kgkVar.b;
            Object obj = kyrVar.b;
            Object obj2 = kyrVar.a;
            int i3 = ampVarA.a;
            khn.e();
            xsc.av(kyrVar, i3);
            kgo kgoVar2 = kgkVar.a;
            synchronized (kgoVar2.i) {
                Iterator it = kgoVar2.e.iterator();
                while (it.hasNext()) {
                    ((ket) it.next()).v(kyrVar);
                }
            }
            return;
        }
        ket ketVar2 = this.f;
        if (z2) {
            kgo kgoVar3 = kgo.a;
            kgk kgkVar2 = (kgk) ketVar2;
            kyr kyrVar2 = kgkVar2.b;
            Object obj3 = kyrVar2.b;
            Object obj4 = kyrVar2.a;
            int i4 = ampVarA.a;
            khn.e();
            xsc.ar(kyrVar2, i4);
            kgo kgoVar4 = kgkVar2.a;
            synchronized (kgoVar4.i) {
                Iterator it2 = kgoVar4.e.iterator();
                while (it2.hasNext()) {
                    ((ket) it2.next()).u(kyrVar2);
                }
            }
        } else {
            kgo kgoVar5 = kgo.a;
            kgk kgkVar3 = (kgk) ketVar2;
            kyr kyrVar3 = kgkVar3.b;
            String str = ((CastDevice) kyrVar3.b).a;
            Object obj5 = kyrVar3.a;
            int i5 = ampVarA.a;
            khn.e();
            kgo kgoVar6 = kgkVar3.a;
            kgoVar6.f.remove(str);
            xsc.av(kyrVar3, i5);
            synchronized (kgoVar6.i) {
                Iterator it3 = kgoVar6.e.iterator();
                while (it3.hasNext()) {
                    ((ket) it3.next()).x(kyrVar3);
                }
            }
        }
        g(1);
        this.f.F();
    }

    public final synchronized void d(boolean z, boolean z2) {
        if (j(z, z2) && f() != 5) {
            int i = true != z2 ? 2429 : 2430;
            kbp kbpVar = new kbp();
            kbpVar.b = i;
            i(kbpVar.a(), true, false);
        }
    }

    public final boolean e() {
        String str = this.j.d;
        return !str.isEmpty() && ((String) this.d.a).equals(str);
    }

    final int f() {
        int i;
        synchronized (g) {
            i = this.n;
        }
        return i;
    }

    public final void g(int i) {
        synchronized (g) {
            this.n = i;
        }
    }

    public final synchronized void h(amp ampVar) {
        i(ampVar, false, false);
    }

    public final synchronized void i(amp ampVar, boolean z, boolean z2) {
        jzz jzzVarA = a();
        if (jzzVarA == null) {
            return;
        }
        int i = ampVar.a;
        this.l = kbk.a(i);
        Object obj = this.d.b;
        khn.e();
        int iF = f();
        int i2 = 4;
        if (iF == 4 || iF == 3 || iF == 2) {
            khn.e();
            jzzVarA.c().q(new kbf(this, i2));
        }
        jzzVarA.g();
        synchronized (h) {
            try {
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        c(z, z2, i);
    }
}
