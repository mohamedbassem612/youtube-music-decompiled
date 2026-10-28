package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atmn extends mep {
    public atmn() {
        super(170382688, atmo.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atmm.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atml.a : new atmo(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atmp.a;
    }
}
