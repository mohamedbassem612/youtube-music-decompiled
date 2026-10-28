package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elh {
    public final List a;
    public final egy b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final ekj h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final eki p;
    public final eka q;
    public final List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final dov w;
    public final jnm x;
    public final axfd y;

    public elh(List list, egy egyVar, String str, long j, int i, long j2, String str2, List list2, ekj ekjVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, eki ekiVar, jnm jnmVar, List list3, int i5, eka ekaVar, boolean z, dov dovVar, axfd axfdVar, int i6) {
        this.a = list;
        this.b = egyVar;
        this.c = str;
        this.d = j;
        this.t = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = ekjVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = ekiVar;
        this.x = jnmVar;
        this.r = list3;
        this.u = i5;
        this.q = ekaVar;
        this.s = z;
        this.w = dovVar;
        this.y = axfdVar;
        this.v = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append('\n');
        egy egyVar = this.b;
        elh elhVarC = egyVar.c(this.e);
        if (elhVarC != null) {
            sb.append("\t\tParents: ");
            sb.append(elhVarC.c);
            for (elh elhVarC2 = egyVar.c(elhVarC.e); elhVarC2 != null; elhVarC2 = egyVar.c(elhVarC2.e)) {
                sb.append("->");
                sb.append(elhVarC2.c);
            }
            sb.append(str);
            sb.append('\n');
        }
        List list = this.g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append('\n');
        }
        int i2 = this.i;
        if (i2 != 0 && (i = this.j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.k)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
