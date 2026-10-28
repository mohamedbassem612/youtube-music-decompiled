package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dus implements bcl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ duu a;

    public dus(duu duuVar, int i) {
        this.$cid = i;
        this.a = duuVar;
    }

    @Override // defpackage.bcl
    public final boolean a(View view) {
        if (this.$cid != 0) {
            this.a.y(((ViewPager2) view).a + 1);
        } else {
            this.a.y(((ViewPager2) view).a - 1);
        }
        return true;
    }
}
