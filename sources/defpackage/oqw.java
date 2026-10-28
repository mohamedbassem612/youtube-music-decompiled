package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqw implements oqy {
    final /* synthetic */ oqx a;
    private float b;
    private int c;

    public oqw(oqx oqxVar) {
        this.a = oqxVar;
        this.b = oqxVar.f() ? oqxVar.a : oqxVar.b;
        this.c = 0;
    }

    @Override // defpackage.oqy
    public final void a(Size size) {
        int i = this.c + 1;
        this.c = i;
        oqx oqxVar = this.a;
        if (i >= oqxVar.c) {
            this.b -= oqxVar.f() ? size.getWidth() : size.getHeight();
            this.c = 0;
        }
    }

    @Override // defpackage.oqy
    public final boolean b() {
        return this.b > 0.0f;
    }
}
