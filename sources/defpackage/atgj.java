package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atgj extends mep {
    public atgj() {
        super(405486368, atgk.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atgi.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atgh.a : new atgk(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atgl.a;
    }
}
