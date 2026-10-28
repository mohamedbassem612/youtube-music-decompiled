package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wgo extends ept implements Comparable {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public wgo(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wgo wgoVar = (wgo) obj;
        if (wgoVar == null) {
            return 1;
        }
        return this.b.compareTo(wgoVar.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wgo)) {
            return false;
        }
        wgo wgoVar = (wgo) obj;
        return this.c == wgoVar.c && this.d == wgoVar.d && Objects.equals(this.a, wgoVar.a) && Objects.equals(this.b, wgoVar.b);
    }

    public final int hashCode() {
        return (((((a.aj(this.c) * 31) + a.aj(this.d)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d)};
        String[] strArrSplit = "id;displayName;isAutoDubbed;isDefault".split(";");
        StringBuilder sb = new StringBuilder("wgo[");
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
