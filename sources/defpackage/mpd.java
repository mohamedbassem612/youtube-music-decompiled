package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpd implements nry {
    final mqq a;
    public final mpe b;
    final axfd c;
    private final boolean d;
    private final boolean e;
    private final isi f;

    public mpd(mqq mqqVar, axfd axfdVar, agev agevVar, agev agevVar2, mpe mpeVar, isi isiVar) {
        this.a = mqqVar;
        this.c = axfdVar;
        this.b = mpeVar;
        Boolean bool = Boolean.FALSE;
        this.d = ((Boolean) agevVar.e(bool)).booleanValue();
        this.e = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.f = isiVar;
    }

    private final avlb f(avlb avlbVar, final nrv nrvVar, int i, boolean z, final boolean z2, final agfr agfrVar) {
        avlb avlbVarU = avlbVar.u(new ibj(agfrVar, 14));
        if (i != 2 || z) {
            return (i == 2 && z) ? avlbVarU.u(new avnn() { // from class: mpa
                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (!mej.c(z2, th)) {
                        return avlb.m(th);
                    }
                    agfr agfrVar2 = agfrVar;
                    return this.a.b.a(nrvVar.i).b(((Integer) agfrVar2.io()).intValue()).c(avlb.m(th));
                }
            }) : avlbVarU;
        }
        return avlbVarU.f(this.b.a(nrvVar.i).b(((Integer) agfrVar.io()).intValue()));
    }

    @Override // defpackage.nry
    public final /* synthetic */ avlb a(CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar) {
        return c(commandOuterClass$Command, nrvVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r7.j.n(r1.d) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.avlb b(com.google.protos.youtube.elements.CommandOuterClass$Command r7, defpackage.nrv r8) {
        /*
            r6 = this;
            axfd r0 = r6.c
            if (r0 == 0) goto L50
            aihl r1 = defpackage.asol.b
            aihl r1 = defpackage.aihn.m61$$Nest$smcheckIsLite(r1)
            r7.c(r1)
            aiha r2 = r7.j
            aihk r1 = r1.d
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L52
            aihl r1 = defpackage.asov.b
            aihl r1 = defpackage.aihn.m61$$Nest$smcheckIsLite(r1)
            r7.c(r1)
            aiha r2 = r7.j
            aihk r1 = r1.d
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L52
            aihl r1 = defpackage.asou.b
            aihl r1 = defpackage.aihn.m61$$Nest$smcheckIsLite(r1)
            r7.c(r1)
            aiha r2 = r7.j
            aihk r1 = r1.d
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L52
            aihl r1 = defpackage.aslc.b
            aihl r1 = defpackage.aihn.m61$$Nest$smcheckIsLite(r1)
            r7.c(r1)
            aiha r2 = r7.j
            aihk r1 = r1.d
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L52
        L50:
            r6 = 0
            goto L6f
        L52:
            rkq r1 = new rkq
            r2 = 1
            r1.<init>(r0, r7, r8, r2)
            avlb r1 = defpackage.avlb.g(r1)
            mqq r0 = r6.a
            nsl r2 = r8.i
            isi r6 = r6.f
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r3 = r8.f
            assc r4 = r0.b(r2)
            r5 = 0
            r0 = r6
            r2 = r7
            avlb r6 = r0.v(r1, r2, r3, r4, r5)
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.b(com.google.protos.youtube.elements.CommandOuterClass$Command, nrv):avlb");
    }

    @Override // defpackage.nry
    public final /* synthetic */ avlb c(CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, int i) {
        if (nrvVar == null) {
            nrvVar = nrv.d().a();
        }
        nrv nrvVar2 = nrvVar;
        avlb avlbVarB = b(commandOuterClass$Command, nrvVar2);
        if (avlbVarB == null) {
            avlbVarB = this.a.f(commandOuterClass$Command, nrvVar2);
        }
        return f(avlbVarB, nrvVar2, i, this.d, this.e, new cbq(commandOuterClass$Command, 19));
    }

    @Override // defpackage.orq
    public final void d(mew mewVar, ors orsVar) {
        aiik aiikVar;
        nrv nrvVarA;
        avlb avlbVarM;
        mewVar.getClass();
        int iAD = ksy.aD(mewVar);
        try {
            nrt nrtVarD = nrv.d();
            nrtVarD.d(orsVar.a());
            nrtVarD.d = orsVar.a;
            nrtVarD.k = orsVar.i;
            nrtVarD.i = orsVar.d;
            nrtVarD.e(orsVar.f);
            nrtVarD.c(orsVar.g);
            nrtVarD.j = orsVar.e;
            mew mewVar2 = orsVar.j;
            if (mewVar2 != null) {
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihn.parseFrom(SenderStateOuterClass$SenderState.a, mewVar2.f(), ExtensionRegistryLite.getGeneratedRegistry());
                nrtVarD.e = senderStateOuterClass$SenderState;
                float f = orsVar.h;
                aihl aihlVar = aslw.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                senderStateOuterClass$SenderState.c(aihlVarCheckIsLite);
                if (senderStateOuterClass$SenderState.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    senderStateOuterClass$SenderState.c(aihlVarCheckIsLite2);
                    Object objK = senderStateOuterClass$SenderState.j.k(aihlVarCheckIsLite2.d);
                    aslw aslwVar = (aslw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    if ((aslwVar.c & 1) != 0) {
                        aslv aslvVar = aslwVar.d;
                        if (aslvVar == null) {
                            aslvVar = aslv.a;
                        }
                        if ((aslvVar.b & 1) != 0) {
                            asob asobVar = aslvVar.c;
                            if (asobVar == null) {
                                asobVar = asob.a;
                            }
                            float f2 = (asobVar.c - 0.5f) * f;
                            asob asobVar2 = aslvVar.c;
                            if (asobVar2 == null) {
                                asobVar2 = asob.a;
                            }
                            nrtVarD.c = new nxg(f2, (asobVar2.d - 0.5f) * f);
                        }
                    }
                } else {
                    aihl aihlVar2 = aslu.b;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    senderStateOuterClass$SenderState.c(aihlVarCheckIsLite3);
                    if (senderStateOuterClass$SenderState.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                        senderStateOuterClass$SenderState.c(aihlVarCheckIsLite4);
                        Object objK2 = senderStateOuterClass$SenderState.j.k(aihlVarCheckIsLite4.d);
                        aslu asluVar = (aslu) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                        if ((asluVar.c & 1) != 0) {
                            aslo asloVar = asluVar.d;
                            if (asloVar == null) {
                                asloVar = aslo.a;
                            }
                            if ((asloVar.b & 1) != 0) {
                                asob asobVar3 = asloVar.c;
                                if (asobVar3 == null) {
                                    asobVar3 = asob.a;
                                }
                                float f3 = (asobVar3.c - 0.5f) * f;
                                asob asobVar4 = asloVar.c;
                                if (asobVar4 == null) {
                                    asobVar4 = asob.a;
                                }
                                nrtVarD.c = new nxg(f3, (asobVar4.d - 0.5f) * f);
                            }
                        }
                    }
                }
            }
            agfr agfrVar = orsVar.c;
            if (agfrVar != null) {
                nsk nskVarB = nsl.b();
                nskVarB.s = new mpb(agfrVar);
                nrtVarD.b(nskVarB.a());
            }
            nrvVarA = nrtVarD.a();
            try {
                avlbVarM = e(mewVar, nrvVarA, 2);
            } catch (aiik e) {
                aiikVar = e;
                if (nrvVarA == null) {
                    nrt nrtVarD2 = nrv.d();
                    nrtVarD2.d(orsVar.a());
                    nrtVarD2.d = orsVar.a;
                    nrtVarD2.k = orsVar.i;
                    nrtVarD2.e(orsVar.f);
                    nrtVarD2.c(orsVar.g);
                    nrvVarA = nrtVarD2.a();
                }
                avlbVarM = avlb.m(aiikVar);
            }
        } catch (aiik e2) {
            aiikVar = e2;
            nrvVarA = null;
        }
        f(avlbVarM, nrvVarA, 2, this.d, this.e, new ckx(iAD, 2)).D();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x00d3, aiik -> 0x00d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0008, B:5:0x000c, B:7:0x0010, B:32:0x00bc, B:8:0x0026, B:10:0x0036, B:12:0x0040, B:13:0x0046, B:15:0x004f, B:17:0x0057, B:19:0x005b, B:21:0x006f, B:23:0x0075, B:26:0x0088, B:28:0x0090, B:30:0x0096), top: B:45:0x0008 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, nsc] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.nry
    public final avlb e(mew mewVar, nrv nrvVar, int i) {
        avlb avlbVarM;
        CommandOuterClass$Command commandOuterClass$Command;
        nrv nrvVar2 = nrvVar;
        int iAD = ksy.aD(mewVar);
        try {
            if (this.c != null) {
                switch (iAD) {
                    case 170382720:
                    case 194114827:
                    case 501637953:
                    case 525000106:
                        avlbVarM = b((CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mewVar.f(), ExtensionRegistryLite.getGeneratedRegistry()), nrvVar2);
                        if (avlbVarM == null) {
                            avlbVarM = avlb.m(new IllegalArgumentException(a.bR(iAD, "Unsupported command: ")));
                            break;
                        }
                        return f(avlbVarM, nrvVar2, i, this.d, this.e, new ckx(iAD, 3));
                    default:
                        break;
                }
            }
            mqq mqqVar = this.a;
            agkj agkjVar = mqqVar.a;
            Integer numValueOf = Integer.valueOf(iAD);
            nrx nrxVar = (nrx) agkjVar.get(numValueOf);
            if (nrxVar == null) {
                nrxVar = (nrx) mqqVar.b.get(numValueOf);
            }
            if (nrxVar == null) {
                avlbVarM = mqqVar.e(iAD);
            } else {
                assc asscVarB = mqqVar.b(nrvVar2.i);
                isi isiVar = mqqVar.d;
                try {
                    try {
                        nrvVar2 = nrvVar;
                        avlb avlbVarH = avlb.h(new ium(nrxVar, mewVar, nrvVar, 6, (byte[]) null));
                        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrvVar2.f;
                        CommandOuterClass$Command defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                        nsu nsuVar = (nsu) isiVar.c.io();
                        if (nsuVar == null || !nsuVar.a()) {
                            commandOuterClass$Command = defaultInstance;
                        } else {
                            try {
                                commandOuterClass$Command = (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mewVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
                            } catch (aiik unused) {
                                commandOuterClass$Command = defaultInstance;
                            }
                        }
                        ?? r2 = isiVar.b;
                        nse nseVarA = r2.b() ? r2.a(iAD) : null;
                        avlbVarM = avlbVarH.l(new mqh(isiVar, commandOuterClass$Command, senderStateOuterClass$SenderState, asscVarB, nseVarA, 2)).k(new gto(isiVar, asscVarB, nseVarA, 11)).j(new mgd((Object) isiVar, (Object) asscVarB, (Object) nseVarA, 9, (byte[]) null));
                    } catch (aiik e) {
                        e = e;
                        nrvVar2 = nrvVar;
                        avlbVarM = avlb.m(e);
                    }
                } catch (aiik e2) {
                    e = e2;
                    nrvVar2 = nrvVar;
                }
            }
            if (avlbVarM == null) {
                avlbVarM = avlb.m(new IllegalArgumentException(a.bR(iAD, "Unsupported command: ")));
            }
        } catch (aiik e3) {
            e = e3;
        }
        return f(avlbVarM, nrvVar2, i, this.d, this.e, new ckx(iAD, 3));
    }
}
