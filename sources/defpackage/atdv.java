package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atdv extends mep {
    public atdv() {
        super(472454357, atdw.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atdu.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atdt.a : new atdw(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atdx.a;
    }
}
