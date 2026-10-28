package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxg extends asxi implements mes {
    public boolean d;

    public asxg() {
        this.d = false;
    }

    public final void aR() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public final asxi aS() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        asxi asxiVar = new asxi(this.b);
        if (this.f != null) {
            asxiVar.f = this.f;
        }
        if (this.g != null) {
            asxiVar.g = this.g;
        }
        if (this.e != null) {
            asxiVar.e = this.e;
        }
        return asxiVar;
    }

    public asxg(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }
}
