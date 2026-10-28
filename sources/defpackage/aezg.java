package defpackage;

import android.util.Property;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezg extends Property {
    public aezg(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = aezi.a;
        return Float.valueOf(((aezi) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        aezi aeziVar = (aezi) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        aeziVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        List list = aeziVar.k;
        aezv aezvVar = (aezv) list.get(0);
        float f2 = aeziVar.g * 1520.0f;
        aezvVar.a = (-20.0f) + f2;
        aezvVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float fH = aezi.h(i, aezi.a[i2], 667);
            float f3 = aezvVar.b;
            bnn bnnVar = aeziVar.d;
            aezvVar.b = f3 + (bnnVar.getInterpolation(fH) * 250.0f);
            aezvVar.a += bnnVar.getInterpolation(aezi.h(i, aezi.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = aezvVar.a;
        float f5 = aezvVar.b;
        float f6 = f4 + ((f5 - f4) * aeziVar.h);
        aezvVar.a = f6;
        aezvVar.a = f6 / 360.0f;
        aezvVar.b = f5 / 360.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            float fH2 = aezi.h(i, aezi.c[i3], 333);
            if (fH2 > 0.0f && fH2 < 1.0f) {
                int i4 = i3 + aeziVar.f;
                int[] iArr = aeziVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((aezv) list.get(0)).c = aeua.a(aeziVar.d.getInterpolation(fH2), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
        }
        aeziVar.j.invalidateSelf();
    }
}
