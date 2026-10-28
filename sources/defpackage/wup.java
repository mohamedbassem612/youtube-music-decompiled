package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wup {
    private final String a = "next";
    private final zwb b;
    private final boolean c;
    private final Set d;
    private final ahbw e;
    private final agfr f;
    private final tqj g;
    private final vxz h;
    private final vxz i;
    private final abxv j;

    public wup(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxu vxuVar, vyo vyoVar, Set set, vxz vxzVar, vxz vxzVar2, ahbw ahbwVar, tqj tqjVar) {
        wlpVar.getClass();
        abxvVar.getClass();
        this.j = abxvVar;
        zwbVar.getClass();
        this.b = zwbVar;
        this.c = vys.a(vxuVar);
        vyoVar.getClass();
        set.getClass();
        this.d = set;
        this.h = vxzVar;
        this.i = vxzVar2;
        this.e = ahbwVar;
        this.f = aguu.al(new wkw(tqjVar, 7));
        this.g = tqjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0072  */
    public final wuq a(String str) {
        Optional optionalEmpty;
        zwa zwaVarE = this.b.e();
        if (((Boolean) this.f.io()).booleanValue()) {
            optionalEmpty = Optional.empty();
        } else {
            vxz vxzVar = this.h;
            if (vxzVar.l(2, 45353255L, false)) {
                aihf aihfVarCreateBuilder = ascs.a.createBuilder();
                boolean zL = vxzVar.l(7, 45363740L, false);
                aihfVarCreateBuilder.copyOnWrite();
                ascs ascsVar = (ascs) aihfVarCreateBuilder.instance;
                ascsVar.b |= 1;
                ascsVar.c = zL;
                aijp aijpVarAv = ahng.av(this.e.a().plusMillis(vxzVar.c(1, 45363743L, 0L)));
                aihfVarCreateBuilder.copyOnWrite();
                ascs ascsVar2 = (ascs) aihfVarCreateBuilder.instance;
                aijpVarAv.getClass();
                ascsVar2.d = aijpVarAv;
                ascsVar2.b |= 2;
                optionalEmpty = Optional.of((ascs) aihfVarCreateBuilder.build());
            } else {
                optionalEmpty = Optional.empty();
            }
        }
        boolean z = this.c;
        abxv abxvVar = this.j;
        zwaVarE.getClass();
        wuq wuqVar = new wuq(abxvVar, zwaVarE, z, optionalEmpty);
        tqj tqjVar = this.g;
        int i = tqr.a;
        wuqVar.z(true != tqjVar.k(1073830013) ? 3 : 1);
        wuqVar.e = this.i.l(359, 45802906L, false);
        wuqVar.e();
        if (!TextUtils.isEmpty(str)) {
            wuqVar.H(str);
        }
        for (wun wunVar : this.d) {
            if (wunVar != null) {
                wunVar.a(wuqVar);
            }
        }
        return wuqVar;
    }
}
