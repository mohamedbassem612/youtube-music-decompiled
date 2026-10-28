package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wza {
    public static final wza a;
    public static final wza b;
    private static final /* synthetic */ wza[] c;

    static {
        wza wzaVar = new wza("DARK", 0);
        a = wzaVar;
        wza wzaVar2 = new wza("LIGHT", 1);
        b = wzaVar2;
        c = new wza[]{wzaVar, wzaVar2};
    }

    public static wza[] values() {
        return (wza[]) c.clone();
    }
}
