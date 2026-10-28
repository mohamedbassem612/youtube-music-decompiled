package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psr extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ Map c;
    final /* synthetic */ pqr d;
    final /* synthetic */ plv e;
    final /* synthetic */ omr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psr(Map map, pqr pqrVar, omr omrVar, plv plvVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = map;
        this.d = pqrVar;
        this.f = omrVar;
        this.e = plvVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new psr(this.c, this.d, this.f, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((psr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        awox awoxVar = awox.a;
        if (this.b != 0) {
            obj2 = this.a;
            atqp.j(obj);
        } else {
            atqp.j(obj);
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : this.c.entrySet()) {
                plx plxVarA = (plx) entry.getValue();
                int iA = this.d.a(plxVarA);
                if (plxVarA.f != iA) {
                    plw plwVar = new plw(plxVarA);
                    plwVar.i(iA);
                    plxVarA = plwVar.a();
                    arrayList.add(plxVarA);
                }
                map.put(entry.getKey(), plxVarA);
            }
            pve pveVarF = ((oml) this.f.b).f(this.e);
            this.a = map;
            this.b = 1;
            obj = pveVarF.e(arrayList, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            obj2 = map;
        }
        pky pkyVar = (pky) obj;
        return !(pkyVar instanceof pku) ? new pla(obj2) : pkyVar;
    }
}
