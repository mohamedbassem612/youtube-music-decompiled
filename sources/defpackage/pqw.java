package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqw extends awpk implements awqk {
    long a;
    Object b;
    int c;
    final /* synthetic */ pra d;
    final /* synthetic */ List e;
    final /* synthetic */ Map f;
    final /* synthetic */ pqq g;
    final /* synthetic */ plv h;
    final /* synthetic */ aier i;
    final /* synthetic */ int j;
    final /* synthetic */ pqo k;
    final /* synthetic */ String l;
    final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqw(pra praVar, List list, Map map, pqq pqqVar, plv plvVar, aier aierVar, int i, pqo pqoVar, String str, String str2, awoq awoqVar) {
        super(2, awoqVar);
        this.d = praVar;
        this.e = list;
        this.f = map;
        this.g = pqqVar;
        this.h = plvVar;
        this.i = aierVar;
        this.j = i;
        this.k = pqoVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pqw(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pqw) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        long epochMilli;
        Object objD;
        int i;
        omm ommVarG;
        pqo pqoVar;
        String str;
        String str2;
        String str3;
        boolean z;
        awox awoxVar = awox.a;
        int i2 = this.c;
        if (i2 == 0) {
            atqp.j(obj);
            pra praVar = this.d;
            epochMilli = praVar.b.f().toEpochMilli();
            List list = this.e;
            Map map = this.f;
            pqq pqqVar = this.g;
            plv plvVar = this.h;
            aier aierVar = this.i;
            this.a = epochMilli;
            this.c = 1;
            objD = praVar.d(list, map, pqqVar, plvVar, epochMilli, aierVar, this);
            if (objD == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                Object obj2 = this.b;
                atqp.j(obj);
                return obj2;
            }
            long j = this.a;
            atqp.j(obj);
            epochMilli = j;
            objD = obj;
        }
        pky pkyVar = (pky) objD;
        if (pkyVar instanceof pla) {
            Map map2 = (Map) ((pla) pkyVar).a;
            if (map2.isEmpty()) {
                pra praVar2 = this.d;
                plv plvVar2 = this.h;
                i = this.j;
                ommVarG = praVar2.g(plvVar2);
                Object objIo = praVar2.c.io();
                objIo.getClass();
                pqoVar = this.k;
                str = this.l;
                str2 = this.m;
                str3 = (String) objIo;
                if (plvVar2.a()) {
                }
                this.b = pkyVar;
                this.c = 2;
                if (ommVarG.m(i, str3, pqoVar, str, epochMilli, str2, z, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((pky) ((Map.Entry) it.next()).getValue()).i()) {
                    }
                }
                pra praVar3 = this.d;
                plv plvVar3 = this.h;
                i = this.j;
                ommVarG = praVar3.g(plvVar3);
                Object objIo2 = praVar3.c.io();
                objIo2.getClass();
                pqoVar = this.k;
                str = this.l;
                str2 = this.m;
                str3 = (String) objIo2;
                z = !plvVar3.a() && plvVar3.b();
                this.b = pkyVar;
                this.c = 2;
                if (ommVarG.m(i, str3, pqoVar, str, epochMilli, str2, z, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        return pkyVar;
    }
}
