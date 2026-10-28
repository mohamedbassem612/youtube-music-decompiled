package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeup implements aeum {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aeup(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        this.$cid = i;
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        jjy jjyVar;
        int i2;
        int i3 = this.$cid;
        Object obj = this.a;
        if (i3 != 0) {
            if (i >= 0 || (i2 = (jjyVar = (jjy) obj).p) <= 0) {
                jjy jjyVar2 = (jjy) obj;
                jjyVar2.h.setAlpha(0.0f);
                jjyVar2.j.setAlpha(1.0f);
                jjyVar2.k.setAlpha(1.0f);
                jjyVar2.i.setAlpha(1.0f);
                return;
            }
            float fMin = Math.min(Math.abs(i) / (i2 - jjyVar.d.getMinimumHeight()), 1.0f);
            jjyVar.h.setAlpha(fMin);
            float f = 1.0f - fMin;
            jjyVar.j.setAlpha(f);
            jjyVar.k.setAlpha(f);
            jjyVar.i.setAlpha(f);
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
        collapsingToolbarLayout.e = i;
        bbn bbnVar = collapsingToolbarLayout.f;
        int iD = bbnVar != null ? bbnVar.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = collapsingToolbarLayout.getChildAt(i4);
            aeuo aeuoVar = (aeuo) childAt.getLayoutParams();
            aeuv aeuvVarC = CollapsingToolbarLayout.c(childAt);
            int i5 = aeuoVar.a;
            if (i5 == 1) {
                aeuvVarC.d(ast.c(-i, 0, collapsingToolbarLayout.a(childAt)));
            } else if (i5 == 2) {
                aeuvVarC.d(Math.round((-i) * aeuoVar.b));
            }
        }
        collapsingToolbarLayout.h();
        if (collapsingToolbarLayout.d != null && iD > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = height - collapsingToolbarLayout.getMinimumHeight();
        int iB = height - collapsingToolbarLayout.b();
        int i6 = minimumHeight - iD;
        int i7 = collapsingToolbarLayout.e + i6;
        float fAbs = Math.abs(i);
        aeyb aeybVar = collapsingToolbarLayout.a;
        float f2 = i6;
        float f3 = iB / f2;
        aeybVar.A(Math.min(1.0f, f3));
        aeybVar.d = i7;
        float f4 = fAbs / f2;
        aeybVar.z(f4);
        aeyb aeybVar2 = collapsingToolbarLayout.b;
        aeybVar2.A(Math.min(1.0f, f3));
        aeybVar2.d = i7;
        aeybVar2.z(f4);
    }

    public /* synthetic */ aeup(jjy jjyVar, int i) {
        this.$cid = i;
        this.a = jjyVar;
    }
}
