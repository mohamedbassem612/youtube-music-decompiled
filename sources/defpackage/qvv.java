package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvv extends qvs {
    private qvv() {
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qvv(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qvv(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "ShapeSegment{%s}", super.toString());
    }

    private qvv(qvv qvvVar) {
        super(qvvVar);
    }
}
