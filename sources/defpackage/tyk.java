package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tyk implements tyh {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public tyk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.tyh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int i = this.a;
        if (marginStart == i && marginLayoutParams.getMarginEnd() == this.c && marginLayoutParams.topMargin == this.b && marginLayoutParams.bottomMargin == this.d) {
            return false;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(this.c);
        marginLayoutParams.topMargin = this.b;
        marginLayoutParams.bottomMargin = this.d;
        return true;
    }
}
