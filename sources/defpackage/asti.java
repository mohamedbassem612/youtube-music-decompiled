package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asti extends mep {
    public asti() {
        super(525000056, astj.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return asth.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? astg.a : new astj(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return astk.a;
    }
}
