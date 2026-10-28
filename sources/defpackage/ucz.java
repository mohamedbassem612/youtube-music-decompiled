package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucz extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucy aucyVar = (aucy) obj;
        switch (aucyVar) {
            case MDE_COLOR_TRANSFER_UNSPECIFIED:
                return ancc.MDE_COLOR_TRANSFER_UNSPECIFIED;
            case MDE_COLOR_TRANSFER_LINEAR:
                return ancc.MDE_COLOR_TRANSFER_LINEAR;
            case MDE_COLOR_TRANSFER_SDR:
                return ancc.MDE_COLOR_TRANSFER_SDR;
            case MDE_COLOR_TRANSFER_ST2084:
                return ancc.MDE_COLOR_TRANSFER_ST2084;
            case MDE_COLOR_TRANSFER_HLG:
                return ancc.MDE_COLOR_TRANSFER_HLG;
            case MDE_COLOR_TRANSFER_GAMMA22:
                return ancc.MDE_COLOR_TRANSFER_GAMMA22;
            case MDE_COLOR_TRANSFER_SMPTE240M:
                return ancc.MDE_COLOR_TRANSFER_SMPTE240M;
            case MDE_COLOR_TRANSFER_SRGB:
                return ancc.MDE_COLOR_TRANSFER_SRGB;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(aucyVar.toString()));
        }
    }
}
