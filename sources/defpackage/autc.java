package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class autc implements autb {
    private static final qmm a = new qmm(aurg.c, 6);

    @Override // defpackage.autb
    public final double a() {
        return ((Double) a.a(2, "measurement.test.double_flag", -3.0d).io()).doubleValue();
    }

    @Override // defpackage.autb
    public final long b() {
        return ((Long) a.b(1, "measurement.test.cached_long_flag", -1L).io()).longValue();
    }

    @Override // defpackage.autb
    public final long c() {
        return ((Long) a.b(3, "measurement.test.int_flag", -2L).io()).longValue();
    }

    @Override // defpackage.autb
    public final long d() {
        return ((Long) a.b(4, "measurement.test.long_flag", -1L).io()).longValue();
    }

    @Override // defpackage.autb
    public final String e() {
        return (String) a.c(5, "measurement.test.string_flag", "---").io();
    }

    @Override // defpackage.autb
    public final boolean f() {
        return ((Boolean) a.d(0, "measurement.test.boolean_flag", false).io()).booleanValue();
    }
}
