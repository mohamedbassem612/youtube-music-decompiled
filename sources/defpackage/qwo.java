package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import j$.time.Duration;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwo extends qwv {
    private static final rbm g = rbm.c(qwo.class);
    static final Duration a = Duration.ZERO;
    static final agke b = agpi.a;

    public static qwo b(Uri uri, Context context) {
        return new qwo(nqx.f(uri), context);
    }

    public static qwo c(String str, Context context) {
        return b(Uri.parse(str), context);
    }

    public final Uri a() {
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
                        Duration durationOfMillis = Duration.ofMillis(qxc.d(qxbVar, a.toMillis()));
                        int iA = Build.VERSION.SDK_INT >= 31 ? qxc.a(qxbVar, 38, -1, false) : -1;
                        qxaVar.b(qwyVar, context);
                        agke agkeVarA = qxaVar.a();
                        qwn qwnVar = qwn.a;
                        this.f = new qwn(durationOfMillis, iA, agkeVarA);
                        qxaVar.close();
                        qxbVar.close();
                    } catch (Throwable th) {
                        try {
                            qxaVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        qxbVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e) {
                e = e;
                rbc rbcVar = new rbc(g, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Failed to parse audio metadata", new Object[0]);
                this.f = qwn.a;
            } catch (UnsupportedOperationException unused) {
                this.f = qwn.a;
            } catch (RuntimeException e2) {
                e = e2;
                rbc rbcVar2 = new rbc(g, rbd.e);
                rbcVar2.a = e;
                rbcVar2.c();
                rbcVar2.a("Failed to parse audio metadata", new Object[0]);
                this.f = qwn.a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qwo) {
            return this.c.equals(((qwo) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
