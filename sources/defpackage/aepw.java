package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepw {
    public static final aepw a;
    public static final aepw b;
    public static final aepw c;
    private static final /* synthetic */ aepw[] d;

    static {
        aepw aepwVar = new aepw("CREATION_CONTEXT", 0);
        a = aepwVar;
        aepw aepwVar2 = new aepw("KIMONO_CONTEXT", 1);
        b = aepwVar2;
        aepw aepwVar3 = new aepw("COMPOSITION_RUNTIME_CONTEXT", 2);
        c = aepwVar3;
        d = new aepw[]{aepwVar, aepwVar2, aepwVar3};
    }

    public static aepw[] values() {
        return (aepw[]) d.clone();
    }
}
