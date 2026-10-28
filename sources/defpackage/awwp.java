package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwp extends axdn implements awvz {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objF = f();
        objF.getClass();
        boolean z = true;
        for (axdp axdpVarG = (axdp) objF; !awrc.c(axdpVarG, this); axdpVarG = axdpVarG.g()) {
            if ((axdpVarG instanceof awwg) && !axdpVarG.kx()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(axdpVarG);
                z = false;
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.awvz
    public final boolean kw() {
        return true;
    }

    @Override // defpackage.axdp
    public final String toString() {
        return awuv.a ? c("Active") : super.toString();
    }

    @Override // defpackage.awvz
    public final awwp ku() {
        return this;
    }
}
