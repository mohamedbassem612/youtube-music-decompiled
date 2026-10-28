package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxe extends gut {
    private final vxe a;
    private final hnq b;
    private final abww c;
    private final iqv d;

    public gxe(vxe vxeVar, hnq hnqVar, abww abwwVar, cf cfVar, jnm jnmVar) {
        vxeVar.getClass();
        this.a = vxeVar;
        hnqVar.getClass();
        this.b = hnqVar;
        abwwVar.getClass();
        this.c = abwwVar;
        cfVar.getClass();
        jnmVar.getClass();
        this.d = jnmVar.c(cfVar);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        c(ajwoVar, null);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apqd.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apqd.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apqd apqdVar = (apqd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            boolean z = false;
            for (apqc apqcVar : apqdVar.c) {
                apru apruVar = apqcVar.e;
                if (apruVar == null) {
                    apruVar = apru.a;
                }
                int iAX = acfz.aX(apruVar.c);
                boolean z2 = true;
                if (iAX == 0) {
                    iAX = 1;
                }
                int i = iAX - 1;
                if (i == 113) {
                    this.b.d(apqcVar.c == 3 ? ((Boolean) apqcVar.d).booleanValue() : false);
                } else if (i == 118) {
                    this.b.e((int) (apqcVar.c == 4 ? ((Long) apqcVar.d).longValue() : 0L));
                } else if (i != 203) {
                    switch (i) {
                        case 223:
                            taf.j(((tpq) this.c.d.io()).b(new zjq(apqcVar.c == 3 ? ((Boolean) apqcVar.d).booleanValue() : false, 7)), new abwu(5));
                            break;
                        case 224:
                            this.d.f(apqcVar.c == 3 ? ((Boolean) apqcVar.d).booleanValue() : false);
                            break;
                        case 225:
                            this.d.e(a.p(apqcVar.c == 4 ? ((Long) apqcVar.d).longValue() : 0L));
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                } else {
                    abww abwwVar = this.c;
                    boolean zBooleanValue = apqcVar.c == 3 ? ((Boolean) apqcVar.d).booleanValue() : false;
                    if (((abmt) abwwVar.e.io()).bc()) {
                        taf.j(((tpq) abwwVar.d.io()).b(new zjq(zBooleanValue, 6)), new abwu(4));
                    }
                    abwwVar.g(zBooleanValue);
                }
                z |= z2;
            }
            if (z) {
                this.a.d(apqdVar.d, map);
            }
        }
    }
}
