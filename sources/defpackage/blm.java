package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blm {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public volatile int b = 0;
    public final dep c;

    public blm(dep depVar, int i) {
        this.c = depVar;
        this.a = i;
    }

    public final int a(int i) {
        dqp dqpVarE = e();
        int iA = dqpVarE.a(16);
        if (iA == 0) {
            return 0;
        }
        return ((ByteBuffer) dqpVarE.c).getInt(dqpVarE.b(iA) + (i << 2));
    }

    public final int b() {
        dqp dqpVarE = e();
        int iA = dqpVarE.a(16);
        if (iA != 0) {
            return dqpVarE.c(iA);
        }
        return 0;
    }

    public final int c() {
        dqp dqpVarE = e();
        int iA = dqpVarE.a(4);
        if (iA == 0) {
            return 0;
        }
        return ((ByteBuffer) dqpVarE.c).getInt(iA + dqpVarE.a);
    }

    public final short d() {
        dqp dqpVarE = e();
        int iA = dqpVarE.a(14);
        if (iA == 0) {
            return (short) 0;
        }
        return ((ByteBuffer) dqpVarE.c).getShort(iA + dqpVarE.a);
    }

    public final dqp e() {
        ThreadLocal threadLocal = d;
        dqp dqpVar = (dqp) threadLocal.get();
        if (dqpVar == null) {
            dqpVar = new dqp();
            threadLocal.set(dqpVar);
        }
        dep depVar = this.c;
        int i = this.a;
        dqp dqpVar2 = (dqp) depVar.a;
        int iA = dqpVar2.a(6);
        if (iA != 0) {
            int iB = dqpVar2.b(iA) + (i << 2);
            dqpVar.d(iB + ((ByteBuffer) dqpVar2.c).getInt(iB), (ByteBuffer) dqpVar2.c);
        }
        return dqpVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(' ');
        }
        return sb.toString();
    }
}
