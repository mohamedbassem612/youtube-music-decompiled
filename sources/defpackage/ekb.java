package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ekb extends ekl {
    public ekb(List list) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        for (int i = 0; i < list.size(); i++) {
            enn ennVar = (enn) list.get(i);
            eko ekoVar = (eko) ennVar.b;
            eko ekoVar2 = (eko) ennVar.c;
            if (ekoVar != null && ekoVar2 != null && (length = (fArr = ekoVar.a).length) != (length2 = (fArr2 = ekoVar2.a).length)) {
                int i2 = length + length2;
                float[] fArr3 = new float[i2];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    float f2 = fArr3[i4];
                    if (f2 != f) {
                        fArr3[i3] = f2;
                        i3++;
                        f = fArr3[i4];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                ennVar = new enn(ekoVar.a(fArrCopyOfRange), ekoVar2.a(fArrCopyOfRange));
            }
            list.set(i, ennVar);
        }
        super(list);
    }

    @Override // defpackage.ekk
    public final eix a() {
        return new ejc(this.a);
    }
}
