package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcn implements Serializable, mcp {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.mcp
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return mcp.class;
    }

    @Override // defpackage.mcp
    public final int b() {
        return 1000;
    }

    @Override // defpackage.mcp
    public final int c() {
        return 1;
    }

    @Override // defpackage.mcp
    public final int d() {
        return 1;
    }

    @Override // defpackage.mcp
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcp) {
            mcp mcpVar = (mcp) obj;
            mcpVar.d();
            mcpVar.e();
            mcpVar.a();
            mcpVar.b();
            mcpVar.c();
            mcpVar.f();
            if (a.equals(mcpVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mcp
    public final long f() {
        return 1L;
    }

    @Override // defpackage.mcp
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
