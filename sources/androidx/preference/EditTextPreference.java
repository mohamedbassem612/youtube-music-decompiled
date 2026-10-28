package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dkc;
import defpackage.dkg;
import defpackage.dlk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iC = aun.c(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iC, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.d, iC, 0);
        if (aun.i(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (dkg.b == null) {
                dkg.b = new dkg(1);
            }
            O(dkg.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dkc.class)) {
            super.g(parcelable);
            return;
        }
        dkc dkcVar = (dkc) parcelable;
        super.g(dkcVar.getSuperState());
        i(dkcVar.a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        Parcelable parcelableGD = super.gD();
        if (this.x) {
            return parcelableGD;
        }
        dkc dkcVar = new dkc(parcelableGD);
        dkcVar.a = this.g;
        return dkcVar;
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        ac(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            z(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
