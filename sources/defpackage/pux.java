package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.util.Objects;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pux implements pul {
    public static final agsn a = agsn.h("GnpSdk");
    private static final pno c = pno.a("X-Goog-Api-Key");
    private static final pno d = pno.a("X-Goog-Spatula");
    private static final pno e = pno.a("X-Android-Cert");
    private static final pno f = pno.a("X-Android-Package");
    private static final pno g = pno.a("Authorization");
    public final awou b;
    private final pnn h;
    private final pls i;
    private final String j;
    private final ppe k;
    private final Context l;
    private final String m;

    static {
        pno.a("Cookie");
        pno.a("X-Goog-Visitor-Id");
        pno.a("X-Goog-Fitbit-Oauth-Token");
    }

    public pux(pnn pnnVar, pls plsVar, String str, ppe ppeVar, Context context, String str2, awou awouVar) {
        plsVar.getClass();
        ppeVar.getClass();
        context.getClass();
        awouVar.getClass();
        this.h = pnnVar;
        this.i = plsVar;
        this.j = str;
        this.k = ppeVar;
        this.l = context;
        this.m = str2;
        this.b = awouVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x0167  */
    /* JADX WARN: Code duplicated, block: B:45:0x016d  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0264  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(aiay aiayVar, String str, plx plxVar, boolean z, awoq awoqVar) throws Throwable {
        puq puqVar;
        pxk pxkVar;
        pky pkyVar;
        Object objD;
        String str2;
        pky pkyVar2;
        Object objD2;
        if (awoqVar instanceof puq) {
            puqVar = (puq) awoqVar;
            int i = puqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                puqVar.d = i - Integer.MIN_VALUE;
            } else {
                puqVar = new puq(this, awoqVar);
            }
        } else {
            puqVar = new puq(this, awoqVar);
        }
        Object objD3 = puqVar.b;
        Object obj = awox.a;
        int i2 = puqVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                plxVar = (plx) puqVar.a;
                aiayVar = puqVar.e;
                atqp.j(objD3);
                pkyVar = (pky) objD3;
                if (!(pkyVar instanceof pku)) {
                    objD = pkyVar.d();
                    if (objD != null) {
                        throw new IllegalArgumentException("Auth token is null");
                    }
                    ahud ahudVarD = ahno.D(aiayVar.toBuilder());
                    aihf builder = ahudVarD.P().toBuilder();
                    builder.getClass();
                    aihf aihfVarCreateBuilder = aiam.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiam aiamVar = (aiam) aihfVarCreateBuilder.instance;
                    aiamVar.b |= 1;
                    aiamVar.c = (String) objD;
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    builder.copyOnWrite();
                    aica aicaVar = (aica) builder.instance;
                    aicaVar.c = (aiam) aihnVarBuild;
                    aicaVar.b = 1;
                    ahudVarD.Q(aext.L(builder));
                    return new awml(ahudVarD.O(), new pla(awmy.a));
                }
                str2 = plxVar.c;
                if (str2 != null || str2.length() == 0) {
                    return new awml(aiayVar, pkyVar);
                }
                ahud ahudVarD2 = ahno.D(aiayVar.toBuilder());
                aihf builder2 = ahudVarD2.P().toBuilder();
                builder2.getClass();
                aihf aihfVarCreateBuilder2 = aian.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                aian aianVar = (aian) aihfVarCreateBuilder2.instance;
                aianVar.b |= 1;
                aianVar.c = str2;
                String message = ((pku) pkyVar).b().getMessage();
                if (message != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aian aianVar2 = (aian) aihfVarCreateBuilder2.instance;
                    aianVar2.b |= 2;
                    aianVar2.d = message;
                }
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                builder2.copyOnWrite();
                aica aicaVar2 = (aica) builder2.instance;
                aicaVar2.c = (aian) aihnVarBuild2;
                aicaVar2.b = 6;
                ahudVarD2.Q(aext.L(builder2));
                return new awml(ahudVarD2.O(), pkyVar);
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aiay aiayVar2 = puqVar.e;
                atqp.j(objD3);
                pky pkyVar3 = (pky) objD3;
                int iAu = a.au(pkyVar3);
                if (iAu != 0) {
                    if (iAu == 1) {
                        return new awml(aiayVar2, (pku) pkyVar3);
                    }
                    throw new awmj();
                }
                String str3 = (String) ((pla) pkyVar3).a;
                ahud ahudVarD3 = ahno.D(aiayVar2.toBuilder());
                aihf builder3 = ahudVarD3.P().toBuilder();
                builder3.getClass();
                aihf aihfVarCreateBuilder3 = aiak.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                str3.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aiak aiakVar = (aiak) aihfVarCreateBuilder3.instance;
                aiakVar.b |= 1;
                aiakVar.c = str3;
                aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
                aihnVarBuild3.getClass();
                builder3.copyOnWrite();
                aica aicaVar3 = (aica) builder3.instance;
                aicaVar3.c = (aiak) aihnVarBuild3;
                aicaVar3.b = 5;
                ahudVarD3.Q(aext.L(builder3));
                return new awml(ahudVarD3.O(), new pla(awmy.a));
            }
            pxkVar = (pxk) puqVar.a;
            aiayVar = puqVar.e;
            atqp.j(objD3);
            pkyVar2 = (pky) objD3;
            if (pkyVar2 instanceof pku) {
                return new awml(aiayVar, pkyVar2);
            }
            objD2 = pkyVar2.d();
            if (objD2 != null) {
                throw new IllegalArgumentException("Auth token is null");
            }
            ahud ahudVarD4 = ahno.D(aiayVar.toBuilder());
            aihf builder4 = ahudVarD4.P().toBuilder();
            builder4.getClass();
            aihf aihfVarCreateBuilder4 = aiag.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            aihfVarCreateBuilder4.copyOnWrite();
            aiag aiagVar = (aiag) aihfVarCreateBuilder4.instance;
            aiagVar.b |= 1;
            aiagVar.c = (String) objD2;
            String str4 = ((pxl) pxkVar).a;
            aihfVarCreateBuilder4.copyOnWrite();
            aiag aiagVar2 = (aiag) aihfVarCreateBuilder4.instance;
            aiagVar2.b |= 2;
            aiagVar2.d = str4;
            aihn aihnVarBuild4 = aihfVarCreateBuilder4.build();
            aihnVarBuild4.getClass();
            builder4.copyOnWrite();
            aica aicaVar4 = (aica) builder4.instance;
            aicaVar4.c = (aiag) aihnVarBuild4;
            aicaVar4.b = 3;
            ahudVarD4.Q(aext.L(builder4));
            return new awml(ahudVarD4.O(), new pla(awmy.a));
        }
        atqp.j(objD3);
        pxk pxkVarB = plxVar.b();
        Objects.checkIndex(0, 6);
        if (pxkVarB instanceof pxo) {
            String str5 = ((pxo) pxkVarB).a;
            puqVar.e = aiayVar;
            puqVar.a = plxVar;
            puqVar.d = 1;
            objD3 = d(str5, pxkVarB, z, puqVar);
            if (objD3 == obj) {
                return obj;
            }
            pkyVar = (pky) objD3;
            if (!(pkyVar instanceof pku)) {
                str2 = plxVar.c;
                if (str2 != null) {
                }
                return new awml(aiayVar, pkyVar);
            }
            objD = pkyVar.d();
            if (objD != null) {
                throw new IllegalArgumentException("Auth token is null");
            }
            ahud ahudVarD5 = ahno.D(aiayVar.toBuilder());
            aihf builder5 = ahudVarD5.P().toBuilder();
            builder5.getClass();
            aihf aihfVarCreateBuilder5 = aiam.a.createBuilder();
            aihfVarCreateBuilder5.getClass();
            aihfVarCreateBuilder5.copyOnWrite();
            aiam aiamVar2 = (aiam) aihfVarCreateBuilder5.instance;
            aiamVar2.b |= 1;
            aiamVar2.c = (String) objD;
            aihn aihnVarBuild5 = aihfVarCreateBuilder5.build();
            aihnVarBuild5.getClass();
            builder5.copyOnWrite();
            aica aicaVar5 = (aica) builder5.instance;
            aicaVar5.c = (aiam) aihnVarBuild5;
            aicaVar5.b = 1;
            ahudVarD5.Q(aext.L(builder5));
            return new awml(ahudVarD5.O(), new pla(awmy.a));
        }
        if (pxkVarB instanceof pxl) {
            String str6 = plxVar.d;
            if (str6 == null || str6.length() == 0) {
                return new awml(aiayVar, new pkv(new IllegalStateException("No actual account name found for delegated Gaia account"), pkx.ap));
            }
            puqVar.e = aiayVar;
            puqVar.a = pxkVarB;
            puqVar.d = 2;
            Object objD4 = d(str6, pxkVarB, z, puqVar);
            if (objD4 == obj) {
                return obj;
            }
            objD3 = objD4;
            pxkVar = pxkVarB;
            pkyVar2 = (pky) objD3;
            if (pkyVar2 instanceof pku) {
                return new awml(aiayVar, pkyVar2);
            }
            objD2 = pkyVar2.d();
            if (objD2 != null) {
                throw new IllegalArgumentException("Auth token is null");
            }
            ahud ahudVarD6 = ahno.D(aiayVar.toBuilder());
            aihf builder6 = ahudVarD6.P().toBuilder();
            builder6.getClass();
            aihf aihfVarCreateBuilder6 = aiag.a.createBuilder();
            aihfVarCreateBuilder6.getClass();
            aihfVarCreateBuilder6.copyOnWrite();
            aiag aiagVar3 = (aiag) aihfVarCreateBuilder6.instance;
            aiagVar3.b |= 1;
            aiagVar3.c = (String) objD2;
            String str7 = ((pxl) pxkVar).a;
            aihfVarCreateBuilder6.copyOnWrite();
            aiag aiagVar4 = (aiag) aihfVarCreateBuilder6.instance;
            aiagVar4.b |= 2;
            aiagVar4.d = str7;
            aihn aihnVarBuild6 = aihfVarCreateBuilder6.build();
            aihnVarBuild6.getClass();
            builder6.copyOnWrite();
            aica aicaVar6 = (aica) builder6.instance;
            aicaVar6.c = (aiag) aihnVarBuild6;
            aicaVar6.b = 3;
            ahudVarD6.Q(aext.L(builder6));
            return new awml(ahudVarD6.O(), new pla(awmy.a));
        }
        if (pxkVarB instanceof pxn) {
            return new awml(aiayVar, new pkv(new IllegalArgumentException("fitbitAuthDataProvider not found, can't get fitbit auth token."), pkx.ao));
        }
        if (pxkVarB instanceof pyd) {
            if (str == null) {
                return new awml(aiayVar, new pkw(new IllegalArgumentException("Zwieback ID must not be null when registering Zwieback"), pkx.ar));
            }
            ahud ahudVarD7 = ahno.D(aiayVar.toBuilder());
            aihf builder7 = ahudVarD7.P().toBuilder();
            builder7.getClass();
            aihf aihfVarCreateBuilder7 = aice.a.createBuilder();
            aihfVarCreateBuilder7.getClass();
            aihfVarCreateBuilder7.copyOnWrite();
            aice aiceVar = (aice) aihfVarCreateBuilder7.instance;
            aiceVar.b |= 1;
            aiceVar.c = str;
            aihn aihnVarBuild7 = aihfVarCreateBuilder7.build();
            aihnVarBuild7.getClass();
            builder7.copyOnWrite();
            aica aicaVar7 = (aica) builder7.instance;
            aicaVar7.c = (aice) aihnVarBuild7;
            aicaVar7.b = 2;
            ahudVarD7.Q(aext.L(builder7));
            return new awml(ahudVarD7.O(), new pla(awmy.a));
        }
        if (!(pxkVarB instanceof pyb)) {
            throw new awmj();
        }
        if (str == null) {
            return new awml(aiayVar, new pkv(new IllegalArgumentException("Visitor ID must not be null when registering YouTube Visitor account"), pkx.aq));
        }
        ahud ahudVarD8 = ahno.D(aiayVar.toBuilder());
        aihf builder8 = ahudVarD8.P().toBuilder();
        builder8.getClass();
        aihf aihfVarCreateBuilder8 = aicd.a.createBuilder();
        aihfVarCreateBuilder8.getClass();
        aihfVarCreateBuilder8.copyOnWrite();
        aicd aicdVar = (aicd) aihfVarCreateBuilder8.instance;
        aicdVar.b |= 1;
        aicdVar.c = str;
        aihn aihnVarBuild8 = aihfVarCreateBuilder8.build();
        aihnVarBuild8.getClass();
        builder8.copyOnWrite();
        aica aicaVar8 = (aica) builder8.instance;
        aicaVar8.c = (aicd) aihnVarBuild8;
        aicaVar8.b = 4;
        ahudVarD8.Q(aext.L(builder8));
        return new awml(ahudVarD8.O(), new pla(awmy.a));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0117  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ahud] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f0 -> B:36:0x00f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r17, java.lang.String r18, defpackage.aiaz r19, boolean r20, defpackage.awoq r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pux.b(java.util.List, java.lang.String, aiaz, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [pux] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final Object c(List list, String str, aiaz aiazVar, boolean z, awoq awoqVar) {
        puu puuVar;
        ?? r5;
        aiaz aiazVar2;
        pky pkyVar;
        if (awoqVar instanceof puu) {
            puuVar = (puu) awoqVar;
            int i = puuVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                puuVar.e = i - Integer.MIN_VALUE;
            } else {
                puuVar = new puu(this, awoqVar);
            }
        } else {
            puuVar = new puu(this, awoqVar);
        }
        puu puuVar2 = puuVar;
        Object objB = puuVar2.c;
        awox awoxVar = awox.a;
        int i2 = puuVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = puuVar2.b;
                aiazVar2 = puuVar2.f;
                atqp.j(objB);
                r5 = obj;
            }
            pkyVar = (pky) objB;
            if (pkyVar instanceof pla) {
                pkyVar.getClass();
                return (pku) pkyVar;
            }
            Object obj2 = ((pla) pkyVar).a;
            obj2.getClass();
            return new pla(new pqq(aiazVar2, (aibb) obj2, r5));
        }
        atqp.j(objB);
        puuVar2.a = z;
        puuVar2.e = 1;
        objB = b(list, str, aiazVar, z, puuVar2);
        if (objB == awoxVar) {
            return awoxVar;
        }
        pky pkyVar2 = (pky) objB;
        URL url = new URL(this.j.concat("/v1/multiloginupdate"));
        if (!(pkyVar2 instanceof pla)) {
            pkyVar2.getClass();
            return (pku) pkyVar2;
        }
        awml awmlVar = (awml) ((pla) pkyVar2).a;
        aiaz aiazVar3 = (aiaz) awmlVar.a;
        Map map = (Map) awmlVar.b;
        aibb aibbVar = aibb.a;
        aibbVar.getClass();
        puuVar2.f = aiazVar3;
        puuVar2.b = map;
        puuVar2.e = 2;
        objB = f(url, aiazVar3, aibbVar, puuVar2);
        if (objB == awoxVar) {
            return awoxVar;
        }
        r5 = map;
        aiazVar2 = aiazVar3;
        pkyVar = (pky) objB;
        if (pkyVar instanceof pla) {
            pkyVar.getClass();
            return (pku) pkyVar;
        }
        Object obj3 = ((pla) pkyVar).a;
        obj3.getClass();
        return new pla(new pqq(aiazVar2, (aibb) obj3, r5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [pxk] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object d(String str, pxk pxkVar, boolean z, awoq awoqVar) throws Throwable {
        puw puwVar;
        Object obj;
        pky pkyVar;
        ?? r7;
        Object pueVar;
        Object obj2;
        if (awoqVar instanceof puw) {
            puwVar = (puw) awoqVar;
            int i = puwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                puwVar.d = i - Integer.MIN_VALUE;
            } else {
                puwVar = new puw(this, awoqVar);
            }
        } else {
            puwVar = new puw(this, awoqVar);
        }
        Object objD = puwVar.b;
        awox awoxVar = awox.a;
        int i2 = puwVar.d;
        if (i2 == 0) {
            atqp.j(objD);
            ppe ppeVar = this.k;
            if (z) {
                puwVar.a = pxkVar;
                puwVar.d = 1;
                objD = ppeVar.c(str, puwVar);
                if (objD == awoxVar) {
                    obj = pxkVar;
                    return awoxVar;
                }
                obj = pxkVar;
                pkyVar = (pky) objD;
                r7 = obj;
            } else {
                puwVar.a = pxkVar;
                puwVar.d = 2;
                objD = ppeVar.d(str, puwVar);
                if (objD == awoxVar) {
                    obj2 = pxkVar;
                    return awoxVar;
                }
                obj2 = pxkVar;
                pkyVar = (pky) objD;
                r7 = obj2;
            }
        } else if (i2 == 1) {
            Object obj3 = puwVar.a;
            atqp.j(objD);
            obj = obj3;
            obj = pxkVar;
            pkyVar = (pky) objD;
            r7 = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj4 = puwVar.a;
            atqp.j(objD);
            obj2 = obj4;
            obj2 = pxkVar;
            pkyVar = (pky) objD;
            r7 = obj2;
        }
        pky pkyVar2 = pkyVar;
        Objects.checkIndex(0, 4);
        if (pkyVar2 == null) {
            return pkyVar2;
        }
        if (pkyVar2 instanceof ppd) {
            ppd ppdVar = (ppd) pkyVar2;
            pueVar = new puf(ppdVar.a, r7, ppdVar.b);
        } else if (pkyVar2 instanceof ppb) {
            ppb ppbVar = (ppb) pkyVar2;
            pueVar = new pue(ppbVar.a, r7, ppbVar.b);
        } else {
            if (!(pkyVar2 instanceof ppc)) {
                return pkyVar2;
            }
            ppc ppcVar = (ppc) pkyVar2;
            pueVar = new pue(ppcVar.a, r7, ppcVar.b);
        }
        return pueVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(URL url, MessageLite messageLite, awoq awoqVar) throws Throwable {
        put putVar;
        tge tgeVar;
        if (awoqVar instanceof put) {
            putVar = (put) awoqVar;
            int i = putVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                putVar.c = i - Integer.MIN_VALUE;
            } else {
                putVar = new put(this, awoqVar);
            }
        } else {
            putVar = new put(this, awoqVar);
        }
        Object obj = putVar.a;
        Object obj2 = awox.a;
        int i2 = putVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            tge tgeVarA = pnp.a();
            tgeVarA.a = 2;
            tgeVarA.k(url);
            tgeVarA.j();
            tgeVarA.d = messageLite.toByteArray();
            putVar.d = tgeVarA;
            putVar.c = 1;
            Object objG = g(tgeVarA, putVar);
            if (objG == obj2) {
                return obj2;
            }
            obj = objG;
            tgeVar = tgeVarA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tgeVar = putVar.d;
            atqp.j(obj);
        }
        pky pkyVar = (pky) obj;
        if (!pkyVar.g()) {
            return new pla(tgeVar.g());
        }
        pkyVar.getClass();
        return (pku) pkyVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(URL url, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        puv puvVar;
        MessageLite messageLite3;
        pnq pnqVar;
        Integer num;
        Integer num2;
        Object puhVar;
        Throwable thA;
        Object puiVar;
        Throwable thA2;
        atxl atxlVar;
        if (awoqVar instanceof puv) {
            puvVar = (puv) awoqVar;
            int i = puvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                puvVar.c = i - Integer.MIN_VALUE;
            } else {
                puvVar = new puv(this, awoqVar);
            }
        } else {
            puvVar = new puv(this, awoqVar);
        }
        Object objE = puvVar.a;
        Object obj = awox.a;
        int i2 = puvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                messageLite2 = puvVar.d;
                atqp.j(objE);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                messageLite3 = puvVar.d;
                atqp.j(objE);
            }
            pnqVar = (pnq) objE;
            pnqVar.getClass();
            if (pnqVar.b()) {
                try {
                    Object objD = messageLite3.getParserForType().d(pnqVar.b);
                    objD.getClass();
                    return new pla(objD);
                } catch (aiik e2) {
                    return new pkv(new pud(e2), pkx.ax);
                }
            }
            byte[] bArr = pnqVar.b;
            num = pnqVar.a;
            if (num != null || num.intValue() != 409 || bArr == null) {
                if (pnqVar.c(auvj.c())) {
                    num2 = pnqVar.a;
                    if (num2 == null && num2.intValue() == 401) {
                        Throwable thA3 = pnqVar.a();
                        if (thA3 == null) {
                            throw new IllegalArgumentException("Error is null");
                        }
                        puiVar = new pui(thA3, pkx.av);
                    } else {
                        thA = pnqVar.a();
                        if (thA == null) {
                            thA = new pud();
                        }
                        puhVar = new puh(thA, pkx.aw);
                    }
                } else {
                    thA2 = pnqVar.a();
                    if (thA2 == null) {
                        thA2 = new pud();
                    }
                    puhVar = new pug(thA2, pkx.aw);
                }
                return puhVar;
            }
            atxp atxpVar = (atxp) aihn.parseFrom(atxp.a, bArr);
            atxpVar.getClass();
            if (atxpVar.d.isEmpty()) {
                ((agsj) a.c()).t("Got a conflict result with a status proto, but details are empty.");
            } else {
                try {
                    atxlVar = (atxl) aihn.parseFrom(atxl.a, ((aifv) atxpVar.d.get(0)).c);
                } catch (Exception unused) {
                    atxlVar = null;
                }
                if (awrc.c(atxlVar != null ? atxlVar.c : null, "notifications-pa.googleapis.com") && awrc.c(atxlVar.b, "TOKEN_ALREADY_IN_USE")) {
                    Throwable thA4 = pnqVar.a();
                    if (thA4 == null) {
                        throw new IllegalArgumentException("Error is null");
                    }
                    puiVar = new puj(thA4, pkx.au);
                }
            }
            if (pnqVar.c(auvj.c())) {
                thA2 = pnqVar.a();
                if (thA2 == null) {
                    thA2 = new pud();
                }
                puhVar = new pug(thA2, pkx.aw);
            } else {
                num2 = pnqVar.a;
                if (num2 == null) {
                }
                thA = pnqVar.a();
                if (thA == null) {
                    thA = new pud();
                }
                puhVar = new puh(thA, pkx.aw);
            }
            return puhVar;
            return puiVar;
        }
        atqp.j(objE);
        puvVar.d = (aibb) messageLite2;
        puvVar.c = 1;
        objE = e(url, messageLite, puvVar);
        if (objE == obj) {
            return obj;
        }
        pky pkyVar = (pky) objE;
        if (!(pkyVar instanceof pla)) {
            pkyVar.getClass();
            return (pku) pkyVar;
        }
        ListenableFuture listenableFutureA = this.h.a((pnp) ((pla) pkyVar).a);
        listenableFutureA.getClass();
        puvVar.d = (aibb) messageLite2;
        puvVar.c = 2;
        objE = awrc.ad(listenableFutureA, puvVar);
        if (objE == obj) {
            return obj;
        }
        messageLite3 = messageLite2;
        pnqVar = (pnq) objE;
        pnqVar.getClass();
        if (pnqVar.b()) {
            Object objD2 = messageLite3.getParserForType().d(pnqVar.b);
            objD2.getClass();
            return new pla(objD2);
        }
        byte[] bArr2 = pnqVar.b;
        num = pnqVar.a;
        if (num != null) {
            if (pnqVar.c(auvj.c())) {
                thA2 = pnqVar.a();
                if (thA2 == null) {
                    thA2 = new pud();
                }
                puhVar = new pug(thA2, pkx.aw);
            } else {
                num2 = pnqVar.a;
                if (num2 == null) {
                }
                thA = pnqVar.a();
                if (thA == null) {
                    thA = new pud();
                }
                puhVar = new puh(thA, pkx.aw);
            }
            return puhVar;
        }
        if (pnqVar.c(auvj.c())) {
            thA2 = pnqVar.a();
            if (thA2 == null) {
                thA2 = new pud();
            }
            puhVar = new pug(thA2, pkx.aw);
        } else {
            num2 = pnqVar.a;
            if (num2 == null) {
            }
            thA = pnqVar.a();
            if (thA == null) {
                thA = new pud();
            }
            puhVar = new puh(thA, pkx.aw);
        }
        return puhVar;
        return puiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(tge tgeVar, awoq awoqVar) throws Throwable {
        pus pusVar;
        if (awoqVar instanceof pus) {
            pusVar = (pus) awoqVar;
            int i = pusVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pusVar.c = i - Integer.MIN_VALUE;
            } else {
                pusVar = new pus(this, awoqVar);
            }
        } else {
            pusVar = new pus(this, awoqVar);
        }
        Object objB = pusVar.a;
        awox awoxVar = awox.a;
        int i2 = pusVar.c;
        if (i2 == 0) {
            atqp.j(objB);
            if (auva.c()) {
                String str = this.i.f;
                if (str == null || str.length() == 0) {
                    return new pkv(new IllegalStateException("One of Account Name, Zwieback or API Key must be set."), pkx.V);
                }
                tgeVar.i(c, str);
                String str2 = this.m;
                if (str2 != null && str2.length() != 0) {
                    tgeVar.i(f, this.l.getPackageName());
                    tgeVar.i(e, str2);
                }
            } else {
                ppe ppeVar = this.k;
                pusVar.d = tgeVar;
                pusVar.c = 2;
                objB = ppeVar.b(pusVar);
                if (objB == awoxVar) {
                    return awoxVar;
                }
            }
            return new pla(awmy.a);
        }
        if (i2 == 1) {
            tge tgeVar2 = pusVar.d;
            atqp.j(objB);
            pky pkyVar = (pky) objB;
            if (!(pkyVar instanceof pla)) {
                pkyVar.getClass();
                return (pku) pkyVar;
            }
            pno pnoVar = g;
            Object obj = ((pla) pkyVar).a;
            java.util.Objects.toString(obj);
            tgeVar2.i(pnoVar, "Bearer ".concat(String.valueOf(obj)));
            return new pla(awmy.a);
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tgeVar = pusVar.d;
        atqp.j(objB);
        pky pkyVar2 = (pky) objB;
        int iAu = a.au(pkyVar2);
        if (iAu != 0) {
            if (iAu == 1) {
                return qnl.ax((pku) pkyVar2);
            }
            throw new awmj();
        }
        tgeVar.i(d, (String) ((pla) pkyVar2).a);
        return new pla(awmy.a);
    }
}
