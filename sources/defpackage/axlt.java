package defpackage;

import org.chromium.net.CallbackException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axlt extends CallbackException {
    public axlt(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
