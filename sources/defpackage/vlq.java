package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlq extends awpk implements awqg {
    final /* synthetic */ assr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlq(assr assrVar, awoq awoqVar) {
        super(1, awoqVar);
        this.a = assrVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new vlq(this.a, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((vlq) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        awog awogVar = new awog(8);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aplp.b);
        assr assrVar = this.a;
        assrVar.c(aihlVarCheckIsLite);
        Object objK = assrVar.j.k(aihlVarCheckIsLite.d);
        for (aplr aplrVar : (List) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))) {
            String str = aplrVar.b;
            str.getClass();
            if (str.length() != 0) {
                String str2 = aplrVar.c;
                str2.getClass();
                if (str2.length() != 0) {
                    int iAS = a.aS(aplrVar.d);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i = iAS - 1;
                    if (i == 1) {
                        String str3 = aplrVar.b;
                        String str4 = aplrVar.c;
                        str4.getClass();
                        awogVar.put(str3, new adpk(str4));
                    } else if (i == 2) {
                        String str5 = aplrVar.b;
                        String str6 = aplrVar.c;
                        str6.getClass();
                        awogVar.put(str5, new adpu(str6));
                    }
                }
            }
        }
        aihl aihlVar = aplp.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        assrVar.c(aihlVarCheckIsLite2);
        if (assrVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            assrVar.c(aihlVarCheckIsLite3);
            Object objK2 = assrVar.j.k(aihlVarCheckIsLite3.d);
            Object objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
            objC.getClass();
            yno.fa(awogVar, (apln) objC, "");
        }
        return awogVar.e();
    }
}
