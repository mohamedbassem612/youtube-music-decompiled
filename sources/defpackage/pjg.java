package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjg extends awpk implements awqg {
    int a;
    final /* synthetic */ pjv b;
    final /* synthetic */ plx c;
    final /* synthetic */ List d;
    final /* synthetic */ pax e;
    final /* synthetic */ pbh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjg(pjv pjvVar, plx plxVar, List list, pax paxVar, pbh pbhVar, awoq awoqVar) {
        super(1, awoqVar);
        this.b = pjvVar;
        this.c = plxVar;
        this.d = list;
        this.e = paxVar;
        this.f = pbhVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjg(this.b, this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjg) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        pjv pjvVar = this.b;
        plx plxVar = this.c;
        List list = this.d;
        String[] strArr = (String[]) list.toArray(new String[0]);
        agke agkeVarR = pjvVar.g.r(plxVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        agkeVarR.getClass();
        pax paxVar = this.e;
        pbh pbhVar = this.f;
        this.a = 1;
        Object objM = pjvVar.m(plxVar, list, agkeVarR, paxVar, pbhVar, this);
        return objM == awoxVar ? awoxVar : objM;
    }
}
