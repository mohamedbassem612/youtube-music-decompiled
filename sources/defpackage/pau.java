package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pau implements paq {
    private final pve a;

    static {
        agsn.h("GnpSdk");
    }

    public pau(pve pveVar) {
        pveVar.getClass();
        this.a = pveVar;
    }

    @Override // defpackage.paq
    public final plx a(pxk pxkVar) throws pvd {
        try {
            return this.a.a(pxkVar);
        } catch (plu unused) {
            plw plwVarA = plx.a();
            plwVarA.b(pxkVar);
            plwVarA.e = new agqj(pya.SYSTEM_TRAY);
            plx plxVarA = plwVarA.a();
            Long[] lArrF = this.a.f(agke.q(plxVarA));
            if (lArrF.length != 1) {
                throw new pvd();
            }
            plw plwVar = new plw(plxVarA);
            plwVar.f(lArrF[0].longValue());
            return plwVar.a();
        }
    }

    @Override // defpackage.paq
    public final void b(String str) {
        str.getClass();
        pve pveVar = this.a;
        synchronized (pveVar) {
            try {
                plw plwVar = new plw(pveVar.a(new pxo(str)));
                plwVar.i(2);
                pveVar.g(agke.q(plwVar.a()));
            } catch (plu unused) {
            }
        }
    }
}
