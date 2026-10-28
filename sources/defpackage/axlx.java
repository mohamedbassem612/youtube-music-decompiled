package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axlx extends CronetException {
    public axlx(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
