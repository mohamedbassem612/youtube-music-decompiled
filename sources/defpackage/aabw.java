package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aabw implements agek {
    @Override // defpackage.agek
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        aaby aabyVar = (aaby) obj;
        switch (aabyVar.ordinal()) {
            case 0:
                return aacc.USER_CHANGED;
            case 1:
                return aacc.LOCALE_CHANGED;
            case 2:
                return aacc.FCM_TOKEN_CHANGED;
            case 3:
                return aacc.OS_SETTINGS_CHANGED;
            case 4:
                return aacc.DEVICE_START;
            case 5:
                return aacc.APP_UPDATED;
            case 6:
                return aacc.TIMEZONE_CHANGED;
            case 7:
                return aacc.EOM_STATE_CHANGED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aabyVar))));
        }
    }
}
