package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.abn;
import defpackage.abp;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class OnClickDelegateImpl implements abn {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* JADX INFO: compiled from: PG */
    public class OnClickListenerStub extends IOnClickListener.Stub {
        private final abp mOnClickListener;

        public OnClickListenerStub(abp abpVar) {
            this.mOnClickListener = abpVar;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ Object m166xba9c2d94() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onClick", new aex() { // from class: abo
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m166xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl(abp abpVar, boolean z) {
        this.mListener = new OnClickListenerStub(abpVar);
        this.mIsParkedOnly = z;
    }

    public static abn create(abp abpVar) {
        return new OnClickDelegateImpl(abpVar, abpVar instanceof ParkedOnlyOnClickListener);
    }

    @Override // defpackage.abn
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(xy xyVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            iOnClickListener.getClass();
            iOnClickListener.onClick(new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
