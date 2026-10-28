package defpackage;

import android.os.Handler;
import androidx.media3.decoder.av1.Libdav1dVideoRenderer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yzp extends Libdav1dVideoRenderer {
    private final yye l;
    private final long m;
    private long n;

    public yzp(Handler handler, cty ctyVar, int i, int i2, int i3, int i4, boolean z, int i5, yye yyeVar, long j) {
        super(5000L, handler, ctyVar, 10, i, i2, i3, i4, z, i5);
        yxu yxuVar = yxu.a;
        this.l = yyeVar;
        this.m = j;
    }

    @Override // defpackage.csq, defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        super.G(j, z, z2);
        this.n = 0L;
    }

    @Override // defpackage.csq, defpackage.cav
    public final void K() {
        super.K();
        zcf zcfVar = this.l.m;
        if (zcfVar != null) {
            zcfVar.Z.h(zhc.b("video/av01", true, "Libdav1dVideoRenderer"));
        }
    }

    @Override // defpackage.csq
    protected final boolean aq(long j, long j2) {
        long j3 = this.m;
        if ((j3 <= 0 || j2 - this.n <= j3) && csq.ap(j)) {
            return true;
        }
        this.n = j2;
        return false;
    }
}
