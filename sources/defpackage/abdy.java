package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abdy {
    public static final abdy a;
    public static final abdy b;
    public static final abdy c;
    public static final abdy d;
    private static final /* synthetic */ abdy[] e;

    static {
        abdy abdyVar = new abdy("NEW", 0);
        a = abdyVar;
        abdy abdyVar2 = new abdy("LOGGED_NEW_SCREEN", 1);
        b = abdyVar2;
        abdy abdyVar3 = new abdy("LOGGED_ATTACH_PLAYER", 2);
        c = abdyVar3;
        abdy abdyVar4 = new abdy("LOGGED_ATTACH_WATCH_NEXT", 3);
        d = abdyVar4;
        e = new abdy[]{abdyVar, abdyVar2, abdyVar3, abdyVar4};
    }

    public static abdy[] values() {
        return (abdy[]) e.clone();
    }

    public final boolean a(abdy abdyVar) {
        return ordinal() >= abdyVar.ordinal();
    }
}
