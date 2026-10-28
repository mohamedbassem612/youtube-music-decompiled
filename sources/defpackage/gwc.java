package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gwc implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gwc(acuu acuuVar, abvz abvzVar, abug abugVar, int i) {
        this.$cid = i;
        this.b = acuuVar;
        this.c = abvzVar;
        this.a = abugVar;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            case 2:
                a((Throwable) obj);
                break;
            case 3:
                a((Throwable) obj);
                break;
            case 4:
                a((Throwable) obj);
                break;
            case 5:
                a((Throwable) obj);
                break;
            case 6:
                a((Throwable) obj);
                break;
            case 7:
                a((Throwable) obj);
                break;
            case 8:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, wpl] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r7v23, types: [abvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, zwa] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        int i = 16;
        switch (this.$cid) {
            case 0:
                aojl aojlVar = (aojl) this.b;
                if ((aojlVar.c & 4) != 0) {
                    Object obj = this.c;
                    Object obj2 = this.a;
                    ((hdd) obj).dismiss();
                    ajwo ajwoVar = aojlVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    ((gwd) obj2).c.a(ajwoVar);
                    return;
                }
                return;
            case 1:
                ((gug) this.a).e(th);
                return;
            case 2:
                agrx agrxVar = agso.a;
                ((gwq) this.a).d((apcd) this.c, this.b, false);
                return;
            case 3:
                Object obj3 = this.a;
                jio jioVarE = jin.e();
                gyj gyjVar = (gyj) obj3;
                ((jik) jioVarE).k(gyjVar.a.b(th));
                gyjVar.d.d(jioVarE.b());
                gyjVar.c.kk(new gsk((String) this.b, true, false));
                Object obj4 = this.c;
                if (obj4 != null) {
                    ((avpr) obj4).b(th);
                    return;
                }
                return;
            case 4:
                Object obj5 = this.a;
                jio jioVarE2 = jin.e();
                gyl gylVar = (gyl) obj5;
                ((jik) jioVarE2).k(gylVar.a.b(th));
                gylVar.d.d(jioVarE2.b());
                gylVar.c.kk(new gsk((String) this.b, false, false));
                Object obj6 = this.c;
                if (obj6 != null) {
                    ((avpr) obj6).b(th);
                    return;
                }
                return;
            case 5:
                ((hit) this.a).d((amzv) this.b, agpr.a, this.c);
                return;
            case 6:
                ?? r0 = this.c;
                if (r0 != 0) {
                    r0.d(th);
                    return;
                }
                aihf aihfVar = (aihf) this.b;
                arrc arrcVar = (arrc) aihfVar.instance;
                int i2 = arrcVar.b;
                if (i2 == 1) {
                    if (((i2 == 1 ? (arrd) arrcVar.c : arrd.a).b & 16) != 0) {
                        Object obj7 = this.a;
                        arrc arrcVar2 = (arrc) aihfVar.instance;
                        ajwo ajwoVar2 = (arrcVar2.b == 1 ? (arrd) arrcVar2.c : arrd.a).e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        ((abzi) obj7).f.a(ajwoVar2);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                vmx vmxVar = (vmx) this.a;
                Optional optional = (Optional) vmxVar.a.io();
                urh urhVar = new urh(th, i);
                if (true == optional.isPresent()) {
                    ((ahgb) optional.get()).ai((Throwable) urhVar.a);
                }
                vmxVar.e(agke.q(this.b), this.c);
                return;
            case 8:
                ?? r1 = this.c;
                Object obj8 = this.b;
                if (r1 != 0 && !(r1 instanceof ywm)) {
                    zhv zhvVar = new zhv("executor");
                    zhvVar.c = (String) obj8;
                    zhvVar.d = th;
                    r1.k(zhvVar.a());
                    return;
                }
                Object obj9 = this.a;
                if (obj9 != null) {
                    ajtx ajtxVarCx = yno.cx(th, 3, ajtv.ERROR_LEVEL_WARNING, (String) obj8);
                    xeu xeuVar = (xeu) obj9;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(ajtxVarCx, alot.CLIENT_ERROR);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                        return;
                    }
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarCx.build();
                    clientErrorOuterClass$ClientError.getClass();
                    alouVar.d = clientErrorOuterClass$ClientError;
                    alouVar.c = 163;
                    xeuVar.b((alou) alosVar.build());
                    return;
                }
                return;
            default:
                ((agrc) ((agrc) ((agrc) acuu.a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/player/sequencer/ReelVideoPlaybackItemHandler", "prefetch", (char) 224, "ReelVideoPlaybackItemHandler.java")).t("There was an error prefetching");
                Object obj10 = this.b;
                acuu acuuVar = (acuu) obj10;
                hno hnoVar = acuuVar.g;
                Object obj11 = this.a;
                if (hnoVar.B()) {
                    String strF = acuu.f(this.c);
                    if (TextUtils.isEmpty(strF)) {
                        return;
                    }
                    synchronized (acuuVar.b) {
                        if (Objects.equals(((abug) obj11).c, ((acuu) obj10).c)) {
                            ((acuu) obj10).d.remove(strF);
                        }
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gwc(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gwc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gwc(ywn ywnVar, String str, xeu xeuVar, int i) {
        this.$cid = i;
        this.c = ywnVar;
        this.b = str;
        this.a = xeuVar;
    }
}
