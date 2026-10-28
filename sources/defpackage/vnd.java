package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vnd extends ept {
    public final int a;
    public final vnf b;
    public final vqb c;

    public vnd(int i, vnf vnfVar, vqb vqbVar) {
        this.a = i;
        this.b = vnfVar;
        this.c = vqbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vnd)) {
            return false;
        }
        vnd vndVar = (vnd) obj;
        return this.a == vndVar.a && Objects.equals(this.b, vndVar.b) && Objects.equals(this.c, vndVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final vnd t(vqb vqbVar) {
        return new vnd(this.a, this.b, vqbVar);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c};
        String[] strArrSplit = "activeItemIndex;syncTrigger;positionOutput".split(";");
        StringBuilder sb = new StringBuilder("vnd[");
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

    public final boolean u(vnf vnfVar) {
        return this.b.equals(vnfVar);
    }
}
