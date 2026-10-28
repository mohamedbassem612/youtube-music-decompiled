package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import defpackage.aohx;
import defpackage.bac;
import defpackage.dlj;
import defpackage.hlp;
import defpackage.hnq;
import defpackage.ira;
import defpackage.jaa;
import defpackage.mqd;
import defpackage.typ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {
    private boolean H;
    public SeekBar a;
    public int b;
    public int c;
    public ira d;
    public mqd e;
    private int f;
    private int g;
    private TextView h;
    private boolean i;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p(context, attributeSet, i, 0);
    }

    private final void ad(int i) {
        TextView textView;
        SeekBar seekBar = this.a;
        if (seekBar != null) {
            seekBar.setProgress((i - this.f) / this.g);
            mqd mqdVar = this.e;
            if (mqdVar != null) {
                SeekBar seekBar2 = this.a;
                SeekBarPreference seekBarPreference = (SeekBarPreference) mqdVar.a;
                Integer numValueOf = Integer.valueOf(seekBarPreference.b);
                SeekBar seekBar3 = seekBarPreference.a;
                bac.t(seekBar2, ((ira) mqdVar.b).b.getString(R.string.smart_download_slider_state_description, numValueOf, Integer.valueOf((seekBar3 == null || seekBarPreference.c == 0) ? 0 : (seekBar3.getProgress() * 100) / seekBarPreference.c)));
            }
        }
        ira iraVar = this.d;
        if (iraVar == null || (textView = this.h) == null) {
            return;
        }
        boolean zX = X();
        Context context = iraVar.b;
        hlp hlpVar = iraVar.f;
        Resources resources = context.getResources();
        long jB = hnq.b(aohx.AUDIO_ONLY, hlpVar.c(), i);
        long jB2 = iraVar.m.b() / 1048576;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) resources.getQuantityString(R.plurals.smart_downloads_num_songs_estimated_space, i, Integer.valueOf(i), typ.h(resources, jB)));
        if (jB2 < jB) {
            String string = context.getString(R.string.pref_offline_storage_warning, typ.h(resources, jB2));
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) string);
            if (zX) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(resources.getColor(android.R.color.holo_red_dark)), 0, spannableStringBuilder.length(), 17);
            }
        }
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    private final void p(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jaa.b, i, i2);
        try {
            l(typedArrayObtainStyledAttributes.getInt(7, 0), typedArrayObtainStyledAttributes.getInt(6, 1), typedArrayObtainStyledAttributes.getInt(10, 1));
            this.H = typedArrayObtainStyledAttributes.getBoolean(5, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.preference.Preference
    public final void D(Preference preference, boolean z) {
        super.D(preference, z);
        if (this.H) {
            R(!z);
        }
    }

    @Override // androidx.preference.Preference
    protected final void G(boolean z, Object obj) {
        int iIntValue = 0;
        if (z) {
            iIntValue = q(0);
        } else if (obj != null) {
            iIntValue = ((Integer) obj).intValue();
        }
        o(iIntValue);
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        super.a(dljVar);
        this.a = (SeekBar) dljVar.C(R.id.seekbar);
        this.h = (TextView) dljVar.C(R.id.summary);
        SeekBar seekBar = this.a;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            this.a.setMax(this.c);
        }
        ad(this.b);
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, 0));
    }

    final int k(int i) {
        return (i * this.g) + this.f;
    }

    public final void l(int i, int i2, int i3) {
        this.f = i;
        this.g = i3;
        int i4 = (i2 - i) / i3;
        this.c = i4;
        SeekBar seekBar = this.a;
        if (seekBar != null) {
            seekBar.setMax(i4);
        }
    }

    public final void o(int i) {
        boolean z = i != this.b;
        if (z || !this.i) {
            this.b = i;
            this.i = true;
            ab(i);
            if (z) {
                d();
            }
        }
        ad(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int iK = k(i);
            this.b = iK;
            ad(iK);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int iK = k(seekBar.getProgress());
        if (U(Integer.valueOf(iK))) {
            o(iK);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SeekBarPreference(Context context) {
        this(context, null);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        p(context, attributeSet, i, i2);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }
}
