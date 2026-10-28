package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hbx implements vnh {
    private final vnh a;

    public hbx(vnh vnhVar) {
        vnhVar.getClass();
        this.a = vnhVar;
    }

    @Override // defpackage.vnh
    public final avmn[] a(RelativeLayout relativeLayout, View view, avlr avlrVar) {
        relativeLayout.getClass();
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.watch_engagement_panel_wrapper);
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        return this.a.a(relativeLayout, view, avlrVar);
    }
}
