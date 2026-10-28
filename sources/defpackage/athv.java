package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class athv extends mep {
    public athv() {
        super(381326004, athw.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return athu.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atht.a : new athw(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return athx.a;
    }
}
