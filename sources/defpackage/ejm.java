package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejm extends eje {
    public ejm(List list) {
        super(list);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        Object obj;
        enp enpVar = this.d;
        if (enpVar == null) {
            return (f != 1.0f || (obj = ennVar.c) == null) ? (ejs) ennVar.b : (ejs) obj;
        }
        float f2 = ennVar.g;
        Float f3 = ennVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        ejs ejsVar = (ejs) ennVar.b;
        Object obj2 = ennVar.c;
        return (ejs) enpVar.b(f2, fFloatValue, ejsVar, obj2 == null ? ejsVar : (ejs) obj2, f, b(), this.c);
    }
}
