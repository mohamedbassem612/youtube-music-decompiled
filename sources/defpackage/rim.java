package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rim {
    public static final rim a;
    public static final rim b;
    private static final /* synthetic */ rim[] c;

    static {
        rim rimVar = new rim("VIDEO", 0);
        a = rimVar;
        rim rimVar2 = new rim("AUDIO", 1);
        b = rimVar2;
        c = new rim[]{rimVar, rimVar2};
    }

    public static rim[] values() {
        return (rim[]) c.clone();
    }
}
