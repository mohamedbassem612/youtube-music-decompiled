package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atcv extends mep {
    public atcv() {
        super(168774585, atcw.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atcu.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atct.a : new atcw(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atcx.a;
    }
}
