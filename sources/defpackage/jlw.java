package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jlw implements wnf {
    public final twi a;
    private final Executor b;
    private final aend c;

    public jlw(aend aendVar, Executor executor, twi twiVar) {
        this.c = aendVar;
        this.b = executor;
        this.a = twiVar;
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        acjxVar.getClass();
        woc wocVarJ = this.c.j();
        wocVarJ.a = "";
        wocVarJ.s(acjxVar);
        return wocVarJ;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        wluVar.getClass();
        wneVar.getClass();
        if (wluVar instanceof woc) {
            taf.i(this.c.k((woc) wluVar), this.b, new ijj(zzaVar, 14), new itt(zzaVar, this, 3, null), null);
        } else {
            zzaVar.jj(new toe(new IllegalArgumentException("Expected YoutubeAssistantRequestWrapper")));
        }
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }
}
