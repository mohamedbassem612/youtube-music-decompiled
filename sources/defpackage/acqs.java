package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqs extends ept {
    public final acra a;
    public final acrp b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public acqs(acra acraVar, acrp acrpVar, boolean z, boolean z2, boolean z3) {
        this.a = acraVar;
        this.b = acrpVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acqs)) {
            return false;
        }
        acqs acqsVar = (acqs) obj;
        return this.c == acqsVar.c && this.d == acqsVar.d && this.e == acqsVar.e && Objects.equals(this.a, acqsVar.a) && Objects.equals(this.b, acqsVar.b);
    }

    public final int hashCode() {
        int iAj = a.aj(this.c);
        acra acraVar = this.a;
        return (((((((iAj * 31) + a.aj(this.d)) * 31) + a.aj(this.e)) * 31) + Objects.hashCode(acraVar)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)};
        String[] strArrSplit = "reelPageData;reelViewHolder;shouldSetResponse;shouldEmit;shouldPrerender".split(";");
        StringBuilder sb = new StringBuilder("acqs[");
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
