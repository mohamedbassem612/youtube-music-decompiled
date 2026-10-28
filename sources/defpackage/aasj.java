package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasj {
    public final agev a;
    public final long b;
    public final long c;
    public final double d;
    public final boolean e;
    public final agev f;
    public final agev g;
    public final int h;
    public final agev i;
    public final agev j;
    public final aamb k;
    public final int l;
    private final agev m;

    public aasj(int i, agev agevVar, agev agevVar2, long j, long j2, double d, boolean z, agev agevVar3, agev agevVar4, int i2, agev agevVar5, agev agevVar6, aamb aambVar) {
        this.l = i;
        this.m = agevVar;
        this.a = agevVar2;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = z;
        this.f = agevVar3;
        this.g = agevVar4;
        this.h = i2;
        this.i = agevVar5;
        this.j = agevVar6;
        this.k = aambVar;
    }

    public static aasi a(int i) {
        aasi aasiVar = new aasi();
        aasiVar.e = i;
        aasiVar.g(0L);
        aasiVar.b(0L);
        aasiVar.h(0.0d);
        aasiVar.i(false);
        aasiVar.e(0);
        aasiVar.d = null;
        return aasiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aasj) {
            aasj aasjVar = (aasj) obj;
            int i = this.l;
            int i2 = aasjVar.l;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.m.equals(aasjVar.m) && this.a.equals(aasjVar.a) && this.b == aasjVar.b && this.c == aasjVar.c) {
                if (Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aasjVar.d) && this.e == aasjVar.e && this.f.equals(aasjVar.f) && this.g.equals(aasjVar.g) && this.h == aasjVar.h && this.i.equals(aasjVar.i) && this.j.equals(aasjVar.j)) {
                    aamb aambVar = this.k;
                    if (aambVar == null) {
                        if (aasjVar.k == null) {
                            return true;
                        }
                    } else if (aambVar.equals(aasjVar.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.l;
        a.by(i);
        int iHashCode = ((((i ^ 1000003) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.a.hashCode();
        double d = this.d;
        long jDoubleToLongBits = (Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d);
        boolean z = this.e;
        int iHashCode2 = this.f.hashCode();
        int i2 = true != z ? 1237 : 1231;
        long j = this.b;
        int i3 = ((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.c;
        int iHashCode3 = ((((((((((((((i3 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ i2) * 1000003) ^ iHashCode2) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
        aamb aambVar = this.k;
        return (iHashCode3 * 1000003) ^ (aambVar == null ? 0 : aambVar.hashCode());
    }

    public final String toString() {
        String str;
        switch (this.l) {
            case 1:
                str = "RESTORE";
                break;
            case 2:
                str = "ADD_TRANSFER";
                break;
            case 3:
                str = "REMOVE_TRANSFER";
                break;
            case 4:
                str = "PING";
                break;
            case 5:
                str = "RESYNC_TRANSFER";
                break;
            case 6:
                str = "SIZE";
                break;
            case 7:
                str = "PROGRESS";
                break;
            case 8:
                str = "COMPLETED";
                break;
            case 9:
                str = "ERROR_RETRYABLE";
                break;
            case 10:
                str = "ERROR_FATAL";
                break;
            case 11:
                str = "RETRY";
                break;
            case 12:
                str = "PAUSE_RUNNING_TRANSFERS";
                break;
            case 13:
                str = "ERROR_PAUSE_TRANSFER";
                break;
            case 14:
                str = "QUIT";
                break;
            case 15:
                str = "WATCH_NEXT_COMPLETED";
                break;
            case 16:
                str = "PAUSE_RUNNING_AND_PENDING_TRANSFERS";
                break;
            case 17:
                str = "UPDATE_TRANSFER_OUTPUT_EXTRAS";
                break;
            case 18:
                str = "STREAM_TRANSFER_STARTED";
                break;
            case 19:
                str = "PAUSE_TRANSFER";
                break;
            case 20:
                str = "RESUME_TRANSFER";
                break;
            case 21:
                str = "SET_DOWNLOAD_NETWORK_PREFERENCE";
                break;
            case 22:
                str = "NOTIFY_NEW_TRANSFER";
                break;
            default:
                str = "null";
                break;
        }
        agev agevVar = this.m;
        agev agevVar2 = this.a;
        agev agevVar3 = this.f;
        agev agevVar4 = this.g;
        agev agevVar5 = this.i;
        agev agevVar6 = this.j;
        aamb aambVar = this.k;
        return "Action{type=" + str + ", offlineStoreTag=" + String.valueOf(agevVar) + ", transferId=" + String.valueOf(agevVar2) + ", transferSize=" + this.b + ", bytesTransferred=" + this.c + ", transferSpeedBytesPerSecond=" + this.d + ", usingDataToDownloadStreams=" + this.e + ", mediaStatus=" + String.valueOf(agevVar3) + ", failureReason=" + String.valueOf(agevVar4) + ", statusReason=" + this.h + ", transfer=" + String.valueOf(agevVar5) + ", downloadNetworkPreference=" + String.valueOf(agevVar6) + ", outputExtras=" + String.valueOf(aambVar) + '}';
    }

    public aasj() {
        throw null;
    }
}
