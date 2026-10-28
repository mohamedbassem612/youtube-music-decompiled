package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjd {
    public static final rjd a;
    public static final rjd b;
    public static final rjd c;
    public static final rjd d;
    private static final /* synthetic */ rjd[] e;

    static {
        rjd rjdVar = new rjd("ENABLEMENT", 0);
        a = rjdVar;
        rjd rjdVar2 = new rjd("TIMING", 1);
        b = rjdVar2;
        rjd rjdVar3 = new rjd("RUNTIME_OPTIONS", 2);
        c = rjdVar3;
        rjd rjdVar4 = new rjd("SOURCE", 3);
        d = rjdVar4;
        e = new rjd[]{rjdVar, rjdVar2, rjdVar3, rjdVar4};
    }

    public static rjd[] values() {
        return (rjd[]) e.clone();
    }
}
