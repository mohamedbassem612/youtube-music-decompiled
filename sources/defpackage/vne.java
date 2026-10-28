package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vne extends ept {
    public static final vne a = new vne(-1, false, vnf.f);
    public final int b;
    public final boolean c;
    public final vnf d;

    public vne(int i, boolean z, vnf vnfVar) {
        this.b = i;
        this.c = z;
        this.d = vnfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vne)) {
            return false;
        }
        vne vneVar = (vne) obj;
        return this.c == vneVar.c && this.b == vneVar.b && Objects.equals(this.d, vneVar.d);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + this.b) * 31) + Objects.hashCode(this.d);
    }

    public final vne t(vnf vnfVar) {
        return new vne(this.b, this.c, vnfVar);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d};
        String[] strArrSplit = "activeItemIndex;isUserScrolling;syncTriggerOutput".split(";");
        StringBuilder sb = new StringBuilder("vne[");
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
