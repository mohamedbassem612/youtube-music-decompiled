package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuj {
    public static final abuj a;
    public static final abuj b;
    public static final abuj c;
    public static final abuj d;
    private static final /* synthetic */ abuj[] e;

    static {
        abuj abujVar = new abuj("NONE", 0);
        a = abujVar;
        abuj abujVar2 = new abuj("NEXT_VIDEO", 1);
        b = abujVar2;
        abuj abujVar3 = new abuj("NEXT_AND_PREVIOUS_VIDEO", 2);
        c = abujVar3;
        abuj abujVar4 = new abuj("NEXT_TWO_VIDEOS", 3);
        d = abujVar4;
        e = new abuj[]{abujVar, abujVar2, abujVar3, abujVar4};
    }

    public static abuj[] values() {
        return (abuj[]) e.clone();
    }
}
