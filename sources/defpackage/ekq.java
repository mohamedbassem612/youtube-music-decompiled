package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ekq implements ekn {
    public final String a;
    public final ekb b;
    public final ekc c;
    public final eke d;
    public final eke e;
    public final eka f;
    public final float g;
    public final List h;
    public final eka i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public ekq(String str, int i, ekb ekbVar, ekc ekcVar, eke ekeVar, eke ekeVar2, eka ekaVar, int i2, int i3, float f, List list, eka ekaVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = ekbVar;
        this.c = ekcVar;
        this.d = ekeVar;
        this.e = ekeVar2;
        this.f = ekaVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = ekaVar2;
        this.j = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eig(ehmVar, eleVar, this);
    }
}
