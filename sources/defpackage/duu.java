package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duu extends azw {
    public final /* synthetic */ ViewPager2 a;
    public qa b;
    private final bcl c;
    private final bcl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duu(ViewPager2 viewPager2) {
        super(null);
        this.a = viewPager2;
        this.c = new dus(this, 1);
        this.d = new dus(this, 0);
    }

    @Override // defpackage.azw
    public final boolean x(int i) {
        return i == 8192 || i == 4096;
    }

    public final void y(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h) {
            viewPager2.f(i, true);
        }
    }

    public final void z() {
        int iA;
        ViewPager2 viewPager2 = this.a;
        int i = R.id.accessibilityActionPageLeft;
        bac.m(R.id.accessibilityActionPageLeft, viewPager2);
        bac.j(viewPager2, 0);
        bac.m(R.id.accessibilityActionPageRight, viewPager2);
        bac.j(viewPager2, 0);
        bac.m(R.id.accessibilityActionPageUp, viewPager2);
        bac.j(viewPager2, 0);
        bac.m(R.id.accessibilityActionPageDown, viewPager2);
        bac.j(viewPager2, 0);
        if (viewPager2.c() == null || (iA = viewPager2.c().a()) == 0 || !viewPager2.h) {
            return;
        }
        int i2 = iA - 1;
        if (viewPager2.a() != 0) {
            if (viewPager2.a < i2) {
                bac.n(viewPager2, new bby(null, R.id.accessibilityActionPageDown, null, null, null), null, this.c);
            }
            if (viewPager2.a > 0) {
                bac.n(viewPager2, new bby(null, R.id.accessibilityActionPageUp, null, null, null), null, this.d);
                return;
            }
            return;
        }
        boolean zK = viewPager2.k();
        int i3 = true != zK ? 16908361 : 16908360;
        if (true == zK) {
            i = 16908361;
        }
        if (viewPager2.a < i2) {
            bac.n(viewPager2, new bby(null, i3, null, null, null), null, this.c);
        }
        if (viewPager2.a > 0) {
            bac.n(viewPager2, new bby(null, i, null, null, null), null, this.d);
        }
    }
}
