package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejc extends eje {
    private final eko e;

    public ejc(List list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            eko ekoVar = (eko) ((enn) list.get(i)).b;
            if (ekoVar != null) {
                iMax = Math.max(iMax, ekoVar.b.length);
            }
        }
        this.e = new eko(new float[iMax], new int[iMax]);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        int length;
        eko ekoVar = (eko) ennVar.b;
        eko ekoVar2 = (eko) ennVar.c;
        boolean zEquals = ekoVar.equals(ekoVar2);
        eko ekoVar3 = this.e;
        if (zEquals || f <= 0.0f) {
            ekoVar3.b(ekoVar);
        } else if (f >= 1.0f) {
            ekoVar3.b(ekoVar2);
        } else {
            int[] iArr = ekoVar.b;
            int length2 = iArr.length;
            int[] iArr2 = ekoVar2.b;
            int length3 = iArr2.length;
            if (length2 != length3) {
                throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + length2 + " vs " + length3 + ')');
            }
            int i = 0;
            while (true) {
                length = iArr.length;
                if (i >= length) {
                    break;
                }
                float[] fArr = ekoVar3.a;
                float f2 = ekoVar.a[i];
                float f3 = ekoVar2.a[i];
                int i2 = enh.a;
                fArr[i] = f2 + ((f3 - f2) * f);
                ekoVar3.b[i] = qa.D(f, iArr[i], iArr2[i]);
                i++;
            }
            while (true) {
                float[] fArr2 = ekoVar3.a;
                if (length >= fArr2.length) {
                    break;
                }
                int length4 = iArr.length - 1;
                fArr2[length] = fArr2[length4];
                int[] iArr3 = ekoVar3.b;
                iArr3[length] = iArr3[length4];
                length++;
            }
        }
        return ekoVar3;
    }
}
