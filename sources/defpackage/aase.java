package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aase {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    private boolean e;
    private byte f;

    public aase(hxb hxbVar) {
        this.c = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = hxbVar.b;
        this.c = hxbVar.c;
        this.a = hxbVar.d;
        this.b = hxbVar.e;
        this.d = hxbVar.f;
        this.f = (byte) 1;
    }

    public final aasg a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (this.f == 1 && (obj = this.a) != null && (obj2 = this.b) != null && (obj3 = this.c) != null && (obj4 = this.d) != null) {
            return new aasd((aamw) obj, (aasf) obj2, this.e, (aogv) obj3, (aamg) obj4, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" transfer");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.f == 0) {
            sb.append(" usingDataToDownloadStreams");
        }
        if (this.c == null) {
            sb.append(" failureReason");
        }
        if (this.d == null) {
            sb.append(" mediaStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aamg aamgVar) {
        if (aamgVar == null) {
            throw new NullPointerException("Null mediaStatus");
        }
        this.d = aamgVar;
    }

    public final void c(boolean z) {
        this.e = z;
        this.f = (byte) 1;
    }

    public final hxb d() {
        if (this.f != 1) {
            throw new IllegalStateException("Missing required properties: watchStartPaused");
        }
        boolean z = this.e;
        Object obj = this.c;
        Object obj2 = this.a;
        return new hxb(z, (Optional) obj, (Optional) obj2, (Optional) this.b, (Optional) this.d);
    }

    public final void e(boolean z) {
        this.a = Optional.of(Boolean.valueOf(z));
    }

    public final void f(xir xirVar) {
        this.b = Optional.of(xirVar);
    }

    public final void g(boolean z) {
        this.e = z;
        this.f = (byte) 1;
    }

    public aase(byte[] bArr) {
        this.c = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
    }
}
