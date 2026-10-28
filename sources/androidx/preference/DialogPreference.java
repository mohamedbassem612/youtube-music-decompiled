package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dld;
import defpackage.dlk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlk.c, i, i2);
        String strH = aun.h(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strH;
        if (strH == null) {
            this.a = this.q;
        }
        this.b = aun.h(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = aun.h(typedArrayObtainStyledAttributes, 11, 3);
        this.e = aun.h(typedArrayObtainStyledAttributes, 10, 4);
        this.f = aun.e(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void c() {
        dld dldVar = this.k.d;
        if (dldVar != null) {
            dldVar.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aun.c(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context) {
        this(context, null);
    }
}
