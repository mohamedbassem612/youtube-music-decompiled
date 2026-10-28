package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dkj;
import defpackage.dlk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iC = aun.c(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iC, 0);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.f, iC, 0);
        this.g = aun.k(typedArrayObtainStyledAttributes, 2, 0);
        this.h = aun.k(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dkj.class)) {
            super.g(parcelable);
            return;
        }
        dkj dkjVar = (dkj) parcelable;
        super.g(dkjVar.getSuperState());
        k(dkjVar.a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        Parcelable parcelableGD = super.gD();
        if (this.x) {
            return parcelableGD;
        }
        dkj dkjVar = new dkj(parcelableGD);
        dkjVar.a = this.i;
        return dkjVar;
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(v((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (Y() && !set.equals(v(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.t, set);
            super.S(editorB);
        }
        d();
    }
}
