package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgu {
    public static final xgu a;
    public static final xgu b;
    public static final xgu c;
    public static final xgu d;
    public static final xgu e;
    private static final /* synthetic */ xgu[] f;

    static {
        xgu xguVar = new xgu("DEFAULT", 0);
        a = xguVar;
        xgu xguVar2 = new xgu("OVERLAY", 1);
        b = xguVar2;
        xgu xguVar3 = new xgu("VR_BROWSE", 2);
        c = xguVar3;
        xgu xguVar4 = new xgu("VR_WATCH", 3);
        d = xguVar4;
        xgu xguVar5 = new xgu("MEDIA_CLIENT", 4);
        e = xguVar5;
        f = new xgu[]{xguVar, xguVar2, xguVar3, xguVar4, xguVar5};
    }

    public static xgu[] values() {
        return (xgu[]) f.clone();
    }
}
