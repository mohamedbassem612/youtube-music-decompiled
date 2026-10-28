package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atbu extends mep {
    public atbu() {
        super(158796298, atbv.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atbt.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atbs.a : new atbv(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atbw.a;
    }
}
