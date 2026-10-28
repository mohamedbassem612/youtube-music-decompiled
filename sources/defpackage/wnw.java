package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wnw extends wnn {
    public final wnv c;
    public final Executor d;
    private final boolean e;

    public wnw(wlp wlpVar, abxv abxvVar, tgg tggVar, vxu vxuVar, Executor executor) {
        super(abxvVar, tggVar);
        this.c = new wnv(this, wlpVar);
        this.d = executor;
        this.e = vys.a(vxuVar);
    }

    @Deprecated
    public final void a(zwa zwaVar, zwa zwaVar2, zza zzaVar, String str, int i) {
        this.c.i(b(zwaVar, zwaVar2, str, i, null), zzaVar);
    }

    public final wnu b(zwa zwaVar, zwa zwaVar2, String str, int i, String str2) {
        return new wnu(this.b, zwaVar, zwaVar2, str, i, str2, this.e);
    }
}
