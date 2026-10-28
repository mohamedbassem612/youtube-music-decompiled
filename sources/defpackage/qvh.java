package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvh extends qvc {
    private qvh() {
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qvh(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "segmenter_effect";
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qvh(this);
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (super.e(obj)) {
            return obj instanceof qvh;
        }
        return false;
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return qvh.class;
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "SegmenterEffect{%s}", super.toString());
    }

    private qvh(qvh qvhVar) {
        super(qvhVar);
    }
}
