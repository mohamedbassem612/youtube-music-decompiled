package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atlr extends mep {
    public atlr() {
        super(193804845, atls.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atlq.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atlp.a : new atls(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atlt.a;
    }
}
