package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qsp extends qsr implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public qsp(qsq qsqVar) {
        super(qsqVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.qsr
    protected final void c(qsq qsqVar) {
        try {
            CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            Cursor cursorA = qsqVar.a(cancellationSignal);
            try {
                if (!isCancelled() && cursorA != null) {
                    cursorA.getCount();
                }
                if (set(cursorA)) {
                    return;
                }
                yno.I(cursorA);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    if (!set(cursorA)) {
                        yno.I(cursorA);
                    }
                }
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
