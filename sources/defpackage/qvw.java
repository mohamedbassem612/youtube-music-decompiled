package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvw extends qvs {
    public final qwx k;
    public String l;
    public String r;

    private qvw(qvw qvwVar) {
        super(qvwVar);
        this.k = new qwx(qvwVar.k);
        this.l = qvwVar.l;
        this.r = qvwVar.r;
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qvw(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qvw(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "SkottieSegment{%s, source: %s, titleText: %s, subtitleText: %s}", super.toString(), this.k.toString(), this.l, this.r);
    }

    public qvw(qwx qwxVar) {
        this.k = qwxVar;
    }
}
