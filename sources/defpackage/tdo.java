package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdo {
    public static final tdo a;
    public static final tdo b;
    public static final tdo c;
    private static final /* synthetic */ tdo[] d;

    static {
        tdo tdoVar = new tdo("ON_CREATE", 0);
        a = tdoVar;
        tdo tdoVar2 = new tdo("ON_START", 1);
        b = tdoVar2;
        tdo tdoVar3 = new tdo("ON_RESUME", 2);
        c = tdoVar3;
        d = new tdo[]{tdoVar, tdoVar2, tdoVar3};
    }

    public static tdo[] values() {
        return (tdo[]) d.clone();
    }
}
