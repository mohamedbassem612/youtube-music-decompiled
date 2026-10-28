package defpackage;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acqe extends awrb implements awqg {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i) {
        super(1, obj, acqf.class, "onReelPageControllerEvent", "onReelPageControllerEvent(Lcom/google/android/libraries/youtube/reel/pager/ReelPageControllerEvent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aunn, java.lang.Object] */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        acqh acqhVar;
        int i;
        int iD;
        acra acraVarL;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        String str;
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite2;
        aihl aihlVarCheckIsLite3;
        Object objK2;
        Object objC2;
        apfp apfpVar;
        String str2;
        switch (this.$cid) {
            case 0:
                acvm acvmVar = (acvm) obj;
                acvmVar.getClass();
                acqf acqfVar = (acqf) this.receiver;
                Objects.checkIndex(0, 3);
                if ((acvmVar instanceof acvl) || (acvmVar instanceof acvk)) {
                    acqz acqzVar = (acqz) acqfVar.a;
                    if (acqzVar.ak && (acqhVar = acqzVar.ag) != null && acqhVar.D() != 0) {
                        if (aawo.j(acqhVar.L(0))) {
                            int i2 = acqzVar.Q;
                            if (i2 != -1) {
                                acra acraVarL2 = acqhVar.L(i2);
                                if ((acraVarL2 != null ? acraVarL2.f : null) != null) {
                                    ajwo ajwoVar2 = acraVarL2.f;
                                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                                    ajwoVar2.c(aihlVarCheckIsLite4);
                                    if (!ajwoVar2.j.n(aihlVarCheckIsLite4.d) || aawo.j(acraVarL2)) {
                                        if (((hno) acqfVar.c).o()) {
                                            ajwoVar = acraVarL2 != null ? acraVarL2.f : null;
                                            if (ajwoVar != null) {
                                                aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                                                ajwoVar.c(aihlVarCheckIsLite2);
                                                if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                                                    aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                                                    ajwoVar.c(aihlVarCheckIsLite3);
                                                    objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                                                    if (objK2 == null) {
                                                        objC2 = aihlVarCheckIsLite3.b;
                                                    } else {
                                                        objC2 = aihlVarCheckIsLite3.c(objK2);
                                                    }
                                                    objC2.getClass();
                                                    apfpVar = (apfp) objC2;
                                                    str2 = apfpVar.o;
                                                    str2.getClass();
                                                    if (str2.length() > 0) {
                                                        apfpVar.o.getClass();
                                                    }
                                                }
                                            }
                                        }
                                        iD = acqhVar.D();
                                        for (i = i2 + 1; i < iD; i++) {
                                            acraVarL = acqhVar.L(i);
                                            if (aawo.j(acraVarL)) {
                                                acraVarL.getClass();
                                                ajwo ajwoVar3 = acraVarL.f;
                                                aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                                                ajwoVar3.c(aihlVarCheckIsLite);
                                                objK = ajwoVar3.j.k(aihlVarCheckIsLite.d);
                                                if (objK == null) {
                                                    objC = aihlVarCheckIsLite.b;
                                                } else {
                                                    objC = aihlVarCheckIsLite.c(objK);
                                                }
                                                objC.getClass();
                                                str = ((apfp) objC).o;
                                                str.getClass();
                                                if (str.length() > 0) {
                                                }
                                            }
                                        }
                                    } else {
                                        if (((hno) acqfVar.c).o()) {
                                        }
                                        acqfVar.a();
                                    }
                                } else {
                                    if (((hno) acqfVar.c).o()) {
                                        if (acraVarL2 != null) {
                                        }
                                        if (ajwoVar != null) {
                                            aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                                            ajwoVar.c(aihlVarCheckIsLite2);
                                            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                                                aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                                                ajwoVar.c(aihlVarCheckIsLite3);
                                                objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                                                if (objK2 == null) {
                                                    objC2 = aihlVarCheckIsLite3.b;
                                                } else {
                                                    objC2 = aihlVarCheckIsLite3.c(objK2);
                                                }
                                                objC2.getClass();
                                                apfpVar = (apfp) objC2;
                                                str2 = apfpVar.o;
                                                str2.getClass();
                                                if (str2.length() > 0) {
                                                    apfpVar.o.getClass();
                                                }
                                            }
                                        }
                                    }
                                    iD = acqhVar.D();
                                    while (i < iD) {
                                        acraVarL = acqhVar.L(i);
                                        if (aawo.j(acraVarL)) {
                                            acraVarL.getClass();
                                            ajwo ajwoVar4 = acraVarL.f;
                                            aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                                            ajwoVar4.c(aihlVarCheckIsLite);
                                            objK = ajwoVar4.j.k(aihlVarCheckIsLite.d);
                                            if (objK == null) {
                                                objC = aihlVarCheckIsLite.b;
                                            } else {
                                                objC = aihlVarCheckIsLite.c(objK);
                                            }
                                            objC.getClass();
                                            str = ((apfp) objC).o;
                                            str.getClass();
                                            if (str.length() > 0) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            acqfVar.a();
                        }
                    }
                }
                return awmy.a;
            case 1:
                ((acmt) this.receiver).e(((Number) obj).intValue());
                return awmy.a;
            case 2:
                avmn avmnVar = (avmn) obj;
                avmnVar.getClass();
                ((avmm) this.receiver).c(avmnVar);
                return awmy.a;
            case 3:
                avmn avmnVar2 = (avmn) obj;
                avmnVar2.getClass();
                ((avmm) this.receiver).c(avmnVar2);
                return awmy.a;
            case 4:
                avmn avmnVar3 = (avmn) obj;
                avmnVar3.getClass();
                ((avmm) this.receiver).c(avmnVar3);
                return awmy.a;
            case 5:
                ((awku) this.receiver).kk((Boolean) obj);
                return awmy.a;
            case 6:
                ((awku) this.receiver).b((Throwable) obj);
                return awmy.a;
            case 7:
                Callable callable = (Callable) obj;
                callable.getClass();
                afmc afmcVar = (afmc) this.receiver;
                int i3 = afmc.b;
                return afmcVar.a(callable);
            case 8:
                Callable callable2 = (Callable) obj;
                callable2.getClass();
                afmc afmcVar2 = (afmc) this.receiver;
                int i4 = afmc.b;
                return afmcVar2.a(callable2);
            case 9:
                Callable callable3 = (Callable) obj;
                callable3.getClass();
                afmc afmcVar3 = (afmc) this.receiver;
                int i5 = afmc.b;
                return afmcVar3.a(callable3);
            case 10:
                ((awwg) this.receiver).a((Throwable) obj);
                return awmy.a;
            default:
                Object objO = ((axel) this.receiver).O((awoq) obj);
                return objO == awox.a ? objO : awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, byte[] bArr) {
        super(1, obj, acmt.class, "setMarginEnd", "setMarginEnd(I)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, char[] cArr) {
        super(1, obj, avmm.class, "add", "add(Lio/reactivex/disposables/Disposable;)Z", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, float[] fArr) {
        super(1, obj, awku.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, boolean[] zArr) {
        super(1, obj, awku.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, byte[][] bArr) {
        super(1, obj, afmc.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, int[][] iArr) {
        super(1, obj, awwg.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqe(Object obj, int i, boolean[][] zArr) {
        super(1, obj, axel.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }
}
