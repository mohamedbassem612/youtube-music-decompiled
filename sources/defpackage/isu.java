package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isu implements syk {
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/sideloaded/migration/SideloadedPlaylistMigrationTaskRunner");
    public final iup a;
    public final Executor b;
    public int c;
    public int d;
    public final klc e;
    public final hfn f;

    public isu(iup iupVar, klc klcVar, hfn hfnVar, Executor executor) {
        this.a = iupVar;
        this.e = klcVar;
        this.f = hfnVar;
        this.b = executor;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 36) {
            return 0;
        }
        try {
            klc klcVar = this.e;
            int i = ((aimq) mci.a(klcVar.e())).d;
            this.c = i;
            int i2 = i + 1;
            this.d = i2;
            this.f.an(3, 2, i2, 0, 0);
            return ((Integer) mci.a(ahno.as(klcVar.h(aimp.IN_PROGRESS), new hqj(this, 19), this.b))).intValue();
        } catch (InterruptedException | RuntimeException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) g.b()).j(e)).k("com/google/android/apps/youtube/music/sideloaded/migration/SideloadedPlaylistMigrationTaskRunner", "runTask", 'D', "SideloadedPlaylistMigrationTaskRunner.java")).t("Migration attempt failed");
            try {
                return ((Integer) mci.a(b())).intValue();
            } catch (InterruptedException | ExecutionException e2) {
                ((agrc) ((agrc) ((agrc) g.b()).j(e2)).k("com/google/android/apps/youtube/music/sideloaded/migration/SideloadedPlaylistMigrationTaskRunner", "runTask", 'H', "SideloadedPlaylistMigrationTaskRunner.java")).t("Migration store operation failed");
                this.f.am(this.d, false);
                taf.j(c(), new ihw(16));
                return 1;
            }
        }
    }

    public final ListenableFuture b() {
        this.f.am(this.d, false);
        this.c++;
        klc klcVar = this.e;
        return ahno.as(ahno.ar(((qrx) klcVar.b).c(), new iqj(15), klcVar.c), new hqj(this, 20), this.b);
    }

    public final ListenableFuture c() {
        iqj iqjVar = new iqj(16);
        klc klcVar = this.e;
        return ahno.ar(((qrx) klcVar.b).a(iqjVar, klcVar.c), new ist(2), this.b);
    }
}
