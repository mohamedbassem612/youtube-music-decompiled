package defpackage;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jhr extends ept {
    public final View a;
    public final adsr b;
    public final aftj c;
    private final View d = null;

    public jhr(aftj aftjVar, View view, adsr adsrVar) {
        this.c = aftjVar;
        this.a = view;
        this.b = adsrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jhr)) {
            return false;
        }
        jhr jhrVar = (jhr) obj;
        if (!Objects.equals(this.c, jhrVar.c)) {
            return false;
        }
        View view = jhrVar.d;
        return Objects.equals(null, null) && Objects.equals(this.a, jhrVar.a) && Objects.equals(this.b, jhrVar.b);
    }

    public final int hashCode() {
        return (((((Objects.hashCode(this.c) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.c, null, this.a, this.b};
        String[] strArrSplit = "tab;stickyHeader;contentView;controller".split(";");
        StringBuilder sb = new StringBuilder("jhr[");
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
