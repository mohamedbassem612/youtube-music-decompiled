package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vux {
    public static final vux a;
    public static final vux b;
    private static final /* synthetic */ vux[] c;

    static {
        vux vuxVar = new vux("NONE", 0);
        a = vuxVar;
        vux vuxVar2 = new vux("DOWN_ONLY", 1);
        b = vuxVar2;
        c = new vux[]{vuxVar, vuxVar2};
    }

    public static vux[] values() {
        return (vux[]) c.clone();
    }
}
