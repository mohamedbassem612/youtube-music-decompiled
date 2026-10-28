package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gos implements adww {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gos(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adww
    public final void hP() {
        nh nhVar;
        int i = this.$cid;
        if (i == 0) {
            ((got) this.a).h.post(new gnc(this, 9));
            return;
        }
        Object obj = this.a;
        if (i == 1) {
            gms gmsVar = (gms) obj;
            gmsVar.hF(gmsVar.H);
            return;
        }
        jml jmlVar = (jml) obj;
        vxz vxzVar = jmlVar.m;
        if (vxzVar.m(270, 45835641L)) {
            acjx acjxVar = jmlVar.i;
            if (!vxzVar.m(270, 45835641L) || acjxVar == null) {
                return;
            }
            RecyclerView recyclerView = jmlVar.e;
            if (recyclerView != null && (nhVar = recyclerView.m) != null) {
                jmlVar.l = nhVar.a();
            }
            jmlVar.i = null;
            jmlVar.c.b(2);
            jmlVar.b.iM(acjxVar);
        }
    }

    @Override // defpackage.adww
    public final boolean jf() {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return true;
        }
        jml jmlVar = (jml) this.a;
        if (jmlVar.m.m(270, 45835641L)) {
            return jmlVar.f();
        }
        return false;
    }
}
