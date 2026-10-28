package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oju {
    public static final oju a;
    public static final oju b;
    public static final oju c;
    public static final oju d;
    public static final oju e;
    private static final /* synthetic */ oju[] f;

    static {
        oju ojuVar = new oju("ANY", 0);
        a = ojuVar;
        oju ojuVar2 = new oju("BLUETOOTH", 1);
        b = ojuVar2;
        oju ojuVar3 = new oju("ETHERNET", 2);
        c = ojuVar3;
        oju ojuVar4 = new oju("CELLULAR", 3);
        d = ojuVar4;
        oju ojuVar5 = new oju("WIFI", 4);
        e = ojuVar5;
        f = new oju[]{ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5};
    }

    public static oju[] values() {
        return (oju[]) f.clone();
    }
}
