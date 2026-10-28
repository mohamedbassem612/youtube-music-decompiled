package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afam extends afar {
    private final Typeface a;
    private final afal b;
    private boolean c;

    public afam(afal afalVar, Typeface typeface) {
        this.a = typeface;
        this.b = afalVar;
    }

    private final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.afar
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.afar
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
