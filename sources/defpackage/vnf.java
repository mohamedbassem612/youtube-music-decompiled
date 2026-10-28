package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vnf {
    public static final vnf a;
    public static final vnf b;
    public static final vnf c;
    public static final vnf d;
    public static final vnf e;
    public static final vnf f;
    private static final /* synthetic */ vnf[] g;

    static {
        vnf vnfVar = new vnf("UNSPECIFIED", 0);
        a = vnfVar;
        vnf vnfVar2 = new vnf("AUTO_SCROLL", 1);
        b = vnfVar2;
        vnf vnfVar3 = new vnf("USER_SCROLL_SETTLED", 2);
        c = vnfVar3;
        vnf vnfVar4 = new vnf("USER_SCROLLING", 3);
        d = vnfVar4;
        vnf vnfVar5 = new vnf("REWIND", 4);
        e = vnfVar5;
        vnf vnfVar6 = new vnf("REQUEST_ANCHOR", 5);
        f = vnfVar6;
        g = new vnf[]{vnfVar, vnfVar2, vnfVar3, vnfVar4, vnfVar5, vnfVar6};
    }

    public static vnf[] values() {
        return (vnf[]) g.clone();
    }
}
