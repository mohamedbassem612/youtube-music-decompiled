package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbl {
    public static final vbl a;
    public static final vbl b;
    private static final /* synthetic */ vbl[] c;

    static {
        vbl vblVar = new vbl("IDLE", 0);
        a = vblVar;
        vbl vblVar2 = new vbl("PROCESSING", 1);
        b = vblVar2;
        c = new vbl[]{vblVar, vblVar2};
    }

    public static vbl[] values() {
        return (vbl[]) c.clone();
    }
}
