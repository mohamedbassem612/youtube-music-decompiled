package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atmt extends mep {
    public atmt() {
        super(525000035, atmu.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atms.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new atmu(upbMessage);
        }
        mep mepVar = atmu.d;
        return atmr.a;
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atmv.a;
    }
}
