package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbd {
    public static final rbd a;
    public static final rbd b;
    public static final rbd c;
    public static final rbd d;
    public static final rbd e;
    private static final /* synthetic */ rbd[] f;

    static {
        rbd rbdVar = new rbd("INFO", 0);
        a = rbdVar;
        rbd rbdVar2 = new rbd("DEBUG", 1);
        b = rbdVar2;
        rbd rbdVar3 = new rbd("WARNING", 2);
        c = rbdVar3;
        rbd rbdVar4 = new rbd("ERROR", 3);
        d = rbdVar4;
        rbd rbdVar5 = new rbd("SEVERE", 4);
        e = rbdVar5;
        f = new rbd[]{rbdVar, rbdVar2, rbdVar3, rbdVar4, rbdVar5};
    }

    public static rbd[] values() {
        return (rbd[]) f.clone();
    }
}
