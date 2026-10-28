package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzw extends mep {
    public mzw() {
        super(1000, mzx.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return mzv.a;
    }

    @Override // defpackage.mep
    public final /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? njf.a : new njh(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return njg.a;
    }
}
