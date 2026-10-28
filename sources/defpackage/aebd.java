package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aebd extends frl {
    private final LinearLayoutManager a;
    private final ViewGroup.LayoutParams b;

    public aebd(LinearLayoutManager linearLayoutManager, ViewGroup.LayoutParams layoutParams) {
        super(linearLayoutManager);
        this.a = linearLayoutManager;
        this.b = layoutParams;
    }

    @Override // defpackage.frl, defpackage.frj
    public final int f(int i, ftg ftgVar) {
        ViewGroup.LayoutParams layoutParams;
        if (this.a.getOrientation() == 0 && (layoutParams = this.b) != null && layoutParams.height == -2) {
            return 0;
        }
        return super.f(i, ftgVar);
    }
}
