package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ncs extends mep {
    public ncs() {
        super(334827261, nct.class, new mwt(16));
    }

    @Override // defpackage.mep
    public final long a() {
        return ncr.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nme.a : new nmg(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nmf.a;
    }
}
