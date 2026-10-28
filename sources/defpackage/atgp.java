package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atgp extends mep {
    public atgp() {
        super(386544496, atgq.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atgo.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atgn.a : new atgq(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atgr.a;
    }
}
