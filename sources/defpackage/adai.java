package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adai extends acxm {
    public opl d;
    public final ElementsRetainedState e;

    public adai(akrn akrnVar) {
        ElementsRetainedState elementsRetainedState = new ElementsRetainedState();
        super(akrnVar);
        this.e = elementsRetainedState;
    }

    @Override // defpackage.acxm
    public final void d() {
        this.e.close();
        f();
    }

    @Override // defpackage.acxm
    public final void e() {
        f();
    }

    public final void f() {
        opl oplVar = this.d;
        if (oplVar != null) {
            try {
                try {
                    oplVar.close();
                    this.d = null;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                this.d = null;
                throw th;
            }
        }
    }
}
