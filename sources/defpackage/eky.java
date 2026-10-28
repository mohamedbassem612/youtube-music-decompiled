package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eky implements ekn {
    public final Path.FillType a;
    public final String b;
    public final ejz c;
    public final ekc d;
    public final boolean e;
    private final boolean f;

    public eky(String str, boolean z, Path.FillType fillType, ejz ejzVar, ekc ekcVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = ejzVar;
        this.d = ekcVar;
        this.e = z2;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eie(ehmVar, eleVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + '}';
    }
}
