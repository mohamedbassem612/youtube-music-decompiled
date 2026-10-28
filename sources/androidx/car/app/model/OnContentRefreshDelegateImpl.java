package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.abq;
import defpackage.abs;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class OnContentRefreshDelegateImpl implements abq {
    private final IOnContentRefreshListener mListener;

    /* JADX INFO: compiled from: PG */
    @yf
    public class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final abs mOnContentRefreshListener;

        public OnContentRefreshListenerStub(abs absVar) {
            this.mOnContentRefreshListener = absVar;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub, reason: not valid java name */
        public /* synthetic */ Object m167xff9c1a9c() {
            this.mOnContentRefreshListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onClick", new aex() { // from class: abr
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m167xff9c1a9c();
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl(abs absVar) {
        this.mListener = new OnContentRefreshListenerStub(absVar);
    }

    public static abq create(abs absVar) {
        return new OnContentRefreshDelegateImpl(absVar);
    }

    public void sendContentRefreshRequested(xy xyVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            iOnContentRefreshListener.getClass();
            iOnContentRefreshListener.onContentRefreshRequested(new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
