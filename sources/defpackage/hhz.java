package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hhz {
    public static final hhz a;
    public static final hhz b;
    public static final hhz c;
    private static final /* synthetic */ hhz[] d;

    static {
        hhz hhzVar = new hhz("UNKNOWN", 0);
        a = hhzVar;
        hhz hhzVar2 = new hhz("VIDEO", 1);
        b = hhzVar2;
        hhz hhzVar3 = new hhz("PLAYLIST", 2);
        c = hhzVar3;
        d = new hhz[]{hhzVar, hhzVar2, hhzVar3};
    }

    public static hhz[] values() {
        return (hhz[]) d.clone();
    }
}
