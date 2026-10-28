package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zak {
    public Object a;
    public Object b;

    public zak(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
    }

    public final void a(wej wejVar) {
        if (wejVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.b = wejVar;
    }

    public final vja b() {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: stickerAsset");
        }
        return new vja((vbu) obj, (Optional) this.b);
    }

    public final void c(vbu vbuVar) {
        if (vbuVar == null) {
            throw new NullPointerException("Null stickerAsset");
        }
        this.a = vbuVar;
    }

    public final void d(Float f) {
        this.b = Optional.of(f);
    }

    public final url e() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new url((agke) obj2, (agke) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" horizontalGuidelineStates");
        }
        if (this.b == null) {
            sb.append(" verticalGuidelineStates");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null horizontalGuidelineStates");
        }
        this.a = agkeVar;
    }

    public final void g(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null verticalGuidelineStates");
        }
        this.b = agkeVar;
    }

    public zak() {
    }
}
