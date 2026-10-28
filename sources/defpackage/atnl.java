package defpackage;

import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atnl extends atnq implements mes {
    private boolean d = false;

    public final TextTypeOuterClass$TextType aR() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = new TextTypeOuterClass$TextType(this.b);
        if (this.f != null) {
            textTypeOuterClass$TextType.f = this.f;
            textTypeOuterClass$TextType.e = this.e;
        }
        if (this.g != null) {
            textTypeOuterClass$TextType.g = this.g;
        }
        asxe asxeVar = this.h;
        textTypeOuterClass$TextType.aS();
        return textTypeOuterClass$TextType;
    }

    @Override // defpackage.atnq
    public final void aS() {
        if (this.e) {
            if (this.d) {
                this.d = false;
                bG();
            }
            bO(8, 1);
            bR(true != a ? 12 : 24, this.f);
            this.e = false;
        }
    }

    public final void aT(asxe asxeVar) {
        if (asxeVar != this.f) {
            this.f = asxeVar;
            this.e = true;
        }
    }
}
