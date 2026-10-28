package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qiu {
    public final Object a;
    public final Object b;

    public qiu(Context context, awmd awmdVar) {
        this.a = context;
        this.b = awmdVar;
    }

    public final aihf a(qci qciVar) {
        aihf aihfVarCreateBuilder = axhq.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        axhq axhqVar = (axhq) aihfVarCreateBuilder.instance;
        axhqVar.b |= 1;
        axhqVar.c = true;
        String str = qciVar == null ? null : qciVar.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar2 = (axhq) aihfVarCreateBuilder.instance;
            axhqVar2.b |= 4;
            axhqVar2.e = str;
        }
        try {
            aihf aihfVarCreateBuilder2 = axhg.a.createBuilder();
            axhf axhfVarD = ((oml) this.a).d();
            aihfVarCreateBuilder2.copyOnWrite();
            axhg axhgVar = (axhg) aihfVarCreateBuilder2.instance;
            axhfVarD.getClass();
            axhgVar.c = axhfVarD;
            axhgVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar3 = (axhq) aihfVarCreateBuilder.instance;
            axhg axhgVar2 = (axhg) aihfVarCreateBuilder2.build();
            axhgVar2.getClass();
            axhqVar3.d = axhgVar2;
            axhqVar3.b |= 2;
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'W', "CrashMetricFactory.java")).t("Failed to get process stats.");
        }
        return aihfVarCreateBuilder;
    }

    public qiu(oml omlVar, aunn aunnVar) {
        this.a = omlVar;
        this.b = aunnVar;
    }
}
