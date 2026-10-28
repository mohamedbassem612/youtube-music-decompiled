package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient q b;
    public final transient int c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.b = q.f((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean h(k kVar) {
        return kVar.d(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final q k(k kVar) {
        if (kVar.d(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.g.g("Unsupported field: ".concat(String.valueOf(this)));
        return null;
    }

    @Override // j$.time.temporal.n
    public final long l(k kVar) {
        return kVar.C(a.EPOCH_DAY) + ((long) this.c);
    }

    @Override // j$.time.temporal.n
    public final k p(HashMap map, w wVar, x xVar) {
        long j = this.c;
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.a aVarX = j$.desugar.sun.nio.fs.g.x(wVar);
        if (xVar == x.LENIENT) {
            return aVarX.p(j$.desugar.sun.nio.fs.g.L(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return aVarX.p(jLongValue - j);
    }

    @Override // j$.time.temporal.n
    public final Temporal r(Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(j$.desugar.sun.nio.fs.g.L(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.b("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.n
    public final q range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
