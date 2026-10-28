package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agez implements agex {
    public static final agez a;
    public static final agez b;
    public static final agez c;
    public static final agez d;
    private static final /* synthetic */ agez[] e;

    static {
        agez agezVar = new agez("ALWAYS_TRUE", 0);
        a = agezVar;
        agez agezVar2 = new agez("ALWAYS_FALSE", 1);
        b = agezVar2;
        agez agezVar3 = new agez("IS_NULL", 2);
        c = agezVar3;
        agez agezVar4 = new agez("NOT_NULL", 3);
        d = agezVar4;
        e = new agez[]{agezVar, agezVar2, agezVar3, agezVar4};
    }

    public static agez[] values() {
        return (agez[]) e.clone();
    }

    @Override // defpackage.agex
    public final /* synthetic */ boolean a(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw null;
                }
                if (obj != null) {
                    return true;
                }
            } else if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }
}
