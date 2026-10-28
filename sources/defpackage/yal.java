package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yal extends Handler {
    public final /* synthetic */ yam a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yal(yam yamVar, Looper looper) {
        super(looper);
        this.a = yamVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 3) {
            yam yamVar = this.a;
            int i2 = yamVar.I;
            if (i2 == 0 || i2 == 1) {
                xls xlsVar = yamVar.am;
                int iA = xlsVar.a();
                if (iA == 2 || iA == 1) {
                    agrx agrxVar = agso.a;
                    xlsVar.f(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER, true, false, Optional.empty());
                }
                agrx agrxVar2 = agso.a;
                xve xveVar = yamVar.t;
                String str = xveVar.c;
                xve xveVarB = yamVar.b(xveVar);
                if (xveVarB == null || !xveVarB.b()) {
                    ((agrc) ((agrc) yam.a.b().i(agrxVar2, "MDX.Cloud")).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession$RemoteConnectionHandler", "handleMessage", 1611, "CloudSession.java")).w("Couldn't obtain token for %s", yamVar.t.c);
                    yamVar.o(amyu.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN, null);
                    return;
                }
                yamVar.t = xveVarB;
                yco ycoVar = yamVar.s;
                if (ycoVar.n().k != 3) {
                    yamVar.al.l(11);
                }
                Object obj = message.obj;
                Optional optionalEmpty = Optional.empty();
                if (obj instanceof String) {
                    optionalEmpty = Optional.of((String) message.obj);
                    ycoVar.aS(false);
                }
                yamVar.n(xveVarB, yamVar.D, optionalEmpty);
                return;
            }
            return;
        }
        int i3 = 5;
        if (i != 4) {
            if (i != 5) {
                if (i == 6) {
                    yam yamVar2 = this.a;
                    yamVar2.I = 3;
                    yamVar2.j(yamVar2.e, new yak(), false);
                    return;
                }
                return;
            }
            yam yamVar3 = this.a;
            int i4 = yamVar3.I;
            if (i4 == 3 || i4 == 4) {
                return;
            }
            yamVar3.s(4);
            agrx agrxVar3 = agso.a;
            String str2 = yamVar3.t.c;
            yamVar3.j(yamVar3.e, new yak(), true);
            ((xly) yamVar3.am.h).i = null;
            xve xveVar2 = yamVar3.t;
            String str3 = xveVar2.c;
            xve xveVarB2 = yamVar3.b(xveVar2);
            if (xveVarB2 != null && xveVarB2.b()) {
                yamVar3.n(xveVarB2, yamVar3.D, Optional.empty());
                return;
            } else {
                ((agrc) ((agrc) yam.a.b().i(agrxVar3, "MDX.Cloud")).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession$RemoteConnectionHandler", "handleMessage", 1650, "CloudSession.java")).w("Couldn't obtain token for %s", yamVar3.t.c);
                yamVar3.o(amyu.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN, null);
                return;
            }
        }
        yam yamVar4 = this.a;
        if (yamVar4.I != 3) {
            yak yakVar = (yak) message.obj;
            boolean z = yakVar.a;
            agrx agrxVar4 = agso.a;
            String str4 = yamVar4.t.c;
            Context context = yamVar4.e;
            amyu amyuVar = yakVar.c;
            if (z && !yamVar4.w() && yamVar4.o) {
                tuk.o(context, context.getString(R.string.shared_queue_disconnect_toast), 1);
            } else if (amyuVar == amyu.MDX_SESSION_DISCONNECT_REASON_SHORTS_ACTIVE_PLAYBACK) {
                yamVar4.k.d(context.getString(R.string.disconnect_reason_shorts_active_playback_toast_msg));
            } else if (amyuVar == amyu.MDX_SESSION_DISCONNECT_REASON_NO_ACTIVE_PLAYBACK) {
                yamVar4.k.d(context.getString(R.string.disconnect_reason_no_active_playback_toast_msg));
            } else if (amyuVar == amyu.MDX_SESSION_DISCONNECT_REASON_COMPROMISED_RECEIVER) {
                yamVar4.k.d(context.getString(R.string.disconnect_reason_compromised_receiver_toast_msg, yamVar4.t.c));
            }
            yamVar4.j(context, yakVar, false);
            boolean z2 = yakVar.b && yamVar4.w();
            if (yamVar4.f.aI() && !z2) {
                yco ycoVar2 = yamVar4.s;
                if (ycoVar2 instanceof yae) {
                    ((yae) ycoVar2).aG(false);
                }
            }
            yamVar4.s(3);
            wjr wjrVar = yamVar4.aq;
            wjrVar.w(16, "c_d");
            yamVar4.h.c(new xng());
            wjrVar.w(121, "mdx_off");
            yco ycoVar3 = yamVar4.s;
            if (ycoVar3.n().k == 4 || ycoVar3.n().k == 6) {
                return;
            }
            ConditionVariable conditionVariable = new ConditionVariable();
            taq.c();
            yamVar4.g.post(new hff(this, z2, conditionVariable, i3));
            conditionVariable.block();
        }
    }
}
