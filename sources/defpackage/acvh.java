package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvh extends ept implements acvm {
    public final boolean a;
    public final ajwo b;
    public final acra c;

    public acvh(boolean z, ajwo ajwoVar, acra acraVar) {
        this.a = z;
        this.b = ajwoVar;
        this.c = acraVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acvh)) {
            return false;
        }
        acvh acvhVar = (acvh) obj;
        return this.a == acvhVar.a && Objects.equals(this.b, acvhVar.b) && Objects.equals(this.c, acvhVar.c);
    }

    public final int hashCode() {
        return (((a.aj(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), this.b, this.c};
        String[] strArrSplit = "isInitialPage;commandWithUpdatedParent;data".split(";");
        StringBuilder sb = new StringBuilder("acvh[");
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
