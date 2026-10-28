package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sso extends qa {
    public sso(Context context) {
        super((byte[]) null);
        context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin);
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        if (recyclerView.c(view) == -1) {
            return;
        }
        int i = ((GridLayoutManager) recyclerView.n).b;
        int i2 = ((ml) view.getLayoutParams()).a;
        throw null;
    }
}
