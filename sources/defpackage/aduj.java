package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aduj extends qa {
    private final admc a;
    private final DisplayMetrics b;
    private final aecs c;
    private final boolean d;
    private final lqa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aduj(admc admcVar, lqa lqaVar, DisplayMetrics displayMetrics, aecs aecsVar, boolean z) {
        super((byte[]) null);
        admcVar.getClass();
        lqaVar.getClass();
        displayMetrics.getClass();
        this.a = admcVar;
        this.e = lqaVar;
        this.b = displayMetrics;
        this.c = aecsVar;
        this.d = z;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        Object item;
        aecs aecsVar;
        rect.getClass();
        view.getClass();
        oeVar.getClass();
        rect.set(0, 0, 0, 0);
        int iC = recyclerView.c(view);
        if (iC != -1) {
            if ((this.d && (aecsVar = this.c) != null && aecsVar.h() && aecsVar.a() > 1) || (item = this.a.getItem(iC)) == null || this.e.S(item) == null) {
                return;
            }
            DisplayMetrics displayMetrics = this.b;
            rect.top = (int) twm.a(displayMetrics, 0.0f);
            rect.bottom = (int) twm.a(displayMetrics, 0.0f);
        }
    }
}
