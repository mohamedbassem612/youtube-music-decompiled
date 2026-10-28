package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abug extends ept {
    public static final abnt a;
    public static final abue b;
    public static final aasc l;
    public final abul c;
    public final abun d;
    public final abul e;
    public final abun f;
    public final boolean g;
    public final abnt h;
    public final abue i;
    public final boolean j;
    public final boolean k;
    public final aasc m;

    static {
        ahsk ahskVarA = abnt.a();
        aclr aclrVarB = abns.b();
        aclrVarB.b = 8;
        ahskVarA.f(aclrVarB.c());
        a = ahskVarA.c();
        l = new aasc();
        b = new abud();
    }

    public abug(abul abulVar, abun abunVar, abul abulVar2, abun abunVar2, boolean z, abnt abntVar, aasc aascVar, abue abueVar, boolean z2) {
        abunVar.getClass();
        abntVar.getClass();
        aascVar.getClass();
        abueVar.getClass();
        abunVar2.getClass();
        this.c = abulVar;
        this.d = abunVar;
        this.e = abulVar2;
        this.f = abunVar2;
        this.g = z;
        this.h = abntVar;
        this.m = aascVar;
        this.i = abueVar;
        this.j = false;
        this.k = z2;
    }

    public static abuf t(abug abugVar) {
        abuf abufVar = new abuf();
        abufVar.c(abugVar.c);
        abufVar.a = abugVar.d;
        abufVar.e(abugVar.e);
        abufVar.f(abugVar.g);
        abufVar.g(abugVar.h);
        abufVar.i(abugVar.m);
        abufVar.b(abugVar.i);
        abufVar.b = abugVar.f;
        abufVar.h();
        abufVar.d(abugVar.k);
        return abufVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abug)) {
            return false;
        }
        abug abugVar = (abug) obj;
        if (this.g != abugVar.g) {
            return false;
        }
        boolean z = abugVar.j;
        return this.k == abugVar.k && Objects.equals(this.c, abugVar.c) && Objects.equals(this.d, abugVar.d) && Objects.equals(this.e, abugVar.e) && Objects.equals(this.f, abugVar.f) && Objects.equals(this.h, abugVar.h) && Objects.equals(this.m, abugVar.m) && Objects.equals(this.i, abugVar.i);
    }

    public final int hashCode() {
        int iAj = a.aj(this.g);
        abul abulVar = this.c;
        return (((((((((((((((((iAj * 31) + a.aj(false)) * 31) + a.aj(this.k)) * 31) + Objects.hashCode(abulVar)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.m)) * 31) + Objects.hashCode(this.i);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, this.m, this.i, Boolean.FALSE, Boolean.valueOf(this.k)};
        String[] strArrSplit = "currentIndex;currentSequenceItem;indexOfItemToPrefetch;originalSequenceItemToPrefetch;isNext;prefetchPrebufferParameters;prefetchCallbacks;beforeQueuedVideoTransitionCallback;isImmediatePrefetch;fetchMedia".split(";");
        StringBuilder sb = new StringBuilder("abug[");
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
