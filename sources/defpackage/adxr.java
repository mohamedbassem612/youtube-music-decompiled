package defpackage;

import com.google.android.libraries.blocks.Container;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adxr {
    public final Container a;
    public adtv b;
    public adxz c;
    public final Set d = new HashSet();
    public final boolean e;
    public auym f;
    private adtb g;
    private agbm h;

    public adxr(Container container, adtv adtvVar, adtb adtbVar, adxz adxzVar, boolean z) {
        this.a = container;
        this.b = adtvVar;
        this.g = adtbVar;
        this.c = adxzVar;
        this.e = z;
    }

    private static final asik j(int i, String str) {
        aihf aihfVarCreateBuilder = asik.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).b = i;
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).c = str;
        atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        asik asikVar = (asik) aihfVarCreateBuilder.instance;
        atxpVar.getClass();
        asikVar.c = atxpVar;
        asikVar.b |= 1;
        return (asik) aihfVarCreateBuilder.build();
    }

    private static final ashv k(int i, String str) {
        aihf aihfVarCreateBuilder = ashv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).b = i;
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).c = str;
        atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ashv ashvVar = (ashv) aihfVarCreateBuilder.instance;
        atxpVar.getClass();
        ashvVar.c = atxpVar;
        ashvVar.b |= 1;
        return (ashv) aihfVarCreateBuilder.build();
    }

    public final synchronized adxp a(adtv adtvVar, acjx acjxVar, adxz adxzVar, boolean z) {
        return new adxp(adtvVar, acjxVar, adxzVar, z);
    }

    public final synchronized ashv b(ashu ashuVar) {
        ashv ashvVarK;
        adtv adtvVar = this.b;
        if (adtvVar == null) {
            ashvVarK = k(atqn.d(15), "Null continuableController, unable to add continuation.");
        } else {
            aqpx aqpxVar = ashuVar.b;
            if (aqpxVar == null) {
                aqpxVar = aqpx.a;
            }
            acjx acjxVarAe = aawb.ae(aqpxVar);
            if (acjxVarAe == null) {
                ashvVarK = k(atqn.d(5), "Invalid continuation data.");
            } else {
                adtvVar.t(agke.q(acjxVarAe));
                aihf aihfVarCreateBuilder = ashv.a.createBuilder();
                aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ((atxp) aihfVarCreateBuilder2.instance).b = 0;
                atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                ashv ashvVar = (ashv) aihfVarCreateBuilder.instance;
                atxpVar.getClass();
                ashvVar.c = atxpVar;
                ashvVar.b |= 1;
                ashvVarK = (ashv) aihfVarCreateBuilder.build();
            }
        }
        return ashvVarK;
    }

    public final synchronized asik c(asij asijVar) {
        acjx acjxVarAe;
        asik asikVarJ;
        adtb adtbVar;
        adtv adtvVar = this.b;
        if (adtvVar == null) {
            return j(atqn.d(11), "localContinuableController is null.");
        }
        adxm adxmVar = new adxm(asijVar, 2);
        if (asijVar.e && (asijVar.b & 2) != 0) {
            adtb adtbVar2 = this.g;
            if (adtbVar2 == null) {
                return j(atqn.d(15), "Null clearAndReloadHandler, unable to add continuation.");
            }
            apho aphoVar = asijVar.d;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            adtbVar2.O(aphoVar, adxmVar, null, null);
            aihf aihfVarCreateBuilder = asik.a.createBuilder();
            aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).b = 0;
            atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asik asikVar = (asik) aihfVarCreateBuilder.instance;
            atxpVar.getClass();
            asikVar.c = atxpVar;
            asikVar.b |= 1;
            return (asik) aihfVarCreateBuilder.build();
        }
        if ((asijVar.b & 2) == 0) {
            acjx acjxVar = adtvVar.al;
            if (acjxVar == null) {
                asikVarJ = j(atqn.d(11), "No reload continuation is set on the section list.");
            } else {
                acjxVarAe = acjxVar;
            }
            return asikVarJ;
        }
        apho aphoVar2 = asijVar.d;
        if (aphoVar2 == null) {
            aphoVar2 = apho.a;
        }
        acjxVarAe = aawb.ae(aphoVar2);
        if (acjxVarAe == null) {
            return j(atqn.d(5), "Invalid reload continuation data.");
        }
        String strC = acjxVarAe.c();
        byte[] bArrH = acjxVarAe.h();
        acjw acjwVarA = acjxVarAe.a();
        alap alapVar = asijVar.c;
        if (alapVar == null) {
            alapVar = alap.a;
        }
        acjx acjxVarAf = aawb.af(strC, bArrH, acjwVarA, alapVar, acjxVarAe.g(), acjxVarAe.f(), acjxVarAe.e(), acjxVarAe.d());
        if (!asijVar.e || (adtbVar = this.g) == null) {
            adtn adtnVarA = adto.a(acjxVarAf);
            adtnVarA.c = adxmVar;
            adtvVar.aK(adtnVarA.a());
        } else {
            adtbVar.ap(acjxVarAf, adxmVar);
        }
        aihf aihfVarCreateBuilder3 = asik.a.createBuilder();
        aihf aihfVarCreateBuilder4 = atxp.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        ((atxp) aihfVarCreateBuilder4.instance).b = 0;
        atxp atxpVar2 = (atxp) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        asik asikVar2 = (asik) aihfVarCreateBuilder3.instance;
        atxpVar2.getClass();
        asikVar2.c = atxpVar2;
        asikVar2.b |= 1;
        asikVarJ = (asik) aihfVarCreateBuilder3.build();
        return asikVarJ;
    }

    public final synchronized void d(adtb adtbVar) {
        this.g = adtbVar;
    }

    public final synchronized void e(adtv adtvVar) {
        this.b = adtvVar;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((adxp) it.next()).b(adtvVar);
        }
    }

    public final synchronized void f(adxz adxzVar) {
        this.c = adxzVar;
        auym auymVar = this.f;
        if (auymVar != null) {
            auymVar.e(adxzVar);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((adxp) it.next()).c(adxzVar);
        }
    }

    public final synchronized boolean g() {
        return this.b == null || this.c == null;
    }

    public final synchronized asig h() {
        asig asigVar;
        try {
            synchronized (this) {
                try {
                    if (g()) {
                        asigVar = asig.a;
                    } else {
                        adxz adxzVar = this.c;
                        agbm agbmVar = this.h;
                        if (agbmVar == null) {
                            agbmVar = (agbm) this.a.b(new afzb(8), new aazx(this, adxzVar, 10, null));
                        }
                        this.h = agbmVar;
                        aihf aihfVarCreateBuilder = asig.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = asin.a.createBuilder();
                        String strH = agbmVar.h();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asin asinVar = (asin) aihfVarCreateBuilder2.instance;
                        strH.getClass();
                        asinVar.b |= 1;
                        asinVar.c = strH;
                        asin asinVar2 = (asin) aihfVarCreateBuilder2.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        asig asigVar2 = (asig) aihfVarCreateBuilder.instance;
                        asinVar2.getClass();
                        asigVar2.c = asinVar2;
                        asigVar2.b |= 1;
                        asigVar = (asig) aihfVarCreateBuilder.build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return asigVar;
    }

    public final synchronized auym i(adxz adxzVar) {
        return new auym(adxzVar);
    }
}
