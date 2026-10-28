package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acof extends ept {
    public final Optional a;
    public final Optional b;
    public final boolean c;

    public acof(Optional optional, Optional optional2, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acof)) {
            return false;
        }
        acof acofVar = (acof) obj;
        return this.c == acofVar.c && Objects.equals(this.a, acofVar.a) && Objects.equals(this.b, acofVar.b);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.valueOf(this.c)};
        String[] strArrSplit = "overlay;contentPresenter;isLandscape".split(";");
        StringBuilder sb = new StringBuilder("acof[");
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
