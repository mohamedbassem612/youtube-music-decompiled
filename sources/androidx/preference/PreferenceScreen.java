package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aun;
import defpackage.dle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, aun.c(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public final boolean ae() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        dle dleVar;
        if (this.u != null || this.v != null || k() == 0 || (dleVar = this.k.e) == null) {
            return;
        }
        dleVar.onNavigateToScreen(this);
    }
}
