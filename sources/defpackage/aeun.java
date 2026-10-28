package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeun implements ayx {
    final /* synthetic */ CollapsingToolbarLayout a;

    public aeun(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        bbn bbnVar2 = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : bbnVar;
        if (!Objects.equals(collapsingToolbarLayout.f, bbnVar2)) {
            collapsingToolbarLayout.f = bbnVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return bbnVar.m();
    }
}
