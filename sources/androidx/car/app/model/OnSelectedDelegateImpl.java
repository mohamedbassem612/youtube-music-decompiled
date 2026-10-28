package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.abf;
import defpackage.abv;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class OnSelectedDelegateImpl implements abv {
    private final IOnSelectedListener mStub;

    /* JADX INFO: compiled from: PG */
    @yf
    public class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final abf mListener;

        public OnSelectedListenerStub(abf abfVar) {
            this.mListener = abfVar;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m169x5a7f46f5(int i) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onSelectedListener", new aex() { // from class: abw
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m169x5a7f46f5(i);
                }
            });
        }
    }

    private OnSelectedDelegateImpl(abf abfVar) {
        this.mStub = new OnSelectedListenerStub(abfVar);
    }

    public static abv create(abf abfVar) {
        return new OnSelectedDelegateImpl(abfVar);
    }

    public void sendSelected(int i, xy xyVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            iOnSelectedListener.getClass();
            iOnSelectedListener.onSelected(i, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
