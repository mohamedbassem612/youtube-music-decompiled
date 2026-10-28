package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwj {
    public static final qwj a;
    public static final qwj b;
    private static final /* synthetic */ qwj[] c;

    static {
        qwj qwjVar = new qwj("THROUGH", 0);
        a = qwjVar;
        qwj qwjVar2 = new qwj("GAPS", 1);
        b = qwjVar2;
        c = new qwj[]{qwjVar, qwjVar2};
    }

    public static qwj[] values() {
        return (qwj[]) c.clone();
    }
}
