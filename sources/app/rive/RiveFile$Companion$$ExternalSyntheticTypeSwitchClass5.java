package app.rive;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveFile$Companion$$ExternalSyntheticTypeSwitchClass5 {
    public static /* synthetic */ int switchDispatch(Object obj, int i) {
        Objects.checkIndex(i, 3);
        if (obj == null) {
            return -1;
        }
        if (i != 0) {
            if (i == 1) {
            }
            return -2;
        }
        if (obj instanceof RiveFileSource.Bytes) {
            return 0;
        }
        if (obj instanceof RiveFileSource.RawRes) {
            return 1;
        }
        return -2;
    }
}
