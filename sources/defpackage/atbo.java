package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atbo extends mep {
    public atbo() {
        super(198239242, atbp.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atbn.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atbm.a : new atbp(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atbq.a;
    }
}
