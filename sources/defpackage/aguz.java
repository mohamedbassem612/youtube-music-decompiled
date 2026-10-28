package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aguz {
    public static final aguz a;
    public static final aguz b;
    public static final aguz c;
    public static final aguz d;
    private static final /* synthetic */ aguz[] e;

    static {
        aguz aguzVar = new aguz("BOOLEAN", 0);
        a = aguzVar;
        aguz aguzVar2 = new aguz("STRING", 1);
        b = aguzVar2;
        aguz aguzVar3 = new aguz("LONG", 2);
        c = aguzVar3;
        aguz aguzVar4 = new aguz("DOUBLE", 3);
        d = aguzVar4;
        e = new aguz[]{aguzVar, aguzVar2, aguzVar3, aguzVar4};
    }

    public static aguz a(Object obj) {
        if (obj instanceof String) {
            return b;
        }
        if (obj instanceof Boolean) {
            return a;
        }
        if (obj instanceof Long) {
            return c;
        }
        if (obj instanceof Double) {
            return d;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public static aguz[] values() {
        return (aguz[]) e.clone();
    }
}
