package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzz {
    public final int a;

    public pzz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof pzz) && this.a == ((pzz) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ProcessingMetadata(processingTrigger=");
        int i = this.a;
        if (i == 1) {
            str = "RECEIVED_FROM_FCM";
        } else if (i == 2) {
            str = "EXECUTED_SCHEDULED_TASK";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "POSTED_LOCAL_NOTIFICATION";
        } else {
            str = "FETCHED_FROM_SERVER";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
