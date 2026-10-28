package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asto extends mep {
    public asto() {
        super(525000006, astp.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return astn.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? astm.a : new astp(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return astq.a;
    }
}
