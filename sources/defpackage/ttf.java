package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ttf implements ayx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public ttf(AppBarLayout appBarLayout, int i) {
        this.$cid = i;
        this.a = appBarLayout;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.a;
            if (i != 1) {
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                bbn bbnVar2 = true != appBarLayout.getFitsSystemWindows() ? null : bbnVar;
                if (!Objects.equals(appBarLayout.c, bbnVar2)) {
                    appBarLayout.c = bbnVar2;
                    appBarLayout.m();
                    appBarLayout.requestLayout();
                }
            } else {
                get getVar = (get) obj;
                if (getVar.D) {
                    ((awku) ((hfn) getVar.aL.io()).a).kk(bbnVar);
                }
            }
        } else {
            int iB = bbnVar.b();
            int iD = bbnVar.d();
            int iC = bbnVar.c();
            int iA = bbnVar.a();
            tth tthVar = (tth) this.a;
            tthVar.c.set(iB, iD, iC, iA);
            tthVar.d.set(tth.a(view));
            tthVar.e.set(tth.b(view));
            tthVar.f = bbnVar.x();
            tthVar.d();
        }
        return bbnVar;
    }

    public /* synthetic */ ttf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
