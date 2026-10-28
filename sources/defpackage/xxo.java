package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xxo {
    public static final xxo a;
    public static final xxo b;
    public static final xxo c;
    private static final /* synthetic */ xxo[] d;

    static {
        xxo xxoVar = new xxo("PLAYING_VIDEO", 0);
        a = xxoVar;
        xxo xxoVar2 = new xxo("SHOWING_TV_QUEUE", 1);
        b = xxoVar2;
        xxo xxoVar3 = new xxo("CONNECTED_ONLY", 2);
        c = xxoVar3;
        d = new xxo[]{xxoVar, xxoVar2, xxoVar3};
    }

    public static xxo[] values() {
        return (xxo[]) d.clone();
    }
}
