package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
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
public final class z3 {
    public static final z3 DISTINCT;
    public static final z3 ORDERED;
    public static final z3 SHORT_CIRCUIT;
    public static final z3 SIZED;
    public static final z3 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ z3[] v;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        y3 y3Var = y3.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarR = r(y3Var);
        y3 y3Var2 = y3.STREAM;
        hVarR.f(y3Var2);
        y3 y3Var3 = y3.OP;
        ((EnumMap) hVarR.b).put(y3Var3, 3);
        z3 z3Var = new z3("DISTINCT", 0, 0, hVarR);
        DISTINCT = z3Var;
        j$.desugar.sun.nio.fs.h hVarR2 = r(y3Var);
        hVarR2.f(y3Var2);
        ((EnumMap) hVarR2.b).put(y3Var3, 3);
        z3 z3Var2 = new z3("SORTED", 1, 1, hVarR2);
        SORTED = z3Var2;
        j$.desugar.sun.nio.fs.h hVarR3 = r(y3Var);
        hVarR3.f(y3Var2);
        EnumMap enumMap = (EnumMap) hVarR3.b;
        enumMap.put(y3Var3, 3);
        y3 y3Var4 = y3.TERMINAL_OP;
        enumMap.put(y3Var4, 2);
        y3 y3Var5 = y3.UPSTREAM_TERMINAL_OP;
        enumMap.put(y3Var5, 2);
        z3 z3Var3 = new z3("ORDERED", 2, 2, hVarR3);
        ORDERED = z3Var3;
        j$.desugar.sun.nio.fs.h hVarR4 = r(y3Var);
        hVarR4.f(y3Var2);
        ((EnumMap) hVarR4.b).put(y3Var3, 2);
        z3 z3Var4 = new z3("SIZED", 3, 3, hVarR4);
        SIZED = z3Var4;
        j$.desugar.sun.nio.fs.h hVarR5 = r(y3Var3);
        hVarR5.f(y3Var4);
        int i2 = 0;
        z3 z3Var5 = new z3("SHORT_CIRCUIT", 4, 12, hVarR5);
        SHORT_CIRCUIT = z3Var5;
        v = new z3[]{z3Var, z3Var2, z3Var3, z3Var4, z3Var5};
        f = k(y3Var);
        g = k(y3Var2);
        h = k(y3Var3);
        k(y3Var4);
        k(y3Var5);
        for (z3 z3Var6 : values()) {
            i2 |= z3Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        z3 z3Var7 = DISTINCT;
        m = z3Var7.c;
        n = z3Var7.d;
        z3 z3Var8 = SORTED;
        o = z3Var8.c;
        p = z3Var8.d;
        z3 z3Var9 = ORDERED;
        q = z3Var9.c;
        r = z3Var9.d;
        z3 z3Var10 = SIZED;
        s = z3Var10.c;
        t = z3Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public z3(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        super(str, i2);
        EnumMap enumMap = (EnumMap) hVar.b;
        for (y3 y3Var : y3.values()) {
            Map.EL.putIfAbsent(enumMap, y3Var, 0);
        }
        this.a = enumMap;
        int i4 = i3 << 1;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int h(int i2, int i3) {
        return (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1)))) | i2;
    }

    public static int k(y3 y3Var) {
        int iIntValue = 0;
        for (z3 z3Var : values()) {
            iIntValue |= ((Integer) z3Var.a.get(y3Var)).intValue() << z3Var.b;
        }
        return iIntValue;
    }

    public static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static j$.desugar.sun.nio.fs.h r(y3 y3Var) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h((byte) 13, new EnumMap(y3.class));
        hVar.f(y3Var);
        return hVar;
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) v.clone();
    }

    public final boolean p(int i2) {
        return (i2 & this.e) == this.c;
    }
}
