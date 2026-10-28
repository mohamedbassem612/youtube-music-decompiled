package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arbs implements weh {
    static final arbr a;
    public static final weq b;
    private final arbt c;

    static {
        arbr arbrVar = new arbr();
        a = arbrVar;
        b = arbrVar;
    }

    public arbs(arbt arbtVar) {
        this.c = arbtVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new arbq(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof arbs) && this.c.equals(((arbs) obj).c);
    }

    public String getAccessibilityFormattedAmount() {
        return this.c.e;
    }

    public Long getAmountMicros() {
        return Long.valueOf(this.c.f);
    }

    public String getFormattedAmount() {
        return this.c.d;
    }

    public String getVirtualCurrencyCode() {
        return this.c.g;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "VcBalanceEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
