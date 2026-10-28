package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qbf {
    public static final /* synthetic */ int e = 0;
    private static final agsn f = agsn.h("GnpSdk");
    private static final pno g = pno.a("Cookie");
    private static final pno h = pno.a("X-Goog-Visitor-Id");
    private static final pno i = pno.a("X-Goog-PageId");
    private static final pno j = pno.a("X-Goog-Fitbit-Oauth-Token");
    private static final pno k = pno.a("X-Goog-Api-Key");
    private static final pno l = pno.a("X-Goog-Spatula");
    private static final pno m = pno.a("X-Android-Cert");
    private static final pno n = pno.a("X-Android-Package");
    public final Context a;
    public final ppe b;
    public final pls c;
    public final pwf d;
    private final String o;
    private final pnn p;
    private final agev q;
    private final String r;
    private final awou s;
    private final awou t;

    public qbf(Context context, ppe ppeVar, pls plsVar, String str, pnn pnnVar, pwf pwfVar, agev agevVar, String str2, awou awouVar, awou awouVar2) {
        context.getClass();
        ppeVar.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.a = context;
        this.b = ppeVar;
        this.c = plsVar;
        this.o = str;
        this.p = pnnVar;
        this.d = pwfVar;
        this.q = agevVar;
        this.r = str2;
        this.s = awouVar;
        this.t = awouVar2;
    }

    private final Object k(String str, boolean z, awoq awoqVar) {
        return awro.p(this.s, new qbd(z, this, str, null), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[Catch: Exception -> 0x0118, TryCatch #0 {Exception -> 0x0118, blocks: (B:13:0x002b, B:31:0x00c2, B:33:0x00ca, B:35:0x00eb, B:38:0x00f4, B:39:0x00fc, B:18:0x003c, B:24:0x0089, B:26:0x008f, B:28:0x00a7, B:21:0x0043), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: Exception -> 0x0118, TRY_LEAVE, TryCatch #0 {Exception -> 0x0118, blocks: (B:13:0x002b, B:31:0x00c2, B:33:0x00ca, B:35:0x00eb, B:38:0x00f4, B:39:0x00fc, B:18:0x003c, B:24:0x0089, B:26:0x008f, B:28:0x00a7, B:21:0x0043), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [qbf] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.google.protobuf.MessageLite] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final Object a(String str, plx plxVar, MessageLite messageLite, MessageLite messageLite2, boolean z, Map map, awoq awoqVar) throws Throwable {
        qbe qbeVar;
        tge tgeVar;
        Object obj;
        ?? r9;
        pnq pnqVar;
        if (awoqVar instanceof qbe) {
            qbeVar = (qbe) awoqVar;
            int i2 = qbeVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qbeVar.d = i2 - Integer.MIN_VALUE;
            } else {
                qbeVar = new qbe(this, awoqVar);
            }
        } else {
            qbeVar = new qbe(this, awoqVar);
        }
        Object objAd = qbeVar.b;
        awox awoxVar = awox.a;
        int i3 = qbeVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    tgeVar = qbeVar.e;
                    obj = qbeVar.a;
                    atqp.j(objAd);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = qbeVar.a;
                    atqp.j(objAd);
                    r9 = obj2;
                }
                pnqVar = (pnq) objAd;
                if (pnqVar.b()) {
                    ?? D = r9.getParserForType().d(pnqVar.b);
                    D.getClass();
                    qat qatVarB = qau.b();
                    qatVarB.c = pnqVar.a;
                    qatVarB.a = D;
                    return qatVarB.a();
                }
                qat qatVarB2 = qau.b();
                qatVarB2.c = pnqVar.a;
                qatVarB2.b = pnqVar.a();
                qatVarB2.c(pnqVar.c(auvj.c()));
                Throwable thA = pnqVar.a();
                qatVarB2.b(!(thA instanceof pnr) && ((pnr) thA).a == 401);
                return qatVarB2.a();
            }
            atqp.j(objAd);
            byte[] byteArray = messageLite.toByteArray();
            byteArray.getClass();
            tge tgeVarA = pnp.a();
            tgeVarA.a = 2;
            tgeVarA.k(new URI(this.o + str).toURL());
            tgeVarA.d = byteArray;
            tgeVarA.j();
            tgeVarA.h().putAll(map);
            qbeVar.a = messageLite2;
            qbeVar.e = tgeVarA;
            qbeVar.d = 1;
            Object objI = i(tgeVarA, plxVar, z, qbeVar);
            if (objI == awoxVar) {
                return awoxVar;
            }
            tgeVar = tgeVarA;
            objAd = objI;
            obj = messageLite2;
            pky pkyVar = (pky) objAd;
            if (pkyVar instanceof pku) {
                qat qatVarB3 = qau.b();
                pku pkuVar = (pku) pkyVar;
                qatVarB3.b = pkuVar.b();
                qatVarB3.c(pkuVar.j());
                return qatVarB3.a();
            }
            ListenableFuture listenableFutureA = this.p.a(tgeVar.g());
            listenableFutureA.getClass();
            qbeVar.a = obj;
            qbeVar.e = null;
            qbeVar.d = 2;
            objAd = awrc.ad(listenableFutureA, qbeVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
            r9 = obj;
            pnqVar = (pnq) objAd;
            if (pnqVar.b()) {
                ?? D2 = r9.getParserForType().d(pnqVar.b);
                D2.getClass();
                qat qatVarB4 = qau.b();
                qatVarB4.c = pnqVar.a;
                qatVarB4.a = D2;
                return qatVarB4.a();
            }
            qat qatVarB5 = qau.b();
            qatVarB5.c = pnqVar.a;
            qatVarB5.b = pnqVar.a();
            qatVarB5.c(pnqVar.c(auvj.c()));
            Throwable thA2 = pnqVar.a();
            qatVarB5.b(!(thA2 instanceof pnr) && ((pnr) thA2).a == 401);
            return qatVarB5.a();
        } catch (Exception e2) {
            qat qatVarB6 = qau.b();
            qatVarB6.b = e2;
            qatVarB6.c(false);
            return qatVarB6.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(awoq awoqVar) throws Throwable {
        qay qayVar;
        if (awoqVar instanceof qay) {
            qayVar = (qay) awoqVar;
            int i2 = qayVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qayVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qayVar = new qay(this, awoqVar);
            }
        } else {
            qayVar = new qay(this, awoqVar);
        }
        Object obj = qayVar.a;
        int i3 = qayVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            return new pkv(new IllegalStateException("fitbitAuthDataProvider not found, can't get fitbit auth token."), pkx.ao);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        pky pkyVar = (pky) obj;
        if (!(pkyVar instanceof pla)) {
            return qnl.ax(pkyVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        qbb qbbVar;
        if (awoqVar instanceof qbb) {
            qbbVar = (qbb) awoqVar;
            int i2 = qbbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qbbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qbbVar = new qbb(this, awoqVar);
            }
        } else {
            qbbVar = new qbb(this, awoqVar);
        }
        Object obj = qbbVar.a;
        int i3 = qbbVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            return new pkv(new IllegalStateException("YouTubeVisitorDataProvider not found, can't get Visitor cookie"), pkx.l);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            atqp.j(obj);
            throw null;
        } catch (Exception e2) {
            return new pkv(e2, pkx.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tge tgeVar, plx plxVar, boolean z, awoq awoqVar) throws Throwable {
        qav qavVar;
        pky pkyVar;
        Object objC;
        pky pkyVar2;
        Object objJ;
        pky pkyVar3;
        Object objD;
        if (awoqVar instanceof qav) {
            qavVar = (qav) awoqVar;
            int i2 = qavVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qavVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qavVar = new qav(this, awoqVar);
            }
        } else {
            qavVar = new qav(this, awoqVar);
        }
        Object objF = qavVar.a;
        Object obj = awox.a;
        switch (qavVar.c) {
            case 0:
                atqp.j(objF);
                pxk pxkVarB = plxVar.b();
                if (pxkVarB instanceof pxo) {
                    qavVar.c = 1;
                    Object objH = h(tgeVar, (pxo) pxkVarB, z, qavVar);
                    if (objH != obj) {
                        return objH;
                    }
                } else if (pxkVarB instanceof pxl) {
                    qavVar.c = 2;
                    Object objG = g(tgeVar, plxVar, z, qavVar);
                    if (objG != obj) {
                        return objG;
                    }
                } else if (pxkVarB instanceof pxn) {
                    qavVar.d = tgeVar;
                    qavVar.c = 3;
                    objF = f(tgeVar, qavVar);
                    if (objF != obj) {
                        pkyVar = (pky) objF;
                        if (!(pkyVar instanceof pku)) {
                            return (pku) pkyVar;
                        }
                        qavVar.d = null;
                        qavVar.c = 4;
                        objC = c(qavVar);
                        if (objC != obj) {
                            return objC;
                        }
                    }
                } else if (awrc.c(pxkVarB, pyd.a)) {
                    qavVar.d = tgeVar;
                    qavVar.c = 5;
                    objF = f(tgeVar, qavVar);
                    if (objF != obj) {
                        pkyVar2 = (pky) objF;
                        if (!(pkyVar2 instanceof pku)) {
                            return (pku) pkyVar2;
                        }
                        qavVar.d = null;
                        qavVar.c = 6;
                        objJ = j(tgeVar, qavVar);
                        if (objJ != obj) {
                            return objJ;
                        }
                    }
                } else {
                    if (!awrc.c(pxkVarB, pyb.a)) {
                        throw new awmj();
                    }
                    qavVar.d = tgeVar;
                    qavVar.c = 7;
                    objF = f(tgeVar, qavVar);
                    if (objF != obj) {
                        pkyVar3 = (pky) objF;
                        if (!(pkyVar3 instanceof pku)) {
                            return (pku) pkyVar3;
                        }
                        qavVar.d = null;
                        qavVar.c = 8;
                        objD = d(qavVar);
                        if (objD != obj) {
                            return objD;
                        }
                    }
                }
                return obj;
            case 1:
            case 2:
            case 4:
            case 6:
            case 8:
                atqp.j(objF);
                return objF;
            case 3:
                atqp.j(objF);
                pkyVar = (pky) objF;
                if (!(pkyVar instanceof pku)) {
                    return (pku) pkyVar;
                }
                qavVar.d = null;
                qavVar.c = 4;
                objC = c(qavVar);
                if (objC != obj) {
                    return objC;
                }
                return obj;
            case 5:
                tgeVar = qavVar.d;
                atqp.j(objF);
                pkyVar2 = (pky) objF;
                if (!(pkyVar2 instanceof pku)) {
                    return (pku) pkyVar2;
                }
                qavVar.d = null;
                qavVar.c = 6;
                objJ = j(tgeVar, qavVar);
                if (objJ != obj) {
                    return objJ;
                }
                return obj;
            case 7:
                atqp.j(objF);
                pkyVar3 = (pky) objF;
                if (!(pkyVar3 instanceof pku)) {
                    return (pku) pkyVar3;
                }
                qavVar.d = null;
                qavVar.c = 8;
                objD = d(qavVar);
                if (objD != obj) {
                    return objD;
                }
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tge tgeVar, awoq awoqVar) throws Throwable {
        qaw qawVar;
        if (awoqVar instanceof qaw) {
            qawVar = (qaw) awoqVar;
            int i2 = qawVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qawVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qawVar = new qaw(this, awoqVar);
            }
        } else {
            qawVar = new qaw(this, awoqVar);
        }
        Object objB = qawVar.a;
        awox awoxVar = awox.a;
        int i3 = qawVar.c;
        if (i3 == 0) {
            atqp.j(objB);
            if (auva.c()) {
                tgeVar.i(k, this.c.f);
                String str = this.r;
                if (str != null && str.length() != 0) {
                    tgeVar.i(n, this.a.getPackageName());
                    tgeVar.i(m, str);
                }
                return new pla(awmy.a);
            }
            ppe ppeVar = this.b;
            qawVar.d = tgeVar;
            qawVar.c = 1;
            objB = ppeVar.b(qawVar);
            if (objB == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tgeVar = qawVar.d;
            atqp.j(objB);
        }
        pky pkyVar = (pky) objB;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu == 1) {
                return qnl.ax((pku) pkyVar);
            }
            throw new awmj();
        }
        tgeVar.i(l, (String) ((pla) pkyVar).a);
        return new pla(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(tge tgeVar, plx plxVar, boolean z, awoq awoqVar) throws Throwable {
        qax qaxVar;
        if (awoqVar instanceof qax) {
            qaxVar = (qax) awoqVar;
            int i2 = qaxVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qaxVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qaxVar = new qax(this, awoqVar);
            }
        } else {
            qaxVar = new qax(this, awoqVar);
        }
        Object objK = qaxVar.a;
        Object obj = awox.a;
        int i3 = qaxVar.c;
        if (i3 == 0) {
            atqp.j(objK);
            String str = plxVar.d;
            if (str == null || str.length() == 0) {
                ((agsj) f.b()).t("No account name was supplied for delegated Gaia.");
                return new pkv(new IllegalStateException("No account name was supplied for delegated Gaia."), pkx.ap);
            }
            qaxVar.e = tgeVar;
            qaxVar.d = plxVar;
            qaxVar.c = 1;
            objK = k(str, z, qaxVar);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            plxVar = qaxVar.d;
            tgeVar = qaxVar.e;
            atqp.j(objK);
        }
        pky pkyVar = (pky) objK;
        if (pkyVar instanceof pla) {
            pno pnoVarA = pno.a("Authorization");
            Object obj2 = ((pla) pkyVar).a;
            Objects.toString(obj2);
            tgeVar.i(pnoVarA, "Bearer ".concat(String.valueOf(obj2)));
        }
        tgeVar.i(i, plxVar.c);
        return qnl.ax(pkyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(tge tgeVar, pxo pxoVar, boolean z, awoq awoqVar) throws Throwable {
        qaz qazVar;
        if (awoqVar instanceof qaz) {
            qazVar = (qaz) awoqVar;
            int i2 = qazVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qazVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qazVar = new qaz(this, awoqVar);
            }
        } else {
            qazVar = new qaz(this, awoqVar);
        }
        Object objK = qazVar.a;
        Object obj = awox.a;
        int i3 = qazVar.c;
        if (i3 == 0) {
            atqp.j(objK);
            String str = pxoVar.a;
            qazVar.d = tgeVar;
            qazVar.c = 1;
            objK = k(str, z, qazVar);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tgeVar = qazVar.d;
            atqp.j(objK);
        }
        pky pkyVar = (pky) objK;
        if (pkyVar instanceof pla) {
            pno pnoVarA = pno.a("Authorization");
            Object obj2 = ((pla) pkyVar).a;
            Objects.toString(obj2);
            tgeVar.i(pnoVarA, "Bearer ".concat(String.valueOf(obj2)));
        }
        return qnl.ax(pkyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r9 != r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.tge r6, defpackage.plx r7, boolean r8, defpackage.awoq r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.qba
            if (r0 == 0) goto L13
            r0 = r9
            qba r0 = (defpackage.qba) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qba r0 = new qba
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            awox r1 = defpackage.awox.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.atqp.j(r9)
            goto L7e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.atqp.j(r9)
            goto L4d
        L36:
            defpackage.atqp.j(r9)
            if (r7 == 0) goto L54
            java.lang.String r9 = r7.b
            if (r9 == 0) goto L54
            int r9 = r9.length()
            if (r9 == 0) goto L54
            r0.c = r4
            java.lang.Object r9 = r5.e(r6, r7, r8, r0)
            if (r9 == r1) goto L6e
        L4d:
            pky r9 = (defpackage.pky) r9
            pky r9 = defpackage.qnl.ax(r9)
            goto L7e
        L54:
            pls r7 = r5.c
            java.lang.String r7 = r7.f
            if (r7 == 0) goto L60
            int r7 = r7.length()
            if (r7 != 0) goto L66
        L60:
            boolean r7 = defpackage.auva.c()
            if (r7 != 0) goto L70
        L66:
            r0.c = r3
            java.lang.Object r9 = r5.f(r6, r0)
            if (r9 != r1) goto L7e
        L6e:
            r9 = r1
            goto L7e
        L70:
            pkv r9 = new pkv
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "One of Account representation or API Key must be set."
            r5.<init>(r6)
            pkx r6 = defpackage.pkx.at
            r9.<init>(r5, r6)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbf.i(tge, plx, boolean, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(tge tgeVar, awoq awoqVar) throws Throwable {
        qbc qbcVar;
        if (awoqVar instanceof qbc) {
            qbcVar = (qbc) awoqVar;
            int i2 = qbcVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qbcVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qbcVar = new qbc(this, awoqVar);
            }
        } else {
            qbcVar = new qbc(this, awoqVar);
        }
        Object objI = qbcVar.a;
        awox awoxVar = awox.a;
        int i3 = qbcVar.c;
        try {
            if (i3 == 0) {
                atqp.j(objI);
                Object obj = ((agfa) this.q).a;
                qbcVar.d = tgeVar;
                qbcVar.c = 1;
                objI = ((kjc) obj).I(qbcVar);
                if (objI == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tgeVar = qbcVar.d;
                atqp.j(objI);
            }
            String str = ((lmn) objI).a;
            if (str == null || str.length() == 0) {
                return new pkv(new IllegalArgumentException("Zwieback Cookie is null or empty."), pkx.j);
            }
            tgeVar.i(g, a.ce(str, "NID="));
            return new pla(awmy.a);
        } catch (Exception e2) {
            return new pkv(e2, pkx.k);
        }
    }
}
