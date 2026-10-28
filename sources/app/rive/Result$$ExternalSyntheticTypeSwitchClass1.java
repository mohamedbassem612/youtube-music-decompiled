package app.rive;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Result$$ExternalSyntheticTypeSwitchClass1 {
    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public static /* synthetic */ int switchDispatch(Object obj, int i) {
        Objects.checkIndex(i, 4);
        if (obj == null) {
            return -1;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                }
                return -2;
            }
            if (obj instanceof Result.Success) {
                return 2;
            }
            return -2;
        }
        if (obj instanceof Result.Loading) {
            return 0;
        }
        if (obj instanceof Result.Error) {
            return 1;
        }
        if (obj instanceof Result.Success) {
            return 2;
        }
        return -2;
    }
}
