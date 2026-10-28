package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahqq {
    public static final ahqq a;
    public static final ahqq b;
    public static final ahqq c;
    private static final /* synthetic */ ahqq[] d;

    static {
        ahqq ahqqVar = new ahqq("DEFAULT", 0);
        a = ahqqVar;
        ahqq ahqqVar2 = new ahqq("SIGNED", 1);
        b = ahqqVar2;
        ahqq ahqqVar3 = new ahqq("FIXED", 2);
        c = ahqqVar3;
        d = new ahqq[]{ahqqVar, ahqqVar2, ahqqVar3};
    }

    public static ahqq[] values() {
        return (ahqq[]) d.clone();
    }
}
