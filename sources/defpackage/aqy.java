package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqy implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    aqt[] j = new aqt[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public aqy(int i) {
        this.n = i;
    }

    public final void a(aqt aqtVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            aqt[] aqtVarArr = this.j;
            if (i >= i2) {
                int length = aqtVarArr.length;
                if (i2 >= length) {
                    aqtVarArr = (aqt[]) Arrays.copyOf(aqtVarArr, length << 1);
                    this.j = aqtVarArr;
                }
                int i3 = this.k;
                aqtVarArr[i3] = aqtVar;
                this.k = i3 + 1;
                return;
            }
            if (aqtVarArr[i] == aqtVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(aqt aqtVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == aqtVar) {
                while (i2 < i - 1) {
                    aqt[] aqtVarArr = this.j;
                    int i3 = i2 + 1;
                    aqtVarArr[i2] = aqtVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((aqy) obj).c;
    }

    public final void d(aqu aquVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(aquVar, this, false);
        }
        this.k = 0;
    }

    public final void e(aqu aquVar, aqt aqtVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(aquVar, aqtVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
