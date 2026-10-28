package com.google.android.libraries.multiplatform.elements;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ElementsException extends ExecutionException {

    /* JADX INFO: compiled from: PG */
    public class SharedRuntimeException extends ElementsException {
        public SharedRuntimeException(int i, String str) {
            super(str);
        }
    }

    public ElementsException() {
    }

    public ElementsException(String str) {
        super(str);
    }
}
