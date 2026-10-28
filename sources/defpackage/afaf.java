package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afaf extends Property {
    public afaf(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = afag.a;
        return Float.valueOf(((afag) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        afag afagVar = (afag) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        afagVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = afagVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            aezv aezvVar = (aezv) list.get(i);
            int[] iArr = afag.b;
            int i3 = i << 1;
            int i4 = iArr[i3];
            int[] iArr2 = afag.a;
            float fH = afag.h(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = afagVar.c;
            aezvVar.a = ast.b(interpolatorArr[i3].getInterpolation(fH), 0.0f, 1.0f);
            int i5 = i3 + 1;
            aezvVar.b = ast.b(interpolatorArr[i5].getInterpolation(afag.h(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (afagVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aezv) it.next()).c = afagVar.d.e[afagVar.e];
            }
            afagVar.f = false;
        }
        afagVar.j.invalidateSelf();
    }
}
