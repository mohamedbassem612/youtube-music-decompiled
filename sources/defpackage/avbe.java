package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbe {
    public static final Logger a = Logger.getLogger(avbe.class.getName());
    public static final avba b = new avfo(1);
    static final agyg c = agyg.d.g();
    public Object[] d;
    public int e;

    public avbe(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    private final int h() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final Object i(int i) {
        return this.d[(i << 1) + 1];
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!l()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void k(int i, byte[] bArr) {
        this.d[i << 1] = bArr;
    }

    private final boolean l() {
        return this.e == 0;
    }

    public final int a() {
        return this.e << 1;
    }

    public final Object b(avbb avbbVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(avbbVar.b, f(i)));
        Object objI = i(i);
        if (objI instanceof byte[]) {
            return avbbVar.a((byte[]) objI);
        }
        throw null;
    }

    public final void c(avbb avbbVar) {
        if (l()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!Arrays.equals(avbbVar.b, f(i2))) {
                int i3 = i << 1;
                k(i, f(i2));
                Object objI = i(i2);
                if (this.d instanceof byte[][]) {
                    j(h());
                }
                this.d[i3 + 1] = objI;
                i++;
            }
        }
        Arrays.fill(this.d, i << 1, a(), (Object) null);
        this.e = i;
    }

    public final void d(avbe avbeVar) {
        if (avbeVar.l()) {
            return;
        }
        int iH = h() - a();
        if (l() || iH < avbeVar.a()) {
            j(a() + avbeVar.a());
        }
        System.arraycopy(avbeVar.d, 0, this.d, a(), avbeVar.a());
        this.e += avbeVar.e;
    }

    public final void e(avbb avbbVar, Object obj) {
        avbbVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == h()) {
            j(Math.max(a() << 1, 8));
        }
        k(this.e, avbbVar.b);
        this.d[(this.e << 1) + 1] = avbbVar.b(obj);
        this.e++;
    }

    public final byte[] f(int i) {
        return (byte[]) this.d[i << 1];
    }

    public final byte[] g(int i) {
        Object objI = i(i);
        if (objI instanceof byte[]) {
            return (byte[]) objI;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(f(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.j(g(i)));
            } else {
                sb.append(new String(g(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public avbe() {
    }
}
