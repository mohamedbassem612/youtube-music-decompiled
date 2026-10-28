package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class min implements fpa {
    private final String a;
    private final mlf b;

    public min(String str, mlf mlfVar) {
        this.a = str;
        this.b = mlfVar;
    }

    @Override // defpackage.fpa
    public final frl a(Context context, int i) {
        mqt mqtVarA;
        frl frlVar = new frl(context, i);
        mlf mlfVar = this.b;
        if (mlfVar != null && (mqtVarA = mlfVar.a(this.a)) != null) {
            aihl aihlVar = mqs.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            mqtVarA.c(aihlVarCheckIsLite);
            if (mqtVarA.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                mqtVarA.c(aihlVarCheckIsLite2);
                Object objK = mqtVarA.j.k(aihlVarCheckIsLite2.d);
                mqs mqsVar = (mqs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                frlVar.l(mqsVar.d, mqsVar.e);
            }
        }
        return frlVar;
    }
}
