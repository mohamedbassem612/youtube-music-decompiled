package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aeya implements afal {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aeyb a;

    public aeya(aeyb aeybVar, int i) {
        this.$cid = i;
        this.a = aeybVar;
    }

    @Override // defpackage.afal
    public final void a(Typeface typeface) {
        int i = this.$cid;
        aeyb aeybVar = this.a;
        if (i != 0) {
            if (aeybVar.F(typeface)) {
                aeybVar.l(false);
            }
        } else if (aeybVar.G(typeface)) {
            aeybVar.l(false);
        }
    }
}
