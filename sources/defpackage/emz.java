package defpackage;

import app.rive.semantics.SemanticState;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class emz implements Closeable {
    public static final String[] a = new String[SemanticState.Focused];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double a();

    public abstract int b();

    final emy c(String str) throws emy {
        throw new emy(str + " at path " + d());
    }

    public final String d() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract String e();

    public abstract String f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    final void k(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new emx("Nesting too deep at ".concat(d()));
            }
            this.c = Arrays.copyOf(iArr, length << 1);
            String[] strArr = this.d;
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.e;
            this.e = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void l();

    public abstract void m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int p();

    public abstract int q(boy boyVar);
}
