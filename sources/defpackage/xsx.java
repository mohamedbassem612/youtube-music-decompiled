package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsx implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ xtr a;
    public final /* synthetic */ xsy b;

    public xsx(xsy xsyVar, xtr xtrVar) {
        this.a = xtrVar;
        this.b = xsyVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            xsy xsyVar = this.b;
            mbc mbcVar = xsyVar.d;
            if (mbcVar.b() - xsyVar.a >= 200) {
                xsyVar.b = i;
                this.a.a.f(i);
                xsyVar.a = mbcVar.b();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        xtr xtrVar = this.a;
        xtrVar.c = true;
        this.b.c.j(xtrVar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        xsy xsyVar = this.b;
        if (xsyVar.b != progress) {
            this.a.a.f(progress);
        }
        xtr xtrVar = this.a;
        xtrVar.c = false;
        xsyVar.e.postDelayed(new xoy(this, xtrVar, 3), 500L);
    }
}
