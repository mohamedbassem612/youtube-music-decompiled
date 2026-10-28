package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doq {
    public static final Bundle a(Bundle bundle, String str) {
        str.getClass();
        return bundle.getBundle(str);
    }

    public static final Map b(Bundle bundle) {
        awog awogVar = new awog(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            awogVar.put(str, bundle.get(str));
        }
        return awogVar.e();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
