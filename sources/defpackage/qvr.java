package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvr extends qvs {
    public qvr() {
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qvr(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qvr(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "EmptySegment{%s}", super.toString());
    }

    private qvr(qvr qvrVar) {
        super(qvrVar);
    }
}
