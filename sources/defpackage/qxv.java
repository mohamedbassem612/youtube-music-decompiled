package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qxv {
    float[] a;
    int b;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    float g = -3.4028235E38f;
    float h = -3.4028235E38f;
    float i = -3.4028235E38f;

    public qxv(int i) {
        this.b = 0;
        if (i <= 0) {
            throw new IllegalArgumentException("windowLength must be positive");
        }
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        this.a = new float[i2];
        this.b = this.f + i;
        a();
    }

    final void a() {
        int i = this.b - this.f;
        Arrays.fill(this.a, -3.4028235E38f);
        this.i = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.b = 0;
        this.d = 0;
        this.e = 0;
        this.c = -(i / 2);
        this.f = -i;
    }
}
