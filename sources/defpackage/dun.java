package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dun extends azw {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dun(ViewPager2 viewPager2) {
        super(null);
        this.a = viewPager2;
    }

    @Override // defpackage.azw
    public final void u(int i) {
        if (i == 0) {
            this.a.i();
        }
    }

    @Override // defpackage.azw
    public final void w(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.a != i) {
            viewPager2.a = i;
            ((duu) viewPager2.j).z();
        }
    }
}
