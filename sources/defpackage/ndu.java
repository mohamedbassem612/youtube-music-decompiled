package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndu extends mep {
    public ndu() {
        super(525000030, ndv.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return ndt.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nne.a : new nng(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nnf.a;
    }
}
