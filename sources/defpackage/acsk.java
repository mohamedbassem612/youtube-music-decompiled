package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsk extends ept implements acsu {
    public final ajwo a;
    public final boolean b;
    public final boolean c;

    public acsk(ajwo ajwoVar, boolean z, boolean z2) {
        this.a = ajwoVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acsk)) {
            return false;
        }
        acsk acskVar = (acsk) obj;
        return this.b == acskVar.b && this.c == acskVar.c && Objects.equals(this.a, acskVar.a);
    }

    public final int hashCode() {
        return (((a.aj(this.b) * 31) + a.aj(this.c)) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c)};
        String[] strArrSplit = "command;shouldClearPlayerResponse;shouldClearReelItemWatchResponse".split(";");
        StringBuilder sb = new StringBuilder("acsk[");
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
