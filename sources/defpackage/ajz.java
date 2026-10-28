package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajz implements Iterable, awrp {
    public static final ajz a = new ajz(0, 0, null);
    public final long b;
    public final long c;
    public final long[] d;

    public ajz(long j, long j2, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = jArr;
    }

    public final ajz a(long j) {
        long[] jArr;
        int iH;
        long[] jArr2;
        long j2;
        long j3;
        ajz ajzVar;
        long j4;
        long j5;
        if (awrc.a(j, 0L) >= 0 && awrc.a(j, 64L) < 0) {
            long j6 = 1 << ((int) j);
            long j7 = this.c;
            if ((j7 & j6) == 0) {
                return this;
            }
            long j8 = ~j6;
            long j9 = this.b;
            long j10 = j7 & j8;
            if (j9 != 0) {
                j4 = j9;
                j5 = j10;
            } else {
                if (j10 == 0) {
                    if (this.d != null) {
                        j5 = 0;
                        j4 = 0;
                    }
                    return a;
                }
                j5 = j10;
                j4 = 0;
            }
            ajzVar = new ajz(j4, j5, this.d);
            return ajzVar;
        }
        if (awrc.a(j, 64L) >= 0 && awrc.a(j, 128L) < 0) {
            long j11 = 1 << (((int) j) - 64);
            long j12 = this.b;
            if ((j12 & j11) == 0) {
                return this;
            }
            long j13 = j12 & (~j11);
            if (j13 != 0) {
                j3 = j13;
            } else if (this.c != 0 || this.d != null) {
                j3 = 0;
            }
            ajzVar = new ajz(j3, this.c, this.d);
            return ajzVar;
        }
        if (awrc.a(j, 0L) >= 0 || (jArr = this.d) == null || (iH = ahs.h(jArr, j)) < 0) {
            return this;
        }
        int length = jArr.length;
        int i = length - 1;
        if (i == 0) {
            jArr2 = null;
        } else {
            long[] jArr3 = new long[i];
            if (iH > 0) {
                System.arraycopy(jArr, 0, jArr3, 0, iH);
            }
            if (iH < i) {
                int i2 = iH + 1;
                System.arraycopy(jArr, i2, jArr3, iH, length - i2);
            }
            jArr2 = jArr3;
        }
        long j14 = this.b;
        if (j14 != 0) {
            j2 = j14;
        } else if (this.c != 0 || jArr2 != null) {
            j2 = 0;
        }
        return new ajz(j2, this.c, jArr2);
        return a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new awta(new ajy(this, null), 1).a();
    }

    public final String toString() throws IOException {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(atqq.N(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + ']';
    }
}
