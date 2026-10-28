package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aamg {
    DELETED(-1),
    COMPLETE(0),
    ACTIVE(1),
    FAILED_UNKNOWN(2),
    NO_STORAGE_ERROR(3),
    DISK_IO_ERROR(4),
    NETWORK_READ_ERROR(5),
    CANNOT_OFFLINE(6),
    PAUSED(7),
    STREAM_DOWNLOAD_PENDING(8),
    REQUIRES_CONTENT_VERIFICATION(9),
    CONTENT_VERIFICATION_FAILED(10),
    STREAM_CORRUPT(11),
    METADATA_ONLY(12);

    static final SparseArray o = new SparseArray();
    public final int p;

    static {
        for (aamg aamgVar : values()) {
            o.put(aamgVar.p, aamgVar);
        }
    }

    aamg(int i) {
        this.p = i;
    }

    public static aamg a(int i) {
        return (aamg) o.get(i);
    }

    public final boolean b() {
        return (this == PAUSED || this == ACTIVE) ? false : true;
    }
}
