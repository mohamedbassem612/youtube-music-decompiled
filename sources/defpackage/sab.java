package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class sab {
    public final spv a;
    private final rsk b;

    public sab(rsk rskVar, spv spvVar) {
        this.b = rskVar;
        this.a = spvVar;
    }

    public final agke a(agke agkeVar, sgp sgpVar) {
        sko skoVarA;
        agjz agjzVar = new agjz(4);
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            aivt aivtVar = (aivt) agkeVar.get(i);
            if (sdc.b(aivtVar)) {
                try {
                    aivs aivsVar = aivtVar.c;
                    if (aivsVar == null) {
                        aivsVar = aivs.a;
                    }
                    String str = aivsVar.c;
                    aivs aivsVar2 = aivtVar.c;
                    aixo aixoVarA = aixo.a((aivsVar2 == null ? aivs.a : aivsVar2).d);
                    if (aixoVarA == null) {
                        aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (aivsVar2 == null) {
                        aivsVar2 = aivs.a;
                    }
                    int i2 = aivsVar2.e;
                    aizs aizsVar = aivtVar.f;
                    if (aizsVar == null) {
                        aizsVar = aizs.a;
                    }
                    agke agkeVarN = agke.n(aivtVar.h);
                    aivs aivsVar3 = aivtVar.c;
                    if (aivsVar3 == null) {
                        aivsVar3 = aivs.a;
                    }
                    aivr aivrVar = aivsVar3.f;
                    if (aivrVar == null) {
                        aivrVar = aivr.a;
                    }
                    Optional optionalOf = Optional.of(aivrVar);
                    skn sknVarA = sko.a();
                    sknVarA.m(1);
                    sknVarA.c = shh.b(new sht[0]);
                    aivu aivuVar = aivtVar.e;
                    if (aivuVar == null) {
                        aivuVar = aivu.a;
                    }
                    apji apjiVar = aivuVar.b;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aivs aivsVar4 = aivtVar.c;
                    if (aivsVar4 == null) {
                        aivsVar4 = aivs.a;
                    }
                    aixo aixoVarA2 = aixo.a(aivsVar4.d);
                    if (aixoVarA2 == null) {
                        aixoVarA2 = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    int iOrdinal = aixoVarA2.ordinal();
                    if (iOrdinal == 9) {
                        appr apprVar = (appr) aavv.s(apjiVar, apps.a);
                        if (apprVar == null) {
                            throw new sau("SequenceItemAdSelectionLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_SEQUENCE_ITEM_AD_SELECTION.", 139);
                        }
                        aiuc aiucVar = apprVar.b;
                        if (aiucVar == null) {
                            aiucVar = aiuc.a;
                        }
                        sdc.a(aiucVar, sknVarA);
                        apji apjiVar2 = apprVar.c;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        sknVarA.o(apjiVar2);
                        sknVarA.f(agke.n(apprVar.d));
                        skoVarA = sknVarA.a();
                    } else if (iOrdinal == 11) {
                        aljy aljyVar = (aljy) aavv.s(apjiVar, aljz.a);
                        if (aljyVar == null) {
                            throw new sau("InPlayerAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_IN_PLAYER.", 139);
                        }
                        aiuc aiucVar2 = aljyVar.b;
                        if (aiucVar2 == null) {
                            aiucVar2 = aiuc.a;
                        }
                        sdc.a(aiucVar2, sknVarA);
                        sknVarA.o(apjiVar);
                        sknVarA.f(agke.n(aljyVar.d));
                        sknVarA.h(agke.n(aljyVar.e));
                        sknVarA.d(agke.n(aljyVar.f));
                        skoVarA = sknVarA.a();
                    } else if (iOrdinal == 26) {
                        alka alkaVar = (alka) aavv.s(apjiVar, alkb.a);
                        if (alkaVar == null) {
                            throw new sau("InPlayerOrganicOverlayAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_IN_PLAYER_ORGANIC_OVERLAY.", 139);
                        }
                        aiuc aiucVar3 = alkaVar.b;
                        if (aiucVar3 == null) {
                            aiucVar3 = aiuc.a;
                        }
                        sdc.a(aiucVar3, sknVarA);
                        apji apjiVar3 = alkaVar.c;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        sknVarA.o(apjiVar3);
                        sknVarA.f(agke.n(alkaVar.d));
                        sknVarA.j(agke.n(alkaVar.e));
                        skoVarA = sknVarA.a();
                    } else if (iOrdinal != 29) {
                        switch (iOrdinal) {
                            case 17:
                                ajlj ajljVar = (ajlj) aavv.s(apjiVar, ajlk.a);
                                if (ajljVar == null) {
                                    throw new sau("BelowPlayerImmersiveAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_BELOW_PLAYER_IMMERSIVE.", 139);
                                }
                                aiuc aiucVar4 = ajljVar.c;
                                if (aiucVar4 == null) {
                                    aiucVar4 = aiuc.a;
                                }
                                sdc.a(aiucVar4, sknVarA);
                                apji apjiVar4 = ajljVar.d;
                                if (apjiVar4 == null) {
                                    apjiVar4 = apji.a;
                                }
                                sknVarA.o(apjiVar4);
                                sknVarA.f(agke.n(ajljVar.e));
                                sknVarA.h(agke.n(ajljVar.f));
                                skoVarA = sknVarA.a();
                                break;
                                break;
                            case 18:
                                aisx aisxVar = (aisx) aavv.s(apjiVar, aisy.a);
                                if (aisxVar == null) {
                                    throw new sau("AdBreakRequestAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_AD_BREAK_REQUEST.", 139);
                                }
                                aiuc aiucVar5 = aisxVar.b;
                                if (aiucVar5 == null) {
                                    aiucVar5 = aiuc.a;
                                }
                                sdc.a(aiucVar5, sknVarA);
                                apji apjiVar5 = aisxVar.c;
                                if (apjiVar5 == null) {
                                    apjiVar5 = apji.a;
                                }
                                sknVarA.o(apjiVar5);
                                sknVarA.f(agke.n(aisxVar.d));
                                skoVarA = sknVarA.a();
                                break;
                                break;
                            case 19:
                                aopf aopfVar = (aopf) aavv.s(apjiVar, aopg.a);
                                if (aopfVar == null) {
                                    throw new sau("PlaybackTrackingAdLayoutRenderer cannot be found from AdSlotRenderer for SLOT_TYPE_PLAYBACK_TRACKING.", 139);
                                }
                                aiuc aiucVar6 = aopfVar.b;
                                if (aiucVar6 == null) {
                                    aiucVar6 = aiuc.a;
                                }
                                sdc.a(aiucVar6, sknVarA);
                                apji apjiVar6 = aopfVar.c;
                                if (apjiVar6 == null) {
                                    apjiVar6 = apji.a;
                                }
                                sknVarA.o(apjiVar6);
                                sknVarA.f(agke.n(aopfVar.d));
                                skoVarA = sknVarA.a();
                                break;
                                break;
                            case 20:
                                aljw aljwVar = (aljw) aavv.s(apjiVar, aljx.a);
                                if (aljwVar == null) {
                                    throw new sau("InFeedAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_IN_FEED.", 139);
                                }
                                aiuc aiucVar7 = aljwVar.b;
                                if (aiucVar7 == null) {
                                    aiucVar7 = aiuc.a;
                                }
                                sdc.a(aiucVar7, sknVarA);
                                sknVarA.o(apjiVar);
                                sknVarA.f(agke.n(aljwVar.d));
                                skoVarA = sknVarA.a();
                                break;
                                break;
                            default:
                                throw new sau("Unrecognized slot type when extracting layout from AdSlotRenderer: " + aixoVarA2.G, 139);
                        }
                    } else {
                        anhm anhmVar = (anhm) aavv.s(apjiVar, anhn.a);
                        if (anhmVar == null) {
                            throw new sau("MiniAppInPlayerAdLayoutRenderer can not be found from AdSlotRenderer for SLOT_TYPE_MINI_APP_IN_PLAYER.", 139);
                        }
                        aiuc aiucVar8 = anhmVar.b;
                        if (aiucVar8 == null) {
                            aiucVar8 = aiuc.a;
                        }
                        sdc.a(aiucVar8, sknVarA);
                        apji apjiVar7 = anhmVar.c;
                        if (apjiVar7 == null) {
                            apjiVar7 = apji.a;
                        }
                        sknVarA.o(apjiVar7);
                        sknVarA.f(agke.n(anhmVar.d));
                        sknVarA.h(agke.n(anhmVar.e));
                        skoVarA = sknVarA.a();
                    }
                    smq smqVarA = smq.a(aixoVarA, i2);
                    agke agkeVar2 = agpi.a;
                    agjzVar.h(new smr(str, smqVarA, 1, agkeVar2, agkeVar2, agkeVar2, shh.b(new sht[0]), optionalOf, Optional.of(skoVarA), true, Optional.of(aizsVar), agkeVarN));
                } catch (sau e) {
                    this.a.d(3, e.a, sgpVar.a, null);
                    rmp.n(null, "Failed to create slot from AdSlotRenderer: ".concat(String.valueOf(e.getMessage())));
                }
            }
        }
        return agjzVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03fc A[LOOP:3: B:132:0x03f6->B:134:0x03fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0429 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0433 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0442 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0452 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0466 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:155:0x048b A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0493 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0499 A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:161:0x049f A[Catch: sas -> 0x0598, sas | sau -> 0x059a, TRY_LEAVE, TryCatch #16 {sas | sau -> 0x059a, blocks: (B:136:0x041f, B:138:0x0429, B:140:0x0433, B:141:0x043c, B:143:0x0442, B:145:0x0452, B:146:0x0454, B:148:0x045c, B:150:0x0466, B:151:0x0468, B:152:0x0480, B:153:0x0481, B:155:0x048b, B:157:0x0493, B:159:0x0499, B:161:0x049f, B:193:0x0562, B:194:0x056b, B:195:0x056c, B:196:0x0573, B:197:0x0574, B:198:0x057b, B:199:0x057c, B:200:0x0585, B:201:0x0586, B:202:0x058f, B:203:0x0590, B:204:0x0597), top: B:281:0x041f }] */
    /* JADX WARN: Code duplicated, block: B:164:0x04aa A[Catch: sav -> 0x053d, sau | sav -> 0x053f, TRY_LEAVE, TryCatch #21 {sau | sav -> 0x053f, blocks: (B:162:0x04a4, B:164:0x04aa), top: B:271:0x04a4 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04e5 A[LOOP:5: B:166:0x04df->B:168:0x04e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x04f7 A[Catch: sau -> 0x0516, TryCatch #13 {sau -> 0x0516, blocks: (B:169:0x04ef, B:171:0x04f7, B:173:0x04fb, B:175:0x0504, B:176:0x050d, B:177:0x050e, B:178:0x0515), top: B:261:0x04ef }] */
    /* JADX WARN: Code duplicated, block: B:173:0x04fb A[Catch: sau -> 0x0516, TRY_LEAVE, TryCatch #13 {sau -> 0x0516, blocks: (B:169:0x04ef, B:171:0x04f7, B:173:0x04fb, B:175:0x0504, B:176:0x050d, B:177:0x050e, B:178:0x0515), top: B:261:0x04ef }] */
    /* JADX WARN: Code duplicated, block: B:181:0x052e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0590 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x057c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[LOOP:4: B:141:0x043c->B:326:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Exception, sau] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [skh] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3, types: [skh] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v4, types: [srh] */
    /* JADX WARN: Type inference failed for: r2v1, types: [spv] */
    /* JADX WARN: Type inference failed for: r2v10, types: [spv] */
    /* JADX WARN: Type inference failed for: r6v10, types: [srh] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void b(defpackage.agke r27, defpackage.sgp r28) {
        /*
            Method dump skipped, instruction units count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sab.b(agke, sgp):void");
    }
}
