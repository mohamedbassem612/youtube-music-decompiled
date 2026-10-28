package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fih extends fgy {
    final Drawable a;
    int b;
    int c;

    public fih(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new fjx();
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        ((fjx) obj).a(this.b, this.c);
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ((fjx) obj).b(this.a, null);
    }

    @Override // defpackage.fgy
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        this.b = fjiVar.g();
        this.c = fjiVar.b();
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        ((fjx) obj).c();
    }

    @Override // defpackage.fgy
    public final String c() {
        return "DrawableComponent";
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar == null || getClass() != fgyVar.getClass()) {
            return false;
        }
        return gzj.aR(this.a, ((fih) fgyVar).a);
    }
}
