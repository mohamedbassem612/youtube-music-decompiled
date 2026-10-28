package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hdm extends LinearLayoutManager {
    private final int a;
    private final int b;
    private final int c;

    public hdm(Context context, int i, int i2, int i3) {
        super(context, 0, false);
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private final int a() {
        int width = getWidth() - (this.b << 1);
        int i = this.a;
        return (width - ((this.c * (i - 1)) << 1)) / i;
    }

    private final void b(nq nqVar) {
        nqVar.width = a();
    }

    @Override // defpackage.np
    public final boolean checkLayoutParams(nq nqVar) {
        return super.checkLayoutParams(nqVar) && nqVar.width == a();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final nq generateDefaultLayoutParams() {
        nq nqVarGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
        b(nqVarGenerateDefaultLayoutParams);
        return nqVarGenerateDefaultLayoutParams;
    }

    @Override // defpackage.np
    public final nq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        nq nqVarGenerateLayoutParams = super.generateLayoutParams(layoutParams);
        b(nqVarGenerateLayoutParams);
        return nqVarGenerateLayoutParams;
    }
}
