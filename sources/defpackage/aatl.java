package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatl implements aarw {
    private final aaqn a;
    private final aarv b;
    private final aamw c;
    private final aatr d;
    private final Object e = new Object();
    private boolean f = false;

    public aatl(aaqn aaqnVar, aamw aamwVar, aarv aarvVar, aatr aatrVar) {
        this.a = aaqnVar;
        this.b = aarvVar;
        this.c = aamwVar;
        this.d = aatrVar;
    }

    @Override // defpackage.aarw
    public final void a(int i) {
        synchronized (this.e) {
            this.f = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.e) {
            if (!this.f) {
                aaqn aaqnVar = this.a;
                aaew aaewVarD = aaqnVar.d();
                aalf aalfVarG = aaqnVar.g();
                if (aaewVarD != null && aalfVarG != null) {
                    try {
                        try {
                            aarv aarvVar = this.b;
                            aamw aamwVar = this.c;
                            String str = aamwVar.a;
                            aarvVar.b(str, 0L, 0.0d, false);
                            this.d.f(aaewVarD, aalfVarG, aamwVar);
                            aarvVar.a(str, new aamv());
                        } catch (Exception e) {
                            zvp.b(zvn.b, zvm.C, "Thumbnail save exception: ".concat(String.valueOf(e.getMessage())), e);
                            this.b.c(this.c.a, new aarx(true, "Unknown error encountered while saving the thumbnail.", e, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON), new aamv());
                        }
                    } catch (aarx e2) {
                        this.b.c(this.c.a, e2, new aamv());
                    } catch (SQLiteException e3) {
                        this.b.c(this.c.a, new aarx(true, "SQL error encountered while saving the thumbnail.", e3, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON), new aamv());
                    }
                }
            }
        }
    }
}
