package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class orc implements oqy {
    final /* synthetic */ ord a;
    private float b;

    public orc(ord ordVar) {
        this.a = ordVar;
        this.b = ordVar.f() ? ordVar.a : ordVar.b;
    }

    @Override // defpackage.oqy
    public final void a(Size size) {
        this.b -= this.a.f() ? size.getWidth() : size.getHeight();
    }

    @Override // defpackage.oqy
    public final boolean b() {
        return this.b > 0.0f;
    }
}
