package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aryq extends mep {
    public aryq() {
        super(999, aryh.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return aryp.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new aryh(upbMessage);
        }
        int i = aryh.d;
        return aryg.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return aryi.a;
    }
}
