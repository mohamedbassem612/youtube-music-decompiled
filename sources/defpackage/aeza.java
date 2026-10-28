package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeza extends dta {
    final /* synthetic */ aezb b;

    public aeza(aezb aezbVar) {
        this.b = aezbVar;
    }

    @Override // defpackage.dta
    public final void b(Drawable drawable) {
        aezb aezbVar = this.b;
        if (aezbVar.e) {
            return;
        }
        aezbVar.setVisibility(aezbVar.f);
    }
}
