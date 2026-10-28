package defpackage;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jhq extends ept {
    public final View a;
    public final View b;
    public final View c;
    public final aftj d;

    public jhq(View view, View view2, View view3, aftj aftjVar) {
        this.a = view;
        this.b = view2;
        this.c = view3;
        this.d = aftjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jhq)) {
            return false;
        }
        jhq jhqVar = (jhq) obj;
        return Objects.equals(this.a, jhqVar.a) && Objects.equals(this.b, jhqVar.b) && Objects.equals(this.c, jhqVar.c) && Objects.equals(this.d, jhqVar.d);
    }

    public final int hashCode() {
        return yno.E(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d};
        String[] strArrSplit = "header;stickyHeader;content;tab".split(";");
        StringBuilder sb = new StringBuilder("jhq[");
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
