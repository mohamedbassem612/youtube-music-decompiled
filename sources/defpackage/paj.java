package defpackage;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class paj implements pma {
    private static final agsn b = agsn.h("GnpSdk");
    public final pct a;
    private final Set c;
    private final phn d;
    private final awou e;
    private final omm f;

    public paj(pct pctVar, omm ommVar, Set set, phn phnVar, awou awouVar) {
        pctVar.getClass();
        ommVar.getClass();
        set.getClass();
        awouVar.getClass();
        this.a = pctVar;
        this.f = ommVar;
        this.c = set;
        this.d = phnVar;
        this.e = awouVar;
    }

    @Override // defpackage.pma
    public final int a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        return (stringExtra == null || !(awrc.c(stringExtra, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || awrc.n(stringExtra, "com.google.android.libraries.notifications.ACTION_ID:", false))) ? 10 : -2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Intent intent, String str, awoq awoqVar) throws Throwable {
        pag pagVar;
        if (awoqVar instanceof pag) {
            pagVar = (pag) awoqVar;
            int i = pagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pagVar.c = i - Integer.MIN_VALUE;
            } else {
                pagVar = new pag(this, awoqVar);
            }
        } else {
            pagVar = new pag(this, awoqVar);
        }
        Object objA = pagVar.a;
        awox awoxVar = awox.a;
        int i2 = pagVar.c;
        if (i2 == 0) {
            atqp.j(objA);
            phn phnVar = this.d;
            pagVar.d = str;
            pagVar.c = 1;
            objA = phnVar.a(intent, pagVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = pagVar.d;
            atqp.j(objA);
        }
        pky pkyVar = (pky) objA;
        int iAu = a.au(pkyVar);
        if (iAu == 0) {
            return ((pla) pkyVar).a;
        }
        if (iAu != 1) {
            throw new awmj();
        }
        ((agsj) ((agsj) b.c()).j(((pku) pkyVar).b())).w("Error handling system tray action [%s]", str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.pma
    public final Object c(Intent intent, plb plbVar, long j, awoq awoqVar) throws Throwable {
        pai paiVar;
        aiff aiffVarE;
        String strH;
        String strG;
        pzn pznVarB;
        aicf aicfVarD;
        ahza ahzaVarC;
        String strF;
        Object obj;
        int i;
        if (awoqVar instanceof pai) {
            paiVar = (pai) awoqVar;
            int i2 = paiVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paiVar.e = i2 - Integer.MIN_VALUE;
            } else {
                paiVar = new pai(this, awoqVar);
            }
        } else {
            paiVar = new pai(this, awoqVar);
        }
        Object obj2 = paiVar.c;
        Object obj3 = awox.a;
        int i3 = paiVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                i = paiVar.b;
                strF = paiVar.l;
                ahzaVarC = paiVar.k;
                aicfVarD = paiVar.j;
                pznVarB = paiVar.i;
                strG = paiVar.h;
                strH = paiVar.g;
                aiffVarE = paiVar.f;
                obj = paiVar.a;
                atqp.j(obj2);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj2);
            }
            return awmy.a;
        }
        atqp.j(obj2);
        aiffVarE = pho.e(intent);
        strH = pho.h(intent);
        strG = pho.g(intent);
        pznVarB = pho.b(intent);
        aicfVarD = pho.d(intent);
        ahzaVarC = pho.c(intent);
        if (strH == null ? strG == null : strG != null) {
            throw new IllegalArgumentException("One of Thread ID or Group ID should be null");
        }
        int iR = pho.r(intent);
        strF = pho.f(intent);
        if (strF != null && awrc.n(strF, "com.google.android.libraries.notifications.ACTION_ID:", false)) {
            strF = new awtk("com.google.android.libraries.notifications.ACTION_ID:").c(strF);
        }
        paiVar.a = intent;
        paiVar.f = aiffVarE;
        paiVar.g = strH;
        paiVar.h = strG;
        paiVar.i = pznVarB;
        paiVar.j = aicfVarD;
        paiVar.k = ahzaVarC;
        paiVar.l = strF;
        paiVar.b = iR;
        paiVar.e = 1;
        Object objB = b(intent, strF, paiVar);
        if (objB == obj3) {
            return obj3;
        }
        obj = intent;
        i = iR;
        obj2 = objB;
        plx plxVar = (plx) obj2;
        if (plxVar != null) {
            omm ommVar = this.f;
            agke agkeVarR = strH != null ? ommVar.r(plxVar, strH) : ommVar.q(plxVar, strG);
            int iB = aiep.b(aiffVarE.c);
            if (iB == 0) {
                iB = aiep.a;
            }
            if (iB == aiep.c) {
                for (pyp pypVar : this.c) {
                    agkeVarR.getClass();
                    aguu.T(agkeVarR);
                    pypVar.f();
                }
            }
            pct pctVar = this.a;
            pbe pbeVarA = pbf.a();
            pbeVarA.f = 1;
            pbeVarA.e(i);
            pbeVarA.a = strF;
            pbeVarA.b = plxVar;
            pbeVarA.f(agkeVarR);
            pbeVarA.d(aiffVarE);
            pbeVarA.c = (Intent) obj;
            pbeVarA.c(pznVarB);
            pbeVarA.d = aicfVarD;
            pbeVarA.e = new pbh(ahzaVarC, null, null, false);
            pbf pbfVarA = pbeVarA.a();
            paiVar.a = null;
            paiVar.f = null;
            paiVar.g = null;
            paiVar.h = null;
            paiVar.i = null;
            paiVar.j = null;
            paiVar.k = null;
            paiVar.l = null;
            paiVar.e = 2;
            if (pctVar.a(pbfVarA, paiVar) == obj3) {
                return obj3;
            }
        }
        return awmy.a;
    }

    @Override // defpackage.pma
    public final void d(Intent intent, plb plbVar, long j) throws Throwable {
        aiff aiffVarE = pho.e(intent);
        String strH = pho.h(intent);
        String strG = pho.g(intent);
        pzn pznVarB = pho.b(intent);
        aicf aicfVarD = pho.d(intent);
        ahza ahzaVarC = pho.c(intent);
        if (strH == null ? strG == null : strG != null) {
            throw new IllegalArgumentException("One of Thread ID or Group ID should be null");
        }
        int iR = pho.r(intent);
        awrm awrmVar = new awrm();
        awrmVar.a = pho.f(intent);
        Object obj = awrmVar.a;
        if (obj != null && awrc.n((String) obj, "com.google.android.libraries.notifications.ACTION_ID:", false)) {
            awrmVar.a = new awtk("com.google.android.libraries.notifications.ACTION_ID:").c((CharSequence) awrmVar.a);
        }
        awou awouVar = this.e;
        plx plxVar = (plx) awqx.l(awouVar, new gme(this, intent, awrmVar, (awoq) null, 6));
        if (plxVar != null) {
            omm ommVar = this.f;
            agke agkeVarR = strH != null ? ommVar.r(plxVar, strH) : ommVar.q(plxVar, strG);
            int iB = aiep.b(aiffVarE.c);
            if (iB == 0) {
                iB = aiep.a;
            }
            if (iB == aiep.c) {
                for (pyp pypVar : this.c) {
                    agkeVarR.getClass();
                    aguu.T(agkeVarR);
                    pypVar.f();
                }
            }
            awqx.l(awouVar, new pah(this, iR, awrmVar, plxVar, agkeVarR, aiffVarE, intent, pznVarB, aicfVarD, ahzaVarC, null));
        }
    }
}
