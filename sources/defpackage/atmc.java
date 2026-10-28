package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atmc extends mep {
    public atmc() {
        super(428067722, atmd.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atmb.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new atmd(upbMessage);
        }
        mep mepVar = atmd.d;
        return atma.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atme.a;
    }
}
