package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxl extends ept {
    public final Typeface a;
    public final String b;
    public final String c;
    public final boolean d;

    public oxl(Typeface typeface, String str, String str2, boolean z) {
        this.a = typeface;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oxl)) {
            return false;
        }
        oxl oxlVar = (oxl) obj;
        return this.d == oxlVar.d && Objects.equals(this.a, oxlVar.a) && Objects.equals(this.b, oxlVar.b) && Objects.equals(this.c, oxlVar.c);
    }

    public final int hashCode() {
        return (((((a.aj(this.d) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, Boolean.valueOf(this.d)};
        String[] strArrSplit = "typeface;paintVariationSettings;family;supportsVariation".split(";");
        StringBuilder sb = new StringBuilder("oxl[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
