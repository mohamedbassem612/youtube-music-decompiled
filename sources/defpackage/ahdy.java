package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdy {
    public static final ahdy a;
    public static final ahdy b;
    public static final ahdy c;
    private static final /* synthetic */ ahdy[] d;

    static {
        ahdy ahdyVar = new ahdy("NOT_RUN", 0);
        a = ahdyVar;
        ahdy ahdyVar2 = new ahdy("WILL_NOT_RUN", 1);
        b = ahdyVar2;
        ahdy ahdyVar3 = new ahdy("STARTED", 2);
        c = ahdyVar3;
        d = new ahdy[]{ahdyVar, ahdyVar2, ahdyVar3};
    }

    public static ahdy[] values() {
        return (ahdy[]) d.clone();
    }
}
