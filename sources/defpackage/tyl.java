package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyl implements tyh {
    private final /* synthetic */ int $cid;
    private final int a;

    public tyl(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.tyh
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.$cid != 0) {
            int i = layoutParams.height;
            int i2 = this.a;
            if (i == i2) {
                return false;
            }
            layoutParams.height = i2;
        } else {
            int i3 = layoutParams.width;
            int i4 = this.a;
            if (i3 == i4) {
                return false;
            }
            layoutParams.width = i4;
        }
        return true;
    }
}
