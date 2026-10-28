package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lhd extends lbw {
    final /* synthetic */ lhe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhd(lhe lheVar, leb lebVar) {
        super(lebVar);
        this.b = lheVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        lhe lheVar = this.b;
        lheVar.o();
        lheVar.c(false, false, SystemClock.elapsedRealtime());
        lheVar.g().e(SystemClock.elapsedRealtime());
    }
}
