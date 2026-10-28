package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqj {
    public static final acqj a;
    public static final acqj b;
    private static final /* synthetic */ acqj[] c;

    static {
        acqj acqjVar = new acqj("PAGE_CHANGED", 0);
        a = acqjVar;
        acqj acqjVar2 = new acqj("FEED_MUTATING", 1);
        b = acqjVar2;
        c = new acqj[]{acqjVar, acqjVar2};
    }

    public static acqj[] values() {
        return (acqj[]) c.clone();
    }
}
