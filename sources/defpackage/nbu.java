package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nbu extends mep {
    public nbu() {
        super(405782140, nbv.class, new nbs(0));
    }

    @Override // defpackage.mep
    public final long a() {
        return nbt.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? nlf.a : new nlh(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return nlg.a;
    }
}
