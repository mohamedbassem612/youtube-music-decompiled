package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcc {
    public static final zcc a;
    public static final zcc b;
    private static final /* synthetic */ zcc[] c;

    static {
        zcc zccVar = new zcc("CLIENT", 0);
        a = zccVar;
        zcc zccVar2 = new zcc("SERVER", 1);
        b = zccVar2;
        c = new zcc[]{zccVar, zccVar2};
    }

    public static zcc[] values() {
        return (zcc[]) c.clone();
    }
}
