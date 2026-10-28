package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dgb extends azs {
    final /* synthetic */ dge a;

    public dgb(dge dgeVar) {
        this.a = dgeVar;
    }

    @Override // defpackage.azs
    public final void s() {
        this.a.q(false);
    }

    @Override // defpackage.azs
    public final void t(dii diiVar) {
        dge dgeVar = this.a;
        SeekBar seekBar = (SeekBar) dgeVar.A.get(diiVar);
        int i = diiVar.p;
        if (seekBar == null || dgeVar.v == diiVar) {
            return;
        }
        seekBar.setProgress(i);
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        this.a.q(true);
    }
}
