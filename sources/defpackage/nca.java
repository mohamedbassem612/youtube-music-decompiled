package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nca extends mep {
    public nca() {
        super(381326004, ncb.class, new nbs(3));
    }

    @Override // defpackage.mep
    public final long a() {
        return nbz.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nlm.a : new nlo(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nln.a;
    }
}
