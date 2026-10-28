package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dtk extends dtp {
    protected avx[] m;
    String n;
    int o;
    int p;

    public dtk(dtk dtkVar) {
        super(null);
        this.m = null;
        this.o = 0;
        this.n = dtkVar.n;
        int i = dtkVar.p;
        this.p = 0;
        this.m = avd.c(dtkVar.m);
    }

    public boolean a() {
        return false;
    }

    public avx[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(avx[] avxVarArr) {
        avx[] avxVarArr2 = this.m;
        if (avxVarArr2 != null && avxVarArr != null) {
            if (avxVarArr2.length == avxVarArr.length) {
                for (int i = 0; i < avxVarArr2.length; i++) {
                    avx avxVar = avxVarArr2[i];
                    char c = avxVar.a;
                    avx avxVar2 = avxVarArr[i];
                    if (c == avxVar2.a && avxVar.b.length == avxVar2.b.length) {
                    }
                }
                avx[] avxVarArr3 = this.m;
                for (int i2 = 0; i2 < avxVarArr.length; i2++) {
                    avxVarArr3[i2].a = avxVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = avxVarArr[i2].b;
                        if (i3 < fArr.length) {
                            avxVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = avd.c(avxVarArr);
    }

    public dtk() {
        super(null);
        this.m = null;
        this.o = 0;
    }
}
