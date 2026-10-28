package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zyk implements zyh {
    public final zyh a;
    public volatile boolean b;
    private final zyh c;

    public zyk(zyh zyhVar, zyh zyhVar2) {
        this.c = zyhVar;
        this.a = zyhVar2;
    }

    public static zyh b(tft tftVar, Executor executor, mbc mbcVar, syr syrVar) {
        tftVar.getClass();
        executor.getClass();
        zsh zshVar = new zsh();
        zyi zyiVar = new zyi();
        return zym.b(syrVar.b(100), new zxt(executor, new zyk(new zyb(tftVar, zshVar, zshVar), new zyb(tftVar, zyiVar, zyiVar))), mbcVar, 1800000L);
    }

    @Override // defpackage.zyh
    public final /* bridge */ /* synthetic */ void a(Object obj, sxu sxuVar) {
        Uri uri = (Uri) obj;
        if (this.b) {
            this.a.a(uri, new zyj(this, sxuVar, false));
        } else {
            this.c.a(uri, new zyj(this, sxuVar, true));
        }
    }
}
