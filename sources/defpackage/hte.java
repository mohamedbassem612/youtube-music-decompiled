package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hte {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    private final int g;
    private final int h;

    public hte(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.g = i;
        this.d = i2;
        this.h = i3;
        this.e = i4;
        this.f = i5;
    }

    public static hte a(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Optional optional = (Optional) it.next();
            if (!optional.isEmpty()) {
                aqph aqphVar = (aqph) optional.get();
                if (aqphVar.getTransferState() == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE && aqphVar.getTransferStatusReason().contains(aqpd.TRANSFER_STATUS_REASON_PENDING_WIFI)) {
                    z = true;
                }
                int iOrdinal = aqphVar.getTransferState().ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        i3++;
                    } else if (iOrdinal == 6) {
                        i2++;
                    }
                }
            }
            i++;
        }
        int size = list.size();
        return new hte(i == 0, i3 > 0, z, i, i2, i3, size, size > 0 ? ((size - i) * 100) / size : 100);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hte) {
            hte hteVar = (hte) obj;
            if (this.a == hteVar.a && this.b == hteVar.b && this.c == hteVar.c && this.g == hteVar.g && this.d == hteVar.d && this.h == hteVar.h && this.e == hteVar.e && this.f == hteVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.d) * 1000003) ^ this.h) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "MusicContainerDownloadStatusModel{finished=" + this.a + ", error=" + this.b + ", isPendingWifi=" + this.c + ", numActiveTransfers=" + this.g + ", numCompletedTransfers=" + this.d + ", numFailedTransfers=" + this.h + ", numTotalTransfers=" + this.e + ", percentComplete=" + this.f + '}';
    }

    public hte() {
        throw null;
    }
}
