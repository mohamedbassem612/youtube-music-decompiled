package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icp extends ept {
    public final agke a;
    private final ajwo b;

    public icp(agke agkeVar, ajwo ajwoVar) {
        this.a = agkeVar;
        this.b = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof icp)) {
            return false;
        }
        icp icpVar = (icp) obj;
        return Objects.equals(this.a, icpVar.a) && Objects.equals(this.b, icpVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "watchNextTrackingParams;currentWatchPageCommand".split(";");
        StringBuilder sb = new StringBuilder("icp[");
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
