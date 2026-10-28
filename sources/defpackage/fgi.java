package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class fgi extends auma {
    public long a;

    public fgi() {
        super("tfdt");
    }

    @Override // defpackage.auly
    protected final long e() {
        return h() == 0 ? 8L : 12L;
    }

    @Override // defpackage.auly
    public final void f(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (h() == 1) {
            this.a = fhz.f(byteBuffer);
        } else {
            this.a = fhz.e(byteBuffer);
        }
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(77);
        sb.append("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
