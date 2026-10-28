package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewx implements aexg {
    final /* synthetic */ aexg a;
    final /* synthetic */ aexg b;
    final /* synthetic */ ExtendedFloatingActionButton c;

    public aewx(ExtendedFloatingActionButton extendedFloatingActionButton, aexg aexgVar, aexg aexgVar2) {
        this.a = aexgVar;
        this.b = aexgVar2;
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.aexg
    public final int a() {
        int i = this.c.v;
        if (i == -1) {
            return this.a.a();
        }
        return (i == 0 || i == -2) ? this.b.a() : i;
    }

    @Override // defpackage.aexg
    public final int b() {
        return this.c.q;
    }

    @Override // defpackage.aexg
    public final int c() {
        return this.c.p;
    }

    @Override // defpackage.aexg
    public final int d() {
        int i = this.c.u;
        if (i == -1) {
            return this.a.d();
        }
        return (i == 0 || i == -2) ? this.b.d() : i;
    }

    @Override // defpackage.aexg
    public final ViewGroup.LayoutParams e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.u;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.v;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }
}
