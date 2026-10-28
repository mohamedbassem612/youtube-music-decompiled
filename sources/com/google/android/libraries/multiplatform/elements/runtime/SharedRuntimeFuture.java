package com.google.android.libraries.multiplatform.elements.runtime;

import com.google.android.libraries.multiplatform.elements.ElementsException;
import defpackage.ahch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class SharedRuntimeFuture extends ahch {
    private SharedRuntimeFuture() {
    }

    private void resolve(ElementsException.SharedRuntimeException sharedRuntimeException) {
        if (sharedRuntimeException == null) {
            set(null);
        } else {
            setException(sharedRuntimeException);
        }
    }
}
