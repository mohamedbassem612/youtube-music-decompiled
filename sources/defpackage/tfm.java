package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfm {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public tfm(awmd awmdVar, tfi tfiVar) {
        this.a = awmdVar;
        this.b = new awku().aI();
        this.c = new awku().aI();
        this.e = aguu.al(new jxq(this, tfiVar, 9, null));
        this.f = aguu.al(new qhs(this, 16));
        this.g = aguu.al(new qhs(this, 17));
        aguu.al(new qhs(this, 18));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aunn, java.lang.Object] */
    public final boolean a(boolean z, Intent intent) {
        intent.getClass();
        if (!z || !awrc.c("android.intent.action.MAIN", intent.getAction())) {
            return false;
        }
        ajwo ajwoVarBc = zik.bc(intent);
        if (ajwoVarBc != null) {
            aihl aihlVar = ajmj.a;
            aihlVar.getClass();
            ajmf ajmfVar = (ajmf) aext.x(ajwoVarBc, aihlVar);
            if (awrc.c(ajmfVar.c, "FEmusic_home")) {
                String str = ajmfVar.d;
                str.getClass();
                if (str.length() > 0) {
                    return false;
                }
            }
        }
        if (!((zwb) this.b.io()).u()) {
            return false;
        }
        String strG = ((jnj) this.c.io()).g();
        strG.getClass();
        if (!awrc.c("FEmusic_home", strG)) {
            return false;
        }
        heh hehVar = new heh();
        hehVar.o();
        hehVar.j(vxh.a(strG));
        hehVar.k = strG;
        ?? r1 = this.f;
        int i = tqr.a;
        if (r1.k(1073807732)) {
            gnl gnlVar = gnl.a;
            heg hegVar = new heg((short[]) null);
            hegVar.e((xir) this.g.io());
            hehVar.c(hegVar.d());
        }
        if (intent.getData() != null) {
            hehVar.b = String.valueOf(intent.getData());
        }
        this.d = hehVar;
        ?? r5 = this.a;
        ((hke) r5.io()).b(strG);
        ((hke) r5.io()).c = strG;
        Object obj = this.d;
        if (obj != null) {
            ((gmy) this.e.io()).d((heh) obj, 7);
        }
        return true;
    }

    public tfm(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, tqj tqjVar, aunn aunnVar5) {
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        tqjVar.getClass();
        aunnVar5.getClass();
        this.a = aunnVar;
        this.e = aunnVar2;
        this.b = aunnVar3;
        this.g = aunnVar4;
        this.f = tqjVar;
        this.c = aunnVar5;
    }
}
