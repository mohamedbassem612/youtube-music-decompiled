package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndf extends mep {
    public ndf() {
        super(408993103, ndg.class, new mwt(19));
    }

    @Override // defpackage.mep
    public final long a() {
        return nde.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nms(upbMessage);
        }
        int i = nms.l;
        return nmq.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nmr.a;
    }
}
