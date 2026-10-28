package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.abe;
import defpackage.abt;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class OnItemVisibilityChangedDelegateImpl implements abt {
    private final IOnItemVisibilityChangedListener mStub;

    /* JADX INFO: compiled from: PG */
    public class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final abe mListener;

        public OnItemVisibilityChangedListenerStub(abe abeVar) {
            this.mListener = abeVar;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m168xb730acdb(int i, int i2) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onItemVisibilityChanged", new aex() { // from class: abu
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m168xb730acdb(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(abe abeVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(abeVar);
    }

    public static abt create(abe abeVar) {
        return new OnItemVisibilityChangedDelegateImpl(abeVar);
    }

    public void sendItemVisibilityChanged(int i, int i2, xy xyVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            iOnItemVisibilityChangedListener.getClass();
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
