package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.car.app.model.Alert;
import defpackage.a;
import defpackage.aha;
import defpackage.aun;
import defpackage.cqc;
import defpackage.dkz;
import defpackage.dlg;
import defpackage.dlk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceGroup extends Preference {
    public final aha a;
    public final List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new aha(0);
        this.d = new Handler(Looper.getMainLooper());
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = new cqc(this, 19, null);
        this.b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.i, i, i2);
        this.e = aun.i(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ad(aun.l(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final boolean ai(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.F();
            if (preference.E == this) {
                preference.w(null);
            }
            zRemove = this.b.remove(preference);
            if (zRemove) {
                String str = preference.t;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.gE()));
                    Handler handler = this.d;
                    Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.g) {
                    preference.E();
                }
            }
        }
        return zRemove;
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.I();
        this.g = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).B();
        }
    }

    @Override // androidx.preference.Preference
    public final void E() {
        super.T();
        this.g = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).E();
        }
    }

    public final void ad(int i) {
        if (i != Integer.MAX_VALUE && !W()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean ae() {
        return true;
    }

    public final boolean af(Preference preference) {
        boolean zAi = ai(preference);
        A();
        return zAi;
    }

    public final boolean ag(CharSequence charSequence) {
        Preference preferenceL = l(charSequence);
        if (preferenceL == null) {
            return false;
        }
        return preferenceL.E.af(preferenceL);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public final void ah(Preference preference) {
        long jA;
        List list = this.b;
        if (list.contains(preference)) {
            return;
        }
        if (preference.t != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.E;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.t;
            if (preferenceGroup.l(str) != null) {
                Log.e("PreferenceGroup", a.bT(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.p == Integer.MAX_VALUE) {
            if (this.e) {
                int i = this.f;
                this.f = i + 1;
                preference.N(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).e = this.e;
            }
        }
        int iBinarySearch = Collections.binarySearch(list, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        preference.Z(j());
        synchronized (this) {
            this.b.add(iBinarySearch, preference);
        }
        dlg dlgVar = this.k;
        String str2 = preference.t;
        if (str2 != null) {
            aha ahaVar = this.a;
            if (ahaVar.containsKey(str2)) {
                jA = ((Long) ahaVar.get(str2)).longValue();
                ahaVar.remove(str2);
            } else {
                jA = dlgVar.a();
            }
        } else {
            jA = dlgVar.a();
        }
        preference.l = jA;
        preference.m = true;
        try {
            preference.C(dlgVar);
            preference.m = false;
            preference.w(this);
            if (this.g) {
                preference.B();
            }
            A();
        } catch (Throwable th) {
            preference.m = false;
            throw th;
        }
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dkz.class)) {
            super.g(parcelable);
            return;
        }
        dkz dkzVar = (dkz) parcelable;
        this.c = dkzVar.a;
        super.g(dkzVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable gD() {
        return new dkz(super.gD(), this.c);
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.t, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = o(i);
            if (TextUtils.equals(preferenceO.t, charSequence) || ((preferenceO instanceof PreferenceGroup) && (preferenceO = ((PreferenceGroup) preferenceO).l(charSequence)) != null)) {
                return preferenceO;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    public final void p() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ai((Preference) list.get(0));
                }
            }
        }
        A();
    }

    @Override // androidx.preference.Preference
    public final void x(Bundle bundle) {
        super.x(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).x(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(boolean z) {
        super.z(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).Z(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
