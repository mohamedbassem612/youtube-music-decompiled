package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxi extends qxj {
    public final qwx a;

    private qxi(qxi qxiVar) {
        super(qxiVar);
        this.a = new qwx(qxiVar.a);
    }

    @Override // defpackage.qxj
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qxj clone() {
        return new qxi(this);
    }

    @Override // defpackage.qxj
    public final /* synthetic */ Object clone() {
        return new qxi(this);
    }

    @Override // defpackage.qxj
    public final String toString() {
        return String.format(Locale.US, "SkottieTransition{%s, skottieSource: %s}", super.toString(), this.a.toString());
    }

    public qxi(qwx qwxVar) {
        this.a = qwxVar;
    }
}
