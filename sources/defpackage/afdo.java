package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdo extends azw {
    private final WeakReference a;
    private int b;
    private int c;

    public afdo(TabLayout tabLayout) {
        super(null);
        this.a = new WeakReference(tabLayout);
        this.c = 0;
        this.b = 0;
    }

    @Override // defpackage.azw
    public final void u(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.B = this.c;
        }
    }

    @Override // defpackage.azw
    public final void v(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z = true;
            if (i3 == 2 && this.b != 1) {
                z = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.n(i, f, z, z, false);
        }
    }

    @Override // defpackage.azw
    public final void w(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.c;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.b != 0)) {
            z = false;
        }
        tabLayout.l(tabLayout.c(i), z);
    }
}
