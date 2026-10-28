package defpackage;

import android.os.Handler;
import internal.org.jni_zero.CommonApis;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfr {
    public final Runnable a;
    public final Handler b;
    public final mbc c;
    public final vyo d;
    public final abmt e;
    public final Function f;
    public long h;
    public boolean i;
    public final abvy l;
    private final boolean m;
    private Boolean n;
    public long g = Long.MAX_VALUE;
    public boolean j = false;
    public avmn k = null;
    private acfs o = null;

    public acfr(mbc mbcVar, vyo vyoVar, Handler handler, awmd awmdVar, abvy abvyVar, Function function, abmt abmtVar) {
        this.c = mbcVar;
        this.d = vyoVar;
        this.b = handler;
        this.e = abmtVar;
        this.l = abvyVar;
        this.f = function;
        this.m = abmtVar.bu();
        this.a = new abwl(this, awmdVar, 12, null);
    }

    private final boolean f() {
        if (!this.m) {
            return this.e.bX();
        }
        Boolean boolValueOf = this.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.e.bX());
            this.n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void a(long j) {
        if (this.e.ad()) {
            j = Math.min(this.g, j);
        }
        this.g = j;
    }

    public final void b() {
        Handler handler = this.b;
        Runnable runnable = this.a;
        handler.removeCallbacks(runnable);
        this.h = 0L;
        handler.post(runnable);
    }

    final void c() {
        this.b.removeCallbacks(this.a);
    }

    public final boolean d(acip acipVar) {
        if (acipVar.a() == 1) {
            return true;
        }
        wjf wjfVarF = acipVar.f();
        if (f() || (wjfVarF != null && wjfVarF.T())) {
            return this.j;
        }
        apfp apfpVar = null;
        if (acipVar.n() != null) {
            abnl abnlVarN = acipVar.n();
            abnlVarN.getClass();
            if (abnlVarN.b != null) {
                abnl abnlVarN2 = acipVar.n();
                abnlVarN2.getClass();
                ajwo ajwoVar = abnlVarN2.b;
                ajwoVar.getClass();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            }
        }
        if (apfpVar != null) {
            if ((apfpVar.c & 1) != 0) {
                int iF = CommonApis.f(apfpVar.l);
                if (iF != 0 && iF == 4) {
                    return true;
                }
            } else if ((apfpVar.c & 4194304) != 0) {
                apdm apdmVar = apfpVar.C;
                if (apdmVar == null) {
                    apdmVar = apdm.a;
                }
                if ((apdmVar.b & 1) != 0) {
                    apdm apdmVar2 = apfpVar.C;
                    if (apdmVar2 == null) {
                        apdmVar2 = apdm.a;
                    }
                    if (apdmVar2.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int e(acfs acfsVar) {
        acip acipVar = acfsVar.a;
        wjf wjfVarF = acipVar.f();
        if (((wjfVarF != null && wjfVarF.T()) || f()) && acfsVar != this.o) {
            this.o = acfsVar;
            this.j = false;
            avmn avmnVar = this.k;
            if (avmnVar != null && !avmnVar.f()) {
                awka.f((AtomicReference) this.k);
            }
            this.k = acipVar.ah().ak(new aceb(this, 10));
        }
        int i = 1;
        if (this.c.b() >= this.h && aawr.b(acipVar) == 2) {
            i = 4;
        }
        acfsVar.P(i);
        return i;
    }
}
