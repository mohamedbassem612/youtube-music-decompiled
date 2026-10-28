package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucx extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucw aucwVar = (aucw) obj;
        switch (aucwVar) {
            case MDE_COLOR_PRIMARIES_UNSPECIFIED:
                return anca.MDE_COLOR_PRIMARIES_UNSPECIFIED;
            case MDE_COLOR_PRIMARIES_BT709:
                return anca.MDE_COLOR_PRIMARIES_BT709;
            case MDE_COLOR_PRIMARIES_BT601_PAL:
                return anca.MDE_COLOR_PRIMARIES_BT601_PAL;
            case MDE_COLOR_PRIMARIES_BT601_NTSC:
                return anca.MDE_COLOR_PRIMARIES_BT601_NTSC;
            case MDE_COLOR_PRIMARIES_DISPLAY_P3:
                return anca.MDE_COLOR_PRIMARIES_DISPLAY_P3;
            case MDE_COLOR_PRIMARIES_BT2020:
                return anca.MDE_COLOR_PRIMARIES_BT2020;
            case MDE_COLOR_PRIMARIES_DCI_P3:
                return anca.MDE_COLOR_PRIMARIES_DCI_P3;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(aucwVar.toString()));
        }
    }
}
