package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aich {
    public static final aich a;
    public static final aich b;
    public static final aich c;
    public static final aich d;
    private static final /* synthetic */ aich[] e;

    static {
        aich aichVar = new aich("IHNR_LAYOUT", 0);
        a = aichVar;
        aich aichVar2 = new aich("INSAT_LAYOUT", 1);
        b = aichVar2;
        aich aichVar3 = new aich("TEMPORARY_MESSAGE_LAYOUT", 2);
        c = aichVar3;
        aich aichVar4 = new aich("LAYOUT_NOT_SET", 3);
        d = aichVar4;
        e = new aich[]{aichVar, aichVar2, aichVar3, aichVar4};
    }

    public static aich a(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i != 3) {
            return null;
        }
        return c;
    }

    public static aich[] values() {
        return (aich[]) e.clone();
    }
}
