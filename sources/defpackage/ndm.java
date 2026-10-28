package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndm extends mep {
    public ndm() {
        super(168772996, ndn.class, new mwt(20));
    }

    @Override // defpackage.mep
    public final long a() {
        return ndl.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nmt.a : new nmv(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nmu.a;
    }
}
