package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvt {
    public avlh a;
    public avlh b;
    public acvr c;
    public acvr d;
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public boolean g;
    public boolean h;
    public byte i;

    public final acvu a() {
        avlh avlhVar;
        avlh avlhVar2;
        acvr acvrVar;
        acvr acvrVar2;
        if (this.i == 31 && (avlhVar = this.a) != null && (avlhVar2 = this.b) != null && (acvrVar = this.c) != null && (acvrVar2 = this.d) != null) {
            return new acvu(avlhVar, avlhVar2, acvrVar, acvrVar2, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" captionPositionFlowable");
        }
        if (this.b == null) {
            sb.append(" aspectViewType");
        }
        if ((this.i & 1) == 0) {
            sb.append(" desiredAspectRatio");
        }
        if (this.c == null) {
            sb.append(" landscapeVideoLayout");
        }
        if (this.d == null) {
            sb.append(" portraitVideoLayout");
        }
        if ((this.i & 2) == 0) {
            sb.append(" forceAspectFitOnTablet");
        }
        if ((this.i & 4) == 0) {
            sb.append(" fitVideoForWideDevice");
        }
        if ((this.i & 8) == 0) {
            sb.append(" enableAutocropInLandscape");
        }
        if ((this.i & 16) == 0) {
            sb.append(" enableAutocropInPortrait");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
