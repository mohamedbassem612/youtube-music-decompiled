package defpackage;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdp implements afdg {
    private final /* synthetic */ int $cid;
    private final ViewGroup a;

    public afdp(ViewGroup viewGroup, int i) {
        this.$cid = i;
        this.a = viewGroup;
    }

    @Override // defpackage.afdf
    public final void f(afdk afdkVar) {
        if (this.$cid != 0) {
            ((duc) this.a).l(afdkVar.c);
        } else {
            ((ViewPager2) this.a).e(afdkVar.c, true);
        }
    }

    @Override // defpackage.afdf
    public final void e(afdk afdkVar) {
    }

    @Override // defpackage.afdf
    public final void g(afdk afdkVar) {
    }
}
