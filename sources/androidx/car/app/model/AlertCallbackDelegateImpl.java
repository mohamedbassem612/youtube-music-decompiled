package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;
import defpackage.zu;
import defpackage.zv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class AlertCallbackDelegateImpl implements zv {
    private final IAlertCallback mCallback;

    /* JADX INFO: compiled from: PG */
    @yf
    public class AlertCallbackStub extends IAlertCallback.Stub {
        private final zu mCallback;

        public AlertCallbackStub(zu zuVar) {
            this.mCallback = zuVar;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m156x74881a4b(int i) {
            this.mCallback.b();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m157xeacf1252() {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onCancel", new aex() { // from class: zx
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m156x74881a4b(i);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onDismiss", new aex() { // from class: zw
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m157xeacf1252();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl(zu zuVar) {
        this.mCallback = new AlertCallbackStub(zuVar);
    }

    public static zv create(zu zuVar) {
        return new AlertCallbackDelegateImpl(zuVar);
    }

    public void sendCancel(int i, xy xyVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertCancelled(i, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(xy xyVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertDismissed(new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
