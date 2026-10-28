package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aex;
import defpackage.xy;
import defpackage.yf;
import defpackage.zl;
import defpackage.zm;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class ConversationCallbackDelegateImpl implements zm {
    private final IConversationCallback mConversationCallbackBinder;

    /* JADX INFO: compiled from: PG */
    @yf
    public class ConversationCallbackStub extends IConversationCallback.Stub {
        private final zl mConversationCallback;

        public ConversationCallbackStub(zl zlVar) {
            this.mConversationCallback = zlVar;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m154xf996ad9e() {
            this.mConversationCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onTextReply$1$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m155xc3f6a0cd(String str) {
            this.mConversationCallback.b();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            aag.b(iOnDoneCallback, "onMarkAsRead", new aex() { // from class: zo
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m154xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            aag.b(iOnDoneCallback, "onReply", new aex() { // from class: zn
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.m155xc3f6a0cd(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(zl zlVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(zlVar);
    }

    public void sendMarkAsRead(xy xyVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onMarkAsRead(new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(String str, xy xyVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onTextReply(new RemoteUtils$1(xyVar), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
