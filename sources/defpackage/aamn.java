package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aamn {
    OFFLINE_IMMEDIATELY(0),
    DEFER_FOR_DISCOUNTED_DATA(1),
    OFFLINE_SHARING(2),
    SIDELOAD(3),
    AUTO_OFFLINE(4),
    EMERGENCY_BUFFER(5);

    static final agkj g;
    public final int h;

    static {
        agkh agkhVar = new agkh(4);
        for (aamn aamnVar : values()) {
            agkhVar.e(Integer.valueOf(aamnVar.h), aamnVar);
        }
        g = agkhVar.d(true);
    }

    aamn(int i2) {
        this.h = i2;
    }

    public static aamn a(int i2) {
        aamn aamnVar = (aamn) g.get(Integer.valueOf(i2));
        return aamnVar == null ? OFFLINE_IMMEDIATELY : aamnVar;
    }

    public final aofb b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return aofb.OFFLINE_NOW;
        }
        if (iOrdinal == 1) {
            return aofb.OFFLINE_DEFERRED;
        }
        if (iOrdinal == 2) {
            return aofb.OFFLINE_MODE_TYPE_OFFLINE_SHARING;
        }
        if (iOrdinal == 3) {
            return aofb.OFFLINE_MODE_TYPE_SIDELOAD;
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? aofb.OFFLINE_TYPE_UNKNOWN : aofb.OFFLINE_MODE_TYPE_EMERGENCY_BUFFER;
        }
        return aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE;
    }
}
