package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zpn extends aevq {
    final /* synthetic */ zpr a;

    public zpn(zpr zprVar) {
        this.a = zprVar;
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        if (i != 4) {
            if (i == 5) {
                zpt zptVar = this.a.n;
                if (zptVar.e() == 3) {
                    zptVar.c();
                    return;
                }
                return;
            }
            return;
        }
        zpr zprVar = this.a;
        zpt zptVar2 = zprVar.n;
        if (zptVar2.e() == 2 || (zprVar.g && zptVar2.e() != 1)) {
            zprVar.h();
        } else {
            zprVar.i();
        }
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
    }
}
