package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.abl;
import defpackage.adb;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class OnCheckedChangeDelegateImpl implements abl {
    private final IOnCheckedChangeListener mStub;

    /* JADX INFO: compiled from: PG */
    @yf
    public class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final adb mListener;

        public OnCheckedChangeListenerStub(adb adbVar) {
            this.mListener = adbVar;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m165xd37d5aa3(boolean z) {
            this.mListener.a(z);
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onCheckedChange", new aex() { // from class: abm
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m165xd37d5aa3(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(adb adbVar) {
        this.mStub = new OnCheckedChangeListenerStub(adbVar);
    }

    public static abl create(adb adbVar) {
        return new OnCheckedChangeDelegateImpl(adbVar);
    }

    public void sendCheckedChange(boolean z, xy xyVar) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            iOnCheckedChangeListener.getClass();
            iOnCheckedChangeListener.onCheckedChange(z, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
