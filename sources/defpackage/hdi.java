package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hdi extends qa {
    private final int a;

    public hdi(Resources resources) {
        super((byte[]) null);
        this.a = resources.getDimensionPixelOffset(R.dimen.generated_thumbnails_gallery_item_margin);
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        int i = this.a;
        rect.left = i;
        rect.top = i;
        rect.bottom = i;
        rect.right = i;
    }
}
