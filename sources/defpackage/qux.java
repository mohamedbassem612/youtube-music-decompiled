package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qux extends quu {
    public final qwx k;
    public String l;
    public String m;

    private qux(qux quxVar) {
        super(quxVar);
        this.k = new qwx(quxVar.k);
        this.l = quxVar.l;
        this.m = quxVar.m;
    }

    @Override // defpackage.qus
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qus clone() {
        return new qux(this);
    }

    @Override // defpackage.qus
    public final /* synthetic */ Object clone() {
        return new qux(this);
    }

    public final Uri p() {
        return this.k.d;
    }

    public qux(qwx qwxVar) {
        this.k = qwxVar;
    }
}
