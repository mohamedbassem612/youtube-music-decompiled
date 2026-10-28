package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qtd implements qsz {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.qsz
    public final ahwl a() {
        aihf aihfVarCreateBuilder = ahwj.a.createBuilder();
        for (int i = 0; i < this.b; i++) {
            aihf aihfVarCreateBuilder2 = ahwi.a.createBuilder();
            double d = this.a[i];
            aihfVarCreateBuilder2.copyOnWrite();
            ahwi ahwiVar = (ahwi) aihfVarCreateBuilder2.instance;
            ahwiVar.b |= 1;
            ahwiVar.c = d;
            aihfVarCreateBuilder2.copyOnWrite();
            ahwi ahwiVar2 = (ahwi) aihfVarCreateBuilder2.instance;
            ahwiVar2.b |= 2;
            ahwiVar2.d = 1L;
            aihfVarCreateBuilder.copyOnWrite();
            ahwj ahwjVar = (ahwj) aihfVarCreateBuilder.instance;
            ahwi ahwiVar3 = (ahwi) aihfVarCreateBuilder2.build();
            ahwiVar3.getClass();
            aiie aiieVar = ahwjVar.b;
            if (!aiieVar.c()) {
                ahwjVar.b = aihn.mutableCopy(aiieVar);
            }
            ahwjVar.b.add(ahwiVar3);
        }
        aihf aihfVarCreateBuilder3 = ahwl.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ahwl ahwlVar = (ahwl) aihfVarCreateBuilder3.instance;
        ahwj ahwjVar2 = (ahwj) aihfVarCreateBuilder.build();
        ahwjVar2.getClass();
        ahwlVar.c = ahwjVar2;
        ahwlVar.b = 3;
        return (ahwl) aihfVarCreateBuilder3.build();
    }

    @Override // defpackage.qsz
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArrCopyOf = this.a;
        int length = dArrCopyOf.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Alert.DURATION_SHOW_INDEFINITELY;
                }
            }
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i2);
            this.a = dArrCopyOf;
        }
        dArrCopyOf[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
