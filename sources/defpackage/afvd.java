package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afvd {
    public final int[] a;
    public final afvc b;
    public afvc c;
    public int d;
    public int e;
    public int f;

    public afvd(int[] iArr) {
        this.a = iArr;
        afvc afvcVar = new afvc(-1, -1);
        this.b = afvcVar;
        this.c = afvcVar;
    }

    private final void d(afvc afvcVar, StringBuilder sb) {
        for (afvc afvcVar2 : afvcVar.d.values()) {
            sb.append("  ");
            sb.append(afvcVar);
            sb.append(" -> ");
            sb.append(afvcVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, afvcVar2.a, Math.min(iArr.length, afvcVar2.b + 1))));
            sb.append("\"]\n");
            d(afvcVar2, sb);
        }
    }

    final void a() {
        afvc afvcVar = this.c.c;
        if (afvcVar != null) {
            this.c = afvcVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        afvc afvcVar = (afvc) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (afvcVar.b - afvcVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = afvcVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                afvcVar = (afvc) afvcVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append('}');
        return sb.toString();
    }
}
