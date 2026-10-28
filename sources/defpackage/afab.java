package defpackage;

import android.util.Property;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afab extends Property {
    public afab(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = afac.f;
        return Float.valueOf(((afac) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        afac afacVar = (afac) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        afacVar.e = fFloatValue;
        List list = afacVar.k;
        ((aezv) list.get(0)).a = 0.0f;
        aezv aezvVar = (aezv) list.get(0);
        aezv aezvVar2 = (aezv) list.get(1);
        bnn bnnVar = afacVar.a;
        float fH = afac.h((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = bnnVar.getInterpolation(fH);
        aezvVar2.a = interpolation;
        aezvVar.b = interpolation;
        aezv aezvVar3 = (aezv) list.get(1);
        aezv aezvVar4 = (aezv) list.get(2);
        float interpolation2 = bnnVar.getInterpolation(fH + 0.49925038f);
        aezvVar4.a = interpolation2;
        aezvVar3.b = interpolation2;
        ((aezv) list.get(2)).b = 1.0f;
        if (afacVar.d && ((aezv) list.get(1)).b < 1.0f) {
            ((aezv) list.get(2)).c = ((aezv) list.get(1)).c;
            ((aezv) list.get(1)).c = ((aezv) list.get(0)).c;
            ((aezv) list.get(0)).c = afacVar.b.e[afacVar.c];
            afacVar.d = false;
        }
        afacVar.j.invalidateSelf();
    }
}
