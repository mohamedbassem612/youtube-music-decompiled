package defpackage;

import com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysi extends ysk {
    private final OnesieResponseSelector a;

    public ysi(OnesieResponseSelector onesieResponseSelector) {
        this.a = onesieResponseSelector;
    }

    @Override // defpackage.ysk, defpackage.ysm
    public final OnesieResponseSelector a() {
        return this.a;
    }

    @Override // defpackage.ysm
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysm)) {
            return false;
        }
        ysm ysmVar = (ysm) obj;
        return ysmVar.b() == 1 && this.a.equals(ysmVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatypusOnesieObjects{onesieResponseSelector=" + this.a.toString() + '}';
    }
}
