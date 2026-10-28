package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvo implements pve {
    private static final agsn b = agsn.h("GnpSdk");
    public final aunn a;
    private final awou c;

    public pvo(aunn aunnVar, awou awouVar) {
        this.a = aunnVar;
        this.c = awouVar;
    }

    @Override // defpackage.pve
    public final plx a(pxk pxkVar) throws plu {
        plx plxVarF;
        try {
            plxVarF = ((pvh) this.a.io()).f(qnl.aw(pxkVar), ((pxo) pxkVar).a);
        } catch (Exception e) {
            ((agsj) ((agsj) b.c()).j(e)).s();
            plxVarF = null;
        }
        if (plxVarF != null) {
            return plxVarF;
        }
        throw new plu("Account representation not found in GnpAccountStorage");
    }

    @Override // defpackage.pve
    public final Object b(pxk pxkVar, awoq awoqVar) {
        return awro.p(this.c, new pvl(this, pxkVar, (awoq) null, 0), awoqVar);
    }

    @Override // defpackage.pve
    public final Object c(awoq awoqVar) {
        return awro.p(this.c, new pvm(this, (awoq) null, 0), awoqVar);
    }

    @Override // defpackage.pve
    public final Object d(List list, awoq awoqVar) {
        return awro.p(this.c, new pvn(this, list, (awoq) null, 0), awoqVar);
    }

    @Override // defpackage.pve
    public final Object e(List list, awoq awoqVar) {
        return awro.p(this.c, new pvn(this, list, (awoq) null, 2, (byte[]) null), awoqVar);
    }

    @Override // defpackage.pve
    public final Long[] f(List list) throws pvd {
        try {
            return ((pvh) this.a.io()).d(list);
        } catch (Exception e) {
            throw new pvd(e);
        }
    }

    @Override // defpackage.pve
    public final void g(List list) {
        try {
            ((pvh) this.a.io()).e(list);
        } catch (Exception e) {
            ((agsj) ((agsj) b.c()).j(e)).s();
        }
    }
}
