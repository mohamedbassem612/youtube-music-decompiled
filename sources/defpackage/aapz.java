package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapz extends wnn {
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapz(Context context, wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar, tqj tqjVar) {
        super(abxvVar, tqjVar.k(1073828827) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        zwbVar.getClass();
        this.c = zwbVar;
        this.f = vxzVar;
        String strI = tym.I(context);
        typ.f(strI);
        this.d = strI;
        this.e = new aapx(this, wlpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final aapy a() {
        aapy aapyVar = new aapy(this.b, this.c.e(), ((vxz) this.f).l(34, 45402343L, false));
        aapyVar.r = (String) this.d;
        return aapyVar;
    }

    public final aluu b(aapy aapyVar) {
        return (aluu) ((wnh) this.e).c(aapyVar);
    }

    public aapz(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, vxu vxuVar, Executor executor) {
        super(abxvVar, tggVar);
        this.f = f(alqr.a, wlpVar, new wsj(11), new wtk(6));
        this.e = vxuVar;
        this.c = executor;
        this.d = zwhVar;
    }

    public aapz(wlp wlpVar, abxv abxvVar, zwh zwhVar, vxz vxzVar, zwy zwyVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwhVar;
        this.f = vxzVar;
        this.d = zwyVar;
        this.e = f(alpu.a, wlpVar, new wut(0), new wtk(17));
    }

    public aapz(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxz vxzVar, zwy zwyVar, tgg tggVar, byte[] bArr) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.f = vxzVar;
        this.d = zwyVar;
        this.e = f(alpy.a, wlpVar, new wut(4), new wtk(20));
    }

    public aapz(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxz vxzVar, zwy zwyVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.e = zwbVar;
        this.f = vxzVar;
        this.d = zwyVar;
        this.c = f(alxb.a, wlpVar, new wut(6), new wvb(0));
    }

    public aapz(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.e = abxvVar;
        int i = 0;
        this.f = f(aldz.a, wlpVar, new heo(i), new hep(i));
        this.c = executor;
    }
}
