package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elb implements ekn {
    public final String a;
    public final eka b;
    public final List c;
    public final ejz d;
    public final ekc e;
    public final eka f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public elb(String str, eka ekaVar, List list, ejz ejzVar, ekc ekcVar, eka ekaVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = ekaVar;
        this.c = list;
        this.d = ejzVar;
        this.e = ekcVar;
        this.f = ekaVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eiq(ehmVar, eleVar, this);
    }
}
