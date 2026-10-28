package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wof extends wnn {
    public final wnh c;

    public wof(wlp wlpVar, abxv abxvVar, awmd awmdVar) {
        super(abxvVar, (tgg) awmdVar.io());
        this.c = f(alsm.a, wlpVar, new heo(13), new hep(8));
    }

    public final wod a(zwa zwaVar, String str, boolean z) {
        return new wod(this.b, zwaVar, str, z, Optional.empty(), false);
    }

    public final ListenableFuture b(wod wodVar, Executor executor, wlt wltVar) {
        return this.c.b(wodVar, executor, wltVar);
    }

    public wof(wlp wlpVar, abxv abxvVar, awmd awmdVar, byte[] bArr) {
        super(abxvVar, (tgg) awmdVar.io());
        this.c = f(allm.a, wlpVar, new heo(12), new hep(7));
    }
}
