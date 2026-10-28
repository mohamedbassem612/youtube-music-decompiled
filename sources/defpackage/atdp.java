package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atdp extends mep {
    public atdp() {
        super(472454038, atdq.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atdo.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atdn.a : new atdq(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atdr.a;
    }
}
