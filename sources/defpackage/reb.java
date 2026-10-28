package defpackage;

import android.util.Size;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class reb implements AutoCloseable {
    public final rie a;
    public final rgm b;
    public boolean c = false;
    final /* synthetic */ rec d;
    private final rhg e;
    private final rhe f;

    public reb(rec recVar, rie rieVar, rgm rgmVar, rhg rhgVar, rhe rheVar) {
        this.d = recVar;
        this.a = rieVar;
        this.b = rgmVar;
        this.e = rhgVar;
        this.f = rheVar;
    }

    final void a() {
        if (this.c) {
            this.a.k();
            this.c = false;
        }
    }

    final boolean b(qxj qxjVar, int i, Size size) {
        int i2;
        Duration duration = rec.a;
        qvu qvuVar = qxjVar.e;
        if (qvuVar == null || qxjVar.f != null) {
            i2 = (qxjVar.f == null || qvuVar != null) ? 1 : 3;
        } else {
            i2 = 2;
        }
        rie rieVar = this.a;
        boolean z = false;
        boolean z2 = i2 == 1;
        int i3 = i2 != 1 ? 0 : i;
        Duration duration2 = qxjVar.c;
        synchronized (rieVar.b) {
            rieVar.r = i2;
            rieVar.m = i3;
            rieVar.o = size;
            rieVar.n = duration2;
            rieVar.d.g(duration2);
        }
        rhe rheVar = this.f;
        rec recVar = this.d;
        rheVar.i(recVar.d);
        if (qxjVar instanceof qxi) {
            qxi qxiVar = (qxi) qxjVar;
            Size size2 = (qxiVar.e == null || qxiVar.f == null) ? null : size;
            UUID uuid = qxjVar.b;
            qwx qwxVar = qxiVar.a;
            rdr rdrVar = (rdr) recVar.c;
            qzm qzmVar = new qzm(uuid, qwxVar, size2, z2, rdrVar.q.a);
            qzmVar.h(recVar.d);
            qzmVar.g(qxjVar.c);
            rhg rhgVar = this.e;
            String strF = rdrVar.q.a.F ? qzmVar.f("gl_skottie_renderer_calculator_runtime_options") : null;
            Optional optionalOfNullable = rhgVar.g;
            String str = rhgVar.j;
            String str2 = rhgVar.n;
            String str3 = rhgVar.o;
            rhgVar.g = Optional.of(qzmVar);
            rhgVar.j = "incoming_video_stream";
            rhgVar.n = "outgoing_video_stream";
            rhgVar.o = strF;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(agke.q(optionalOfNullable.get()));
            }
            qzg qzgVarJ = nqy.j((agke) optionalOfNullable.orElse(agpi.a), agke.q(qzmVar));
            z = ("incoming_video_stream".equals(str) && "outgoing_video_stream".equals(str2) && Objects.equals(strF, str3)) ? false : true;
            int iOrdinal = qzgVarJ.ordinal();
            if (iOrdinal == 0) {
                rhgVar.i = rhgVar.i(Optional.empty());
                rhgVar.o(rhgVar.i);
                return true;
            }
            if (iOrdinal == 1) {
                rhgVar.i = rhgVar.i(rhgVar.g);
                rhgVar.o(rhgVar.i);
                return true;
            }
            if (iOrdinal == 2) {
                rhgVar.o(rhgVar.c.g(rhgVar.i, new jkb(rhgVar, qzmVar, 18, null)));
                return true;
            }
            if (iOrdinal != 3) {
                return true;
            }
        }
        return z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rie rieVar = this.a;
        rieVar.k();
        rieVar.e(null);
        this.b.close();
        rieVar.close();
    }
}
