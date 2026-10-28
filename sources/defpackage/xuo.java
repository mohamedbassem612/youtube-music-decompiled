package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xuo {
    public static final xuo a;
    public static final xuo b;
    public static final xuo c;
    public static final xuo d;
    public static final xuo e;
    public static final xuo f;
    private static final /* synthetic */ xuo[] g;

    static {
        xuo xuoVar = new xuo("UNKNOWN", 0);
        a = xuoVar;
        xuo xuoVar2 = new xuo("DISCONNECTED", 1);
        b = xuoVar2;
        xuo xuoVar3 = new xuo("ACTIVE_DEVICE_DETECTED", 2);
        c = xuoVar3;
        xuo xuoVar4 = new xuo("ACTIVE_DEVICE_DETECTED_WITH_PLAYBACK", 3);
        d = xuoVar4;
        xuo xuoVar5 = new xuo("CONNECTING", 4);
        e = xuoVar5;
        xuo xuoVar6 = new xuo("CONNECTED", 5);
        f = xuoVar6;
        g = new xuo[]{xuoVar, xuoVar2, xuoVar3, xuoVar4, xuoVar5, xuoVar6};
    }

    public static xuo[] values() {
        return (xuo[]) g.clone();
    }
}
