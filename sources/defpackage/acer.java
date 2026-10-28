package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acer extends ept {
    public final acdq a;
    public final acep b;
    public final ez c;

    public acer(acdq acdqVar, acep acepVar, ez ezVar) {
        this.a = acdqVar;
        this.b = acepVar;
        this.c = ezVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acer)) {
            return false;
        }
        acer acerVar = (acer) obj;
        return Objects.equals(this.a, acerVar.a) && Objects.equals(this.b, acerVar.b) && Objects.equals(this.c, acerVar.c);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "playerControlsModel;mediaSessionAdapterCallback;mediaSessionCallback".split(";");
        StringBuilder sb = new StringBuilder("acer[");
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
