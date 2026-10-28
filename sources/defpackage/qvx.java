package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qvx {
    public static final qvx a;
    public static final qvx b;
    private static final /* synthetic */ qvx[] c;

    static {
        qvx qvxVar = new qvx("ALL_CORNERS_ROUNDED", 0);
        a = qvxVar;
        qvx qvxVar2 = new qvx("SHARP_INNER_CORNERS", 1);
        b = qvxVar2;
        c = new qvx[]{qvxVar, qvxVar2};
    }

    public static qvx[] values() {
        return (qvx[]) c.clone();
    }
}
