package defpackage;

import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmc {
    public final abvn b;
    public final abvk c;
    public final tun d;
    public final vxe e;
    public boolean i;
    public boolean j;
    public final hee m;
    private final xeu n;
    private final xgn o;
    private final Handler p;
    public final awku f = new awku();
    public arnk g = null;
    public Runnable h = null;
    public final avmm a = new avmm();
    public String k = "";
    public int l = -1;

    public abmc(Handler handler, abvn abvnVar, abvk abvkVar, tun tunVar, xeu xeuVar, xgn xgnVar, vxe vxeVar, hee heeVar) {
        this.p = handler;
        this.b = abvnVar;
        this.c = abvkVar;
        this.d = tunVar;
        this.n = xeuVar;
        this.o = xgnVar;
        this.e = vxeVar;
        this.m = heeVar;
    }

    public final void a() {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.p.removeCallbacks(runnable);
            this.h = null;
        }
    }

    public final void b(arnj arnjVar, boolean z) {
        int i = arnjVar.b;
        if ((32768 & i) == 0) {
            f(arnjVar);
            return;
        }
        long j = (i & 4) != 0 ? arnjVar.e : 0L;
        hff hffVar = new hff(this, z, arnjVar, 8);
        this.h = hffVar;
        this.p.postDelayed(hffVar, j);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aeez, java.lang.Object] */
    public final void c(arnj arnjVar) {
        alay alayVar;
        e();
        a();
        if ((arnjVar.b & 16384) != 0) {
            alayVar = arnjVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        if (!TextUtils.isEmpty(spannedK)) {
            ?? r1 = this.m.a;
            jio jioVarE = jin.e();
            jik jikVar = (jik) jioVarE;
            jikVar.i(-1);
            jikVar.k(spannedK);
            r1.d(jioVarE.b());
        }
        h(5, arnjVar);
    }

    public final void d(arnj arnjVar) {
        this.c.ap(false, 43);
        h(4, arnjVar);
    }

    public final void e() {
        this.p.postDelayed(new abbj(this, 11), 300L);
    }

    public final void f(arnj arnjVar) {
        abaq abaqVar = new abaq(this, arnjVar, 9);
        this.h = abaqVar;
        this.p.postDelayed(abaqVar, arnjVar.f);
    }

    public final void g(arnj arnjVar) {
        this.d.addObserver(new abmb(this, arnjVar));
    }

    public final void h(int i, arnj arnjVar) {
        aihf aihfVarCreateBuilder = arnf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar = (arnf) aihfVarCreateBuilder.instance;
        arnfVar.c = i - 1;
        arnfVar.b |= 1;
        String strI = this.o.i();
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar2 = (arnf) aihfVarCreateBuilder.instance;
        strI.getClass();
        arnfVar2.b |= 8;
        arnfVar2.e = strI;
        int i2 = arnjVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar3 = (arnf) aihfVarCreateBuilder.instance;
        arnfVar3.b |= 16;
        arnfVar3.f = i2;
        long j = arnjVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar4 = (arnf) aihfVarCreateBuilder.instance;
        arnfVar4.b |= 2;
        arnfVar4.d = j;
        int iBc = a.bc(arnjVar.g);
        int i3 = iBc != 0 ? iBc : 1;
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar5 = (arnf) aihfVarCreateBuilder.instance;
        arnfVar5.i = i3 - 1;
        arnfVar5.b |= SemanticState.Hidden;
        long j2 = arnjVar.h;
        aihfVarCreateBuilder.copyOnWrite();
        arnf arnfVar6 = (arnf) aihfVarCreateBuilder.instance;
        arnfVar6.b |= 64;
        arnfVar6.h = j2;
        String str = this.k;
        if (str != null && !"".equals(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            arnf arnfVar7 = (arnf) aihfVarCreateBuilder.instance;
            arnfVar7.b |= SemanticState.LiveRegion;
            arnfVar7.j = str;
        }
        int i4 = this.l;
        if (i4 != -1 && (i == 3 || i == 23)) {
            aihfVarCreateBuilder.copyOnWrite();
            arnf arnfVar8 = (arnf) aihfVarCreateBuilder.instance;
            arnfVar8.b |= 32;
            arnfVar8.g = i4;
        }
        xeu xeuVar = this.n;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.YOU_THERE);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arnf arnfVar9 = (arnf) aihfVarCreateBuilder.build();
        arnfVar9.getClass();
        alouVar.d = arnfVar9;
        alouVar.c = 21;
        xeuVar.b((alou) alosVar.build());
    }
}
