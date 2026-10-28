package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class oso {
    private final ElementsServices a;
    private oph b;
    private final int c;
    private final Context d;
    private Runnable e;
    private opl f;
    private ooy g;

    public oso(ElementsServices elementsServices, Context context, int i) {
        this.a = elementsServices;
        this.c = i;
        this.d = context;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oov] */
    private final opl e() {
        opl oplVar = this.f;
        if (oplVar != null) {
            return oplVar;
        }
        oph ophVar = this.b;
        if (ophVar == null) {
            ophVar = oph.a;
        }
        opl oplVarA = opl.a(this.a.L().io().b(ophVar));
        this.f = oplVarA;
        return oplVarA;
    }

    public final ooy a() {
        if (this.g == null) {
            ooy ooyVar = new ooy(this.d, 2);
            this.g = ooyVar;
            Runnable runnable = this.e;
            if (runnable != null) {
                ooyVar.c = runnable;
            }
        }
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, oov] */
    public final void b() {
        this.e = null;
        ooy ooyVar = this.g;
        if (ooyVar != null) {
            ooyVar.n();
        }
        opl oplVar = this.f;
        if (oplVar != null) {
            try {
                oplVar.close();
            } catch (Exception e) {
                this.a.L().io().c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close NodeTreeProcessor", e);
            } finally {
                this.f = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, oov] */
    public final void c(byte[] bArr, ElementsRetainedState elementsRetainedState, oph ophVar) {
        if (!Objects.equals(this.b, ophVar)) {
            this.b = ophVar;
            opl oplVar = this.f;
            if (oplVar != null) {
                try {
                    try {
                        oplVar.close();
                        this.f = null;
                    } catch (Exception e) {
                        this.a.L().io().c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close NodeTreeProcessor", e);
                        this.f = null;
                    }
                } catch (Throwable th) {
                    this.f = null;
                    throw th;
                }
            }
        }
        e().c().s(bArr, View.MeasureSpec.makeMeasureSpec(this.c, 1073741824), 0, elementsRetainedState);
        a().z(e().b());
    }

    public final void d(Runnable runnable) {
        this.e = runnable;
        ooy ooyVar = this.g;
        if (ooyVar != null) {
            ooyVar.c = runnable;
        }
    }
}
