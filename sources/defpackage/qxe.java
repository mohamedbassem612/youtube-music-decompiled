package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxe extends qwv {
    public static final /* synthetic */ int a = 0;
    private static final rbm b = rbm.c(qxe.class);

    public qxe(qwy qwyVar, Context context) {
        super(qwyVar, context);
    }

    public final int a() {
        d();
        qxd qxdVar = (qxd) this.f;
        qxdVar.getClass();
        return qxdVar.d;
    }

    public final int b() {
        d();
        qxd qxdVar = (qxd) this.f;
        qxdVar.getClass();
        return qxdVar.c;
    }

    public final Uri c() {
        return ((qwp) this.c).a;
    }

    @Override // defpackage.qwv
    public final void d() {
        if (this.f == null) {
            rjs.c();
            try {
                qxb qxbVar = new qxb();
                try {
                    Context context = this.d;
                    qxa qxaVar = new qxa();
                    try {
                        qwy qwyVar = this.c;
                        qxbVar.a(qwyVar, context);
                        Duration durationOfMillis = Duration.ofMillis(qxc.d(qxbVar, 0L));
                        Optional optionalB = qxc.b(qxbVar, 25, false);
                        if (true == optionalB.isPresent()) {
                            optionalB = Optional.ofNullable(Float.valueOf(Float.parseFloat((String) optionalB.get())));
                        }
                        float fFloatValue = ((Float) optionalB.orElse(Float.valueOf(0.0f))).floatValue();
                        int iA = qxc.a(qxbVar, 18, 1, true);
                        int iA2 = qxc.a(qxbVar, 19, 1, true);
                        int iA3 = qxc.a(qxbVar, 24, 0, true);
                        boolean z = iA3 == 90 || iA3 == 270;
                        int iA4 = qxc.a(qxbVar, 20, -1, false);
                        qxaVar.b(qwyVar, context);
                        if (true != z) {
                            iA2 = iA;
                        }
                        int i = true != z ? iA2 : iA;
                        agke agkeVarA = qxaVar.a();
                        qxd qxdVar = qxd.a;
                        this.f = new qxd(durationOfMillis, iA2, i, fFloatValue, iA4, agkeVarA);
                        qxaVar.close();
                        qxbVar.close();
                    } catch (Throwable th) {
                        try {
                            qxaVar.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        qxbVar.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e) {
                e = e;
                rbc rbcVar = new rbc(b, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Failed to parse video metadata", new Object[0]);
                this.f = qxd.a;
            } catch (UnsupportedOperationException unused) {
                this.f = qxd.a;
            } catch (RuntimeException e2) {
                e = e2;
                rbc rbcVar2 = new rbc(b, rbd.e);
                rbcVar2.a = e;
                rbcVar2.c();
                rbcVar2.a("Failed to parse video metadata", new Object[0]);
                this.f = qxd.a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxe) {
            return this.c.equals(((qxe) obj).c);
        }
        return false;
    }

    public final Duration f() {
        d();
        qxd qxdVar = (qxd) this.f;
        qxdVar.getClass();
        return qxdVar.b;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
