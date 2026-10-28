package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzt {
    public final Bundle a;

    public pzt(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof pzt) && awrc.c(this.a, ((pzt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    public final String toString() {
        return "NotificationExpiredInfo(appProvidedData=" + this.a + ')';
    }
}
