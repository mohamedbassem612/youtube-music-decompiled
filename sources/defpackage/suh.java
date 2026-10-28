package defpackage;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suh implements SeekBar.OnSeekBarChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public suh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.$cid;
        if (i2 == 0) {
            sui suiVar = (sui) this.a;
            suiVar.k = i;
            suiVar.b();
        } else {
            if (i2 != 1) {
                vkl vklVar = (vkl) this.a;
                vklVar.q.setTextSize(2, i + 12.0f);
                vklVar.o();
                return;
            }
            if (z) {
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
                if (seekBarPreference.f || !seekBarPreference.c) {
                    seekBarPreference.l(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = (SeekBarPreference) this.a;
            seekBarPreference2.o(i + seekBarPreference2.b);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.$cid == 1) {
            ((SeekBarPreference) this.a).c = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.$cid == 1) {
            SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
            seekBarPreference.c = false;
            if (seekBar.getProgress() + seekBarPreference.b != seekBarPreference.a) {
                seekBarPreference.l(seekBar);
            }
        }
    }
}
