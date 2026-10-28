package defpackage;

import android.net.ConnectivityManager;
import android.view.ViewGroup;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi(aunn aunnVar, CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, int i) {
        this.$cid = i;
        this.a = aunnVar;
        this.c = commandOuterClass$Command;
        this.b = nrvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, zqs] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, zqs] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, zqs] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws tog {
        nry nryVar;
        nry nryVar2;
        int i = 11;
        int i2 = 4;
        switch (this.$cid) {
            case 0:
                ((bj) this.b).d.f((ViewGroup) this.c, this.a);
                return awmy.a;
            case 1:
                Object obj = this.b;
                bj bjVar = (bj) obj;
                List list = bjVar.a;
                if (list.isEmpty()) {
                    Object obj2 = this.c;
                    dv dvVar = bjVar.d;
                    Object obj3 = bjVar.g;
                    obj3.getClass();
                    dvVar.u(obj3, new bg(obj, obj2, 4, (byte[]) null));
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((bk) it.next()).a.d) {
                            Object obj4 = this.a;
                            awl awlVar = new awl();
                            dv dvVar2 = bjVar.d;
                            ea eaVar = ((bk) list.get(0)).a;
                            dvVar2.r(obj4, awlVar, new bh(obj, 1));
                            awlVar.a();
                        }
                    }
                    Object obj5 = this.c;
                    dv dvVar3 = bjVar.d;
                    Object obj6 = bjVar.g;
                    obj6.getClass();
                    dvVar3.u(obj6, new bg(obj, obj5, 4, (byte[]) null));
                }
                return awmy.a;
            case 2:
                if (((awri) this.a).a) {
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    dzf.b();
                    String str = ecu.a;
                    ((ConnectivityManager) obj8).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj7);
                }
                return awmy.a;
            case 3:
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.c;
                ((tiz) ((vwt) this.b).a).e(urlResponseInfo, new tnm(urlResponseInfo.getHttpStatusCode(), (byte[]) this.a, false, (List) taq.l(urlResponseInfo)));
                return awmy.a;
            case 4:
                tiz tizVar = (tiz) ((vwt) this.b).a;
                if (!tizVar.d.get()) {
                    Object obj9 = this.c;
                    tja tjaVar = tizVar.e;
                    String str2 = (String) obj9;
                    tjaVar.f(str2);
                    int i3 = tqr.a;
                    if (tjaVar.d.k(1073830474) && (tyu.j(tjaVar.b.s()) || tyu.j(str2))) {
                        throw new tog("Open redirect blocked.");
                    }
                    Object obj10 = this.a;
                    tizVar.a.f();
                    ((UrlRequest) obj10).followRedirect();
                }
                return awmy.a;
            case 5:
                UrlResponseInfo urlResponseInfo2 = (UrlResponseInfo) this.a;
                int httpStatusCode = urlResponseInfo2.getHttpStatusCode();
                agke agkeVarL = taq.l(urlResponseInfo2);
                tiz tizVar2 = (tiz) ((vwt) this.b).a;
                boolean z = tizVar2.b;
                tizVar2.e(urlResponseInfo2, new tnm(httpStatusCode, (Iterable) this.c, agkeVarL, z, z));
                return awmy.a;
            case 6:
                ?? r0 = this.a;
                if (r0 != 0 && (nryVar = (nry) r0.io()) != null) {
                    nryVar.a((CommandOuterClass$Command) this.c, (nrv) this.b).F(new hrj(5), new var(new uhd(i), 12));
                }
                return awmy.a;
            case 7:
                ?? r1 = this.a;
                if (r1 != 0 && (nryVar2 = (nry) r1.io()) != null) {
                    nryVar2.a((CommandOuterClass$Command) this.c, (nrv) this.b).F(new hrj(i2), new var(new uhd(10), i));
                }
                return awmy.a;
            case 8:
                UUID uuid = (UUID) this.a;
                zqr zqrVar = new zqr(uuid);
                zqf zqfVar = (zqf) this.b;
                Object obj11 = zqfVar.d.get(zqrVar);
                if (obj11 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ?? r8 = this.c;
                zrg zrgVarB = r8.b(((zqr) obj11).a);
                return zrgVarB != null ? zrgVarB : zqfVar.c(uuid, r8);
            case 9:
                Object obj12 = this.a;
                ?? r2 = this.c;
                r2.b((UUID) obj12);
                zqf zqfVar2 = (zqf) this.b;
                return zqfVar2.c(zqfVar2.b, r2);
            default:
                UUID uuid2 = (UUID) this.a;
                zqr zqrVar2 = new zqr(uuid2);
                zqf zqfVar3 = (zqf) this.b;
                awnm awnmVar = (awnm) zqfVar3.c.remove(zqrVar2);
                if (awnmVar == null) {
                    return null;
                }
                Object obj13 = zqfVar3.d.get(new zqr(uuid2));
                if (obj13 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ?? r9 = this.c;
                if (r9.f(((zqr) obj13).a).isEmpty()) {
                    Iterator it2 = awnmVar.iterator();
                    while (it2.hasNext()) {
                        r9.m((zrg) it2.next());
                    }
                    return (zrg) awnmVar.d();
                }
                throw new IllegalStateException("\n      Pending route found for a context (" + zqr.a(uuid2) + ") that already had navigation state.\n      Note that a pending route implies the context was created by ActivityScopedNavController,\n      so it should be the only entity capable of initial entry.\n      ");
        }
    }

    public /* synthetic */ bi(awri awriVar, ConnectivityManager connectivityManager, ecj ecjVar, int i) {
        this.$cid = i;
        this.a = awriVar;
        this.b = connectivityManager;
        this.c = ecjVar;
    }

    public /* synthetic */ bi(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ bi(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ bi(zqs zqsVar, UUID uuid, zqf zqfVar, int i) {
        this.$cid = i;
        this.c = zqsVar;
        this.a = uuid;
        this.b = zqfVar;
    }

    public /* synthetic */ bi(zqs zqsVar, zqf zqfVar, UUID uuid, int i) {
        this.$cid = i;
        this.c = zqsVar;
        this.b = zqfVar;
        this.a = uuid;
    }
}
