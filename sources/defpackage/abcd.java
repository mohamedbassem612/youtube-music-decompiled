package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abcd {
    public static final abcd a;
    public static final abcd b;
    public static final abcd c;
    private static final /* synthetic */ abcd[] d;

    static {
        abcd abcdVar = new abcd("ENABLED", 0);
        a = abcdVar;
        abcd abcdVar2 = new abcd("PAUSED", 1);
        b = abcdVar2;
        abcd abcdVar3 = new abcd("DISABLED", 2);
        c = abcdVar3;
        d = new abcd[]{abcdVar, abcdVar2, abcdVar3};
    }

    public static abcd[] values() {
        return (abcd[]) d.clone();
    }
}
