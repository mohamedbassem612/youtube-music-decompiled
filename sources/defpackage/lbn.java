package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lbn extends lbm {
    final /* synthetic */ lbo a;
    private final lhw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbn(lbo lboVar, String str, int i, lhw lhwVar) {
        super(str, i);
        this.a = lboVar;
        this.h = lhwVar;
    }

    @Override // defpackage.lbm
    public final int a() {
        return this.h.c;
    }

    @Override // defpackage.lbm
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lbm
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final boolean d(Long l, Long l2, lix lixVar, boolean z) {
        ausi.c();
        lbo lboVar = this.a;
        boolean zF = lboVar.G().F(this.b, lcl.aB);
        lhw lhwVar = this.h;
        boolean z2 = lhwVar.f;
        boolean z3 = lhwVar.g;
        boolean z4 = lhwVar.h;
        Object[] objArr = z2 || z3 || z4;
        Boolean boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        if (!z || objArr == true) {
            lhu lhuVar = lhwVar.e;
            if (lhuVar == null) {
                lhuVar = lhu.a;
            }
            boolean z5 = lhuVar.e;
            int i = lixVar.b;
            if ((i & 8) != 0) {
                if ((lhuVar.b & 2) != 0) {
                    long j = lixVar.f;
                    lhv lhvVar = lhuVar.d;
                    if (lhvVar == null) {
                        lhvVar = lhv.a;
                    }
                    boolJ = j(h(j, lhvVar), z5);
                } else {
                    lboVar.aT().f.b("No number filter for long property. property", lboVar.I().e(lixVar.d));
                }
            } else if ((i & 32) != 0) {
                if ((lhuVar.b & 2) != 0) {
                    double d = lixVar.g;
                    lhv lhvVar2 = lhuVar.d;
                    if (lhvVar2 == null) {
                        lhvVar2 = lhv.a;
                    }
                    boolJ = j(g(d, lhvVar2), z5);
                } else {
                    lboVar.aT().f.b("No number filter for double property. property", lboVar.I().e(lixVar.d));
                }
            } else if ((i & 4) != 0) {
                int i2 = lhuVar.b;
                if ((i2 & 1) != 0) {
                    String str = lixVar.e;
                    lhx lhxVar = lhuVar.c;
                    if (lhxVar == null) {
                        lhxVar = lhx.a;
                    }
                    boolJ = j(f(str, lhxVar, lboVar.aT()), z5);
                } else if ((i2 & 2) == 0) {
                    lboVar.aT().f.b("No string or number filter defined. property", lboVar.I().e(lixVar.d));
                } else if (lfx.F(lixVar.e)) {
                    String str2 = lixVar.e;
                    lhv lhvVar3 = lhuVar.d;
                    if (lhvVar3 == null) {
                        lhvVar3 = lhv.a;
                    }
                    boolJ = j(i(str2, lhvVar3), z5);
                } else {
                    lboVar.aT().f.c("Invalid user property value for Numeric number filter. property, value", lboVar.I().e(lixVar.d), lixVar.e);
                }
            } else {
                lboVar.aT().f.b("User property has no value, property", lboVar.I().e(lixVar.d));
            }
            lboVar.aT().k.b("Property filter result", boolJ == null ? "null" : boolJ);
            if (boolJ == null) {
                return false;
            }
            this.d = Boolean.TRUE;
            if (!z4 || boolJ.booleanValue()) {
                if (!z || lhwVar.f) {
                    this.e = boolJ;
                }
                if (boolJ.booleanValue() && objArr != false && (lixVar.b & 1) != 0) {
                    long jLongValue = lixVar.c;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    if (zF && lhwVar.f && !lhwVar.g && l2 != null) {
                        jLongValue = l2.longValue();
                    }
                    if (lhwVar.g) {
                        this.g = Long.valueOf(jLongValue);
                    } else {
                        this.f = Long.valueOf(jLongValue);
                    }
                }
            }
        } else {
            lboVar.aT().k.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.c), (lhwVar.b & 1) != 0 ? Integer.valueOf(lhwVar.c) : null);
        }
        return true;
    }
}
