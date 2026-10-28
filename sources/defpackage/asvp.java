package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asvp extends mep {
    public asvp() {
        super(168774763, asvq.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return asvo.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new asvq(upbMessage);
        }
        mep mepVar = asvq.d;
        return asvn.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return asvr.a;
    }
}
