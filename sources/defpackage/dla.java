package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dla {
    final int a;
    final int b;
    final String c;

    public dla(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.C;
        this.b = preference.D;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dla)) {
            return false;
        }
        dla dlaVar = (dla) obj;
        return this.a == dlaVar.a && this.b == dlaVar.b && TextUtils.equals(this.c, dlaVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
