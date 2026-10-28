package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.dlj;
import defpackage.dlk;
import defpackage.dll;
import defpackage.grw;
import defpackage.suh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends Preference {
    private final boolean H;
    private final SeekBar.OnSeekBarChangeListener I;
    private final View.OnKeyListener J;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.I = new suh(this, 1);
        this.J = new grw(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(7, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(8, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.H = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(13, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        super.a(dljVar);
        dljVar.a.setOnKeyListener(this.J);
        this.d = (SeekBar) dljVar.C(R.id.seekbar);
        TextView textView = (TextView) dljVar.C(R.id.seekbar_value);
        this.i = textView;
        if (this.H) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.I);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        SeekBar seekBar2 = this.d;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.h = seekBar2.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        o(this.a);
        this.d.setEnabled(X());
    }

    @Override // androidx.preference.Preference
    protected Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dll.class)) {
            super.g(parcelable);
            return;
        }
        dll dllVar = (dll) parcelable;
        super.g(dllVar.getSuperState());
        this.a = dllVar.a;
        this.b = dllVar.b;
        this.g = dllVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        Parcelable parcelableGD = super.gD();
        if (this.x) {
            return parcelableGD;
        }
        dll dllVar = new dll(parcelableGD);
        dllVar.a = this.a;
        dllVar.b = this.b;
        dllVar.c = this.g;
        return dllVar;
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        k(q(((Integer) obj).intValue()), true);
    }

    public final void k(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            o(i);
            ab(i);
            if (z) {
                d();
            }
        }
    }

    public final void l(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (U(Integer.valueOf(progress))) {
                k(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                o(this.a);
            }
        }
    }

    public final void o(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
