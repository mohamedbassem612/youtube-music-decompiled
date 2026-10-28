package defpackage;

import android.content.DialogInterface;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hrg implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrg(Object obj, aihn aihnVar, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = aihnVar;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aaui, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            this.b.a();
            ((xsc) this.a).c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj((xhc) this.c), null);
            return;
        }
        if (i2 == 1) {
            if (i == -1) {
                ((gxy) this.a).d((apyr) this.c, this.b);
                return;
            }
            return;
        }
        if (i2 == 2) {
            Object obj = this.a;
            aaac aaacVar = (aaac) obj;
            wva wvaVar = aaacVar.g;
            wri wriVar = new wri(wvaVar.b, wvaVar.e.e());
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aocq.b);
            Object obj2 = this.c;
            aihi aihiVar = (aihi) obj2;
            aihiVar.c(aihlVarCheckIsLite);
            Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
            Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
            Object obj3 = this.b;
            aocq aocqVar = (aocq) objC;
            wriVar.a = aocqVar.d;
            wriVar.b = aocqVar.f;
            wriVar.n(vxg.a((ajwo) obj2));
            taf.k(aaacVar.b, wvaVar.c.b(wriVar, aaacVar.e, null), new uny(obj, 20), new gyr(obj, obj2, obj3, 17));
            return;
        }
        if (i2 != 3) {
            Object obj4 = this.a;
            if (i2 != 4) {
                this.c.a((CommandOuterClass$Command) this.b, (nrv) obj4).D();
                return;
            } else {
                this.c.a((CommandOuterClass$Command) this.b, (nrv) obj4).D();
                return;
            }
        }
        acmk acmkVar = (acmk) this.a;
        ycp ycpVar = acmkVar.e;
        yco ycoVar = ycpVar.e;
        if (ycoVar != null) {
            acmkVar.d = new acmj(acmkVar, (ajwo) this.c, acmkVar.c.f().toEpochMilli());
            ycpVar.a(acmkVar.d);
            if (acmkVar.f.l(159, 45659742L, false)) {
                taf.i(ycoVar.q(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_PLAY_ON_PHONE, Optional.empty()), MoreExecutors.directExecutor(), new abwu(11), new uqk(14), null);
            } else {
                ycoVar.J();
            }
            acmkVar.e(xhb.b(192410));
        }
    }

    public /* synthetic */ hrg(nry nryVar, CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, int i) {
        this.$cid = i;
        this.c = nryVar;
        this.b = commandOuterClass$Command;
        this.a = nrvVar;
    }

    public /* synthetic */ hrg(xsc xscVar, aaui aauiVar, xhc xhcVar, int i) {
        this.$cid = i;
        this.a = xscVar;
        this.b = aauiVar;
        this.c = xhcVar;
    }
}
