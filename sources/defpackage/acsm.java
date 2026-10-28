package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsm extends ept implements acsu {
    public final aaxt a;
    public final wjf b;
    private final String c;

    public acsm(aaxt aaxtVar, wjf wjfVar, String str) {
        this.a = aaxtVar;
        this.b = wjfVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acsm)) {
            return false;
        }
        acsm acsmVar = (acsm) obj;
        return Objects.equals(this.a, acsmVar.a) && Objects.equals(this.b, acsmVar.b) && Objects.equals(this.c, acsmVar.c);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "event;playerResponse;cpn".split(";");
        StringBuilder sb = new StringBuilder("acsm[");
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
