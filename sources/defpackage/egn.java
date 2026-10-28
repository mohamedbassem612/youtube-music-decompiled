package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class egn {
    public static final String a = dzf.a("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(dov dovVar, ees eesVar, awoq awoqVar) {
        egm egmVar;
        if (awoqVar instanceof egm) {
            egmVar = (egm) awoqVar;
            int i = egmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                egmVar.b = i - Integer.MIN_VALUE;
            } else {
                egmVar = new egm(awoqVar);
            }
        } else {
            egmVar = new egm(awoqVar);
        }
        Object objO = egmVar.a;
        awox awoxVar = awox.a;
        int i2 = egmVar.b;
        if (i2 == 0) {
            atqp.j(objO);
            ikx ikxVar = new ikx(new awzj(dovVar.q(eesVar), new hqx(eesVar, (awoq) null, 1), 3), 1);
            egmVar.b = 1;
            objO = awqx.o(ikxVar, egmVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objO);
        }
        return new Integer(((eci) objO).a);
    }
}
