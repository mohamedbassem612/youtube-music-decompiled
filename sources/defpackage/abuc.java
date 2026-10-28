package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuc extends ept {
    public final abul a;
    public final abtz b;
    public final abua c;
    private final abub d;

    static {
        t().f();
    }

    public abuc(abul abulVar, abtz abtzVar, abua abuaVar) {
        abtzVar.getClass();
        this.a = abulVar;
        this.b = abtzVar;
        this.c = abuaVar;
        this.d = null;
    }

    public static zj t() {
        zj zjVar = new zj();
        zjVar.h(0);
        zjVar.a = abtz.NONE;
        return zjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abuc)) {
            return false;
        }
        abuc abucVar = (abuc) obj;
        if (!Objects.equals(this.a, abucVar.a) || !Objects.equals(this.b, abucVar.b) || !Objects.equals(this.c, abucVar.c)) {
            return false;
        }
        abub abubVar = abucVar.d;
        return Objects.equals(null, null);
    }

    public final int hashCode() {
        return (((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(null);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, null};
        String[] strArrSplit = "index;navType;playbackStartDescriptorMutator;playbackStartParametersMutator".split(";");
        StringBuilder sb = new StringBuilder("abuc[");
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
