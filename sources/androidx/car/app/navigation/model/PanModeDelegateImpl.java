package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aeb;
import defpackage.aed;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class PanModeDelegateImpl implements aeb {
    private final IPanModeListener mStub;

    /* JADX INFO: compiled from: PG */
    @yf
    public class PanModeListenerStub extends IPanModeListener.Stub {
        private final aed mListener;

        public PanModeListenerStub(aed aedVar) {
            this.mListener = aedVar;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m182xa5766d47(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onPanModeChanged", new aex() { // from class: aec
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m182xa5766d47(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(aed aedVar) {
        this.mStub = new PanModeListenerStub(aedVar);
    }

    public static aeb create(aed aedVar) {
        return new PanModeDelegateImpl(aedVar);
    }

    public void sendPanModeChanged(boolean z, xy xyVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            iPanModeListener.getClass();
            iPanModeListener.onPanModeChanged(z, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
