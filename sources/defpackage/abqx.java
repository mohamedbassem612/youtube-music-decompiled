package defpackage;

import android.content.Context;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqx extends wnn {
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public abqx(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxz vxzVar, zwy zwyVar, tgg tggVar, vxz vxzVar2, Context context, syn synVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = vxzVar;
        this.e = zwyVar;
        this.g = vxzVar2;
        this.i = context;
        this.f = synVar;
        this.h = f(aman.a, wlpVar, new wut(3), new wtk(19));
    }

    public static agev a(vyo vyoVar) {
        alik alikVarB = vyoVar.b();
        if (alikVarB != null) {
            aoqs aoqsVar = alikVarB.k;
            if (aoqsVar == null) {
                aoqsVar = aoqs.a;
            }
            ariz arizVar = aoqsVar.L;
            if (arizVar == null) {
                arizVar = ariz.a;
            }
            if (arizVar.b != 0) {
                int i = arizVar.e;
                twq twqVar = new twq(i > 0 ? i : Duration.ofSeconds(arizVar.c).toMillis(), Duration.ofSeconds(arizVar.d).toMillis(), Long.MAX_VALUE, Duration.ofSeconds(arizVar.b).toMillis(), 2.0d);
                ahfi ahfiVarB = wlt.b(0L);
                ahfiVarB.h(twqVar);
                return agev.i(ahfiVarB.g());
            }
        }
        return agdf.a;
    }

    public final avlr b(wlo wloVar) {
        return nsi.g(e(), new wlq(wloVar, false));
    }

    public abqx(awmd awmdVar, abxv abxvVar, abqi abqiVar, wlp wlpVar, grj grjVar, avmb avmbVar, vyo vyoVar, vxu vxuVar, abmt abmtVar) {
        super(abxvVar, (tgg) awmdVar.io());
        this.h = abqiVar;
        this.c = wlpVar;
        this.d = grjVar;
        this.e = avmbVar;
        this.i = vxuVar;
        this.f = vyoVar;
        this.g = abmtVar;
    }
}
