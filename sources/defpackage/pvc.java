package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvc implements pun {
    public static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pqg c;
    private final pum d;

    public pvc(Context context, pls plsVar, pqg pqgVar, pum pumVar) {
        context.getClass();
        plsVar.getClass();
        pqgVar.getClass();
        pumVar.getClass();
        this.b = context;
        this.c = pqgVar;
        this.d = pumVar;
    }

    private final aiby h(plx plxVar, boolean z) {
        String str;
        aihf aihfVarCreateBuilder = aiby.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        ahng.aX(true != z ? 4 : 12, aihfVarCreateBuilder);
        if (plxVar != null && (str = plxVar.i) != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aiby aibyVar = (aiby) aihfVarCreateBuilder.instance;
            aibyVar.b |= 4;
            aibyVar.e = str;
        }
        aihf aihfVarCreateBuilder2 = aiah.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = aiao.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        Context context = this.b;
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        ahno.v(packageName, aihfVarCreateBuilder3);
        ahno.x(this.c.c(), aihfVarCreateBuilder3);
        Long lAg = qnl.ag(context);
        if (lAg != null) {
            ahno.u(lAg.longValue(), aihfVarCreateBuilder3);
        }
        Long lAh = qnl.ah(context);
        if (lAh != null) {
            ahno.w(lAh.longValue(), aihfVarCreateBuilder3);
        }
        ahno.z(ahno.t(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
        ahng.aW(ahno.y(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aiby) aihnVarBuild;
    }

    @Override // defpackage.pun
    public final aiby a(plx plxVar) {
        return h(plxVar, true);
    }

    @Override // defpackage.pun
    public final aiby b(plx plxVar) {
        return h(plxVar, false);
    }

    @Override // defpackage.pun
    public final Object c(plx plxVar, awoq awoqVar) {
        return f(plxVar, awoqVar);
    }

    @Override // defpackage.pun
    public final Object d(plx plxVar, awoq awoqVar) {
        return g(plxVar, awoqVar);
    }

    @Override // defpackage.pun
    public final ahzs e(plx plxVar) {
        String str;
        ahub ahubVarR = aewp.R(ahzs.a.createBuilder());
        Context context = this.b;
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        ahubVarR.G(packageName);
        aihf aihfVarCreateBuilder = ahzr.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aewp.F(4, aihfVarCreateBuilder);
        if (plxVar != null && (str = plxVar.i) != null) {
            aewp.E(str, aihfVarCreateBuilder);
        }
        aihf aihfVarCreateBuilder2 = ahyo.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = ahys.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        String packageName2 = context.getApplicationContext().getPackageName();
        packageName2.getClass();
        aewo.K(packageName2, aihfVarCreateBuilder3);
        Long lAh = qnl.ah(context);
        if (lAh != null) {
            aewo.L(lAh.longValue(), aihfVarCreateBuilder3);
        }
        if (auvp.c() || plxVar == null) {
            String strB = this.c.b();
            if (strB != null && strB.length() != 0) {
                aewo.M(strB, aihfVarCreateBuilder3);
            }
            Long lAg = qnl.ag(context);
            if (lAg != null) {
                aewo.J(lAg.longValue(), aihfVarCreateBuilder3);
            }
        }
        aewo.Q(aewo.I(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
        aewp.D(aewo.P(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        ahubVarR.H(aewp.C(aihfVarCreateBuilder));
        return ahubVarR.F();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(plx plxVar, awoq awoqVar) throws Throwable {
        pva pvaVar;
        axst axstVar;
        axst axstVar2;
        if (awoqVar instanceof pva) {
            pvaVar = (pva) awoqVar;
            int i = pvaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pvaVar.c = i - Integer.MIN_VALUE;
            } else {
                pvaVar = new pva(this, awoqVar);
            }
        } else {
            pvaVar = new pva(this, awoqVar);
        }
        Object objA = pvaVar.a;
        awox awoxVar = awox.a;
        int i2 = pvaVar.c;
        if (i2 == 0) {
            atqp.j(objA);
            aihf aihfVarCreateBuilder = aibz.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            axst axstVar3 = new axst(aihfVarCreateBuilder);
            String packageName = this.b.getApplicationContext().getPackageName();
            packageName.getClass();
            aihf aihfVar = (aihf) axstVar3.a;
            aihfVar.copyOnWrite();
            aibz aibzVar = (aibz) aihfVar.instance;
            aibzVar.b |= 1;
            aibzVar.e = packageName;
            aiby aibyVarH = h(plxVar, false);
            aihfVar.copyOnWrite();
            aibz aibzVar2 = (aibz) aihfVar.instance;
            aibzVar2.d = aibyVarH;
            aibzVar2.c = 1;
            pum pumVar = this.d;
            pxk pxkVarB = plxVar != null ? plxVar.b() : null;
            pvaVar.d = axstVar3;
            pvaVar.e = axstVar3;
            pvaVar.c = 1;
            objA = pumVar.a(pxkVarB, pvaVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
            axstVar = axstVar3;
            axstVar2 = axstVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axstVar = pvaVar.e;
            axstVar2 = pvaVar.d;
            atqp.j(objA);
        }
        List list = (List) objA;
        if (list != null && !list.isEmpty()) {
            aihf aihfVar2 = (aihf) axstVar.a;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((aibz) aihfVar2.instance).f);
            listUnmodifiableList.getClass();
            new aikl(listUnmodifiableList);
            aihfVar2.copyOnWrite();
            aibz aibzVar3 = (aibz) aihfVar2.instance;
            aiie aiieVar = aibzVar3.f;
            if (!aiieVar.c()) {
                aibzVar3.f = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, aibzVar3.f);
        }
        aihn aihnVarBuild = ((aihf) axstVar2.a).build();
        aihnVarBuild.getClass();
        return (aibz) aihnVarBuild;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(plx plxVar, awoq awoqVar) throws Throwable {
        pvb pvbVar;
        ahub ahubVar;
        ahub ahubVar2;
        String str;
        if (awoqVar instanceof pvb) {
            pvbVar = (pvb) awoqVar;
            int i = pvbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pvbVar.c = i - Integer.MIN_VALUE;
            } else {
                pvbVar = new pvb(this, awoqVar);
            }
        } else {
            pvbVar = new pvb(this, awoqVar);
        }
        Object obj = pvbVar.a;
        awox awoxVar = awox.a;
        int i2 = pvbVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            ahub ahubVarR = aewp.R(ahzs.a.createBuilder());
            Context context = this.b;
            String packageName = context.getApplicationContext().getPackageName();
            packageName.getClass();
            ahubVarR.G(packageName);
            pvbVar.d = ahubVarR;
            pvbVar.e = ahubVarR;
            pvbVar.c = 1;
            aihf aihfVarCreateBuilder = ahzr.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aewp.F(4, aihfVarCreateBuilder);
            if (plxVar != null && (str = plxVar.i) != null) {
                aewp.E(str, aihfVarCreateBuilder);
            }
            aihf aihfVarCreateBuilder2 = ahyo.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            aihf aihfVarCreateBuilder3 = ahys.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            String packageName2 = context.getApplicationContext().getPackageName();
            packageName2.getClass();
            aewo.K(packageName2, aihfVarCreateBuilder3);
            Long lAh = qnl.ah(context);
            if (lAh != null) {
                aewo.L(lAh.longValue(), aihfVarCreateBuilder3);
            }
            if (auvp.c() || plxVar == null) {
                String strB = this.c.b();
                if (strB != null && strB.length() != 0) {
                    aewo.M(strB, aihfVarCreateBuilder3);
                }
                Long lAg = qnl.ag(context);
                if (lAg != null) {
                    aewo.J(lAg.longValue(), aihfVarCreateBuilder3);
                }
            }
            aewo.Q(aewo.I(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
            aewp.D(aewo.P(aihfVarCreateBuilder2), aihfVarCreateBuilder);
            ahzr ahzrVarC = aewp.C(aihfVarCreateBuilder);
            if (ahzrVarC == awoxVar) {
                return awoxVar;
            }
            ahubVar = ahubVarR;
            obj = ahzrVarC;
            ahubVar2 = ahubVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahubVar2 = pvbVar.e;
            ahubVar = pvbVar.d;
            atqp.j(obj);
        }
        ahubVar2.H((ahzr) obj);
        return ahubVar.F();
    }
}
