package app.rive.core;

import app.rive.RiveLog;
import app.rive.RiveResourceClosedException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CloseOnce implements CheckableAutoCloseable {
    public static final int $stable = 8;
    private final AtomicBoolean _closed;
    private final String label;
    private final Function0 onClose;

    public CloseOnce(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.label = str;
        this.onClose = function0;
        this._closed = new AtomicBoolean(false);
    }

    static final String close$lambda$0(CloseOnce closeOnce) {
        return "Attempted to close already closed resource (" + closeOnce.label + "). While safe, this may represent a mistake in ownership. The resource should only be closed once.";
    }

    public final void checkOpen() {
        if (getClosed()) {
            throw new RiveResourceClosedException(String.valueOf(this.label).concat(" is closed"));
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        if (this._closed.getAndSet(true)) {
            RiveLog.INSTANCE.getLogger().w("CloseOnce", new Function0() { // from class: app.rive.core.CloseOnce$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CloseOnce.close$lambda$0(this.f$0);
                }
            });
        } else {
            RiveLog.INSTANCE.getLogger().v("CloseOnce", new Function0() { // from class: app.rive.core.CloseOnce$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "Closing resource: ".concat(String.valueOf(this.f$0.label));
                }
            });
            this.onClose.invoke();
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this._closed.get();
    }
}
