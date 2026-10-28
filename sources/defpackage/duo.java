package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duo extends azw {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duo(ViewPager2 viewPager2) {
        super(null);
        this.a = viewPager2;
    }

    @Override // defpackage.azw
    public final void w(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.d.requestFocus(2);
        }
    }
}
