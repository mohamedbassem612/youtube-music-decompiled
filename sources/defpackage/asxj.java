package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxj extends asxl implements mes {
    public boolean d;

    public asxj(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }

    @Override // defpackage.asxl
    public final void aR() {
        if (this.e) {
            if (this.d) {
                this.d = false;
                bG();
            }
            bO(8, 1);
            bR(true != a ? 12 : 16, this.f);
            this.e = false;
        }
    }
}
