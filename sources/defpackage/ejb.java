package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejb extends eje {
    public ejb(List list) {
        super(list);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        return Float.valueOf(l(ennVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(enn ennVar, float f) {
        float f2;
        Object obj = ennVar.b;
        if (obj == null || ennVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        enp enpVar = this.d;
        if (enpVar != null) {
            f2 = f;
            Float f3 = (Float) enpVar.b(ennVar.g, ennVar.h.floatValue(), (Float) obj, (Float) ennVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = ennVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            ennVar.i = fFloatValue;
        }
        float fFloatValue2 = ennVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) ennVar.c).floatValue();
            ennVar.j = fFloatValue2;
        }
        int i = enh.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
