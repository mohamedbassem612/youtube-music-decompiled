package defpackage;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jib implements jic {
    public final jia a;
    private final ViewPager2 b;
    private afdq c;
    private qa d;

    public jib(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.b = viewPager2;
        viewPager2.h(false);
        jia jiaVar = new jia();
        this.a = jiaVar;
        viewPager2.d(jiaVar);
    }

    @Override // defpackage.jic
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.jic
    public final View b() {
        return this.b;
    }

    @Override // defpackage.jic
    public final agke c() {
        return agke.n(this.a.a);
    }

    @Override // defpackage.jic
    public final void d(int i, jhq jhqVar) {
        jia jiaVar = this.a;
        jiaVar.a.add(i, jhqVar);
        jiaVar.jW();
    }

    @Override // defpackage.jic
    public final void e() {
        jia jiaVar = this.a;
        jiaVar.a.clear();
        jiaVar.jW();
        this.b.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void f(jhq jhqVar) {
        jia jiaVar = this.a;
        List list = jiaVar.a;
        if (list.indexOf(jhqVar) != -1) {
            list.remove(jhqVar);
            jiaVar.jW();
        }
        this.b.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void g(boolean z) {
        this.b.h(z);
    }

    @Override // defpackage.jic
    public final void h(TabLayout tabLayout) {
        afdq afdqVar = this.c;
        if (afdqVar != null && afdqVar.d) {
            nh nhVar = afdqVar.c;
            if (nhVar != null) {
                nhVar.y(afdqVar.g);
                afdqVar.g = null;
            }
            afdqVar.a.k(afdqVar.f);
            afdqVar.b.m(afdqVar.e);
            afdqVar.f = null;
            afdqVar.e = null;
            afdqVar.c = null;
            afdqVar.d = false;
        }
        afdq afdqVar2 = new afdq(tabLayout, this.b, new hxh(this, null));
        this.c = afdqVar2;
        if (afdqVar2.d) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = afdqVar2.b;
        afdqVar2.c = viewPager2.c();
        if (afdqVar2.c == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        afdqVar2.d = true;
        TabLayout tabLayout2 = afdqVar2.a;
        afdqVar2.e = new afdo(tabLayout2);
        viewPager2.l(afdqVar2.e);
        afdqVar2.f = new afdp(viewPager2, 0);
        tabLayout2.e(afdqVar2.f);
        afdqVar2.g = new afdn(afdqVar2);
        afdqVar2.c.x(afdqVar2.g);
        afdqVar2.a();
        tabLayout2.n(viewPager2.a, 0.0f, true, true, true);
    }

    @Override // defpackage.jic
    public final void i(List list) {
        jia jiaVar = this.a;
        List list2 = jiaVar.a;
        list2.clear();
        list2.addAll(list);
        jiaVar.jW();
        this.b.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void j() {
        qa qaVar = this.d;
        if (qaVar != null) {
            this.a.y(qaVar);
            this.d = null;
        }
    }

    @Override // defpackage.jic
    public final void k(int i) {
        this.b.e(i, false);
    }

    @Override // defpackage.jic
    public final void l(hxh hxhVar) {
        jhz jhzVar = new jhz(hxhVar);
        this.d = jhzVar;
        this.a.x(jhzVar);
    }
}
