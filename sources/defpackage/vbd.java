package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbd {
    public static final vbd a;
    public static final vbd b;
    public static final vbd c;
    public static final vbd d;
    private static final /* synthetic */ vbd[] e;

    static {
        vbd vbdVar = new vbd("CAMERA", 0);
        a = vbdVar;
        vbd vbdVar2 = new vbd("EDITOR", 1);
        b = vbdVar2;
        vbd vbdVar3 = new vbd("RECOMPOSITION", 2);
        c = vbdVar3;
        vbd vbdVar4 = new vbd("UNKNOWN", 3);
        d = vbdVar4;
        e = new vbd[]{vbdVar, vbdVar2, vbdVar3, vbdVar4};
    }

    public static vbd[] values() {
        return (vbd[]) e.clone();
    }
}
