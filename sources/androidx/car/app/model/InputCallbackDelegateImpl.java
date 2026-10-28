package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aay;
import defpackage.aaz;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class InputCallbackDelegateImpl implements aaz {
    private final IInputCallback mCallback;

    /* JADX INFO: compiled from: PG */
    @yf
    public class OnInputCallbackStub extends IInputCallback.Stub {
        private final aay mCallback;

        public OnInputCallbackStub(aay aayVar) {
            this.mCallback = aayVar;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m163x52ef688c(String str) {
            this.mCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m164x16cfd85f(String str) {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onInputSubmitted", new aex() { // from class: abb
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m163x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onInputTextChanged", new aex() { // from class: aba
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m164x16cfd85f(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl(aay aayVar) {
        this.mCallback = new OnInputCallbackStub(aayVar);
    }

    public static aaz create(aay aayVar) {
        aayVar.getClass();
        return new InputCallbackDelegateImpl(aayVar);
    }

    public void sendInputSubmitted(String str, xy xyVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputSubmitted(str, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, xy xyVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputTextChanged(str, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
