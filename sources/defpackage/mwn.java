package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwn extends mep {
    public mwn() {
        super(168774763, mwo.class, new mwt(1));
    }

    @Override // defpackage.mep
    public final long a() {
        return mwm.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nfo(upbMessage);
        }
        int i = nfo.l;
        return nfm.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nfn.a;
    }
}
