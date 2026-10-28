package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjl implements eyv {
    private final adic a;
    private final awmd b;
    private final awmd c;
    private final Map d;
    private final adjf e;

    public adjl(adic adicVar, awmd awmdVar, awmd awmdVar2, Map map, adjf adjfVar) {
        this.a = adicVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = map;
        this.e = adjfVar;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        eyl eylVar = (eyl) obj;
        return new hed(eylVar, this.e.a(this.a, this.b, this.c, this.d, eylVar));
    }
}
