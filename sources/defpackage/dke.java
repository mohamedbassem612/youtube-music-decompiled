package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dke extends Preference {
    private long a;

    public dke(Context context, List list, long j) {
        super(context);
        this.C = R.layout.expand_button;
        Drawable drawableD = dl.d(this.j, R.drawable.ic_arrow_down_24dp);
        if (this.s != drawableD) {
            this.s = drawableD;
            this.r = 0;
            d();
        }
        this.r = R.drawable.ic_arrow_down_24dp;
        P(R.string.expand_button_title);
        N(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.E)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        n(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        super.a(dljVar);
        dljVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long gE() {
        return this.a;
    }
}
