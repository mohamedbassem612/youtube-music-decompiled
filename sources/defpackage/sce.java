package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sce extends sbk implements sag {
    public static final Set a = new afx(Arrays.asList(0, 2));
    public static final Set b = new afx(Arrays.asList(3));
    public final awmd c;
    final Map d = new HashMap();
    private final awmd e;
    private final sci f;

    public sce(awmd awmdVar, awmd awmdVar2, sci sciVar) {
        this.e = awmdVar;
        this.c = awmdVar2;
        this.f = sciVar;
    }

    @Override // defpackage.sag
    public final sgs a(smr smrVar, sko skoVar) {
        return new scd(this, smrVar, skoVar, 1);
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.q(smp.class, smo.class);
    }

    @Override // defpackage.sag
    public final sgs b(smr smrVar, sko skoVar) {
        return new scd(this, skoVar, smrVar, 0);
    }

    @Override // defpackage.sag
    public final void c(String str, sgq sgqVar) {
        this.d.put(str, sgqVar);
    }

    @Override // defpackage.sag
    public final void d(String str) {
        this.d.remove(str);
    }

    public final void e(smr smrVar, sko skoVar, String str, Set set) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof smp) && TextUtils.equals(str, ((smp) snkVar).a) && set.contains(Integer.valueOf(sniVar.a))) {
                arrayList.add(sniVar);
            }
            if (snkVar instanceof smo) {
                smo smoVar = (smo) snkVar;
                boolean z = false;
                if (smoVar.a && this.f.a(smoVar.c)) {
                    z = true;
                }
                if (TextUtils.equals(str, smoVar.b) && set.contains(Integer.valueOf(sniVar.a)) && !z) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) this.e.io()).q(arrayList);
            return;
        }
        String strConcat = "No associated layout for skip click. Exit category: ".concat(String.valueOf(String.valueOf(set)));
        if (smrVar == null || skoVar == null) {
            rmp.n(null, strConcat);
        } else {
            rmp.m(smrVar, skoVar, strConcat);
        }
    }
}
