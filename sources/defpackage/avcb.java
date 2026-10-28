package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcb {
    public static final avcb a;
    public static final avcb b;
    public static final avcb c;
    private static final /* synthetic */ avcb[] d;

    static {
        avcb avcbVar = new avcb("NONE", 0);
        a = avcbVar;
        avcb avcbVar2 = new avcb("INTEGRITY", 1);
        b = avcbVar2;
        avcb avcbVar3 = new avcb("PRIVACY_AND_INTEGRITY", 2);
        c = avcbVar3;
        d = new avcb[]{avcbVar, avcbVar2, avcbVar3};
    }

    public static avcb[] values() {
        return (avcb[]) d.clone();
    }
}
