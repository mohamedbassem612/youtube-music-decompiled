package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xda implements avlc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public xda(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [awoq, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((xdb) this.a).b();
            return;
        }
        if (i == 1) {
            boolean z = th instanceof CancellationException;
            Object obj = this.a;
            if (z) {
                ((aqi) obj).c();
                return;
            } else {
                ((aqi) obj).d(th);
                return;
            }
        }
        ?? r2 = this.a;
        if (i != 2) {
            r2.resumeWith(atqp.i(th));
            return;
        }
        avqv avqvVar = (avqv) r2;
        avqvVar.a.dispose();
        avqvVar.b.b(th);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awuc, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                ?? r2 = this.a;
                if (i != 2) {
                    avkz.l(r2, avmnVar);
                    return;
                } else {
                    ((avqv) r2).a.c(avmnVar);
                    return;
                }
            }
            avmnVar.getClass();
            rno rnoVar = new rno(avmnVar, 8);
            ((aqi) this.a).a(rnoVar, MoreExecutors.directExecutor());
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [awoq, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        int i = this.$cid;
        if (i == 0) {
            ((xdb) this.a).b();
            return;
        }
        if (i != 1) {
            ?? r2 = this.a;
            if (i != 2) {
                r2.resumeWith(awmy.a);
                return;
            }
            avqv avqvVar = (avqv) r2;
            avqvVar.a.dispose();
            avqvVar.b.kn();
            return;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles();
            Object obj = this.a;
            if (fileArrListFiles == null) {
                ((aqi) obj).b(agpi.a);
            } else {
                ((aqi) obj).b(rmp.v(fileArrListFiles));
            }
        } catch (RuntimeException unused) {
            ((aqi) this.a).b(agpi.a);
        }
    }
}
