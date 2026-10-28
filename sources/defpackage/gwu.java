package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gwu extends gut {
    private final jki a;
    private final hed b;

    public gwu(hed hedVar, jki jkiVar) {
        hedVar.getClass();
        jkiVar.getClass();
        this.b = hedVar;
        this.a = jkiVar;
    }

    private final boolean d(cc ccVar) {
        if (ccVar == null) {
            return false;
        }
        gqj gqjVar = (gqj) awrc.f(nsj.k(ccVar, gqj.class));
        if (gqjVar == null) {
            if (!ccVar.isAdded()) {
                return false;
            }
            List<cc> listK = ccVar.getChildFragmentManager().k();
            listK.getClass();
            if (listK.isEmpty()) {
                return false;
            }
            for (cc ccVar2 : listK) {
                if (ccVar2 == null || ccVar2.isHidden() || !d(ccVar2)) {
                }
            }
            return false;
        }
        gqjVar.r();
        return true;
    }

    private final boolean e(cc ccVar) {
        if (ccVar == null) {
            return false;
        }
        adww adwwVar = (adww) awrc.f(nsj.k(ccVar, adww.class));
        if (adwwVar == null || !adwwVar.jf()) {
            if (!ccVar.isAdded()) {
                return false;
            }
            List<cc> listK = ccVar.getChildFragmentManager().k();
            listK.getClass();
            if (listK.isEmpty()) {
                return false;
            }
            for (cc ccVar2 : listK) {
                if (ccVar2 == null || ccVar2.isHidden() || !e(ccVar2)) {
                }
            }
            return false;
        }
        adwwVar.hP();
        return true;
    }

    private static final boolean f(vor vorVar) {
        if (vorVar != null && vorVar.I()) {
            vob vobVarD = vorVar.d();
            if (vobVarD instanceof vnr) {
                ((vnr) vobVarD).k(new ulo(15));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aphb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("command is missing RefreshCommand extension");
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aphb.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        objC.getClass();
        int iAS = a.aS(((aphb) objC).c);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i != 1) {
            if (i == 2) {
                d(this.a.b());
            }
        } else {
            hed hedVar = this.b;
            if (f(hedVar.b(akuc.ENGAGEMENT_PANEL_SURFACE_BROWSE)) || f(hedVar.b(akuc.ENGAGEMENT_PANEL_SURFACE_WATCH))) {
                return;
            }
            e(this.a.b());
        }
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }
}
