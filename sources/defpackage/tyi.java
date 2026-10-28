package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyi implements tyh {
    private final /* synthetic */ int $cid;
    private final int a;

    public tyi(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.tyh
    public final /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.$cid != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.bottomMargin;
            int i2 = this.a;
            if (i == i2) {
                return false;
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginEnd = marginLayoutParams2.getMarginEnd();
            int i3 = this.a;
            if (marginEnd == i3) {
                return false;
            }
            marginLayoutParams2.setMarginEnd(i3);
        }
        return true;
    }
}
