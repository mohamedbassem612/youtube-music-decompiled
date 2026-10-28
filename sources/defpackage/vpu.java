package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vpu extends od {
    public boolean a;
    private final int n;
    private final int o;

    public vpu(Context context, int i, int i2) {
        super(context);
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.od
    protected final int b(int i) {
        return this.o;
    }

    @Override // defpackage.od
    public final int i(View view, int i) {
        return super.i(view, i) - this.n;
    }

    @Override // defpackage.od
    protected final int j(int i) {
        return this.o >> 1;
    }

    @Override // defpackage.od
    public final int l() {
        return this.a ? 1 : -1;
    }

    public final void m() {
        super.g();
    }
}
