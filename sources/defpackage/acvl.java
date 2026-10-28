package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvl extends ept implements acvm {
    private final boolean a;
    private final ajwo b;
    private final acra c;

    public acvl(boolean z, ajwo ajwoVar, acra acraVar) {
        this.a = z;
        this.b = ajwoVar;
        this.c = acraVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acvl)) {
            return false;
        }
        acvl acvlVar = (acvl) obj;
        return this.a == acvlVar.a && Objects.equals(this.b, acvlVar.b) && Objects.equals(this.c, acvlVar.c);
    }

    public final int hashCode() {
        return (((a.aj(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), this.b, this.c};
        String[] strArrSplit = "isInitialPage;command;reelPageData".split(";");
        StringBuilder sb = new StringBuilder("acvl[");
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
