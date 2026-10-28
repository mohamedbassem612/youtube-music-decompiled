package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afap extends afar {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ afar c;
    final /* synthetic */ afaq d;

    public afap(afaq afaqVar, Context context, TextPaint textPaint, afar afarVar) {
        this.a = context;
        this.b = textPaint;
        this.c = afarVar;
        this.d = afaqVar;
    }

    @Override // defpackage.afar
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.afar
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
