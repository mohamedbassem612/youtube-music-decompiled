package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agmy {
    public static final agmy a;
    public static final agmy b;
    private static final /* synthetic */ agmy[] c;

    static {
        agmy agmyVar = new agmy("STRONG", 0);
        a = agmyVar;
        agmy agmyVar2 = new agmy("WEAK", 1);
        b = agmyVar2;
        c = new agmy[]{agmyVar, agmyVar2};
    }

    public static agmy[] values() {
        return (agmy[]) c.clone();
    }

    final ageb a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return agdz.a;
        }
        if (iOrdinal == 1) {
            return agea.a;
        }
        throw null;
    }
}
