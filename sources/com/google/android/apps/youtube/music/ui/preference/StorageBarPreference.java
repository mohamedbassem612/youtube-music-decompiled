package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.StatFs;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import defpackage.aadc;
import defpackage.aamc;
import defpackage.aanb;
import defpackage.abxv;
import defpackage.anyx;
import defpackage.avmb;
import defpackage.avmn;
import defpackage.avnr;
import defpackage.awmd;
import defpackage.dlj;
import defpackage.hpy;
import defpackage.iwb;
import defpackage.jaa;
import defpackage.jac;
import defpackage.tqa;
import defpackage.tym;
import defpackage.typ;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class StorageBarPreference extends Preference {
    public long a;
    private final awmd b;
    private final avmb c;
    private final boolean d;
    private avmn e;
    private final tqa f;
    private final abxv g;

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jac jacVar = (jac) tym.O(context, jac.class);
        this.g = jacVar.bP();
        this.f = jacVar.bz();
        jacVar.bL();
        this.b = jacVar.bt();
        this.c = jacVar.aJ();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jaa.c);
            this.d = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.d = false;
        }
        this.C = R.layout.pref_offline_storage;
        if (this.w) {
            this.w = false;
            d();
        }
    }

    @Override // androidx.preference.Preference
    public final void E() {
        F();
        super.T();
    }

    @Override // androidx.preference.Preference
    protected final void F() {
        Object obj = this.e;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.e = null;
        }
        super.T();
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        long jE;
        super.a(dljVar);
        Object obj = this.e;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.e = ((hpy) this.b.io()).f(anyx.class).O(this.c).af(new iwb(this, 4));
        this.a = k();
        if (this.d) {
            tqa tqaVar = this.f;
            if (tqaVar.f()) {
                StatFs statFs = new StatFs(tqaVar.b().getAbsolutePath());
                jE = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } else {
                jE = 0;
            }
        } else {
            jE = tym.E();
        }
        ProgressBar progressBar = (ProgressBar) dljVar.C(R.id.storage_bar);
        if (progressBar != null) {
            int i = 1000;
            progressBar.setMax(1000);
            if (jE != 0) {
                float f = this.a;
                i = (int) ((1000.0f * f) / (f + jE));
            }
            progressBar.setProgress(i);
        }
        TextView textView = (TextView) dljVar.C(R.id.storage_used);
        if (textView != null) {
            Context context = this.j;
            textView.setText(context.getResources().getString(R.string.pref_offline_storage_used, typ.h(context.getResources(), this.a / 1048576)));
        }
        TextView textView2 = (TextView) dljVar.C(R.id.storage_free);
        if (textView2 != null) {
            Context context2 = this.j;
            textView2.setText(context2.getResources().getString(R.string.pref_offline_storage_free, typ.h(context2.getResources(), jE / 1048576)));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    public final long k() {
        aamc aamcVarD;
        aamc aamcVarE;
        boolean z = this.d;
        abxv abxvVar = this.g;
        if (z) {
            aadc aadcVarC = ((aanb) abxvVar.c.io()).b().c();
            if (aadcVarC != null && (aamcVarE = aadcVarC.e()) != null) {
                return aamcVarE.a();
            }
        } else {
            aadc aadcVarC2 = ((aanb) abxvVar.c.io()).b().c();
            if (aadcVarC2 != null && (aamcVarD = aadcVarC2.d()) != null) {
                return aamcVarD.a();
            }
        }
        return 0L;
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageBarPreference(Context context) {
        this(context, null);
    }
}
