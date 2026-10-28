package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaMetadataRetriever;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uhe implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uhe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, uxi] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                return;
            case 1:
                this.a.invoke(obj);
                return;
            case 2:
                akoy akoyVar = (akoy) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                alpr alprVar = (alpr) aihfVar.instance;
                alpr alprVar2 = alpr.a;
                akoyVar.getClass();
                alprVar.d = akoyVar;
                alprVar.b |= 8;
                return;
            case 3:
                String str = (String) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                alpr alprVar3 = (alpr) aihfVar2.instance;
                alpr alprVar4 = alpr.a;
                str.getClass();
                alprVar3.b |= 32;
                alprVar3.e = str;
                return;
            case 4:
                AutoCloseable autoCloseable = (qxg) obj;
                try {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                        return;
                    }
                    if (autoCloseable instanceof ExecutorService) {
                        a.ar((ExecutorService) autoCloseable);
                        return;
                    }
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                        return;
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                        return;
                    }
                } catch (Exception e) {
                    ((uld) this.a).s("font_manager_close_failed", e);
                    return;
                }
            case 5:
                ((uql) obj).f.l(new uui(this.a.a(), null));
                return;
            case 6:
                ((uql) obj).f.l(new uui(this.a.a(), Float.valueOf(0.0f)));
                return;
            case 7:
                ((uql) obj).h((atzv) this.a);
                return;
            case 8:
                ((uql) this.a).h((atzv) obj);
                return;
            case 9:
                ((uql) obj).f(this.a.a(), true);
                return;
            case 10:
                ((uql) obj).t((ahgb) this.a);
                return;
            case 11:
                uql uqlVar = (uql) obj;
                ujl ujlVar = uqlVar.l;
                umf umfVar = (umf) this.a;
                ujlVar.i(umfVar.g);
                uqlVar.g.j.i(uqlVar);
                ume umeVar = umfVar.f;
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                umfVar.f = new ume(umeVar.a, umeVar.b, umeVar.c, umeVar.d, umeVar.e, Optional.empty());
                return;
            case 12:
                String str2 = (String) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                upv upvVar = (upv) aihfVar3.instance;
                upv upvVar2 = upv.a;
                str2.getClass();
                upvVar.b |= 32;
                upvVar.h = str2;
                return;
            case 13:
                ((unr) obj).b((ugb) this.a);
                return;
            case 14:
                uom uomVar = (uom) obj;
                uop uopVar = uomVar.c;
                uoo uooVar = (uoo) this.a;
                uooVar.c = uopVar;
                uooVar.d(uomVar.d.a);
                uooVar.a();
                return;
            case 15:
                uom uomVar2 = (uom) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                uoj uojVar = uomVar2.d;
                upd updVar = new upd(atomicBoolean, ahng.n(uojVar));
                upg upgVar = (upg) this.a;
                upgVar.j = updVar;
                uoi uoiVar = uomVar2.a;
                upd updVar2 = upgVar.j;
                updVar2.getClass();
                upgVar.o(uoiVar, uojVar, updVar2, Optional.of(uomVar2.b), false);
                return;
            case 16:
                upo.s(((upo) this.a).m, ((Integer) obj).intValue());
                return;
            case 17:
                upo.s(((upo) this.a).m, ((Integer) obj).intValue());
                return;
            case 18:
                float fFloatValue = ((Float) obj).floatValue();
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                auhp auhpVar = (auhp) aihfVar4.instance;
                auhp auhpVar2 = auhp.a;
                auhpVar.b |= 1;
                auhpVar.c = fFloatValue;
                return;
            case 19:
                float fFloatValue2 = ((Float) obj).floatValue();
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                auhp auhpVar3 = (auhp) aihfVar5.instance;
                auhp auhpVar4 = auhp.a;
                auhpVar3.b |= 2;
                auhpVar3.d = fFloatValue2;
                return;
            default:
                ((agkx) this.a).c((auak) obj);
                return;
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
