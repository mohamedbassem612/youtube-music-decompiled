package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesb {
    public final aess a;
    public final awmd b;
    public int c;
    public long d;
    public aihf e;

    public aesb(aess aessVar, awmd awmdVar) {
        this.a = aessVar;
        this.b = awmdVar;
        this.c = Math.min(10, ((trl) aessVar.e).c(330, 0, 5));
    }

    public static void b(aess aessVar, awmd awmdVar) {
        int i = aerx.a;
        for (File file : aewo.l(aessVar)) {
            aihf aihfVarN = aewo.n(file);
            if (aihfVarN != null) {
                xeu xeuVar = (xeu) awmdVar.io();
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarN, alot.ANR_DETECTION);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    ajeb ajebVar = (ajeb) aihfVarN.build();
                    ajebVar.getClass();
                    alouVar.d = ajebVar;
                    alouVar.c = 161;
                    xeuVar.b((alou) alosVar.build());
                }
            }
            afba.S(file);
        }
    }

    final void a() {
        this.e = null;
        afba.S(aewo.j(this.a));
    }
}
