package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.widget.EditText;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.research.xeno.effect.RemoteAssetManager;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usf implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ usf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v52, types: [acjx, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        ListenableFuture listenableFutureN;
        int i = 8;
        switch (this.$cid) {
            case 0:
                ((agkx) this.a).c((Long) obj);
                break;
            case 1:
                ((usc) obj).g((auhs) this.a);
                break;
            case 2:
                ((usd) this.a).j((augy) obj);
                break;
            case 3:
                ((uvw) obj).u((auaj) this.a);
                break;
            case 4:
                ((uvw) obj).A((augy) this.a);
                break;
            case 5:
                ((uvw) obj).v((auan) this.a);
                break;
            case 6:
                ((uvw) obj).w(this.a);
                break;
            case 7:
                ((uvw) obj).t(this.a);
                break;
            case 8:
                ((uyb) this.a).a((List) obj);
                break;
            case 9:
                String str = (String) obj;
                vae vaeVar = (vae) this.a;
                if (uxp.e(vaeVar.t(), str)) {
                    vaeVar.q(str);
                    if (vaeVar.n != null) {
                        vaeVar.A(str);
                    }
                } else if (vaeVar.n != null) {
                    vaeVar.A(str);
                }
                break;
            case 10:
                Optional optional = (Optional) obj;
                vae vaeVar2 = (vae) ((yhi) this.a).b;
                vaeVar2.u();
                if (vaeVar2.n != null) {
                    optional.isPresent();
                }
                break;
            case 11:
                uyq uyqVar = (uyq) obj;
                if (uyqVar != null) {
                    Object obj2 = this.a;
                    uyb uybVar = new uyb(uyqVar);
                    vaq vaqVar = (vaq) obj2;
                    uybVar.b = vaqVar.a.n(new usf(uybVar, i));
                    vaqVar.d = uybVar;
                    uyb uybVar2 = vaqVar.d;
                    uyq uyqVar2 = uybVar2.d;
                    RemoteAssetManager remoteAssetManagerB = uyqVar2.b();
                    agqr it = uyqVar2.a().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        RemoteAssetManager.a.execute(new atvv(remoteAssetManagerB, str2, (RemoteAssetManager.FetchCallback) new atvw(new uya(uybVar2, str2)), 1));
                    }
                }
                break;
            case 12:
                ((vat) this.a).n();
                break;
            case 13:
                auhf auhfVar = (auhf) obj;
                if ((auhfVar.b & 2) != 0) {
                    agek agekVar = vfh.a;
                    aimy aimyVar = auhfVar.d;
                    if (aimyVar == null) {
                        aimyVar = aimy.a;
                    }
                    Object obj3 = this.a;
                    Object objApply = agekVar.apply(aimyVar);
                    aihf aihfVar = (aihf) obj3;
                    aihfVar.copyOnWrite();
                    akpo akpoVar = (akpo) aihfVar.instance;
                    akpo akpoVar2 = akpo.a;
                    objApply.getClass();
                    aiie aiieVar = akpoVar.d;
                    if (!aiieVar.c()) {
                        akpoVar.d = aihn.mutableCopy(aiieVar);
                    }
                    akpoVar.d.add(objApply);
                }
                break;
            case 14:
                augy augyVar = (augy) obj;
                int i2 = augyVar.c;
                ?? r6 = this.a;
                if (i2 != 101) {
                    r6.put(Long.valueOf(augyVar.e), (augyVar.c == 110 ? (auhb) augyVar.d : auhb.a).c);
                } else {
                    r6.put(Long.valueOf(augyVar.e), (augyVar.c == 101 ? (augu) augyVar.d : augu.a).c);
                }
                break;
            case 15:
                vim vimVar = (vim) obj;
                vin vinVar = ((vjf) this.a).m;
                vinVar.getClass();
                vjq vjqVar = (vjq) vinVar;
                EditText editText = vjqVar.r;
                if (editText != null) {
                    ((vjh) vinVar).ja(editText);
                }
                vjqVar.m();
                xgn xgnVar = vjqVar.t;
                if (xgnVar != null) {
                    xgnVar.l(new xgj(xhb.b(185132)));
                }
                if (vjqVar.i() != null) {
                    vjqVar.j();
                    listenableFutureN = vimVar.a();
                } else {
                    listenableFutureN = ahng.n(Boolean.FALSE);
                }
                taf.i(listenableFutureN, MoreExecutors.directExecutor(), new roc(vinVar, 17), new ixb(vinVar, i), null);
                break;
            case 16:
                String str3 = vjj.c;
                ((aqi) obj).d((Throwable) this.a);
                break;
            case 17:
                String str4 = vjq.h;
                ((View) obj).setBackgroundTintList((ColorStateList) this.a);
                break;
            case 18:
                vkq vkqVar = (vkq) obj;
                Paint.Join join = vkq.a;
                break;
            case 19:
                ajwo ajwoVar = (ajwo) obj;
                ((List) Map.EL.computeIfAbsent(this.a, vmx.h(ajwoVar), new vmw(0))).add(vmx.g(ajwoVar));
                break;
            default:
                ((vro) obj).n(this.a);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
