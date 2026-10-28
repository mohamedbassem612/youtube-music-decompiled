package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lb {
    private final Typeface a;
    private final String b;
    private final int c;

    public lb(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return this.c == lbVar.c && Objects.equals(this.a, lbVar.a) && Objects.equals(this.b, lbVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
