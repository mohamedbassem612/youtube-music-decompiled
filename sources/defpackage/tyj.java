package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tyj implements tyh {
    private final /* synthetic */ int $cid;
    private final int a;

    public tyj(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.tyh
    public final /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        int i = this.$cid;
        if (i == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            int i2 = this.a;
            if (marginStart == i2) {
                return false;
            }
            marginLayoutParams.setMarginStart(i2);
        } else if (i != 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams2.topMargin;
            int i4 = this.a;
            if (i3 == i4) {
                return false;
            }
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i4, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i5 = layoutParams2.gravity;
            int i6 = this.a;
            if (i5 == i6) {
                return false;
            }
            layoutParams2.gravity = i6;
        }
        return true;
    }

    public tyj(int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
    }
}
