package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blo {
    private int a = 1;
    private int b;
    private int c;
    private final boolean d;
    private final int[] e;
    private final zg f;
    private zg g;
    private zg h;

    public blo(zg zgVar, boolean z, int[] iArr) {
        this.f = zgVar;
        this.g = zgVar;
        this.d = z;
        this.e = iArr;
    }

    private static boolean e(int i) {
        return i == 65039;
    }

    private final boolean f() {
        int[] iArr;
        dqp dqpVarE = ((blm) this.g.b).e();
        int iA = dqpVarE.a(6);
        if (iA != 0) {
            if (((ByteBuffer) dqpVarE.c).get(iA + dqpVarE.a) != 0) {
                return true;
            }
        }
        if (e(this.b)) {
            return true;
        }
        return this.d && ((iArr = this.e) == null || Arrays.binarySearch(iArr, ((blm) this.g.b).a(0)) < 0);
    }

    private final void g() {
        this.a = 1;
        this.g = this.f;
        this.c = 0;
    }

    public final int a(int i) {
        zg zgVarE = this.g.e(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a == 2) {
            if (zgVarE != null) {
                this.g = zgVarE;
                this.c++;
            } else if (i == 65038) {
                g();
            } else if (!e(i)) {
                zg zgVar = this.g;
                if (zgVar.b != null) {
                    i3 = 3;
                    if (this.c != 1) {
                        this.h = zgVar;
                        g();
                    } else if (f()) {
                        this.h = this.g;
                        g();
                    } else {
                        g();
                    }
                } else {
                    g();
                }
            }
            i2 = i3;
        } else if (zgVarE == null) {
            g();
        } else {
            this.a = 2;
            this.g = zgVarE;
            this.c = 1;
            i2 = i3;
        }
        this.b = i;
        return i2;
    }

    public final blm b() {
        return (blm) this.g.b;
    }

    final blm c() {
        return (blm) this.h.b;
    }

    public final boolean d() {
        if (this.a != 2 || this.g.b == null) {
            return false;
        }
        return this.c > 1 || f();
    }
}
