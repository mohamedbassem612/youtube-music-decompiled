package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dkf;
import defpackage.dkg;
import defpackage.dkq;
import defpackage.dlk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ListPreference extends DialogPreference {
    private String H;
    private boolean I;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.e, i, i2);
        this.g = aun.k(typedArrayObtainStyledAttributes, 2, 0);
        this.h = aun.k(typedArrayObtainStyledAttributes, 3, 1);
        if (aun.i(typedArrayObtainStyledAttributes, 4, 4, false)) {
            if (dkg.a == null) {
                dkg.a = new dkg(0);
            }
            O(dkg.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dlk.g, i, i2);
        this.H = aun.h(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void e(CharSequence[] charSequenceArr) {
        this.g = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dkf.class)) {
            super.g(parcelable);
            return;
        }
        dkf dkfVar = (dkf) parcelable;
        super.g(dkfVar.getSuperState());
        o(dkfVar.a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        Parcelable parcelableGD = super.gD();
        if (this.x) {
            return parcelableGD;
        }
        dkf dkfVar = new dkf(parcelableGD);
        dkfVar.a = this.i;
        return dkfVar;
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        o(u((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.h) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.h[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        dkq dkqVar = this.F;
        if (dkqVar != null) {
            return dkqVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.H;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceM)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.H = null;
        } else {
            this.H = charSequence.toString();
        }
    }

    public void o(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.I) {
            return;
        }
        this.i = str;
        this.I = true;
        ac(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public final void p() {
        e(this.j.getResources().getTextArray(R.array.bitrate_entries));
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aun.c(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
