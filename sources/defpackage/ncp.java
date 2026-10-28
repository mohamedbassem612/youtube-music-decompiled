package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ncp extends mep {
    public ncp() {
        super(158796345, ncq.class, new mwt(15));
    }

    @Override // defpackage.mep
    public final long a() {
        return nco.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nmb.a : new nmd(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nmc.a;
    }
}
