package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucw extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucv aucvVar = (aucv) obj;
        int iOrdinal = aucvVar.ordinal();
        if (iOrdinal == 0) {
            return anby.MDE_ANDROID_BITRATE_MODE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return anby.MDE_ANDROID_BITRATE_MODE_CQ;
        }
        if (iOrdinal == 2) {
            return anby.MDE_ANDROID_BITRATE_MODE_VBR;
        }
        if (iOrdinal == 3) {
            return anby.MDE_ANDROID_BITRATE_MODE_CBR;
        }
        if (iOrdinal == 4) {
            return anby.MDE_ANDROID_BITRATE_MODE_CBR_FD;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aucvVar.toString()));
    }
}
