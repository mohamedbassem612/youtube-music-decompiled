package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class be {
    public final ea a;

    public be(ea eaVar) {
        this.a = eaVar;
    }

    public final boolean b() {
        ea eaVar = this.a;
        View view = eaVar.a.mView;
        int i = view != null ? dl.i(view) : 0;
        int i2 = eaVar.h;
        return i == i2 || !(i == 2 || i2 == 2);
    }
}
