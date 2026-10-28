package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aszl extends mep {
    public aszl() {
        super(512985100, aszm.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return aszk.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new aszm(upbMessage);
        }
        mep mepVar = aszm.d;
        return aszj.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return aszn.a;
    }
}
