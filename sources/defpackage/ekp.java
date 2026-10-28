package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ekp implements ekn {
    public final Path.FillType a;
    public final ekb b;
    public final ekc c;
    public final eke d;
    public final eke e;
    public final String f;
    public final boolean g;
    public final int h;

    public ekp(String str, int i, Path.FillType fillType, ekb ekbVar, ekc ekcVar, eke ekeVar, eke ekeVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = ekbVar;
        this.c = ekcVar;
        this.d = ekeVar;
        this.e = ekeVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        return new eif(ehmVar, egyVar, eleVar, this);
    }
}
