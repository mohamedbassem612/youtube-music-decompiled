package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ha extends bak {
    final /* synthetic */ hd a;

    public ha(hd hdVar) {
        this.a = hdVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        View view2;
        hd hdVar = this.a;
        if (hdVar.j && (view2 = hdVar.e) != null) {
            view2.setTranslationY(0.0f);
            hdVar.c.setTranslationY(0.0f);
        }
        hdVar.c.setVisibility(8);
        hdVar.c.a(false);
        hdVar.l = null;
        hu huVar = hdVar.h;
        if (huVar != null) {
            huVar.a(hdVar.g);
            hdVar.g = null;
            hdVar.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = hdVar.b;
        if (actionBarOverlayLayout != null) {
            int i = bac.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
