package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class imj {
    public static final imj a;
    public static final imj b;
    public static final imj c;
    private static final /* synthetic */ imj[] d;

    static {
        imj imjVar = new imj("HEADER", 0);
        a = imjVar;
        imj imjVar2 = new imj("SHELF", 1);
        b = imjVar2;
        imj imjVar3 = new imj("LIBRARY_SHELF", 2);
        c = imjVar3;
        d = new imj[]{imjVar, imjVar2, imjVar3};
    }

    public static imj[] values() {
        return (imj[]) d.clone();
    }
}
