package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.acf;
import defpackage.acg;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class SearchCallbackDelegateImpl implements acg {
    private final ISearchCallback mStubCallback;

    /* JADX INFO: compiled from: PG */
    @yf
    public class SearchCallbackStub extends ISearchCallback.Stub {
        private final acf mSearchCallback;

        public SearchCallbackStub(acf acfVar) {
            this.mSearchCallback = acfVar;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m170x5bd43f40(String str) {
            this.mSearchCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m171xa7c97055(String str) {
            this.mSearchCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onSearchSubmitted", new aex() { // from class: ach
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m170x5bd43f40(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onSearchTextChanged", new aex() { // from class: aci
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m171xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl(acf acfVar) {
        this.mStubCallback = new SearchCallbackStub(acfVar);
    }

    public static acg create(acf acfVar) {
        return new SearchCallbackDelegateImpl(acfVar);
    }

    public void sendSearchSubmitted(String str, xy xyVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchSubmitted(str, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(String str, xy xyVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchTextChanged(str, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
