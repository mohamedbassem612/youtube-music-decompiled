package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cos extends cpa {
    private final cor[] a;

    /* JADX WARN: Illegal instructions before constructor call */
    public cos(cno cnoVar, List list, cno[] cnoVarArr) {
        int i = ((agpi) list).d;
        int length = cnoVarArr.length;
        ahno.F(i == length);
        cor[] corVarArr = new cor[length];
        for (int i2 = 0; i2 < cnoVarArr.length; i2++) {
            cno cnoVar2 = cnoVarArr[i2];
            long j = ((bsr) list.get(i2)).h;
            corVarArr[i2] = new cor(cnoVar2);
        }
        cno[] cnoVarArr2 = new cno[length + 1];
        cnoVarArr2[0] = cnoVar;
        System.arraycopy(corVarArr, 0, cnoVarArr2, 1, length);
        super(new cny(cnoVarArr2));
        this.a = corVarArr;
    }

    @Override // defpackage.cpa, defpackage.cmi, defpackage.cno
    public final void jJ(bss bssVar) {
        super.jJ(bssVar);
        bsp bspVar = bssVar.c;
        bspVar.getClass();
        int i = 0;
        while (true) {
            cor[] corVarArr = this.a;
            if (i >= corVarArr.length) {
                return;
            }
            agke agkeVar = bspVar.g;
            cor corVar = corVarArr[i];
            int i2 = 0;
            while (true) {
                List list = corVar.a;
                if (i2 < list.size()) {
                    ((cow) list.get(i2)).b = 0L;
                    i2++;
                }
            }
            i++;
        }
    }
}
