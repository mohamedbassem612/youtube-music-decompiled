package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum agsq {
    STRING('s', agss.GENERAL, "-#", true),
    BOOLEAN('b', agss.BOOLEAN, "-", true),
    CHAR('c', agss.CHARACTER, "-", true),
    DECIMAL('d', agss.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', agss.INTEGRAL, "-#0(", false),
    HEX('x', agss.INTEGRAL, "-#0(", true),
    FLOAT('f', agss.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', agss.FLOAT, "-#0+ (", true),
    GENERAL('g', agss.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', agss.FLOAT, "-#0+ ", true);

    public static final agsq[] k = new agsq[26];
    public final char l;
    public final agss m;
    public final int n;
    public final String o;

    static {
        for (agsq agsqVar : values()) {
            k[(agsqVar.l | ' ') - 97] = agsqVar;
        }
    }

    agsq(char c, agss agssVar, String str, boolean z) {
        this.l = c;
        this.m = agssVar;
        agsr agsrVar = agsr.a;
        int i = true != z ? 0 : SemanticState.Focused;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = agsr.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }
}
