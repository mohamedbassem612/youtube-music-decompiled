package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atbe extends mep {
    public atbe() {
        super(444964488, atbf.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atbd.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atbb.a : new atbf(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atbg.a;
    }
}
