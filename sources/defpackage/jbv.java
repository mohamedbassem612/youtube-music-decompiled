package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jbv extends qa {
    private final int a;

    public jbv(Resources resources) {
        super((byte[]) null);
        this.a = resources.getDimensionPixelOffset(R.dimen.cloud_chip_margin);
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        int i = bac.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        int i2 = this.a;
        if (layoutDirection == 1) {
            rect.left = i2;
        } else {
            rect.right = i2;
        }
    }
}
