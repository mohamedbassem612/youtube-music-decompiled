package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eus implements euj {
    public final fbg a;

    public eus(InputStream inputStream, ewv ewvVar) {
        fbg fbgVar = new fbg(inputStream, ewvVar);
        this.a = fbgVar;
        fbgVar.mark(5242880);
    }

    @Override // defpackage.euj
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.euj
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        fbg fbgVar = this.a;
        fbgVar.reset();
        return fbgVar;
    }
}
