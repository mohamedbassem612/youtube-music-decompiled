package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class athm extends atok implements mes {
    public boolean d;

    public athm(UpbMessage upbMessage) {
        super(upbMessage, (byte[]) null);
        this.d = false;
    }

    public final void aR() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }
}
