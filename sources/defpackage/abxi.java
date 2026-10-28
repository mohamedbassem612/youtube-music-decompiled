package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxi implements abxp, abxh {
    public static final abxi a = new abxi();
    public final boolean b = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abxi)) {
            return false;
        }
        boolean z = ((abxi) obj).b;
        return true;
    }

    public final int hashCode() {
        return a.aj(false);
    }

    public final String toString() {
        return "AudioSettingModel(muted=false)";
    }
}
