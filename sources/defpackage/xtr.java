package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xtr extends azs implements xtq {
    public final xvq a;
    public final boolean b;
    public boolean c;
    public SeekBar d;

    public xtr(xvq xvqVar) {
        this.a = xvqVar;
        this.b = xvqVar.a.b() == 1;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.azs
    public final void t(dii diiVar) {
        if (this.d == null || !diiVar.equals(this.a.a) || this.c) {
            return;
        }
        this.d.setProgress(diiVar.p);
    }
}
