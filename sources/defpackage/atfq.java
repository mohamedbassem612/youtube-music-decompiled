package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atfq extends mep {
    public atfq() {
        super(194116769, atfr.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atfp.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atfo.a : new atfr(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atfs.a;
    }
}
