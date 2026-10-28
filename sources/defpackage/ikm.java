package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.NetError;
import org.chromium.net.Proxy;
import org.chromium.net.impl.CompletionOnceCallback;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ikm implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ikm(aeei aeeiVar, View view, int i, np npVar, int i2) {
        this.$cid = i2;
        this.c = aeeiVar;
        this.d = view;
        this.a = i;
        this.b = npVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kty] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((ikn) ((qcb) this.b).a).h((String) this.c, this.a, (Optional) this.d);
                return;
            case 1:
                ((hj) this.b).b.execute(new bg(this, hs.a(new hi(this), true), 7, (char[]) null));
                return;
            case 2:
                ahgb ahgbVar = (ahgb) this.d;
                kro.e((Handler) ahgbVar.d);
                Object obj = ahgbVar.e;
                kpz kpzVar = (kpz) obj;
                boolean zW = kpzVar.w();
                Object obj2 = this.c;
                ?? r6 = this.b;
                if (zW) {
                    ahgb.an(r6, (kqs) obj, (kjc) obj2);
                    return;
                }
                if (kpzVar.x()) {
                    ahgbVar.ao(r6, (kjc) obj2);
                    return;
                } else if (this.a - 1 != 0) {
                    kuc kucVar = (kuc) ahgbVar.c;
                    ((kjc) obj2).w(kro.q(kucVar.b.c() ? new Status(8, "GmsClient is disconnected with SUCCESS connection status.", null, null) : kucVar.b));
                    return;
                } else {
                    ahgbVar.ao(r6, (kjc) obj2);
                    kpzVar.H();
                    return;
                }
            case 3:
                ((leu) this.b).a.a(this.a, (Throwable) this.d, (byte[]) this.c);
                return;
            case 4:
                Object obj3 = ((lqa) this.c).a;
                lfi lfiVar = (lfi) obj3;
                int i = this.a;
                if (lfiVar.b(i)) {
                    Object obj4 = this.b;
                    ((lcz) this.d).k.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
                    ldr.h((Context) obj3, null, null, null).aT().k.a("Completed wakeful intent.");
                    lfiVar.a((Intent) obj4);
                    return;
                }
                return;
            case 5:
                Object obj5 = this.d;
                zfj zfjVar = (zfj) obj5;
                zfjVar.a.lock();
                int i2 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.b;
                try {
                    ((zfj) obj5).h((zfi) obj7, (String) obj6, i2);
                    ((zfi) obj7).e = null;
                    return;
                } finally {
                    zfjVar.a.unlock();
                }
            case 6:
                aeei aeeiVar = (aeei) this.c;
                aeeiVar.k = false;
                aeea aeeaVar = aeeiVar.d;
                if (!aedi.c(aeeaVar.o(), 2)) {
                    aeeiVar.h();
                    return;
                }
                Object obj8 = this.d;
                if (obj8 != null) {
                    aeeiVar.c.removeView((View) obj8);
                }
                int i3 = this.a;
                nh nhVar = aeeiVar.b;
                ViewGroup viewGroup = aeeiVar.c;
                oh ohVarJV = nhVar.jV(viewGroup, nhVar.b(i3));
                aeeiVar.i = ohVarJV.a;
                nhVar.o(ohVarJV, i3);
                aeeiVar.j = aeeaVar.s();
                viewGroup.addView(aeeiVar.i);
                if (aeeiVar.s.l(248, 45835904L, false)) {
                    aeeiVar.i.setAlpha(1.0f);
                    aeeiVar.i.setVisibility(0);
                }
                aeeiVar.i.setFocusable(true);
                aeeiVar.i.setAccessibilityDelegate(new aeef(aeeiVar));
                if (obj8 != null || aeeaVar.s() == Long.MAX_VALUE) {
                    return;
                }
                ((np) this.b).findViewByPosition(i3);
                return;
            default:
                ?? r0 = this.b;
                String str = CronetUrlRequestContext.a;
                int i4 = this.a;
                Object obj9 = this.c;
                Object obj10 = this.d;
                try {
                    try {
                        ((CompletionOnceCallback) obj10).a(((Proxy.HttpConnectCallback) ((axoz) obj9).a).onResponseReceived(DesugarCollections.unmodifiableList(r0), i4) != 1 ? -188 : 0);
                        if (obj10 != null) {
                            ((CompletionOnceCallback) obj10).close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (obj10 != null) {
                            try {
                                ((CompletionOnceCallback) obj10).close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ((CompletionOnceCallback) obj10).a(NetError.ERR_PROXY_DELEGATE_CANCELED_CONNECT_RESPONSE);
                    throw th3;
                }
        }
    }

    public /* synthetic */ ikm(ahgb ahgbVar, int i, kty ktyVar, kjc kjcVar, int i2) {
        this.$cid = i2;
        this.d = ahgbVar;
        this.a = i;
        this.b = ktyVar;
        this.c = kjcVar;
    }

    public ikm(hj hjVar, List list, List list2, int i, int i2) {
        this.$cid = i2;
        this.b = hjVar;
        this.c = list;
        this.d = list2;
        this.a = i;
    }

    public /* synthetic */ ikm(leu leuVar, int i, Exception exc, byte[] bArr, int i2) {
        this.$cid = i2;
        this.b = leuVar;
        this.a = i;
        this.d = exc;
        this.c = bArr;
    }

    public /* synthetic */ ikm(lqa lqaVar, int i, lcz lczVar, Intent intent, int i2) {
        this.$cid = i2;
        this.c = lqaVar;
        this.a = i;
        this.d = lczVar;
        this.b = intent;
    }

    public /* synthetic */ ikm(CompletionOnceCallback completionOnceCallback, axoz axozVar, ArrayList arrayList, int i, int i2) {
        this.$cid = i2;
        this.d = completionOnceCallback;
        this.c = axozVar;
        this.b = arrayList;
        this.a = i;
    }

    public /* synthetic */ ikm(qcb qcbVar, String str, int i, Optional optional, int i2) {
        this.$cid = i2;
        this.b = qcbVar;
        this.c = str;
        this.a = i;
        this.d = optional;
    }

    public /* synthetic */ ikm(zfj zfjVar, zfi zfiVar, String str, int i, int i2) {
        this.$cid = i2;
        this.d = zfjVar;
        this.b = zfiVar;
        this.c = str;
        this.a = i;
    }
}
