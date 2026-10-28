package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.research.xeno.effect.EventManager;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.UserInteractionManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvl implements atvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ atvl(UserInteractionManager userInteractionManager, aihn aihnVar, int i) {
        this.$cid = i;
        this.b = userInteractionManager;
        this.a = aihnVar;
    }

    @Override // defpackage.atvh
    public final void a(long j) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = ((InputFrameSource) this.a).e;
            String str = atvp.b;
            Size size = (Size) this.b;
            atvp.nativeStartVideoProcessing(j, i2, size.getWidth(), size.getHeight(), 0, 0, null);
            return;
        }
        if (i == 1) {
            if (j == 0) {
                Log.w(EventManager.a, "Sending event to event manager which is released");
                return;
            } else {
                EventManager.nativeSendEvent(((EventManager) this.a).b, ((aifs) this.b).toByteArray());
                return;
            }
        }
        if (i != 2) {
            if (j == 0) {
                Log.w(UserInteractionManager.c, "Sending gesture event to user interaction manager which is released");
                return;
            } else {
                UserInteractionManager.nativeSendGestureEvent(((UserInteractionManager) this.b).d, ((aifs) this.a).toByteArray());
                return;
            }
        }
        if (j == 0) {
            Log.w(UserInteractionManager.c, "Sending touch event to user interaction manager which is released");
        } else {
            UserInteractionManager.nativeSendTouchEvent(((UserInteractionManager) this.b).d, ((aifs) this.a).toByteArray());
        }
    }

    public /* synthetic */ atvl(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
