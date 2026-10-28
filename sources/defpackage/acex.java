package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acex extends ept {
    public final abnl a;
    public final abnp b;
    public final wjf c;

    public acex(abnl abnlVar, abnp abnpVar, wjf wjfVar) {
        this.a = abnlVar;
        this.b = abnpVar;
        this.c = wjfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acex)) {
            return false;
        }
        acex acexVar = (acex) obj;
        return Objects.equals(this.a, acexVar.a) && Objects.equals(this.b, acexVar.b) && Objects.equals(this.c, acexVar.c);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "playbackStartDescriptor;playbackStartParameters;playerResponse".split(";");
        StringBuilder sb = new StringBuilder("acex[");
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
