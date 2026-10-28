package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wjt implements wmg {
    private final tbt a;
    private final tce b;
    private final tce c;

    public wjt(tbt tbtVar, tce tceVar, tce tceVar2) {
        tbtVar.getClass();
        this.a = tbtVar;
        this.b = tceVar;
        this.c = tceVar2;
    }

    @Override // defpackage.wmg
    public void a(alop alopVar) {
        if (alopVar.d.isEmpty()) {
            return;
        }
        amgu[] amguVarArr = null;
        for (aloq aloqVar : alopVar.d) {
            int iBh = a.bh(aloqVar.b);
            if (iBh == 0) {
                iBh = 1;
            }
            int i = iBh - 1;
            if (i == 1) {
                HashMap map = new HashMap();
                for (amgu amguVar : aloqVar.c) {
                    map.put(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
                }
                this.a.c(new wjo(map));
            } else if (i == 2) {
                this.b.a(new wjq((amgu[]) aloqVar.c.toArray(new amgu[0])));
            } else if (i == 6) {
                amguVarArr = (amgu[]) aloqVar.c.toArray(new amgu[0]);
            } else if (i == 7) {
                this.a.c(new wju((amgu[]) aloqVar.c.toArray(new amgu[0])));
            } else if (i == 8) {
                this.a.c(new wjs(aloqVar.c));
            }
        }
        this.c.a(new wjp(amguVarArr));
    }

    @Override // defpackage.wmg
    public final /* synthetic */ void c(wlu wluVar, alop alopVar, zwa zwaVar) {
        a(alopVar);
    }

    @Override // defpackage.wmg
    public final /* synthetic */ void d() {
    }
}
