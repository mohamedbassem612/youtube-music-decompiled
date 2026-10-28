package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwh {
    public static final qwh a;
    public static final qwh b;
    public static final qwh c;
    private static final /* synthetic */ qwh[] d;

    static {
        qwh qwhVar = new qwh("NORMAL", 0);
        a = qwhVar;
        qwh qwhVar2 = new qwh("HIGHLIGHT_REVEAL", 1);
        b = qwhVar2;
        qwh qwhVar3 = new qwh("LETTER_REVEAL", 2);
        c = qwhVar3;
        d = new qwh[]{qwhVar, qwhVar2, qwhVar3};
    }

    public static qwh[] values() {
        return (qwh[]) d.clone();
    }
}
