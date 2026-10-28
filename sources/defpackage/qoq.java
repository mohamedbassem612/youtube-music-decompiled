package defpackage;

import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qoq implements ayx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ qoq(View view, int i, int i2, int i3, int i4, int i5) {
        this.$cid = i5;
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        bbb bavVar;
        if (this.$cid == 0) {
            avw avwVarF = bbnVar.f(519);
            int i = avwVarF.b;
            int i2 = avwVarF.c;
            int i3 = avwVarF.d;
            int i4 = avwVarF.e;
            int i5 = this.e;
            int i6 = this.d;
            this.a.setPadding(this.b + i, this.c + i2, i6 + i3, i5 + i4);
            return bbnVar;
        }
        avw avwVarF2 = bbnVar.f(519);
        int i7 = avwVarF2.b;
        int i8 = avwVarF2.c;
        int i9 = avwVarF2.d;
        ((Toolbar) this.a).setPadding(this.b + i7, this.c + i8, this.d + i9, this.e);
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw(bbnVar);
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVar) : new bau(bbnVar);
        }
        bavVar.g(519, avw.d(i7, 0, i9, avwVarF2.e));
        return bavVar.a();
    }
}
