package androidx.car.app.dialer;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITelephoneKeypadCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;
import defpackage.yj;
import defpackage.yk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class TelephoneKeypadCallbackDelegateImpl implements yk {
    private final ITelephoneKeypadCallback mBinder;

    /* JADX INFO: compiled from: PG */
    @yf
    public class TelephoneKeypadCallbackStub extends ITelephoneKeypadCallback.Stub {
        private final yj mTelephoneKeypadCallback;

        public TelephoneKeypadCallbackStub(yj yjVar) {
            this.mTelephoneKeypadCallback = yjVar;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onKeyDown$1$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m148xb62da350(int i) {
            this.mTelephoneKeypadCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onKeyLongPress$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m149x958616ee(int i) {
            this.mTelephoneKeypadCallback.b();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onKeyUp$2$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m150xbf34a9ca(int i) {
            this.mTelephoneKeypadCallback.c();
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(final int i, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new aex() { // from class: ym
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m148xb62da350(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(final int i, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new aex() { // from class: yl
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m149x958616ee(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(final int i, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new aex() { // from class: yn
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m150xbf34a9ca(i);
                }
            });
        }
    }

    private TelephoneKeypadCallbackDelegateImpl(yj yjVar) {
        this.mBinder = new TelephoneKeypadCallbackStub(yjVar);
    }

    public static yk create(yj yjVar) {
        return new TelephoneKeypadCallbackDelegateImpl(yjVar);
    }

    public void sendKeyDown(int i, xy xyVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyDown(i, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendKeyLongPress(int i, xy xyVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyLongPress(i, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendKeyUp(int i, xy xyVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyUp(i, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}
