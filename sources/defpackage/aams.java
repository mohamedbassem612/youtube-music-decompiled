package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aams {
    public static final long a;
    private static final long g;
    public final String b;
    public final aogq c;
    public final long d;
    public final long e;
    public final mbc f;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        g = 43200000L;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        a = 2592000000L;
    }

    public aams(String str, aogq aogqVar, long j, long j2, mbc mbcVar) {
        str.getClass();
        this.b = str;
        this.c = aogqVar;
        this.d = j;
        this.e = j2;
        this.f = mbcVar;
    }

    public final long a() {
        return this.e + (((long) this.c.g) * 1000);
    }

    public final aamr b() {
        aamr aamrVar = new aamr();
        aamrVar.a = this.b;
        aamrVar.b = this.c;
        aamrVar.c = this.d;
        aamrVar.d = this.e;
        aamrVar.e = this.f;
        return aamrVar;
    }

    public final String c() {
        aogq aogqVar = this.c;
        if ((aogqVar.b & 1) != 0) {
            return aogqVar.e;
        }
        return null;
    }

    public final boolean d() {
        return this.f.f().toEpochMilli() < this.e - g;
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        return a() <= this.f.f().toEpochMilli() || d();
    }

    public final boolean f() {
        int i = this.c.h;
        aogp aogpVarA = aogp.a(i);
        if (aogpVarA == null) {
            aogpVarA = aogp.UNKNOWN;
        }
        if (aogpVarA != aogp.DELETE) {
            aogp aogpVarA2 = aogp.a(i);
            if (aogpVarA2 == null) {
                aogpVarA2 = aogp.UNKNOWN;
            }
            if (aogpVarA2 != aogp.DISABLE) {
                aogp aogpVarA3 = aogp.a(i);
                if (aogpVarA3 == null) {
                    aogpVarA3 = aogp.UNKNOWN;
                }
                if (aogpVarA3 != aogp.UNKNOWN) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g() {
        return f() && !e();
    }
}
