package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cis {
    public final Uri a;
    public final String b;

    public cis(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cis) {
            cis cisVar = (cis) obj;
            if (Objects.equals(this.a, cisVar.a) && Objects.equals(this.b, cisVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public cis(Uri uri) {
        this(uri, uri.toString());
    }
}
