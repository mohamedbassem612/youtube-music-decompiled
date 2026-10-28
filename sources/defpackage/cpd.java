package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cpd implements cph {
    public final con[] a;
    private final int[] b;

    public cpd(int[] iArr, con[] conVarArr) {
        this.b = iArr;
        this.a = conVarArr;
    }

    @Override // defpackage.cph
    public final cwj a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i3 >= iArr.length) {
                bvx.c("BaseMediaChunkOutput", a.bR(i2, "Unmatched track of type: "));
                return new cvf();
            }
            if (i2 == iArr[i3]) {
                return this.a[i3];
            }
            i3++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            con[] conVarArr = this.a;
            if (i >= conVarArr.length) {
                return;
            }
            con conVar = conVarArr[i];
            if (conVar.j != j) {
                conVar.j = j;
                conVar.h = true;
            }
            i++;
        }
    }
}
