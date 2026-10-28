package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cmd implements cll {
    private final MediaCodec a;

    public cmd(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // defpackage.cll
    public final void c(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.cll
    public final void f(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.cll
    public final void g(int i, cak cakVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, cakVar.i, j, i2);
    }

    @Override // defpackage.cll
    public final void a() {
    }

    @Override // defpackage.cll
    public final void b() {
    }

    @Override // defpackage.cll
    public final void d() {
    }

    @Override // defpackage.cll
    public final void e() {
    }
}
