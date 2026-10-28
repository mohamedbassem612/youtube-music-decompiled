package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzs {
    public final pzp a;
    public final boolean b;
    public final int c;
    private final pzz d;

    public pzs(int i, pzz pzzVar, pzp pzpVar, boolean z) {
        this.c = i;
        this.d = pzzVar;
        this.a = pzpVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzs) {
            pzs pzsVar = (pzs) obj;
            if (this.c == pzsVar.c && awrc.c(this.d, pzsVar.d) && awrc.c(this.a, pzsVar.a) && this.b == pzsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        pzp pzpVar = this.a;
        return (((((this.c * 31) + this.d.a) * 31) + (pzpVar == null ? 0 : pzpVar.hashCode())) * 31) + a.aj(this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotificationCreatedInfo(reason=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "RESURFACE" : "REPLACED";
        } else {
            str = "NEW";
        }
        sb.append((Object) str);
        sb.append(", processingMetadata=");
        sb.append(this.d);
        sb.append(", imageLoadingOutcome=");
        sb.append(this.a);
        sb.append(", hasUserFeedbackSurvey=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
