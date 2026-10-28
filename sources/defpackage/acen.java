package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acen {
    public static final acen a;
    public static final acen b;
    private static final /* synthetic */ acen[] c;

    static {
        acen acenVar = new acen("STARTED", 0);
        a = acenVar;
        acen acenVar2 = new acen("STOPPED", 1);
        b = acenVar2;
        c = new acen[]{acenVar, acenVar2};
    }

    public static acen[] values() {
        return (acen[]) c.clone();
    }
}
