package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aqpd implements aihr {
    TRANSFER_STATUS_REASON_UNKNOWN(0),
    TRANSFER_STATUS_REASON_PENDING_STARTUP(1),
    TRANSFER_STATUS_REASON_PENDING_NETWORK(2),
    TRANSFER_STATUS_REASON_PENDING_MEDIA(4),
    TRANSFER_STATUS_REASON_PENDING_WIFI(8),
    TRANSFER_STATUS_REASON_PENDING_USER_RESUMED(64),
    TRANSFER_STATUS_REASON_PENDING_USER_PAUSED(SemanticState.Focused),
    TRANSFER_STATUS_REASON_PENDING_SYSTEM_PAUSED(SemanticState.Hidden),
    TRANSFER_STATUS_REASON_TRANSFER_REMOVED(SemanticState.LiveRegion),
    TRANSFER_STATUS_REASON_PENDING_STORAGE(SemanticState.Obscured);

    public final int k;

    aqpd(int i) {
        this.k = i;
    }

    public static aqpd a(int i) {
        if (i == 0) {
            return TRANSFER_STATUS_REASON_UNKNOWN;
        }
        if (i == 1) {
            return TRANSFER_STATUS_REASON_PENDING_STARTUP;
        }
        if (i == 2) {
            return TRANSFER_STATUS_REASON_PENDING_NETWORK;
        }
        if (i == 4) {
            return TRANSFER_STATUS_REASON_PENDING_MEDIA;
        }
        if (i == 8) {
            return TRANSFER_STATUS_REASON_PENDING_WIFI;
        }
        if (i == 64) {
            return TRANSFER_STATUS_REASON_PENDING_USER_RESUMED;
        }
        if (i == 128) {
            return TRANSFER_STATUS_REASON_PENDING_USER_PAUSED;
        }
        if (i == 256) {
            return TRANSFER_STATUS_REASON_PENDING_SYSTEM_PAUSED;
        }
        if (i == 512) {
            return TRANSFER_STATUS_REASON_TRANSFER_REMOVED;
        }
        if (i != 4096) {
            return null;
        }
        return TRANSFER_STATUS_REASON_PENDING_STORAGE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
