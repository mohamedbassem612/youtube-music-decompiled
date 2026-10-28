package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yru {
    final yqs a;
    final wlo b;
    final String c;
    final long d;
    final /* synthetic */ yrv e;
    final int f;

    public yru(yrv yrvVar, yqs yqsVar, wlo wloVar, int i, String str) {
        this.e = yrvVar;
        this.a = yqsVar;
        this.b = wloVar;
        this.f = i;
        this.c = str;
        this.d = yrvVar.c.b();
    }

    public static /* synthetic */ awmy a(ysf ysfVar, yqs yqsVar, tjk tjkVar, Throwable th) {
        if (th instanceof CancellationException) {
            if (ysfVar.f.get()) {
                yqsVar.a().cancel(false);
                yqsVar.c();
            } else {
                ysfVar.f(new ysa(th), tjkVar);
            }
        } else if (th != null) {
            ysfVar.f(th, tjkVar);
        }
        return awmy.a;
    }
}
