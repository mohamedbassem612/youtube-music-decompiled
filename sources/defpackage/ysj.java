package defpackage;

import com.google.android.libraries.youtube.media.interfaces.OnesieVideoData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ysj extends ysk {
    private final OnesieVideoData a;

    public ysj(OnesieVideoData onesieVideoData) {
        this.a = onesieVideoData;
    }

    @Override // defpackage.ysm
    public final int b() {
        return 2;
    }

    @Override // defpackage.ysk, defpackage.ysm
    public final OnesieVideoData c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysm)) {
            return false;
        }
        ysm ysmVar = (ysm) obj;
        return ysmVar.b() == 2 && this.a.equals(ysmVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatypusOnesieObjects{onesieVideoData=" + this.a.toString() + '}';
    }
}
