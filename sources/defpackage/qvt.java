package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvt extends qvs {
    public qwr k;
    public boolean l;

    private qvt(qvt qvtVar) {
        super(qvtVar);
        this.l = false;
        this.k = qvtVar.k;
        this.l = qvtVar.l;
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qvt(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qvt(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "ImageSegment{%s, source: %s, applyEffectsAfterCrop: %b}", super.toString(), this.k, Boolean.valueOf(this.l));
    }

    public qvt(qwr qwrVar) {
        this.l = false;
        this.k = qwrVar;
    }
}
