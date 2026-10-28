package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fqs extends GridLayoutManager {
    @Override // android.support.v7.widget.GridLayoutManager, defpackage.np
    public final nq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fsw ? new fqr((fsw) layoutParams) : super.generateLayoutParams(layoutParams);
    }
}
