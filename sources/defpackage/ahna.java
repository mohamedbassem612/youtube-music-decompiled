package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahna {
    public static final ahna a;
    public static final ahna b;
    public static final ahna c;
    public static final ahna d;
    public static final ahna e;
    private static final /* synthetic */ ahna[] f;

    static {
        ahna ahnaVar = new ahna("SHA1", 0);
        a = ahnaVar;
        ahna ahnaVar2 = new ahna("SHA224", 1);
        b = ahnaVar2;
        ahna ahnaVar3 = new ahna("SHA256", 2);
        c = ahnaVar3;
        ahna ahnaVar4 = new ahna("SHA384", 3);
        d = ahnaVar4;
        ahna ahnaVar5 = new ahna("SHA512", 4);
        e = ahnaVar5;
        f = new ahna[]{ahnaVar, ahnaVar2, ahnaVar3, ahnaVar4, ahnaVar5};
    }

    public static ahna[] values() {
        return (ahna[]) f.clone();
    }
}
