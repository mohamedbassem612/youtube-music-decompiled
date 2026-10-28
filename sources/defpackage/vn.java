package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vn {
    private final StringBuilder a = new StringBuilder();
    private boolean b = false;
    private int c = 0;

    public final void a(String str) {
        int iIndexOf = str.indexOf("\n");
        if (iIndexOf == 0) {
            this.a.append('\n');
            this.b = true;
            if (str.length() > 1) {
                a(str.substring(1));
                return;
            }
            return;
        }
        if (iIndexOf > 0) {
            a(str.substring(0, iIndexOf));
            this.a.append('\n');
            this.b = true;
            int i = iIndexOf + 1;
            if (str.length() > i) {
                a(str.substring(i));
                return;
            }
            return;
        }
        if (this.b) {
            for (int i2 = 0; i2 < this.c; i2++) {
                this.a.append("  ");
            }
            this.b = false;
        }
        this.a.append(str);
    }

    public final void b(Object obj) {
        a(obj.toString());
    }

    public final void c() {
        int i = this.c;
        if (i == 0) {
            throw new IllegalStateException("Cannot set indent level below 0.");
        }
        this.c = i - 1;
    }

    public final void d() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
