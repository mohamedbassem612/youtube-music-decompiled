package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afao extends avr {
    final /* synthetic */ afar a;
    final /* synthetic */ afaq b;

    public afao(afaq afaqVar, afar afarVar) {
        this.a = afarVar;
        this.b = afaqVar;
    }

    @Override // defpackage.avr
    public final void a(int i) {
        this.b.m = true;
        this.a.a(i);
    }

    @Override // defpackage.avr
    public final void b(Typeface typeface) {
        afaq afaqVar = this.b;
        afaqVar.n = Typeface.create(typeface, afaqVar.d);
        afaqVar.m = true;
        this.a.b(afaqVar.n, false);
    }
}
