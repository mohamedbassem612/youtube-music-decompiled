package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atno extends mep {
    public atno() {
        super(158796380, TextTypeOuterClass$TextType.class, null);
    }

    @Override // defpackage.mep
    public final long a() {
        return atnn.a;
    }

    @Override // defpackage.mep
    public final /* bridge */ /* synthetic */ met c(UpbMessage upbMessage) {
        return upbMessage == null ? atnm.a : new TextTypeOuterClass$TextType(upbMessage);
    }

    @Override // defpackage.mep
    public final UpbMiniTable d() {
        return atnp.a;
    }
}
