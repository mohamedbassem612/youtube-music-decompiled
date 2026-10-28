package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jhy implements jic {
    private final jho a;
    private final jhx b;
    private DataSetObserver c;

    public jhy(Context context) {
        jho jhoVar = new jho(context);
        this.a = jhoVar;
        jhx jhxVar = new jhx();
        this.b = jhxVar;
        jhoVar.k(jhxVar);
    }

    @Override // defpackage.jic
    public final int a() {
        return this.b.g();
    }

    @Override // defpackage.jic
    public final View b() {
        return this.a;
    }

    @Override // defpackage.jic
    public final agke c() {
        return agke.n(this.b.a);
    }

    @Override // defpackage.jic
    public final void d(int i, jhq jhqVar) {
        jhx jhxVar = this.b;
        jhxVar.a.add(i, jhqVar);
        jhxVar.l();
    }

    @Override // defpackage.jic
    public final void e() {
        jhx jhxVar = this.b;
        jhxVar.a.clear();
        jhxVar.l();
        this.a.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void f(jhq jhqVar) {
        jhx jhxVar = this.b;
        List list = jhxVar.a;
        if (list.indexOf(jhqVar) != -1) {
            list.remove(jhqVar);
            jhxVar.l();
        }
        this.a.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void g(boolean z) {
        this.a.i = z;
    }

    @Override // defpackage.jic
    public final void h(TabLayout tabLayout) {
        tabLayout.s(this.a, false);
    }

    @Override // defpackage.jic
    public final void i(List list) {
        jhx jhxVar = this.b;
        List list2 = jhxVar.a;
        list2.clear();
        list2.addAll(list);
        jhxVar.l();
        this.a.clearDisappearingChildren();
    }

    @Override // defpackage.jic
    public final void j() {
        DataSetObserver dataSetObserver = this.c;
        if (dataSetObserver != null) {
            dts dtsVar = this.a.b;
            if (dtsVar != null) {
                dtsVar.o(dataSetObserver);
            }
            this.c = null;
        }
    }

    @Override // defpackage.jic
    public final void k(int i) {
        this.a.m(i, false);
    }

    @Override // defpackage.jic
    public final void l(hxh hxhVar) {
        this.c = new jhw(hxhVar);
        dts dtsVar = this.a.b;
        if (dtsVar != null) {
            dtsVar.m(this.c);
        }
    }
}
