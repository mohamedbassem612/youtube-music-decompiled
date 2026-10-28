package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdq {
    public final TabLayout a;
    public final ViewPager2 b;
    public nh c;
    public boolean d;
    public afdo e;
    public afdg f;
    public qa g;
    private final hxh h;

    public afdq(TabLayout tabLayout, ViewPager2 viewPager2, hxh hxhVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.h = hxhVar;
    }

    public final void a() {
        TabLayout tabLayout = this.a;
        tabLayout.j();
        nh nhVar = this.c;
        if (nhVar != null) {
            int iA = nhVar.a();
            for (int i = 0; i < iA; i++) {
                afdk afdkVarD = tabLayout.d();
                afdkVarD.e(((aqjj) ((jhq) ((jib) this.h.a).a.a.get(i)).d.b).e);
                tabLayout.f(afdkVarD, false);
            }
            if (iA > 0) {
                int iMin = Math.min(this.b.a, tabLayout.b() - 1);
                if (iMin != tabLayout.a()) {
                    tabLayout.l(tabLayout.c(iMin), true);
                }
            }
        }
    }
}
