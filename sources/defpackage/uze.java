package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uze {
    public Object a;
    public Object b;
    public Object c;
    public Object d = Duration.ZERO;

    public uze(byte[] bArr) {
    }

    public final uzf a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new uzf((agke) obj2, (agke) obj, (apji) this.c, (apji) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" cameraToolbeltButtonRenderers");
        }
        if (this.b == null) {
            sb.append(" editorToolbeltButtonRenderers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null cameraToolbeltButtonRenderers");
        }
        this.a = agkeVar;
    }

    public final void c(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null editorToolbeltButtonRenderers");
        }
        this.b = agkeVar;
    }
}
