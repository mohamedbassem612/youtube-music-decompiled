package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class sgi implements ogi, rsd {
    protected static final agkj a = agpn.b;
    public long b;
    public int c = 0;
    protected boolean d;
    public String e;
    public final long f;
    public ofg g;
    protected boolean h;
    protected boolean i;
    protected final axfd j;
    private final sko k;

    public sgi(sko skoVar, long j, boolean z, boolean z2, axfd axfdVar) {
        this.k = skoVar;
        this.f = j;
        this.h = z;
        this.i = z2;
        this.j = axfdVar;
    }

    @Override // defpackage.ogi
    public final ogm a() {
        return new ogm((int) this.f, (int) this.b, this.h, this.i);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.ogi
    public final void c(ofg ofgVar) {
        this.g = ofgVar;
        sbh sbhVar = (sbh) this.j.c.io();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sni sniVar : sbhVar.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof sge) {
                boolean zEquals = TextUtils.equals(((sge) snkVar).a, this.k.a);
                if (sniVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (zEquals) {
                        arrayList2.add(sniVar);
                    }
                } else if (zEquals) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) sbhVar.a.io()).q(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sbhVar.b(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.ogi
    public final void d(ofg ofgVar) {
        this.g = ofgVar;
        sbh sbhVar = (sbh) this.j.c.io();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sni sniVar : sbhVar.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof sgf) {
                boolean zEquals = TextUtils.equals(((sgf) snkVar).a, this.k.a);
                if (sniVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (zEquals) {
                        arrayList2.add(sniVar);
                    }
                } else if (zEquals) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) sbhVar.a.io()).q(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sbhVar.b(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.ogi
    public final void e(ofg ofgVar) {
        this.g = ofgVar;
        sbh sbhVar = (sbh) this.j.c.io();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sni sniVar : sbhVar.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof sgg) {
                boolean zEquals = TextUtils.equals(((sgg) snkVar).a, this.k.a);
                if (sniVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (zEquals) {
                        arrayList2.add(sniVar);
                    }
                } else if (zEquals) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) sbhVar.a.io()).q(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sbhVar.b(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.ogi
    public final void f(ofg ofgVar) {
        this.g = ofgVar;
        sbh sbhVar = (sbh) this.j.c.io();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sni sniVar : sbhVar.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof sgh) {
                boolean zEquals = TextUtils.equals(((sgh) snkVar).a, this.k.a);
                if (sniVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (zEquals) {
                        arrayList2.add(sniVar);
                    }
                } else if (zEquals) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) sbhVar.a.io()).q(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sbhVar.b(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.ogi
    public final void g(ofg ofgVar) {
        this.g = ofgVar;
        sbh sbhVar = (sbh) this.j.c.io();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sni sniVar : sbhVar.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof sgl) {
                boolean zEquals = TextUtils.equals(((sgl) snkVar).a, this.k.a);
                if (sniVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (zEquals) {
                        arrayList2.add(sniVar);
                    }
                } else if (zEquals) {
                    arrayList.add(sniVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) sbhVar.a.io()).q(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        sbhVar.b(arrayList2);
    }

    public abstract ofg h(int i);

    public final Boolean i(sko skoVar) {
        return Boolean.valueOf(TextUtils.equals(skoVar.a, this.k.a));
    }

    public abstract void j();

    public abstract void k();

    protected abstract void l();

    protected abstract void m();

    protected abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r(abnr abnrVar);

    public void s(boolean z, long j) {
        throw null;
    }

    public void t(int i) {
        if (i != 2) {
            if (i == 3) {
                m();
            }
        } else if (this.d) {
            n();
        } else {
            l();
            this.d = true;
        }
    }
}
