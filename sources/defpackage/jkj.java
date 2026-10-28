package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkj {
    public String a;
    private String b;
    private boolean c;
    private byte d;

    public final jkk a() {
        String str;
        String str2;
        if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
            return new jkk(str, str2, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" label");
        }
        if (this.b == null) {
            sb.append(" reloadContinuation");
        }
        if (this.d == 0) {
            sb.append(" isSelected");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.a = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null reloadContinuation");
        }
        this.b = str;
    }

    public final iar e() {
        String str;
        String str2;
        if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
            return new iar(str, str2, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.d == 0) {
            sb.append(" isAlbum");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }
}
