package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejd extends eje {
    public ejd(List list) {
        super(list);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        return Integer.valueOf(k(ennVar, f));
    }

    public final int k(enn ennVar, float f) {
        int iIntValue;
        float f2;
        Object obj = ennVar.b;
        if (obj == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object obj2 = ennVar.c;
        if (obj2 == null) {
            iIntValue = ennVar.d();
        } else {
            int i = ennVar.k;
            if (i == 784923401) {
                iIntValue = ((Integer) obj2).intValue();
                ennVar.k = iIntValue;
            } else {
                iIntValue = i;
            }
        }
        enp enpVar = this.d;
        if (enpVar != null) {
            f2 = f;
            Integer num = (Integer) enpVar.b(ennVar.g, ennVar.h.floatValue(), (Integer) obj, Integer.valueOf(iIntValue), f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iD = ennVar.d();
        int i2 = enh.a;
        return (int) (iD + (f2 * (iIntValue - iD)));
    }
}
