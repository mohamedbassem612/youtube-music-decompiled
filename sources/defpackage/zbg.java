package defpackage;

import android.os.Handler;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbg extends zay {
    public final /* synthetic */ zbh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(zbh zbhVar, Handler handler, zao zaoVar, Handler handler2) {
        super(handler, zaoVar, handler2);
        this.d = zbhVar;
    }

    final synchronized void b(zbj zbjVar) {
        zbh zbhVar = this.d;
        zbj zbjVar2 = zbhVar.b;
        if (zbjVar2 != null) {
            long jA = yno.A(zbjVar.o, zbjVar2.o);
            long j = zbjVar.p;
            long j2 = zbjVar2.p;
            long jA2 = yno.A(j, j2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (zbjVar.j == zbjVar2.j && zbjVar.k == zbjVar2.k && zbjVar.l == zbjVar2.l && ((jA == -9223372036854775807L || Math.abs(jA) < 50000) && ((j == j2 || (jA2 != -9223372036854775807L && Math.abs(jA2) < 50000)) && zbjVar.q == zbjVar2.q && zbjVar.n == zbjVar2.n && Objects.equals(zbjVar.e, zbjVar2.e) && zbjVar.s == zbjVar2.s))) {
                return;
            }
        }
        if (zbhVar.b == null) {
            zhq zhqVar = zhq.ABR;
        }
        zbhVar.b = zbjVar;
        this.c.post(new yts(this, zbjVar, 20));
    }
}
