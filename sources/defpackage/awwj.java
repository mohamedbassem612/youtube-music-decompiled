package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwj implements awvz {
    public final awwp a;
    public final awto b;
    private final awtr c;
    private final awtr d;

    public awwj(awwp awwpVar, Throwable th) {
        this.a = awwpVar;
        awts awtsVar = awts.a;
        this.b = new awto(false, awtsVar);
        this.c = new awtr(th, awtsVar);
        this.d = new awtr(null, awtsVar);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            this.c.c(th);
            return;
        }
        if (th != thD) {
            Object objC = c();
            int iU = awro.u(objC);
            if (iU == -1) {
                f(th);
                return;
            }
            if (iU != 0) {
                if (iU != 1) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(String.valueOf(objC)));
                }
                objC.getClass();
                ((ArrayList) objC).add(th);
                return;
            }
            if (th != objC) {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(objC);
                arrayList.add(th);
                f(arrayList);
            }
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    @Override // defpackage.awvz
    public final awwp ku() {
        return this.a;
    }

    @Override // defpackage.awvz
    public final boolean kw() {
        return d() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + ']';
    }
}
