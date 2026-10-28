package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnb {
    public static final axnb a;
    public static final axnb b;
    public static final axnb c;
    public static final axnb d;
    public static final axnb e;
    public static final axnb f;
    private static final /* synthetic */ axnb[] g;

    static {
        axnb axnbVar = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN", 0);
        a = axnbVar;
        axnb axnbVar2 = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_NOT_STARTED", 1);
        b = axnbVar2;
        axnb axnbVar3 = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_STARTED", 2);
        c = axnbVar3;
        axnb axnbVar4 = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_SUCCEEDED", 3);
        d = axnbVar4;
        axnb axnbVar5 = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_FAILED", 4);
        e = axnbVar5;
        axnb axnbVar6 = new axnb("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_CANCELLED", 5);
        f = axnbVar6;
        g = new axnb[]{axnbVar, axnbVar2, axnbVar3, axnbVar4, axnbVar5, axnbVar6};
    }

    public static axnb[] values() {
        return (axnb[]) g.clone();
    }
}
