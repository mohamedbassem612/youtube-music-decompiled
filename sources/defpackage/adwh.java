package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adwh {
    public final adwt a;
    public final admh b;
    public final advz c;
    public final avlh d;
    private final boolean e;

    public adwh(adwt adwtVar, admh admhVar, advz advzVar, avlh avlhVar) {
        adwtVar.getClass();
        admhVar.getClass();
        advzVar.getClass();
        this.a = adwtVar;
        this.b = admhVar;
        this.c = advzVar;
        this.e = false;
        this.d = avlhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adwh) {
            adwh adwhVar = (adwh) obj;
            if (awrc.c(this.a, adwhVar.a) && awrc.c(this.b, adwhVar.b) && awrc.c(this.c, adwhVar.c)) {
                boolean z = adwhVar.e;
                if (awrc.c(this.d, adwhVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        avlh avlhVar = this.d;
        return (((iHashCode * 31) + 1237) * 31) + (avlhVar == null ? 0 : avlhVar.hashCode());
    }

    public final String toString() {
        return "RecyclerViewSectionListControllerConfig(commonConfig=" + this.a + ", viewPool=" + this.b + ", binderFactory=" + this.c + ", disableNotifyDataSetChangedOnConfigurationChange=false, scrollToSectionEventFlowable=" + this.d + ')';
    }
}
