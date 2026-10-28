package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yth {
    public final String a;
    public final int b;
    public final Uri c;

    public yth(String str, int i, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yth) {
            yth ythVar = (yth) obj;
            if (this.a.equals(ythVar.a) && this.b == ythVar.b && Objects.equals(this.c, ythVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return "PrewarmedHostInfo openedHost(" + this.a + "), rttMs(" + this.b + ')';
    }
}
