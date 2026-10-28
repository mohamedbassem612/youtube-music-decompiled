package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vng {
    public static final agkz a = ahng.ad(vqb.b, vqb.c);
    public static final agkz b = ahng.ad(vqb.e, vqb.f);
    public static final agkz c = ahng.ad(vnf.b, vnf.e);
    public final RecyclerView g;
    public final vxz i;
    public final avju j;
    public final awku d = new awku();
    public final awku e = awku.aC(Boolean.FALSE);
    public final awku f = new awku();
    public avlh h = null;

    public vng(RecyclerView recyclerView, avju avjuVar, vxz vxzVar) {
        this.g = recyclerView;
        this.j = avjuVar;
        this.i = vxzVar;
    }

    public static int a(RecyclerView recyclerView, int i) {
        oh ohVarHG = recyclerView.hG(i);
        if (ohVarHG == null) {
            return 0;
        }
        return ohVarHG.a.getHeight();
    }

    public static vqb b(vqb vqbVar, vqb vqbVar2, Set set, Set set2) {
        boolean z = true;
        if (!set.contains(vqbVar) && vqbVar != vqb.d) {
            z = false;
        }
        return (z && set2.contains(vqbVar2)) ? vqb.d : vqbVar2;
    }

    public final void c() {
        this.f.kk(vne.a);
    }
}
