package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abui {
    public byte a;
    public Object b;
    private boolean c;

    public final abuk a() {
        if (this.a == 1 && this.b != null) {
            return new abuk((abuj) this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" prefetchPolicy");
        }
        if (this.a == 0) {
            sb.append(" wrappedSequence");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zki] */
    public final abna c() {
        ?? r0 = this.b;
        if (r0 == 0) {
            throw new IllegalStateException("Property \"mediaView\" has not been set");
        }
        if (this.a == 1) {
            return new abna(r0, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" mediaView");
        }
        if (this.a == 0) {
            sb.append(" broadcastMediaViewChangeImmediately");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    public final void e(zki zkiVar) {
        if (zkiVar == null) {
            throw new NullPointerException("Null mediaView");
        }
        this.b = zkiVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final sow f() {
        ?? r0;
        if (this.a == 3 && (r0 = this.b) != 0) {
            return new sow(this.c, r0);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" learnMoreCtaHidden");
        }
        if ((this.a & 2) == 0) {
            sb.append(" learnMoreCtaEnabled");
        }
        if (this.b == null) {
            sb.append(" learnMoreText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }

    public final void h(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null learnMoreText");
        }
        this.b = charSequence;
    }
}
