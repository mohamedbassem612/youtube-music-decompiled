package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadt implements aarp {
    final Map a = new HashMap();
    public final /* synthetic */ aadu b;

    public aadt(aadu aaduVar) {
        this.b = aaduVar;
    }

    private final void m(aamw aamwVar) {
        Set<String> setD;
        String strE = aarq.e(aamwVar.f);
        aadu aaduVar = this.b;
        aado aadoVar = aaduVar.g;
        if (aadoVar.C()) {
            typ.f(strE);
            setD = ((aagg) aaduVar.d.io()).d(strE);
        } else {
            setD = agpr.a;
        }
        for (String str : setD) {
            aaok aaokVarJ = aaduVar.j(str);
            if (aaokVarJ != null && aaokVarJ.d != null) {
                ArrayList arrayList = new ArrayList();
                abxu abxuVar = (abxu) aaduVar.c.io();
                aohm aohmVarD = abxuVar.d(str);
                aohmVarD.name();
                if (aohmVarD != aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN) {
                    aadoVar.u(new xhv(this, str, (List) arrayList, abxuVar, 11));
                }
            }
        }
    }

    @Override // defpackage.aarp
    public final void e(aamw aamwVar) {
        if (!aarq.l(aamwVar) || aamwVar.i) {
            return;
        }
        aamb aambVar = aamwVar.f;
        Map map = this.a;
        String strE = aarq.e(aambVar);
        if (map.containsKey(strE) && this.b.e.f().toEpochMilli() - ((Long) map.get(strE)).longValue() > aadu.a) {
            m(aamwVar);
        }
        map.put(strE, Long.valueOf(this.b.e.f().toEpochMilli()));
    }

    @Override // defpackage.aarp
    public final void k(aamw aamwVar, aogv aogvVar, aamg aamgVar) {
        if (aarq.l(aamwVar) && !aamwVar.i && aamgVar.b()) {
            m(aamwVar);
        }
    }

    @Override // defpackage.aarp
    public final void c() {
    }

    @Override // defpackage.aarp
    public final void g() {
    }

    @Override // defpackage.aarp
    public final void a(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void b(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void d(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void f(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void h(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void i(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void j(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void l(aamw aamwVar) {
    }
}
