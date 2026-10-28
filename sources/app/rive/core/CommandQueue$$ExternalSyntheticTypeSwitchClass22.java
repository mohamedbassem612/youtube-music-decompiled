package app.rive.core;

import app.rive.ViewModelInstanceSource;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CommandQueue$$ExternalSyntheticTypeSwitchClass22 {
    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    /* JADX WARN: Code duplicated, block: B:23:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0033  */
    public static /* synthetic */ int switchDispatch(Object obj, int i) {
        Objects.checkIndex(i, 6);
        if (obj == null) {
            return -1;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                        }
                        return -2;
                    }
                    if (obj instanceof ViewModelInstanceSource.ReferenceListItem) {
                        return 4;
                    }
                    return -2;
                }
                if (obj instanceof ViewModelInstanceSource.Reference) {
                    return 3;
                }
                if (obj instanceof ViewModelInstanceSource.ReferenceListItem) {
                    return 4;
                }
                return -2;
            }
            if (obj instanceof ViewModelInstanceSource.Named) {
                return 2;
            }
            if (obj instanceof ViewModelInstanceSource.Reference) {
                return 3;
            }
            if (obj instanceof ViewModelInstanceSource.ReferenceListItem) {
                return 4;
            }
            return -2;
        }
        if (obj instanceof ViewModelInstanceSource.Blank) {
            return 0;
        }
        if (obj instanceof ViewModelInstanceSource.Default) {
            return 1;
        }
        if (obj instanceof ViewModelInstanceSource.Named) {
            return 2;
        }
        if (obj instanceof ViewModelInstanceSource.Reference) {
            return 3;
        }
        if (obj instanceof ViewModelInstanceSource.ReferenceListItem) {
            return 4;
        }
        return -2;
    }
}
