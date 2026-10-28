package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eji extends eje {
    private final enq e;

    public eji(List list) {
        super(list);
        this.e = new enq(1.0f, 1.0f);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        Object obj;
        float f2;
        Object obj2 = ennVar.b;
        if (obj2 == null || (obj = ennVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        enq enqVar = (enq) obj2;
        enq enqVar2 = (enq) obj;
        enp enpVar = this.d;
        if (enpVar != null) {
            f2 = f;
            enq enqVar3 = (enq) enpVar.b(ennVar.g, ennVar.h.floatValue(), enqVar, enqVar2, f2, c(), this.c);
            if (enqVar3 != null) {
                return enqVar3;
            }
        } else {
            f2 = f;
        }
        enq enqVar4 = this.e;
        float f3 = enqVar.a;
        float f4 = enqVar2.a;
        int i = enh.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = enqVar.b;
        float f7 = f6 + ((enqVar2.b - f6) * f2);
        enqVar4.a = f5;
        enqVar4.b = f7;
        return enqVar4;
    }
}
