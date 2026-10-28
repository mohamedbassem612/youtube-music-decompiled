package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aecn extends aecu {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final boolean e;
    private final Runnable f;

    private aecn(String str, String str2, int i, int i2, boolean z, Runnable runnable) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = runnable;
    }

    @Override // defpackage.aecu
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aecu
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aecu
    public final Runnable c() {
        return this.f;
    }

    @Override // defpackage.aecu
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aecu
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aecu) {
            aecu aecuVar = (aecu) obj;
            if (this.a.equals(aecuVar.d()) && this.b.equals(aecuVar.e()) && this.c == aecuVar.b() && this.d == aecuVar.a() && this.e == aecuVar.f()) {
                Runnable runnable = this.f;
                if (runnable == null) {
                    if (aecuVar.c() == null) {
                        return true;
                    }
                } else if (runnable.equals(aecuVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aecu
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Runnable runnable = this.f;
        int iHashCode2 = runnable == null ? 0 : runnable.hashCode();
        int i = this.c;
        return (((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ iHashCode2;
    }

    public final String toString() {
        return "ScrollToSectionEvent{sectionListId=" + this.a + ", targetSectionId=" + this.b + ", verticalOffsetDp=" + this.c + ", sectionItemScrollPosition=" + this.d + ", disableScrollingOnUserScroll=" + this.e + ", scrolledToSectionCallback=" + String.valueOf(this.f) + '}';
    }

    public /* synthetic */ aecn(String str, String str2, int i, int i2, boolean z, Runnable runnable, aecm aecmVar) {
        this(str, str2, i, i2, z, runnable);
    }
}
