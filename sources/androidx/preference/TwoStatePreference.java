package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.dlj;
import defpackage.dln;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    protected final void ad(dlj dljVar) {
        p(dljVar.C(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        boolean z = !this.a;
        if (U(Boolean.valueOf(z))) {
            k(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dln.class)) {
            super.g(parcelable);
            return;
        }
        dln dlnVar = (dln) parcelable;
        super.g(dlnVar.getSuperState());
        k(dlnVar.a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        Parcelable parcelableGD = super.gD();
        if (this.x) {
            return parcelableGD;
        }
        dln dlnVar = new dln(parcelableGD);
        dlnVar.a = this.a;
        return dlnVar;
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        k(V(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        boolean z = this.b;
        boolean z2 = this.a;
        if (!z ? z2 : !z2) {
            if (!super.j()) {
                return false;
            }
        }
        return true;
    }

    public void k(boolean z) {
        boolean z2 = this.a != z;
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            aa(z);
            if (z2) {
                z(j());
                d();
            }
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    protected final void p(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence charSequenceM = m();
                if (TextUtils.isEmpty(charSequenceM)) {
                    i = 8;
                } else {
                    textView.setText(charSequenceM);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
