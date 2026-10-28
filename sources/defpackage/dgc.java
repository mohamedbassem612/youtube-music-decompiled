package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dgc implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ dge a;
    private final Runnable b = new cqc(this, 11, null);

    public dgc(dge dgeVar) {
        this.a = dgeVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            dii diiVar = (dii) seekBar.getTag();
            int i2 = dge.W;
            diiVar.g(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        dge dgeVar = this.a;
        if (dgeVar.v != null) {
            dgeVar.t.removeCallbacks(this.b);
        }
        dgeVar.v = (dii) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.t.postDelayed(this.b, 500L);
    }
}
