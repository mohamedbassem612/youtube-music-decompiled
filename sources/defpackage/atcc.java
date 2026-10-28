package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atcc extends mep {
    public atcc() {
        super(281539545, atcd.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atcb.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new atcd(upbMessage);
        }
        mep mepVar = atcd.d;
        return atca.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atce.a;
    }
}
