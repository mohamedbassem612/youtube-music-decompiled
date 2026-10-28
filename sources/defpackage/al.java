package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class al {
    public final ArrayList a = new ArrayList();

    public final void a(am amVar) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= amVar.e) {
                break;
            }
            an anVar = ((an[]) amVar.g.c)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                anVar.e[i2] = 0.0f;
            }
            anVar.e[anVar.c] = 1.0f;
            if (anVar.h == 4) {
                arrayList.add(anVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            an anVar2 = (an) arrayList.get(i3);
            int i4 = anVar2.b;
            if (i4 != -1) {
                aj ajVar = amVar.c[i4].d;
                int i5 = ajVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    an anVarD = ajVar.d(i6);
                    if (anVarD == null) {
                        f3 = f;
                    } else {
                        float fB = ajVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = anVarD.e;
                            fArr[i7] = fArr[i7] + (anVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(anVarD)) {
                            arrayList.add(anVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    anVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            an anVar = (an) arrayList.get(i);
            Objects.toString(anVar);
            String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = anVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}
