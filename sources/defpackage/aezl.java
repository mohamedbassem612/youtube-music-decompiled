package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezl extends Property {
    public aezl(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = aezn.a;
        return Float.valueOf(((aezn) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        aezn aeznVar = (aezn) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        aeznVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        List list = aeznVar.k;
        aezv aezvVar = (aezv) list.get(0);
        float f2 = aeznVar.f * 1080.0f;
        int[] iArr = aezn.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += aeznVar.c.getInterpolation(aezn.h(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        aezvVar.g = f2 + interpolation;
        TimeInterpolator timeInterpolator = aeznVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(aezn.h(i, 0, 3000)) - timeInterpolator.getInterpolation(aezn.h(i, 3000, 3000));
        aezvVar.a = 0.0f;
        float[] fArr = aezn.b;
        float f3 = ((1.0f - interpolation2) * fArr[0]) + (interpolation2 * fArr[1]);
        aezvVar.b = f3;
        float f4 = aeznVar.g;
        if (f4 > 0.0f) {
            aezvVar.b = f3 * (1.0f - f4);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float fH = aezn.h(i, iArr[i3], 100);
            if (fH >= 0.0f && fH <= 1.0f) {
                int i4 = i3 + aeznVar.e;
                int[] iArr2 = aeznVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((aezv) list.get(0)).c = aeua.a(timeInterpolator.getInterpolation(fH), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        aeznVar.j.invalidateSelf();
    }
}
