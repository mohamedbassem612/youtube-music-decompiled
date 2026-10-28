package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjh {
    public static final rjh a;
    public static final rjh b;
    public static final rjh c;
    public static final rjh d;
    public static final rjh e;
    private static final /* synthetic */ rjh[] f;

    static {
        rjh rjhVar = new rjh("TIMING", 0);
        a = rjhVar;
        rjh rjhVar2 = new rjh("ENABLEMENT", 1);
        b = rjhVar2;
        rjh rjhVar3 = new rjh("INCOMING_SEGMENT", 2);
        c = rjhVar3;
        rjh rjhVar4 = new rjh("OUTGOING_SEGMENT", 3);
        d = rjhVar4;
        rjh rjhVar5 = new rjh("SKOTTIE_SOURCE", 4);
        e = rjhVar5;
        f = new rjh[]{rjhVar, rjhVar2, rjhVar3, rjhVar4, rjhVar5};
    }

    public static rjh[] values() {
        return (rjh[]) f.clone();
    }
}
