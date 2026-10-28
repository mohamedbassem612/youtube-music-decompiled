package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvo {
    public static final Map a = atqq.y(new awml("MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID", amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID), new awml("MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID", amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID));
    public final amyn b;
    public final String c;

    public xvo(amyn amynVar, String str) {
        str.getClass();
        this.b = amynVar;
        this.c = str;
    }

    public static final xvo a(String str, String str2) {
        str.getClass();
        str2.getClass();
        amyn amynVar = (amyn) a.get(str);
        if (amynVar == null) {
            return null;
        }
        return new xvo(amynVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xvo) {
            xvo xvoVar = (xvo) obj;
            if (this.b == xvoVar.b && awrc.c(this.c, xvoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MdxDiscoveryId(type=" + this.b + ", id=" + this.c + ')';
    }
}
