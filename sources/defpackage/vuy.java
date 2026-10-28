package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vuy {
    public static final vuy a;
    public static final vuy b;
    public static final vuy c;
    private static final /* synthetic */ vuy[] d;

    static {
        vuy vuyVar = new vuy("NO_FLING", 0);
        a = vuyVar;
        vuy vuyVar2 = new vuy("FLING_UP", 1);
        b = vuyVar2;
        vuy vuyVar3 = new vuy("FLING_DOWN", 2);
        c = vuyVar3;
        d = new vuy[]{vuyVar, vuyVar2, vuyVar3};
    }

    public static vuy[] values() {
        return (vuy[]) d.clone();
    }
}
