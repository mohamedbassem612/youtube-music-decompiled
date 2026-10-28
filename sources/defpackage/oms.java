package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oms implements omw {
    public final Context a;
    public final omb b;
    public final oin c;
    public final ojt d;
    public final oiq e;
    public final oiw f;
    public final int g;
    public final long h;
    public final String i;
    public final agev j;
    public final Executor k;
    public final int l;
    public final ong m;
    public final ayq n;
    public final qnl o;
    private final oii p;

    public oms(Context context, omb ombVar, ayq ayqVar, qnl qnlVar, oin oinVar, int i, ojt ojtVar, oiq oiqVar, ong ongVar, oiw oiwVar, int i2, long j, String str, agev agevVar, oii oiiVar, Executor executor) {
        this.a = context;
        this.b = ombVar;
        this.n = ayqVar;
        this.o = qnlVar;
        this.c = oinVar;
        this.l = i;
        this.d = ojtVar;
        this.e = oiqVar;
        this.m = ongVar;
        this.f = oiwVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = agevVar;
        this.p = oiiVar;
        this.k = executor;
    }

    @Override // defpackage.omw
    public final ListenableFuture a(Uri uri) {
        int i = onb.a;
        ayq ayqVar = this.n;
        oiq oiqVar = this.e;
        if (!omu.e(ayqVar, uri, oiqVar.e)) {
            onb.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, oiqVar.e);
            acb acbVarA = oig.a();
            acbVarA.b = oif.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            oig oigVarA = acbVarA.a();
            omb ombVar = this.b;
            oin oinVar = this.c;
            int i2 = this.l;
            String str = oiqVar.e;
            ong ongVar = this.m;
            oii oiiVar = this.p;
            Executor executor = this.k;
            return ooi.d(omt.d(ombVar, oinVar, i2, ayqVar, uri, str, ongVar, oiiVar, executor)).c(IOException.class, new oll(oigVarA, 12), executor).f(new oll(oigVarA, 13), executor);
        }
        Uri uriA = nsm.a(uri);
        aihf aihfVarCreateBuilder = oiz.a.createBuilder();
        oim oimVar = oiqVar.g;
        if (oimVar == null) {
            oimVar = oim.a;
        }
        String str2 = oimVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar = (oiz) aihfVarCreateBuilder.instance;
        str2.getClass();
        oizVar.b |= 4;
        oizVar.e = str2;
        int i3 = this.l;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar2 = (oiz) aihfVarCreateBuilder.instance;
        oizVar2.f = i3 - 1;
        oizVar2.b |= 8;
        oiz oizVar3 = (oiz) aihfVarCreateBuilder.build();
        ListenableFuture listenableFutureE = this.b.e(oizVar3);
        iaj iajVar = new iaj((Object) this, (aihn) oizVar3, (Object) uriA, (Object) uri, 19);
        Executor executor2 = this.k;
        return ahno.as(ahno.as(listenableFutureE, iajVar, executor2), new ols(this, uriA, 7), executor2);
    }

    @Override // defpackage.omw
    public final ListenableFuture b(oig oigVar) {
        oin oinVar = this.c;
        String str = oinVar.g;
        int i = onb.a;
        boolean zEquals = oigVar.a.equals(oif.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        int i2 = this.l;
        if (zEquals) {
            return omt.c(oiv.CORRUPTED, oinVar, i2, this.b, this.k);
        }
        return omt.c(oiv.DOWNLOAD_FAILED, oinVar, i2, this.b, this.k);
    }
}
