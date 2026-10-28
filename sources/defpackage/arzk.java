package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arzk extends mew implements mes {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzk(int i, byte[] bArr) {
        super(artj.a);
        this.$cid = i;
    }

    @Override // defpackage.mew
    public final void bJ() {
        int i = this.$cid;
        if (i != 0 && i != 1) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzk(UpbMessage upbMessage, int i, byte[] bArr) {
        super(upbMessage);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzk(int i) {
        super(arzj.a);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzk(UpbMessage upbMessage, int i) {
        super(upbMessage);
        this.$cid = i;
    }
}
