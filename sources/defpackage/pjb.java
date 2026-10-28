package defpackage;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pjb implements phc {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;
    private final phe d;
    private final pcn e;
    private final pav f;
    private final awmd g;

    public pjb(Context context, pls plsVar, phe pheVar, pcn pcnVar, pav pavVar, awmd awmdVar) {
        context.getClass();
        plsVar.getClass();
        pheVar.getClass();
        pcnVar.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        this.b = context;
        this.c = plsVar;
        this.d = pheVar;
        this.e = pcnVar;
        this.f = pavVar;
        this.g = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0171  */
    /* JADX WARN: Code duplicated, block: B:44:0x0185  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.phc
    public final Object a(pbf pbfVar, awoq awoqVar) throws Throwable {
        pja pjaVar;
        pot potVar;
        String str;
        phe pheVar;
        pzn pznVar;
        pzn pznVarB;
        pcv pcvVar;
        pbf pbfVar2 = pbfVar;
        if (awoqVar instanceof pja) {
            pjaVar = (pja) awoqVar;
            int i = pjaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjaVar.c = i - Integer.MIN_VALUE;
            } else {
                pjaVar = new pja(this, awoqVar);
            }
        } else {
            pjaVar = new pja(this, awoqVar);
        }
        Object obj = pjaVar.a;
        Object obj2 = awox.a;
        int i2 = pjaVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            agke agkeVarB = pbfVar2.b();
            if (agkeVarB.isEmpty()) {
                ((agsj) a.b()).t("No threads associated with this event.");
                return awmy.a;
            }
            agkeVarB.getClass();
            Object objX = atqq.X(agkeVarB);
            objX.getClass();
            potVar = (pot) objX;
            ozj ozjVarB = nvj.b(potVar);
            agev agevVarA = this.e.a(ozjVarB);
            if (agevVarA.g()) {
                if (pbfVar2.d != pbd.a) {
                    ((agsj) a.b()).t("NotificationEvent threads are not system tray threads");
                    return awmy.a;
                }
                Intent intent = pbfVar2.g;
                if (intent == null) {
                    ((agsj) a.b()).t("NotificationEvent has no intent");
                    return awmy.a;
                }
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                if (resultsFromIntent == null) {
                    ((agsj) a.b()).t("Reply action text could not be retrieved from intent.");
                    return awmy.a;
                }
                CharSequence charSequence = resultsFromIntent.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
                String string = charSequence != null ? charSequence.toString() : null;
                if (string != null) {
                    paw pawVarB = this.f.b(ahzv.ACTION_CLICK);
                    pbc pbcVar = (pbc) pawVarB;
                    pbcVar.r = 2;
                    pbcVar.q = 2;
                    plx plxVar = pbfVar2.c;
                    pawVarB.f(plxVar);
                    pawVarB.b(potVar);
                    pawVarB.a();
                    ((pwf) this.g.io()).m(this.b.getPackageName(), this.c.a, Build.VERSION.SDK_INT, "ACTION_CLICKED");
                    abqq abqqVar = (abqq) agevVarA.c();
                    aicf aicfVar = pbfVar2.i;
                    pjaVar.f = pbfVar2;
                    pjaVar.d = potVar;
                    pjaVar.e = string;
                    pjaVar.c = 1;
                    ((elr) abqqVar.e).q(aaan.ATTEMPT);
                    byte[] bArr = null;
                    str = string;
                    aheo aheoVarP = aheo.p(ahng.s(afwl.c(new gmf(abqqVar, ozjVarB, string, 17, bArr)), abqqVar.h));
                    agek agekVarA = afwl.a(new xwd(abqqVar, 12));
                    ?? r9 = abqqVar.g;
                    Object objAd = awrc.ad(ahbz.f(aheoVarP.q(agekVarA, r9), Exception.class, afwl.d(new qzc((Object) abqqVar, (Object) plxVar, (Object) ozjVarB, 19, (short[]) bArr)), r9), pjaVar);
                    if (objAd != obj2) {
                        objAd = awmy.a;
                    }
                    if (objAd == obj2) {
                        return obj2;
                    }
                    pheVar = this.d;
                    pcu pcuVarA = nvu.a(pbfVar2.c);
                    plb plbVarC = plb.c();
                    pznVar = pbfVar2.h;
                    pznVar.getClass();
                    str.getClass();
                    if (pznVar.b.size() == 0) {
                        aihf aihfVarCreateBuilder = pzn.a.createBuilder();
                        aihfVarCreateBuilder.getClass();
                        nqz.c(aihfVarCreateBuilder);
                        aihfVarCreateBuilder.Z(str);
                        pznVarB = nqz.b(aihfVarCreateBuilder);
                    } else {
                        aiie aiieVar = pznVar.b;
                        aiieVar.getClass();
                        aihf builder = pznVar.toBuilder();
                        builder.getClass();
                        nqz.c(builder);
                        builder.copyOnWrite();
                        ((pzn) builder.instance).b = pzn.emptyProtobufList();
                        nqz.c(builder);
                        builder.Z(str);
                        nqz.c(builder);
                        builder.copyOnWrite();
                        pzn pznVar2 = (pzn) builder.instance;
                        pznVar2.a();
                        aifs.addAll(aiieVar, pznVar2.b);
                        pznVarB = nqz.b(builder);
                    }
                    pcvVar = new pcv(pcuVarA, plbVarC, null, pznVarB, true, true, null, false, 324);
                    pjaVar.f = null;
                    pjaVar.d = null;
                    pjaVar.e = null;
                    pjaVar.c = 2;
                    if (pheVar.d(potVar, pcvVar, pjaVar) == obj2) {
                        return obj2;
                    }
                }
            }
        } else if (i2 == 1) {
            String str2 = pjaVar.e;
            potVar = pjaVar.d;
            pbf pbfVar3 = pjaVar.f;
            atqp.j(obj);
            str = str2;
            pbfVar2 = pbfVar3;
            pheVar = this.d;
            pcu pcuVarA2 = nvu.a(pbfVar2.c);
            plb plbVarC2 = plb.c();
            pznVar = pbfVar2.h;
            pznVar.getClass();
            str.getClass();
            if (pznVar.b.size() == 0) {
                aihf aihfVarCreateBuilder2 = pzn.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                nqz.c(aihfVarCreateBuilder2);
                aihfVarCreateBuilder2.Z(str);
                pznVarB = nqz.b(aihfVarCreateBuilder2);
            } else {
                aiie aiieVar2 = pznVar.b;
                aiieVar2.getClass();
                aihf builder2 = pznVar.toBuilder();
                builder2.getClass();
                nqz.c(builder2);
                builder2.copyOnWrite();
                ((pzn) builder2.instance).b = pzn.emptyProtobufList();
                nqz.c(builder2);
                builder2.Z(str);
                nqz.c(builder2);
                builder2.copyOnWrite();
                pzn pznVar3 = (pzn) builder2.instance;
                pznVar3.a();
                aifs.addAll(aiieVar2, pznVar3.b);
                pznVarB = nqz.b(builder2);
            }
            pcvVar = new pcv(pcuVarA2, plbVarC2, null, pznVarB, true, true, null, false, 324);
            pjaVar.f = null;
            pjaVar.d = null;
            pjaVar.e = null;
            pjaVar.c = 2;
            if (pheVar.d(potVar, pcvVar, pjaVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
