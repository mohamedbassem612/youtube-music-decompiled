package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jba implements admk {
    private final admk a;

    public jba() {
        this(new admq());
    }

    @Override // defpackage.admh
    public final int a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.admh
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.admh
    public final adma c(int i, ViewGroup viewGroup) {
        return this.a.c(i, viewGroup);
    }

    @Override // defpackage.admh
    public final void d(Class cls, adme admeVar) {
        throw null;
    }

    @Override // defpackage.admh
    public final void e(View view) {
        if (view != null) {
            this.a.e(view);
        }
    }

    @Override // defpackage.admk
    public final tgr f() {
        return ((admq) this.a).c;
    }

    public jba(admk admkVar) {
        this.a = admkVar;
    }
}
