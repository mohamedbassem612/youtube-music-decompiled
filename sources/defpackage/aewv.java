package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewv implements aexg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ExtendedFloatingActionButton a;

    public aewv(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.$cid = i;
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.aexg
    public final int a() {
        int i = this.$cid;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.l() : extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.aexg
    public final int b() {
        int i = this.$cid;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.k() : extendedFloatingActionButton.q;
    }

    @Override // defpackage.aexg
    public final int c() {
        int i = this.$cid;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.k() : extendedFloatingActionButton.p;
    }

    @Override // defpackage.aexg
    public final int d() {
        int i = this.$cid;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        if (i != 0) {
            return extendedFloatingActionButton.l();
        }
        return extendedFloatingActionButton.q + ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.p;
    }

    @Override // defpackage.aexg
    public final ViewGroup.LayoutParams e() {
        return this.$cid != 0 ? new ViewGroup.LayoutParams(d(), a()) : new ViewGroup.LayoutParams(-2, -2);
    }
}
