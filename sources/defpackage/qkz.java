package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkz implements Comparable {
    public final long a;
    public final String b;
    final int c;
    final long d;
    final Object e;
    private final RuntimeException f;

    public qkz(long j, String str, int i, long j2, Object obj) {
        if ((j == 0) != (str != null)) {
            throw new IllegalArgumentException();
        }
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        RuntimeException runtimeException = null;
        if (i == 5) {
            if (obj == null) {
                this.f = new NullPointerException("Null stringOrBytes");
                return;
            } else if (!(obj instanceof byte[]) && !(obj instanceof aigj)) {
                runtimeException = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
            }
        }
        this.f = runtimeException;
    }

    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Long.valueOf(this.d);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.d));
        }
        if (i == 4) {
            Object obj = this.e;
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.e;
        obj2.getClass();
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((aigj) obj2).G();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final String b() {
        String str = this.b;
        return str == null ? Long.toString(this.a) : str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qkz qkzVar = (qkz) obj;
        long j = qkzVar.a;
        long j2 = this.a;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.b;
        str.getClass();
        String str2 = qkzVar.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qkz) {
            qkz qkzVar = (qkz) obj;
            if (this.a == qkzVar.a && Objects.equals(this.b, qkzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return b() + ':' + String.valueOf(a());
    }
}
