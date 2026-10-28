package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbt extends gcr {
    public gbt(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "M9yico5AANfu4aZ1TdrlczENIG33WgpklxK+mTW4HOlB0oGDYaRPp2kRAmmSgams", "C9rrIWuRFVmVu9oTQXt/sPIUl+/6M07ySvGK7JmM73Y=", fxgVar, i, 5);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.b |= 16;
        fxlVar.i = -1L;
        fxgVar.copyOnWrite();
        fxl fxlVar3 = (fxl) fxgVar.instance;
        fxlVar3.b |= 32;
        fxlVar3.j = -1L;
        int[] iArr = (int[]) this.e.invoke(null, this.a.a);
        synchronized (fxgVar) {
            long j = iArr[0];
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxlVar4.b |= 16;
            fxlVar4.i = j;
            long j2 = iArr[1];
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            fxlVar5.b |= 32;
            fxlVar5.j = j2;
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                fxgVar.copyOnWrite();
                fxl fxlVar6 = (fxl) fxgVar.instance;
                fxlVar6.c |= 2097152;
                fxlVar6.U = i;
            }
        }
    }
}
