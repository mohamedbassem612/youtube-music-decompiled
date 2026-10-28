package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ugd {
    public static final ugd a;
    public static final ugd b;
    private static final /* synthetic */ ugd[] c;

    static {
        ugd ugdVar = new ugd("EVENT_TYPE_ADD", 0);
        a = ugdVar;
        ugd ugdVar2 = new ugd("EVENT_TYPE_REMOVE", 1);
        b = ugdVar2;
        c = new ugd[]{ugdVar, ugdVar2};
    }

    public static ugd[] values() {
        return (ugd[]) c.clone();
    }
}
