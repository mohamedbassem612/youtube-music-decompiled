package defpackage;

import android.content.Intent;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbf {
    public final int a;
    public final String b;
    public final plx c;
    public final pbd d;
    public final List e;
    public final aiff f;
    public final Intent g;
    public final pzn h;
    public final aicf i;
    public final boolean j;
    public final pbh k;
    public final int l;

    public pbf(int i, int i2, String str, plx plxVar, pbd pbdVar, List list, aiff aiffVar, Intent intent, pzn pznVar, aicf aicfVar, boolean z, pbh pbhVar) {
        this.l = i;
        this.a = i2;
        this.b = str;
        this.c = plxVar;
        this.d = pbdVar;
        this.e = list;
        this.f = aiffVar;
        this.g = intent;
        this.h = pznVar;
        this.i = aicfVar;
        this.j = z;
        this.k = pbhVar;
    }

    public static pbe a() {
        pbe pbeVar = new pbe();
        pbeVar.f(new ArrayList());
        pbeVar.d(aiff.a);
        pbeVar.c(pzn.a);
        xyg xygVar = new xyg();
        xygVar.d(ahza.REMOVE_REASON_UNKNOWN);
        pbeVar.e = xygVar.c();
        pbeVar.b(false);
        return pbeVar;
    }

    public final agke b() {
        pbd pbdVar = this.d;
        int i = 1;
        ahno.K(pbdVar == pbd.a, "Can't get system tray threads as threads in this event are from type %s", pbdVar);
        return (agke) Collection.EL.stream(this.e).map(new qdi(i)).collect(aghu.a);
    }

    public final boolean equals(Object obj) {
        String str;
        plx plxVar;
        Intent intent;
        aicf aicfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pbf) {
            pbf pbfVar = (pbf) obj;
            int i = this.l;
            int i2 = pbfVar.l;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == pbfVar.a && ((str = this.b) != null ? str.equals(pbfVar.b) : pbfVar.b == null) && ((plxVar = this.c) != null ? plxVar.equals(pbfVar.c) : pbfVar.c == null) && this.d.equals(pbfVar.d) && this.e.equals(pbfVar.e) && this.f.equals(pbfVar.f) && ((intent = this.g) != null ? intent.equals(pbfVar.g) : pbfVar.g == null) && this.h.equals(pbfVar.h) && ((aicfVar = this.i) != null ? aicfVar.equals(pbfVar.i) : pbfVar.i == null) && this.j == pbfVar.j && this.k.equals(pbfVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.l;
        a.bj(i);
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = i ^ 1000003;
        int i3 = this.a;
        plx plxVar = this.c;
        int iHashCode2 = ((((((((((((i2 * 1000003) ^ i3) * 1000003) ^ iHashCode) * 1000003) ^ (plxVar == null ? 0 : plxVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        Intent intent = this.g;
        int iHashCode3 = (((iHashCode2 ^ (intent == null ? 0 : intent.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        aicf aicfVar = this.i;
        return ((((iHashCode3 ^ (aicfVar != null ? aicfVar.hashCode() : 0)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.l;
        if (i == 1) {
            str = "SYSTEM_TRAY";
        } else if (i == 2) {
            str = "INBOX";
        } else if (i != 3) {
            str = i != 4 ? "null" : "API";
        } else {
            str = "GNP_INBOX";
        }
        int i2 = this.a;
        String str2 = this.b;
        plx plxVar = this.c;
        pbd pbdVar = this.d;
        List list = this.e;
        aiff aiffVar = this.f;
        Intent intent = this.g;
        pzn pznVar = this.h;
        aicf aicfVar = this.i;
        boolean z = this.j;
        pbh pbhVar = this.k;
        return "NotificationEvent{source=" + str + ", type=" + i2 + ", actionId=" + str2 + ", account=" + String.valueOf(plxVar) + ", eventThreadType=" + String.valueOf(pbdVar) + ", threads=" + String.valueOf(list) + ", threadStateUpdate=" + String.valueOf(aiffVar) + ", intent=" + String.valueOf(intent) + ", localThreadState=" + String.valueOf(pznVar) + ", action=" + String.valueOf(aicfVar) + ", activityLaunched=" + z + ", removalInfo=" + String.valueOf(pbhVar) + '}';
    }

    public pbf() {
        throw null;
    }
}
