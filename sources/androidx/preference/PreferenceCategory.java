package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aun.c(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean X() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void a(dlj dljVar) {
        super.a(dljVar);
        if (Build.VERSION.SDK_INT >= 28) {
            dljVar.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.X();
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
