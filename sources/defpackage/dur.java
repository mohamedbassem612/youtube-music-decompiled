package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dur extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dur(ViewPager2 viewPager2, Context context) {
        super(context);
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void calculateExtraLayoutSpace(oe oeVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.i == -1) {
            super.calculateExtraLayoutSpace(oeVar, iArr);
            return;
        }
        viewPager2.b();
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityNodeInfoForItem(nv nvVar, oe oeVar, View view, bbz bbzVar) {
        ViewPager2 viewPager2 = ((duu) this.a.j).a;
        bbzVar.y(zs.g(viewPager2.a() == 1 ? viewPager2.c.getPosition(view) : 0, 1, viewPager2.a() == 0 ? viewPager2.c.getPosition(view) : 0, 1, false));
    }

    @Override // defpackage.np
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
