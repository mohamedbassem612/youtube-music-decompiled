package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RiveFileController$$ExternalSyntheticTypeSwitchClass22 {
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
            if (obj instanceof SMINumber) {
                return 2;
            }
            return -2;
        }
        if (obj instanceof SMITrigger) {
            return 0;
        }
        if (obj instanceof SMIBoolean) {
            return 1;
        }
        if (obj instanceof SMINumber) {
            return 2;
        }
        return -2;
    }
}
