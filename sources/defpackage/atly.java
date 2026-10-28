package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atly extends mep {
    public atly() {
        super(197633010, atlz.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atlx.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atlw.a : new atlz(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atmh.a;
    }
}
