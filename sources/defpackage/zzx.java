package defpackage;

import j$.time.Duration;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zzx implements pxd {
    public static final Duration a;
    public static final syx b;
    public static final File c;
    public final adhv d;
    public final syw e;
    public final Executor f;
    public final aaap g;
    public final vxz h;

    static {
        Duration durationOfDays = Duration.ofDays(7L);
        a = durationOfDays;
        b = new syx(3, "chime_media_cache", durationOfDays);
        c = new File("");
    }

    public zzx(adhv adhvVar, qcb qcbVar, Executor executor, vxz vxzVar, aaap aaapVar, vxz vxzVar2) {
        this.d = adhvVar;
        if (vxzVar2.l(322, 45849203L, false)) {
            this.e = qcbVar.z(b);
        } else {
            this.e = qcbVar.A(3, "chime_media_cache", a.toSeconds());
        }
        this.f = executor;
        this.h = vxzVar;
        this.g = aaapVar;
    }

    @Override // defpackage.pxd
    public final /* synthetic */ Object a(String str, int i, int i2, awoq awoqVar) {
        return nqw.b(this, str, i, i2, awoqVar);
    }

    @Override // defpackage.pxd
    public final /* synthetic */ Object b(String str, awoq awoqVar) {
        return nqw.c(this, str, awoqVar);
    }
}
