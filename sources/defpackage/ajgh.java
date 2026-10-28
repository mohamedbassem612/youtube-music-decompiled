package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgh {
    public static final ajgh a;
    public static final ajgh b;
    private static final /* synthetic */ ajgh[] c;

    static {
        ajgh ajghVar = new ajgh("AUTO_CROP_DATA", 0);
        a = ajghVar;
        ajgh ajghVar2 = new ajgh("DATA_NOT_SET", 1);
        b = ajghVar2;
        c = new ajgh[]{ajghVar, ajghVar2};
    }

    public static ajgh a(int i) {
        if (i == 0) {
            return b;
        }
        if (i != 1) {
            return null;
        }
        return a;
    }

    public static ajgh[] values() {
        return (ajgh[]) c.clone();
    }
}
