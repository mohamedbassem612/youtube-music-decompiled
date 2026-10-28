package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atfw extends mep {
    public atfw() {
        super(191923252, atfx.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atfv.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new atfx(upbMessage);
        }
        mep mepVar = atfx.d;
        return atfu.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atfy.a;
    }
}
