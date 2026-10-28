package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eiy extends eje {
    public eiy(List list) {
        super(list);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        return Integer.valueOf(l(ennVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(enn ennVar, float f) {
        float f2;
        Float f3;
        Object obj = ennVar.b;
        if (obj == null || ennVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        enp enpVar = this.d;
        if (enpVar == null || (f3 = ennVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) enpVar.b(ennVar.g, f3.floatValue(), (Integer) obj, (Integer) ennVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        }
        int i = enh.a;
        return qa.D(Math.max(0.0f, Math.min(1.0f, f2)), ((Integer) obj).intValue(), ((Integer) ennVar.c).intValue());
    }
}
