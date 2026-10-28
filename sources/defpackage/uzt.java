package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzt extends uhv {
    public final aunn b;
    public final uys c;
    public final zvl d;
    public final awut e;
    public awwd f;
    public List g;
    public List h;
    public final xpl i;
    private final vao j;
    private final awou k;
    private final awou l;
    private ufs m;
    private avmn n;
    private final vbk o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzt(cc ccVar, aunn aunnVar, uys uysVar, vbk vbkVar, zvl zvlVar, vao vaoVar, awou awouVar, awou awouVar2, xpl xplVar, awut awutVar) {
        super(ccVar, true);
        ccVar.getClass();
        aunnVar.getClass();
        zvlVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.b = aunnVar;
        this.c = uysVar;
        this.o = vbkVar;
        this.d = zvlVar;
        this.j = vaoVar;
        this.k = awouVar;
        this.l = awouVar2;
        this.i = xplVar;
        this.e = awutVar;
        this.m = ufs.CREATION_FLOW_SHORTS;
        this.g = awno.a;
    }

    public static final qvk p(aufd aufdVar, uyr uyrVar) {
        apsr apsrVar = aufdVar.g;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        apse apseVar = apsrVar.b == 4 ? (apse) apsrVar.c : apse.a;
        apseVar.getClass();
        return yno.fs(uyrVar.a, apseVar.c, apseVar.d, uyrVar.b);
    }

    public static final aufd q(aufd aufdVar, uyr uyrVar) {
        if (aufdVar.c == 2) {
            return aufdVar;
        }
        aihf aihfVarCreateBuilder = aufe.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        atte atteVar = uyrVar.e;
        if (atteVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aufe aufeVar = (aufe) aihfVarCreateBuilder.instance;
            aufeVar.c = atteVar;
            aufeVar.b |= 1;
        }
        ajhv ajhvVar = uyrVar.b;
        if (ajhvVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aufe aufeVar2 = (aufe) aihfVarCreateBuilder.instance;
            aufeVar2.d = ajhvVar;
            aufeVar2.b |= 2;
        }
        aihf builder = aufdVar.toBuilder();
        aufe aufeVar3 = (aufe) aihfVarCreateBuilder.build();
        builder.copyOnWrite();
        aufd aufdVar2 = (aufd) builder.instance;
        aufeVar3.getClass();
        aufdVar2.d = aufeVar3;
        aufdVar2.c = 2;
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (aufd) aihnVarBuild;
    }

    @Override // defpackage.uhv
    public final void h() {
        if (this.j.e(this.m)) {
            this.n = ((ukp) this.b.io()).e().af(new usn(new hho((Object) this, 7, (byte[][]) null), 13));
        }
    }

    @Override // defpackage.uhv
    public final void i() {
        if (this.j.e(this.m)) {
            Object obj = this.n;
            if (obj != null) {
                avnr.b((AtomicReference) obj);
            }
            awwd awwdVar = this.f;
            if (awwdVar != null) {
                awwdVar.p(null);
            }
        }
    }

    @Override // defpackage.uhv, defpackage.ugl
    public final /* synthetic */ void iY(ugk ugkVar) {
        ufs ufsVar = ((uke) ugkVar).a;
        ufsVar.getClass();
        this.m = ufsVar;
        k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(String str, aufd aufdVar, aufe aufeVar, awoq awoqVar) {
        uzo uzoVar;
        aufd aufdVar2;
        String str2;
        uyr uyrVarA;
        if (awoqVar instanceof uzo) {
            uzoVar = (uzo) awoqVar;
            int i = uzoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzoVar.c = i - Integer.MIN_VALUE;
            } else {
                uzoVar = new uzo(this, awoqVar);
            }
        } else {
            uzoVar = new uzo(this, awoqVar);
        }
        Object obj = uzoVar.a;
        awox awoxVar = awox.a;
        int i2 = uzoVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aufdVar2 = uzoVar.e;
                str2 = uzoVar.d;
                atqp.j(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return Optional.empty();
        }
        atqp.j(obj);
        uzoVar.d = str;
        uzoVar.e = aufdVar;
        uzoVar.c = 1;
        awud awudVar = new awud(JniZero.q(uzoVar), 1);
        awudVar.w();
        uys uysVar = this.c;
        atte atteVar = aufeVar.c;
        if (atteVar == null) {
            atteVar = atte.a;
        }
        ajhv ajhvVar = aufeVar.d;
        if (ajhvVar == null) {
            ajhvVar = ajhv.a;
        }
        uysVar.e(str, atteVar, null, ajhvVar, null, agpi.a, new uzs(awudVar, 1));
        Object objJ = awudVar.j();
        if (objJ == awoxVar) {
            return awoxVar;
        }
        obj = objJ;
        aufdVar2 = aufdVar;
        str2 = str;
        if (((Optional) obj).isPresent() && (uyrVarA = this.c.a(str2)) != null && uyrVarA.e != null && uyrVarA.b != null) {
            return Optional.of(new ury(q(aufdVar2, uyrVarA), p(aufdVar2, uyrVarA)));
        }
        awou awouVar = this.l;
        hqx hqxVar = new hqx(this, (awoq) null, 6);
        uzoVar.d = null;
        uzoVar.e = null;
        uzoVar.c = 2;
        if (awro.p(awouVar, hqxVar, uzoVar) == awoxVar) {
            return awoxVar;
        }
        return Optional.empty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v5, types: [awqg, java.lang.Object] */
    public final Object m(List list, usd usdVar, awoq awoqVar) throws Throwable {
        uzp uzpVar;
        if (awoqVar instanceof uzp) {
            uzpVar = (uzp) awoqVar;
            int i = uzpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzpVar.c = i - Integer.MIN_VALUE;
            } else {
                uzpVar = new uzp(this, awoqVar);
            }
        } else {
            uzpVar = new uzp(this, awoqVar);
        }
        Object objP = uzpVar.a;
        awox awoxVar = awox.a;
        int i2 = uzpVar.c;
        if (i2 == 0) {
            atqp.j(objP);
            awou awouVar = this.k;
            qbj qbjVar = new qbj(list, this, (awoq) null, 10);
            uzpVar.d = usdVar;
            uzpVar.c = 1;
            objP = awro.p(awouVar, qbjVar, uzpVar);
            if (objP == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            usdVar = uzpVar.d;
            atqp.j(objP);
        }
        agjz agjzVar = new agjz(4);
        for (Optional optional : (List) objP) {
            urh urhVar = new urh(new hho(agjzVar, 6, (float[]) null), 9);
            if (true == optional.isPresent()) {
                urhVar.a.invoke(optional.get());
            }
        }
        usdVar.h(new uug(agjzVar.g(), 0));
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0137 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:13:0x0032, B:63:0x014d, B:14:0x0037, B:60:0x0132, B:17:0x0040, B:49:0x00f4, B:51:0x00fc, B:53:0x0104, B:55:0x0108, B:57:0x010c, B:58:0x011e, B:61:0x0137, B:18:0x0045, B:44:0x00c7, B:21:0x004e, B:33:0x008b, B:34:0x0098, B:36:0x009e, B:40:0x00af, B:42:0x00b3, B:46:0x00cc, B:31:0x0079), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final Object n(String str, aufd aufdVar, awoq awoqVar) {
        uzr uzrVar;
        vbh vbhVar;
        InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse;
        Iterator<E> it;
        Object next;
        ajhu ajhuVar;
        String str2;
        aufd aufdVar2;
        awou awouVar;
        tiy tiyVar;
        awou awouVar2;
        hqx hqxVar;
        uyr uyrVarA;
        awou awouVar3;
        hqx hqxVar2;
        if (awoqVar instanceof uzr) {
            uzrVar = (uzr) awoqVar;
            int i = uzrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzrVar.c = i - Integer.MIN_VALUE;
            } else {
                uzrVar = new uzr(this, awoqVar);
            }
        } else {
            uzrVar = new uzr(this, awoqVar);
        }
        Object objAd = uzrVar.a;
        awox awoxVar = awox.a;
        try {
            switch (uzrVar.c) {
                case 0:
                    atqp.j(objAd);
                    apsr apsrVar = aufdVar.g;
                    if (apsrVar == null) {
                        apsrVar = apsr.a;
                    }
                    String str3 = (apsrVar.b == 4 ? (apse) apsrVar.c : apse.a).d;
                    str3.getClass();
                    uzy uzyVarA = uzz.a();
                    uzyVarA.b(str);
                    uzyVarA.c(str3);
                    ListenableFuture listenableFutureB = this.o.b(uzyVarA.a());
                    uzrVar.d = str;
                    uzrVar.e = aufdVar;
                    uzrVar.c = 1;
                    objAd = awrc.ad(listenableFutureB, uzrVar);
                    if (objAd == awoxVar) {
                        return awoxVar;
                    }
                    vbhVar = (vbh) objAd;
                    innertubeGetAssetService$GetAssetResponse = vbhVar.a;
                    aiie aiieVar = innertubeGetAssetService$GetAssetResponse.d;
                    aiieVar.getClass();
                    it = aiieVar.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        ajhuVar = (ajhu) next;
                        if (ajhuVar != null) {
                            awouVar = this.l;
                            tiyVar = new tiy(this, ajhuVar, (awoq) null, 2);
                            uzrVar.d = null;
                            uzrVar.e = null;
                            uzrVar.c = 2;
                            if (awro.p(awouVar, tiyVar, uzrVar) == awoxVar) {
                                return awoxVar;
                            }
                            return Optional.empty();
                        }
                        uzrVar.d = str;
                        uzrVar.e = aufdVar;
                        uzrVar.c = 3;
                        awud awudVar = new awud(JniZero.q(uzrVar), 1);
                        awudVar.w();
                        this.c.c(str, innertubeGetAssetService$GetAssetResponse, vbhVar.b, new uzs(awudVar, 0));
                        objAd = awudVar.j();
                        if (objAd != awoxVar) {
                            return awoxVar;
                        }
                        aufd aufdVar3 = aufdVar;
                        str2 = str;
                        aufdVar2 = aufdVar3;
                        if (!((Optional) objAd).isPresent()) {
                            awouVar2 = this.l;
                            hqxVar = new hqx(this, (awoq) null, 8, (char[]) null);
                            uzrVar.d = null;
                            uzrVar.e = null;
                            uzrVar.c = 5;
                            if (awro.p(awouVar2, hqxVar, uzrVar) == awoxVar) {
                                return awoxVar;
                            }
                            return Optional.empty();
                        }
                        uyrVarA = this.c.a(str2);
                        if (uyrVarA == null && uyrVarA.e != null && uyrVarA.b != null) {
                            return Optional.of(new ury(q(aufdVar2, uyrVarA), p(aufdVar2, uyrVarA)));
                        }
                        awouVar3 = this.l;
                        hqxVar2 = new hqx(this, (awoq) null, 7, (byte[]) null);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 4;
                        if (awro.p(awouVar3, hqxVar2, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    } while (!awrc.c(((ajhu) next).b, str));
                    ajhuVar = (ajhu) next;
                    if (ajhuVar != null) {
                        awouVar = this.l;
                        tiyVar = new tiy(this, ajhuVar, (awoq) null, 2);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 2;
                        if (awro.p(awouVar, tiyVar, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    }
                    uzrVar.d = str;
                    uzrVar.e = aufdVar;
                    uzrVar.c = 3;
                    awud awudVar2 = new awud(JniZero.q(uzrVar), 1);
                    awudVar2.w();
                    this.c.c(str, innertubeGetAssetService$GetAssetResponse, vbhVar.b, new uzs(awudVar2, 0));
                    objAd = awudVar2.j();
                    if (objAd != awoxVar) {
                        return awoxVar;
                    }
                    aufd aufdVar4 = aufdVar;
                    str2 = str;
                    aufdVar2 = aufdVar4;
                    if (!((Optional) objAd).isPresent()) {
                        awouVar2 = this.l;
                        hqxVar = new hqx(this, (awoq) null, 8, (char[]) null);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 5;
                        if (awro.p(awouVar2, hqxVar, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    }
                    uyrVarA = this.c.a(str2);
                    if (uyrVarA == null) {
                    }
                    awouVar3 = this.l;
                    hqxVar2 = new hqx(this, (awoq) null, 7, (byte[]) null);
                    uzrVar.d = null;
                    uzrVar.e = null;
                    uzrVar.c = 4;
                    if (awro.p(awouVar3, hqxVar2, uzrVar) == awoxVar) {
                        return awoxVar;
                    }
                    return Optional.empty();
                case 1:
                    aufdVar = uzrVar.e;
                    str = uzrVar.d;
                    atqp.j(objAd);
                    vbhVar = (vbh) objAd;
                    innertubeGetAssetService$GetAssetResponse = vbhVar.a;
                    aiie aiieVar2 = innertubeGetAssetService$GetAssetResponse.d;
                    aiieVar2.getClass();
                    it = aiieVar2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        ajhuVar = (ajhu) next;
                        if (ajhuVar != null) {
                            awouVar = this.l;
                            tiyVar = new tiy(this, ajhuVar, (awoq) null, 2);
                            uzrVar.d = null;
                            uzrVar.e = null;
                            uzrVar.c = 2;
                            if (awro.p(awouVar, tiyVar, uzrVar) == awoxVar) {
                                return awoxVar;
                            }
                            return Optional.empty();
                        }
                        uzrVar.d = str;
                        uzrVar.e = aufdVar;
                        uzrVar.c = 3;
                        awud awudVar3 = new awud(JniZero.q(uzrVar), 1);
                        awudVar3.w();
                        this.c.c(str, innertubeGetAssetService$GetAssetResponse, vbhVar.b, new uzs(awudVar3, 0));
                        objAd = awudVar3.j();
                        if (objAd != awoxVar) {
                            return awoxVar;
                        }
                        aufd aufdVar5 = aufdVar;
                        str2 = str;
                        aufdVar2 = aufdVar5;
                        if (!((Optional) objAd).isPresent()) {
                            awouVar2 = this.l;
                            hqxVar = new hqx(this, (awoq) null, 8, (char[]) null);
                            uzrVar.d = null;
                            uzrVar.e = null;
                            uzrVar.c = 5;
                            if (awro.p(awouVar2, hqxVar, uzrVar) == awoxVar) {
                                return awoxVar;
                            }
                            return Optional.empty();
                        }
                        uyrVarA = this.c.a(str2);
                        if (uyrVarA == null) {
                            break;
                        }
                        awouVar3 = this.l;
                        hqxVar2 = new hqx(this, (awoq) null, 7, (byte[]) null);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 4;
                        if (awro.p(awouVar3, hqxVar2, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    } while (!awrc.c(((ajhu) next).b, str));
                    ajhuVar = (ajhu) next;
                    if (ajhuVar != null) {
                        awouVar = this.l;
                        tiyVar = new tiy(this, ajhuVar, (awoq) null, 2);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 2;
                        if (awro.p(awouVar, tiyVar, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    }
                    uzrVar.d = str;
                    uzrVar.e = aufdVar;
                    uzrVar.c = 3;
                    awud awudVar4 = new awud(JniZero.q(uzrVar), 1);
                    awudVar4.w();
                    this.c.c(str, innertubeGetAssetService$GetAssetResponse, vbhVar.b, new uzs(awudVar4, 0));
                    objAd = awudVar4.j();
                    if (objAd != awoxVar) {
                        return awoxVar;
                    }
                    aufd aufdVar6 = aufdVar;
                    str2 = str;
                    aufdVar2 = aufdVar6;
                    if (!((Optional) objAd).isPresent()) {
                        awouVar2 = this.l;
                        hqxVar = new hqx(this, (awoq) null, 8, (char[]) null);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 5;
                        if (awro.p(awouVar2, hqxVar, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    }
                    uyrVarA = this.c.a(str2);
                    if (uyrVarA == null) {
                        break;
                    }
                    awouVar3 = this.l;
                    hqxVar2 = new hqx(this, (awoq) null, 7, (byte[]) null);
                    uzrVar.d = null;
                    uzrVar.e = null;
                    uzrVar.c = 4;
                    if (awro.p(awouVar3, hqxVar2, uzrVar) == awoxVar) {
                        return awoxVar;
                    }
                    return Optional.empty();
                case 2:
                    atqp.j(objAd);
                    return Optional.empty();
                case 3:
                    aufdVar2 = uzrVar.e;
                    str2 = uzrVar.d;
                    atqp.j(objAd);
                    if (!((Optional) objAd).isPresent()) {
                        awouVar2 = this.l;
                        hqxVar = new hqx(this, (awoq) null, 8, (char[]) null);
                        uzrVar.d = null;
                        uzrVar.e = null;
                        uzrVar.c = 5;
                        if (awro.p(awouVar2, hqxVar, uzrVar) == awoxVar) {
                            return awoxVar;
                        }
                        return Optional.empty();
                    }
                    uyrVarA = this.c.a(str2);
                    if (uyrVarA == null) {
                        break;
                    }
                    awouVar3 = this.l;
                    hqxVar2 = new hqx(this, (awoq) null, 7, (byte[]) null);
                    uzrVar.d = null;
                    uzrVar.e = null;
                    uzrVar.c = 4;
                    if (awro.p(awouVar3, hqxVar2, uzrVar) == awoxVar) {
                        return awoxVar;
                    }
                    return Optional.empty();
                case 4:
                    atqp.j(objAd);
                    return Optional.empty();
                case 5:
                    atqp.j(objAd);
                    return Optional.empty();
                case 6:
                    atqp.j(objAd);
                    return Optional.empty();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            awou awouVar4 = this.l;
            tiy tiyVar2 = new tiy(this, th, (awoq) null, 3);
            uzrVar.d = null;
            uzrVar.e = null;
            uzrVar.c = 6;
            if (awro.p(awouVar4, tiyVar2, uzrVar) == awoxVar) {
                return awoxVar;
            }
        }
    }

    public final void r() {
        this.f = null;
    }
}
