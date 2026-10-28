package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ResourceType$Companion$$ExternalSyntheticTypeSwitchClass0 {
    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a  */
    public static /* synthetic */ int switchDispatch(Object obj, int i) {
        Objects.checkIndex(i, 5);
        if (obj == null) {
            return -1;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                    }
                    return -2;
                }
                if (obj instanceof File) {
                    return 3;
                }
                return -2;
            }
            if (obj instanceof byte[]) {
                return 2;
            }
            if (obj instanceof File) {
                return 3;
            }
            return -2;
        }
        if (obj instanceof Integer) {
            return 0;
        }
        if (obj instanceof String) {
            return 1;
        }
        if (obj instanceof byte[]) {
            return 2;
        }
        if (obj instanceof File) {
            return 3;
        }
        return -2;
    }
}
