package app.rive.core;

import app.rive.ViewModelSource;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CommandQueue$$ExternalSyntheticTypeSwitchClass23 {
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
        if (obj instanceof ViewModelSource.Named) {
            return 0;
        }
        if (obj instanceof ViewModelSource.DefaultForArtboard) {
            return 1;
        }
        return -2;
    }
}
