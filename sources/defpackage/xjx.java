package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class xjx implements gdi {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final tqj g;
    private final zwb h;
    private volatile akja i;
    private final vxz j;

    public xjx(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, zwb zwbVar, awmd awmdVar5, awmd awmdVar6, tqj tqjVar, vxz vxzVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.f = awmdVar4;
        zwbVar.getClass();
        this.h = zwbVar;
        awmdVar5.getClass();
        this.d = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
        tqjVar.getClass();
        this.g = tqjVar;
        this.j = vxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    @Override // defpackage.gdi
    public final void a(String str, Map map) {
        akja akjaVar;
        if (map != null) {
            String str2 = (String) map.get("action");
            if ("process".equals(str2)) {
                return;
            }
            if ("home".equals(str2)) {
                awmd awmdVar = this.e;
                if (((vxz) awmdVar.io()).l(2, 45367220L, false)) {
                    return;
                }
                if ("cold".equals((String) map.get("yt_lt")) && ((vxz) awmdVar.io()).l(8, 45383117L, false)) {
                    return;
                }
            } else {
                if (xjl.a.keySet().contains(str2)) {
                    return;
                }
                tqj tqjVar = this.g;
                int i = tqr.a;
                if (tqjVar.k(1073814159) && xjl.b.keySet().contains(str2)) {
                    return;
                }
            }
        }
        tyt tytVar = new tyt(Uri.parse(kro.aQ(str, map)));
        ((abuz) this.c.io()).g(null, tytVar);
        tytVar.f("proc", String.valueOf(Runtime.getRuntime().availableProcessors()));
        String string = tytVar.a().toString();
        if (this.i == null) {
            alik alikVarB = ((vyo) this.d.io()).b();
            if (alikVarB == null || (alikVarB.b & 524288) == 0) {
                akjaVar = akja.a;
            } else {
                amuh amuhVar = alikVarB.n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                if ((amuhVar.b & 4) != 0) {
                    amuh amuhVar2 = alikVarB.n;
                    if (amuhVar2 == null) {
                        amuhVar2 = amuh.a;
                    }
                    akjaVar = amuhVar2.e;
                    if (akjaVar == null) {
                        akjaVar = akja.a;
                    }
                } else {
                    akjaVar = akja.a;
                }
            }
            this.i = akjaVar;
        }
        xjw xjwVar = new xjw(string, this.i.c ? tnr.a : tnr.b, (Set) this.f.io(), this.h.e(), zzl.b);
        if (this.j.m(14, 45627566L)) {
            xjwVar.B(tok.LOGGING_CSI_REQUEST);
        }
        if (((tfq) this.b.io()).h()) {
            ((tgg) this.a.io()).b(xjwVar);
        }
    }
}
