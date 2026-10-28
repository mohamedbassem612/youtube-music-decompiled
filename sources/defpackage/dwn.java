package defpackage;

import android.app.Activity;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwn implements dwu {
    private final dwu b;
    private final pj c;

    public dwn(dwu dwuVar) {
        pj pjVar = new pj((byte[]) null);
        this.b = dwuVar;
        this.c = pjVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    public final void a(Activity activity, Executor executor, axo axoVar) {
        awzc awzcVarAh;
        executor.getClass();
        axoVar.getClass();
        awyx awyxVar = new awyx(new ecl((dww) this.b, activity, (awoq) null, 1));
        awuq awuqVar = awvi.a;
        awwo awwoVar = axds.a;
        if (awwoVar.get(awwd.d) != null) {
            Objects.toString(awwoVar);
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(awwoVar)));
        }
        if (!awrc.c(awwoVar, awov.a)) {
            awzcVarAh = awyxVar;
            awzcVarAh = awrc.ah(awyxVar, awwoVar, 0, 0, 6);
        }
        awzcVarAh = awyxVar;
        pj pjVar = this.c;
        ?? r0 = pjVar.a;
        r0.lock();
        try {
            ?? r5 = pjVar.b;
            if (r5.get(axoVar) == null) {
                r5.put(axoVar, awro.t(awrc.K(awuw.f(executor)), null, 0, new bev(awzcVarAh, axoVar, (awoq) null, 5), 3));
            }
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b(axo axoVar) {
        axoVar.getClass();
        pj pjVar = this.c;
        ?? r0 = pjVar.a;
        r0.lock();
        try {
            ?? r3 = pjVar.b;
            awwd awwdVar = (awwd) r3.get(axoVar);
            if (awwdVar != null) {
                awwdVar.p(null);
            }
        } finally {
            r0.unlock();
        }
    }
}
