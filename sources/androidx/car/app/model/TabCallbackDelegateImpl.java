package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.acs;
import defpackage.acy;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class TabCallbackDelegateImpl implements acs {
    private final ITabCallback mStubCallback;

    /* JADX INFO: compiled from: PG */
    @yf
    public class TabCallbackStub extends ITabCallback.Stub {
        private final acy mCallback;

        public TabCallbackStub(acy acyVar) {
            this.mCallback = acyVar;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m180x7d0e011a(String str) {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onTabSelected", new aex() { // from class: act
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m180x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl(acy acyVar) {
        this.mStubCallback = new TabCallbackStub(acyVar);
    }

    public static acs create(acy acyVar) {
        return new TabCallbackDelegateImpl(acyVar);
    }

    public void sendTabSelected(String str, xy xyVar) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            iTabCallback.getClass();
            iTabCallback.onTabSelected(str, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
