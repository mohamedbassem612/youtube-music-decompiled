package defpackage;

import android.view.Choreographer;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aon implements ahy {
    public final Choreographer b;
    private final aok c;

    public aon(Choreographer choreographer, aok aokVar) {
        this.b = choreographer;
        this.c = aokVar;
    }

    @Override // defpackage.ahy
    public final Object a(awqg awqgVar, awoq awoqVar) {
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        aom aomVar = new aom(awudVar, awqgVar);
        aok aokVar = this.c;
        Choreographer choreographer = aokVar.b;
        Choreographer choreographer2 = this.b;
        if (awrc.c(choreographer, choreographer2)) {
            synchronized (aokVar.d) {
                aokVar.e.add(aomVar);
                if (!aokVar.g) {
                    aokVar.g = true;
                    choreographer.postFrameCallback(aokVar.h);
                }
            }
            awudVar.b(new aol(aokVar, aomVar, 1));
        } else {
            choreographer2.postFrameCallback(aomVar);
            awudVar.b(new aol(this, aomVar, 0));
        }
        return awudVar.j();
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final /* synthetic */ awot getKey() {
        return ahy.a;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        awouVar.getClass();
        return atqq.e(this, awouVar);
    }
}
