package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import app.rive.semantics.SemanticState;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iuk implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iuk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0307  */
    /* JADX WARN: Code duplicated, block: B:144:0x030f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0327  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r10v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v44, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        kik kikVar;
        int i;
        double d;
        int i2;
        int i3;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return ((iuo) this.a).Q((iux) obj, null);
            case 1:
                return ((iuf) this.a).P((iux) obj, null);
            case 2:
                iux iuxVar = (iux) obj;
                long j = iuxVar.a;
                agke agkeVar = (agke) Optional.ofNullable((agke) this.a.get(Long.valueOf(j))).orElse(agpi.a);
                iuw iuwVar = new iuw();
                iuwVar.b(j);
                iuwVar.c(iuxVar.b);
                iuwVar.d(agkeVar);
                return iuwVar.a();
            case 3:
                Object obj2 = ((hcg) obj).a.get();
                boolean z2 = obj2 instanceof anjx;
                kwq kwqVar = ((ixd) this.a).h;
                if (z2) {
                    return (anzn) ((hfn) kwqVar.b).ap(anjx.class, anzn.class, (anjx) obj2, kwq.p());
                }
                if (obj2 instanceof anuk) {
                    return (anzn) ((hfn) kwqVar.b).ap(anuk.class, anzn.class, (anuk) obj2, kwq.p());
                }
                throw new IllegalArgumentException("Unexpected container entity: ".concat(obj2.toString()));
            case 4:
                jkk jkkVar = (jkk) obj;
                aihf aihfVarCreateBuilder = ajtb.a.createBuilder();
                aihf aihfVarCreateBuilder2 = ajsy.a.createBuilder();
                String str = jkkVar.a;
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar = (ajsy) aihfVarCreateBuilder2.instance;
                ajsyVar.b |= SemanticState.Multiline;
                ajsyVar.n = str;
                aihf aihfVarCreateBuilder3 = ajsz.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                ajsz ajszVar = (ajsz) aihfVarCreateBuilder3.instance;
                ajszVar.c = 10;
                ajszVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar2 = (ajsy) aihfVarCreateBuilder2.instance;
                ajsz ajszVar2 = (ajsz) aihfVarCreateBuilder3.build();
                ajszVar2.getClass();
                ajsyVar2.e = ajszVar2;
                ajsyVar2.b |= 1;
                ajwo ajwoVarB = ixt.B(jkkVar.b);
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar3 = (ajsy) aihfVarCreateBuilder2.instance;
                ajwoVarB.getClass();
                ajsyVar3.g = ajwoVarB;
                ajsyVar3.b |= 4;
                ajwo ajwoVarB2 = ixt.B((String) this.a);
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar4 = (ajsy) aihfVarCreateBuilder2.instance;
                ajwoVarB2.getClass();
                ajsyVar4.h = ajwoVarB2;
                ajsyVar4.b |= 8;
                boolean z3 = jkkVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar5 = (ajsy) aihfVarCreateBuilder2.instance;
                ajsyVar5.b |= SemanticState.Focused;
                ajsyVar5.k = z3;
                alay alayVarD = ackj.d(str);
                aihfVarCreateBuilder2.copyOnWrite();
                ajsy ajsyVar6 = (ajsy) aihfVarCreateBuilder2.instance;
                alayVarD.getClass();
                ajsyVar6.f = alayVarD;
                ajsyVar6.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                ajtb ajtbVar = (ajtb) aihfVarCreateBuilder.instance;
                ajsy ajsyVar7 = (ajsy) aihfVarCreateBuilder2.build();
                ajsyVar7.getClass();
                ajtbVar.c = ajsyVar7;
                ajtbVar.b = 91394224;
                return (ajtb) aihfVarCreateBuilder.build();
            case 5:
                jla jlaVar = (jla) obj;
                ajwo ajwoVar = jlb.a;
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihl aihlVar = anlt.a;
                aihf aihfVarCreateBuilder4 = anls.a.createBuilder();
                String str2 = jlaVar.d;
                aihfVarCreateBuilder4.copyOnWrite();
                anls anlsVar = (anls) aihfVarCreateBuilder4.instance;
                str2.getClass();
                anlsVar.b |= 1;
                anlsVar.c = str2;
                Object obj3 = this.a;
                aihfVarCreateBuilder4.copyOnWrite();
                anls anlsVar2 = (anls) aihfVarCreateBuilder4.instance;
                anlsVar2.b |= 4;
                anlsVar2.d = jlaVar == obj3;
                aihhVar.e(aihlVar, (anls) aihfVarCreateBuilder4.build());
                return (ajwo) aihhVar.build();
            case 6:
                Map map = kkh.a;
                List list = kii.m;
                Context context = (Context) this.a;
                kif kifVar = new kif(context, "CLIENT_LOGGING_PROD");
                kifVar.e = (String) obj;
                kim kimVarA = auqe.a.io().a(context);
                kifVar.g = kimVarA;
                kifVar.h = 11;
                if ((kimVarA.b & 2) != 0) {
                    kil kilVar = kimVarA.d;
                    if (kilVar == null) {
                        kilVar = kil.a;
                    }
                    if ((kilVar.b & 1) != 0) {
                        double d2 = kilVar.c;
                        if (d2 >= 0.0d && d2 <= 1.0d) {
                            if ((kimVarA.b & 1) != 0) {
                                kikVar = kimVarA.c;
                                if (kikVar == null) {
                                    kikVar = kik.a;
                                }
                                i = kikVar.b;
                                if ((i & 1) != 0) {
                                    d = kikVar.c;
                                    if (d >= 0.0d) {
                                    }
                                }
                            }
                        }
                    }
                    aihf builder = kimVarA.toBuilder();
                    aihf aihfVarCreateBuilder5 = kik.a.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    kik kikVar2 = (kik) aihfVarCreateBuilder5.instance;
                    kikVar2.b |= 1;
                    kikVar2.c = 0.0d;
                    builder.copyOnWrite();
                    kim kimVar = (kim) builder.instance;
                    kik kikVar3 = (kik) aihfVarCreateBuilder5.build();
                    kikVar3.getClass();
                    kimVar.c = kikVar3;
                    kimVar.b |= 1;
                    aihf aihfVarCreateBuilder6 = kil.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    kil kilVar2 = (kil) aihfVarCreateBuilder6.instance;
                    kilVar2.b |= 1;
                    kilVar2.c = 0.0d;
                    builder.copyOnWrite();
                    kim kimVar2 = (kim) builder.instance;
                    kil kilVar3 = (kil) aihfVarCreateBuilder6.build();
                    kilVar3.getClass();
                    kimVar2.d = kilVar3;
                    kimVar2.b |= 2;
                    kifVar.g = (kim) builder.build();
                } else if ((kimVarA.b & 1) != 0) {
                    kikVar = kimVarA.c;
                    if (kikVar == null) {
                        kikVar = kik.a;
                    }
                    i = kikVar.b;
                    if ((i & 1) != 0) {
                        d = kikVar.c;
                        if (d >= 0.0d || d > 1.0d || (i2 = kikVar.d) <= 0 || ((i & 4) != 0 && ((i3 = kikVar.e) <= 0 || i3 > i2))) {
                            aihf builder2 = kimVarA.toBuilder();
                            aihf aihfVarCreateBuilder7 = kik.a.createBuilder();
                            aihfVarCreateBuilder7.copyOnWrite();
                            kik kikVar4 = (kik) aihfVarCreateBuilder7.instance;
                            kikVar4.b |= 1;
                            kikVar4.c = 0.0d;
                            builder2.copyOnWrite();
                            kim kimVar3 = (kim) builder2.instance;
                            kik kikVar5 = (kik) aihfVarCreateBuilder7.build();
                            kikVar5.getClass();
                            kimVar3.c = kikVar5;
                            kimVar3.b |= 1;
                            aihf aihfVarCreateBuilder8 = kil.a.createBuilder();
                            aihfVarCreateBuilder8.copyOnWrite();
                            kil kilVar4 = (kil) aihfVarCreateBuilder8.instance;
                            kilVar4.b |= 1;
                            kilVar4.c = 0.0d;
                            builder2.copyOnWrite();
                            kim kimVar4 = (kim) builder2.instance;
                            kil kilVar5 = (kil) aihfVarCreateBuilder8.build();
                            kilVar5.getClass();
                            kimVar4.d = kilVar5;
                            kimVar4.b |= 2;
                            kifVar.g = (kim) builder2.build();
                        }
                    } else {
                        aihf builder3 = kimVarA.toBuilder();
                        aihf aihfVarCreateBuilder9 = kik.a.createBuilder();
                        aihfVarCreateBuilder9.copyOnWrite();
                        kik kikVar6 = (kik) aihfVarCreateBuilder9.instance;
                        kikVar6.b |= 1;
                        kikVar6.c = 0.0d;
                        builder3.copyOnWrite();
                        kim kimVar5 = (kim) builder3.instance;
                        kik kikVar7 = (kik) aihfVarCreateBuilder9.build();
                        kikVar7.getClass();
                        kimVar5.c = kikVar7;
                        kimVar5.b |= 1;
                        aihf aihfVarCreateBuilder10 = kil.a.createBuilder();
                        aihfVarCreateBuilder10.copyOnWrite();
                        kil kilVar6 = (kil) aihfVarCreateBuilder10.instance;
                        kilVar6.b |= 1;
                        kilVar6.c = 0.0d;
                        builder3.copyOnWrite();
                        kim kimVar6 = (kim) builder3.instance;
                        kil kilVar7 = (kil) aihfVarCreateBuilder10.build();
                        kilVar7.getClass();
                        kimVar6.d = kilVar7;
                        kimVar6.b |= 2;
                        kifVar.g = (kim) builder3.build();
                    }
                }
                return kifVar.b();
            case 7:
                return this.a.invoke(obj);
            case 8:
                return this.a.invoke(obj);
            case 9:
                oin oinVar = (oin) obj;
                int iAS = a.aS(((oip) this.a).j);
                return nsj.a(oinVar, iAS != 0 ? iAS : 1);
            case 10:
                oin oinVar2 = (oin) obj;
                for (ohy ohyVar : ((ohz) this.a).g) {
                    if (ohyVar.b.equals(oinVar2.c)) {
                        if (oinVar2.e < 2147483647L && oinVar2.j < 2147483647L) {
                            return ohyVar;
                        }
                        aihf aihfVarCreateBuilder11 = oie.a.createBuilder();
                        long j2 = oinVar2.e;
                        aihfVarCreateBuilder11.copyOnWrite();
                        oie oieVar = (oie) aihfVarCreateBuilder11.instance;
                        oieVar.c |= 1;
                        oieVar.d = j2;
                        long j3 = oinVar2.j;
                        aihfVarCreateBuilder11.copyOnWrite();
                        oie oieVar2 = (oie) aihfVarCreateBuilder11.instance;
                        oieVar2.c |= 2;
                        oieVar2.e = j3;
                        aihh aihhVar2 = (aihh) ohyVar.toBuilder();
                        aihhVar2.e(oie.b, (oie) aihfVarCreateBuilder11.build());
                        return (ohy) aihhVar2.build();
                    }
                }
                throw new IllegalArgumentException("DataFileGroup does not contain DataFile with fileId: ".concat(String.valueOf(oinVar2.c)));
            case 11:
                ohy ohyVar2 = (ohy) obj;
                for (oin oinVar3 : ((oip) this.a).o) {
                    if (oinVar3.c.equals(ohyVar2.b)) {
                        aihl aihlVar2 = oie.b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar2);
                        ohyVar2.c(aihlVarCheckIsLite);
                        if (!ohyVar2.j.n(aihlVarCheckIsLite.d)) {
                            return oinVar3;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar2);
                        ohyVar2.c(aihlVarCheckIsLite2);
                        Object objK = ohyVar2.j.k(aihlVarCheckIsLite2.d);
                        oie oieVar3 = (oie) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        aihf builder4 = oinVar3.toBuilder();
                        long j4 = oieVar3.d;
                        builder4.copyOnWrite();
                        oin oinVar4 = (oin) builder4.instance;
                        oinVar4.b |= 4;
                        oinVar4.e = j4;
                        long j5 = oieVar3.e;
                        builder4.copyOnWrite();
                        oin oinVar5 = (oin) builder4.instance;
                        oinVar5.b |= SemanticState.Focused;
                        oinVar5.j = j5;
                        return (oin) builder4.build();
                    }
                }
                throw new IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(ohyVar2.b)));
            case 12:
                Integer num = (Integer) obj;
                Object obj4 = this.a;
                int i4 = otk.d;
                TypedValue typedValue = new TypedValue();
                Context context2 = (Context) obj4;
                context2.getResources().getValue(num.intValue(), typedValue, true);
                if (typedValue.string == null) {
                    return Boolean.FALSE;
                }
                String lowerCase = typedValue.string.toString().toLowerCase(Locale.getDefault());
                if (!lowerCase.endsWith(".gif") && !lowerCase.endsWith(".webp") && !lowerCase.endsWith(".avif")) {
                    return Boolean.FALSE;
                }
                List listC = erj.b(context2).f().c();
                ewv ewvVar = erj.b(context2).h;
                try {
                    InputStream inputStreamOpenRawResource = ((Context) obj4).getResources().openRawResource(num.intValue());
                    try {
                        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeG = ept.g(listC, inputStreamOpenRawResource, ewvVar);
                        Boolean boolValueOf = Boolean.valueOf(imageHeaderParser$ImageTypeG == ImageHeaderParser$ImageType.GIF || imageHeaderParser$ImageTypeG == ImageHeaderParser$ImageType.ANIMATED_WEBP || imageHeaderParser$ImageTypeG == ImageHeaderParser$ImageType.ANIMATED_AVIF);
                        if (inputStreamOpenRawResource == null) {
                            return boolValueOf;
                        }
                        inputStreamOpenRawResource.close();
                        return boolValueOf;
                    } catch (Throwable th) {
                        if (inputStreamOpenRawResource != null) {
                            try {
                                inputStreamOpenRawResource.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    return Boolean.FALSE;
                }
            case 13:
                return otk.a((Context) this.a, (Integer) obj);
            case 14:
                return ((nrc) this.a).f((qvu) obj);
            case 15:
                qvk qvkVar = (qvk) ((qxt) this.a).c.get(((qvc) obj).c);
                qvkVar.getClass();
                return qvkVar;
            case 16:
                qvc qvcVar = (qvc) obj;
                Optional optionalB = ((qzf) this.a).b(qvcVar);
                qvcVar.getClass();
                return new AbstractMap.SimpleImmutableEntry(qvcVar, optionalB);
            case 17:
                qup qupVar = (qup) obj;
                int i5 = rcl.l;
                qus qusVar = qupVar.b;
                boolean z4 = qusVar instanceof quv;
                if (z4) {
                    quv quvVar = (quv) qusVar;
                    if (quvVar.c == 0 && rar.c(qupVar)) {
                        qwr qwrVar = quvVar.k;
                        if (qwrVar instanceof qwt) {
                            Uri uri = ((qwt) qwrVar).a;
                            String scheme = uri.getScheme();
                            String path = uri.getPath();
                            if (scheme == null || path == null || !scheme.equals("file")) {
                                if (qusVar instanceof quy) {
                                    if (!(qusVar instanceof qux)) {
                                        if (qusVar instanceof quw) {
                                            if (!((agkz) this.a).contains(qupVar.a)) {
                                                z = true;
                                            }
                                        }
                                    } else if (qusVar instanceof quw) {
                                        if (!((agkz) this.a).contains(qupVar.a)) {
                                            z = true;
                                        }
                                    }
                                } else if (!(qusVar instanceof qux)) {
                                    if (qusVar instanceof quw) {
                                        if (!((agkz) this.a).contains(qupVar.a)) {
                                            z = true;
                                        }
                                    }
                                } else if (qusVar instanceof quw) {
                                    if (!((agkz) this.a).contains(qupVar.a)) {
                                        z = true;
                                    }
                                }
                            } else if (!((agkz) this.a).contains(qupVar.a)) {
                                z = true;
                            }
                        } else if (qusVar instanceof quy) {
                            if (!(qusVar instanceof qux)) {
                                if (qusVar instanceof quw) {
                                    if (!((agkz) this.a).contains(qupVar.a)) {
                                        z = true;
                                    }
                                }
                            } else if (qusVar instanceof quw) {
                                if (!((agkz) this.a).contains(qupVar.a)) {
                                    z = true;
                                }
                            }
                        } else if (!(qusVar instanceof qux)) {
                            if (qusVar instanceof quw) {
                                if (!((agkz) this.a).contains(qupVar.a)) {
                                    z = true;
                                }
                            }
                        } else if (qusVar instanceof quw) {
                            if (!((agkz) this.a).contains(qupVar.a)) {
                                z = true;
                            }
                        }
                    } else if ((qusVar instanceof quy) || !rar.c(qupVar) || ahno.aa(((quy) qusVar).k)) {
                        if (!(qusVar instanceof qux) && rar.c(qupVar)) {
                            qux quxVar = (qux) qusVar;
                            if (quxVar.p().getPath() == null || quxVar.c != 0) {
                                if (qusVar instanceof quw) {
                                    if (!((agkz) this.a).contains(qupVar.a)) {
                                        z = true;
                                    }
                                }
                            } else if (!((agkz) this.a).contains(qupVar.a)) {
                                z = true;
                            }
                        } else if ((qusVar instanceof quw) && rar.c(qupVar)) {
                            if (!((agkz) this.a).contains(qupVar.a) && !z4) {
                                z = true;
                            }
                        }
                    } else if (!((agkz) this.a).contains(qupVar.a)) {
                        z = true;
                    }
                } else if (qusVar instanceof quy) {
                    if (!(qusVar instanceof qux)) {
                        if (qusVar instanceof quw) {
                            if (!((agkz) this.a).contains(qupVar.a)) {
                                z = true;
                            }
                        }
                    } else if (qusVar instanceof quw) {
                        if (!((agkz) this.a).contains(qupVar.a)) {
                            z = true;
                        }
                    }
                } else if (!(qusVar instanceof qux)) {
                    if (qusVar instanceof quw) {
                        if (!((agkz) this.a).contains(qupVar.a)) {
                            z = true;
                        }
                    }
                } else if (qusVar instanceof quw) {
                    if (!((agkz) this.a).contains(qupVar.a)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 18:
                return ((nrc) this.a).f((qvs) obj);
            case 19:
                return new rgb((rfs) obj, ((rgc) this.a).b);
            default:
                rbm rbmVar = rgw.j;
                return nrb.c((Future) ((agkj) this.a).get((qvc) obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
        return Function$CC.$default$compose(this, function);
    }
}
