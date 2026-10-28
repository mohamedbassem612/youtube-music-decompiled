package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxh extends qxj {
    private qxh() {
    }

    @Override // defpackage.qxj
    /* JADX INFO: renamed from: a */
    public final qxj clone() {
        return new qxh(this);
    }

    @Override // defpackage.qxj
    public final /* synthetic */ Object clone() {
        return new qxh(this);
    }

    @Override // defpackage.qxj
    public final String toString() {
        return String.format(Locale.US, "AudioFadeTransition{%s}", super.toString());
    }

    private qxh(qxh qxhVar) {
        super(qxhVar);
    }
}
