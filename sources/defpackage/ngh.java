package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ngh implements mex {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ngh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.mex
    public final met a(UpbMessage upbMessage) {
        switch (this.$cid) {
            case 0:
                return new nhb(upbMessage);
            case 1:
                return new ngd(upbMessage);
            case 2:
                return new nhd(upbMessage);
            case 3:
                return new ngk(upbMessage);
            case 4:
                return new nhg(upbMessage);
            case 5:
                return new ngm(upbMessage);
            case 6:
                return new nii(upbMessage);
            case 7:
                return new nkl(upbMessage);
            case 8:
                return new nma(upbMessage);
            case 9:
                return new mew(upbMessage);
            case 10:
                return new nop(upbMessage);
            case 11:
                return new ataq(upbMessage);
            default:
                return new atgs(upbMessage, (char[]) null);
        }
    }
}
