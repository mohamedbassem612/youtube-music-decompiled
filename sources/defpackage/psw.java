package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psw {
    public static final agsn a = agsn.h("GnpSdk");
    public final pls b;
    public final agev c;
    public final pqm d;
    public final awou e;
    public final awou f;
    public final Context g;
    public final pwf h;
    public final awmd i;
    private final pwl j;

    public psw(pls plsVar, pwl pwlVar, agev agevVar, pqm pqmVar, awou awouVar, awou awouVar2, agev agevVar2, Context context, pwf pwfVar, awmd awmdVar) {
        plsVar.getClass();
        pwlVar.getClass();
        pqmVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        agevVar2.getClass();
        context.getClass();
        pwfVar.getClass();
        awmdVar.getClass();
        this.b = plsVar;
        this.j = pwlVar;
        this.c = agevVar;
        this.d = pqmVar;
        this.e = awouVar;
        this.f = awouVar2;
        this.g = context;
        this.h = pwfVar;
        this.i = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(plx plxVar, agkz agkzVar, omm ommVar, plv plvVar, awoq awoqVar) throws Throwable {
        psv psvVar;
        ahud ahudVar;
        plx plxVar2;
        ahud ahudVar2;
        ahud ahudVar3;
        plx plxVar3;
        String str;
        Integer num;
        if (awoqVar instanceof psv) {
            psvVar = (psv) awoqVar;
            int i = psvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                psvVar.e = i - Integer.MIN_VALUE;
            } else {
                psvVar = new psv(this, awoqVar);
            }
        } else {
            psvVar = new psv(this, awoqVar);
        }
        Object objC = psvVar.c;
        Object obj = awox.a;
        int i2 = psvVar.e;
        Long l = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ahudVar2 = psvVar.h;
                ahud ahudVar4 = psvVar.g;
                plvVar = (plv) psvVar.b;
                agkz agkzVar2 = (agkz) psvVar.a;
                plxVar2 = psvVar.f;
                atqp.j(objC);
                ahudVar = ahudVar4;
                agkzVar = agkzVar2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ahudVar2 = psvVar.h;
                ahudVar3 = psvVar.g;
                ahudVar = (ahud) psvVar.b;
                plvVar = (plv) psvVar.a;
                plxVar3 = psvVar.f;
                atqp.j(objC);
            }
            aibw aibwVar = (aibw) objC;
            aibwVar.getClass();
            aihf aihfVar = (aihf) ahudVar2.b;
            aihfVar.copyOnWrite();
            aiay aiayVar = (aiay) aihfVar.instance;
            aiay aiayVar2 = aiay.a;
            aiayVar.f = aibwVar;
            aiayVar.b |= 4;
            str = plxVar3.i;
            if (str != null && str.length() != 0) {
                aihf aihfVar2 = (aihf) ahudVar3.b;
                aihfVar2.copyOnWrite();
                aiay aiayVar3 = (aiay) aihfVar2.instance;
                aiayVar3.b |= 16;
                aiayVar3.h = str;
            }
            if (plvVar.a()) {
                num = this.b.i;
                if (num != null) {
                    int i3 = awtl.b;
                    num.intValue();
                    l = new Long(awtl.g(awrc.i(90, awtn.DAYS), awtn.SECONDS));
                }
                if (l != null) {
                    int iLongValue = (int) l.longValue();
                    aihf aihfVar3 = (aihf) ahudVar3.b;
                    aihfVar3.copyOnWrite();
                    aiay aiayVar4 = (aiay) aihfVar3.instance;
                    aiayVar4.b |= 8;
                    aiayVar4.g = iLongValue;
                }
            }
            String strValueOf = String.valueOf(plxVar3.a);
            strValueOf.getClass();
            aihf aihfVar4 = (aihf) ahudVar3.b;
            aihfVar4.copyOnWrite();
            aiay aiayVar5 = (aiay) aihfVar4.instance;
            aiayVar5.b |= 32;
            aiayVar5.i = strValueOf;
            return ahudVar.O();
        }
        atqp.j(objC);
        aihf aihfVarCreateBuilder = aiay.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        ahud ahudVar5 = new ahud(aihfVarCreateBuilder, (byte[]) null);
        plxVar.b();
        psvVar.f = plxVar;
        psvVar.a = agkzVar;
        psvVar.b = plvVar;
        psvVar.g = ahudVar5;
        psvVar.h = ahudVar5;
        psvVar.e = 1;
        objC = ommVar.c(psvVar);
        if (objC == obj) {
            return obj;
        }
        ahudVar = ahudVar5;
        plxVar2 = plxVar;
        ahudVar2 = ahudVar;
        List list = (List) objC;
        if (list == null && plvVar.a()) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            aihf aihfVar5 = (aihf) ahudVar2.b;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((aiay) aihfVar5.instance).e);
            listUnmodifiableList.getClass();
            new aikl(listUnmodifiableList);
            aihfVar5.copyOnWrite();
            aiay aiayVar6 = (aiay) aihfVar5.instance;
            aiie aiieVar = aiayVar6.e;
            if (!aiieVar.c()) {
                aiayVar6.e = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, aiayVar6.e);
        }
        pwl pwlVar = this.j;
        pxk pxkVarB = plxVar2.b();
        psvVar.f = plxVar2;
        psvVar.a = plvVar;
        psvVar.b = ahudVar;
        psvVar.g = ahudVar2;
        psvVar.h = ahudVar2;
        psvVar.e = 2;
        objC = pwlVar.a(pxkVarB, agkzVar, plvVar, psvVar);
        if (objC == obj) {
            return obj;
        }
        ahudVar3 = ahudVar2;
        plxVar3 = plxVar2;
        aibw aibwVar2 = (aibw) objC;
        aibwVar2.getClass();
        aihf aihfVar6 = (aihf) ahudVar2.b;
        aihfVar6.copyOnWrite();
        aiay aiayVar7 = (aiay) aihfVar6.instance;
        aiay aiayVar8 = aiay.a;
        aiayVar7.f = aibwVar2;
        aiayVar7.b |= 4;
        str = plxVar3.i;
        if (str != null) {
            aihf aihfVar7 = (aihf) ahudVar3.b;
            aihfVar7.copyOnWrite();
            aiay aiayVar9 = (aiay) aihfVar7.instance;
            aiayVar9.b |= 16;
            aiayVar9.h = str;
        }
        if (plvVar.a()) {
            num = this.b.i;
            if (num != null) {
                int i4 = awtl.b;
                num.intValue();
                l = new Long(awtl.g(awrc.i(90, awtn.DAYS), awtn.SECONDS));
            }
            if (l != null) {
                int iLongValue2 = (int) l.longValue();
                aihf aihfVar8 = (aihf) ahudVar3.b;
                aihfVar8.copyOnWrite();
                aiay aiayVar10 = (aiay) aihfVar8.instance;
                aiayVar10.b |= 8;
                aiayVar10.g = iLongValue2;
            }
        }
        String strValueOf2 = String.valueOf(plxVar3.a);
        strValueOf2.getClass();
        aihf aihfVar9 = (aihf) ahudVar3.b;
        aihfVar9.copyOnWrite();
        aiay aiayVar11 = (aiay) aihfVar9.instance;
        aiayVar11.b |= 32;
        aiayVar11.i = strValueOf2;
        return ahudVar.O();
    }
}
