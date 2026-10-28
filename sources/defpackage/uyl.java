package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class uyl {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper");

    static attl a(arlk arlkVar) {
        arlkVar.getClass();
        aihf aihfVarCreateBuilder = attl.a.createBuilder();
        if ((arlkVar.b & 1) != 0) {
            String str = arlkVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            attl attlVar = (attl) aihfVarCreateBuilder.instance;
            str.getClass();
            attlVar.b |= 1;
            attlVar.c = str;
        }
        return (attl) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ac A[Catch: aiik -> 0x0610, TryCatch #0 {aiik -> 0x0610, blocks: (B:176:0x0434, B:177:0x0449, B:179:0x044f, B:181:0x0473, B:192:0x048b, B:194:0x048f, B:195:0x0492, B:239:0x05b9, B:247:0x0603, B:197:0x0498, B:199:0x049f, B:235:0x0594, B:237:0x05ac, B:238:0x05b2, B:198:0x049d, B:202:0x04b7, B:204:0x04be, B:203:0x04bc, B:207:0x04df, B:209:0x04e6, B:208:0x04e4, B:212:0x04fe, B:214:0x0505, B:213:0x0503, B:217:0x0525, B:219:0x052b, B:222:0x053e, B:224:0x0548, B:227:0x055c, B:229:0x0566, B:232:0x057a, B:234:0x0584, B:240:0x05d1, B:241:0x05d2, B:243:0x05ea, B:244:0x05f0, B:245:0x05f9), top: B:309:0x0434 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:323:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    public static atup b(arlz arlzVar) {
        int i;
        int i2;
        armh armhVar;
        Throwable th;
        armf armfVar;
        Object obj;
        int i3;
        attu attuVar;
        aiie aiieVar;
        atty attyVar;
        int i4;
        aigj aigjVar;
        int i5;
        atuc atucVar;
        int i6;
        atuo atuoVar;
        atul atulVar;
        arlzVar.getClass();
        jrq jrqVar = (jrq) atup.a.createBuilder();
        Iterator it = arlzVar.c.iterator();
        while (true) {
            int i7 = 10;
            int i8 = 8;
            Throwable th2 = null;
            int i9 = 2;
            int i10 = 1;
            if (!it.hasNext()) {
                for (arlp arlpVar : arlzVar.b) {
                    arlpVar.getClass();
                    aihf aihfVarCreateBuilder = atty.a.createBuilder();
                    if ((arlpVar.b & i10) != 0) {
                        String str = arlpVar.e;
                        aihfVarCreateBuilder.copyOnWrite();
                        atty attyVar2 = (atty) aihfVarCreateBuilder.instance;
                        str.getClass();
                        attyVar2.b |= i10;
                        attyVar2.e = str;
                    }
                    int i11 = arlpVar.c;
                    if (i11 != 0) {
                        switch (i11) {
                            case 2:
                                i = i9;
                                break;
                            case 3:
                                i = 3;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 5;
                                break;
                            case 6:
                                i = 6;
                                break;
                            case 7:
                                i = i10;
                                break;
                            case 8:
                                i = 7;
                                break;
                            case 9:
                                i = i8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 9;
                    }
                    int i12 = i - 1;
                    if (i == 0) {
                        throw th2;
                    }
                    switch (i12) {
                        case 0:
                            armd armdVar = i11 == 7 ? (armd) arlpVar.d : armd.a;
                            aihf aihfVarCreateBuilder2 = atts.a.createBuilder();
                            int i13 = armdVar.c;
                            aihfVarCreateBuilder2.copyOnWrite();
                            atts attsVar = (atts) aihfVarCreateBuilder2.instance;
                            attsVar.b |= 1;
                            attsVar.c = i13;
                            if ((armdVar.b & 2) != 0) {
                                int i14 = armdVar.d;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atts attsVar2 = (atts) aihfVarCreateBuilder2.instance;
                                attsVar2.b |= 2;
                                attsVar2.d = i14;
                            }
                            if ((armdVar.b & 4) != 0) {
                                int i15 = armdVar.e;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atts attsVar3 = (atts) aihfVarCreateBuilder2.instance;
                                attsVar3.b |= 4;
                                attsVar3.e = i15;
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar3 = (atty) aihfVarCreateBuilder.instance;
                            atts attsVar4 = (atts) aihfVarCreateBuilder2.build();
                            attsVar4.getClass();
                            attyVar3.d = attsVar4;
                            i2 = 2;
                            attyVar3.c = 2;
                            th = th2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 1:
                            i10 = i10;
                            i8 = i8;
                            arlu arluVar = i11 == i9 ? (arlu) arlpVar.d : arlu.a;
                            aihf aihfVarCreateBuilder3 = attp.a.createBuilder();
                            float f = arluVar.c;
                            aihfVarCreateBuilder3.copyOnWrite();
                            attp attpVar = (attp) aihfVarCreateBuilder3.instance;
                            attpVar.b |= 1;
                            attpVar.c = f;
                            if ((arluVar.b & 2) != 0) {
                                float f2 = arluVar.d;
                                aihfVarCreateBuilder3.copyOnWrite();
                                attp attpVar2 = (attp) aihfVarCreateBuilder3.instance;
                                attpVar2.b |= 2;
                                attpVar2.d = f2;
                            }
                            if ((arluVar.b & 4) != 0) {
                                float f3 = arluVar.e;
                                aihfVarCreateBuilder3.copyOnWrite();
                                attp attpVar3 = (attp) aihfVarCreateBuilder3.instance;
                                attpVar3.b |= 4;
                                attpVar3.e = f3;
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar4 = (atty) aihfVarCreateBuilder.instance;
                            attp attpVar4 = (attp) aihfVarCreateBuilder3.build();
                            attpVar4.getClass();
                            attyVar4.d = attpVar4;
                            attyVar4.c = 3;
                            th = th2;
                            i2 = 2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 2:
                            i10 = i10;
                            i8 = i8;
                            arlm arlmVar = i11 == 3 ? (arlm) arlpVar.d : arlm.a;
                            aihf aihfVarCreateBuilder4 = attm.a.createBuilder();
                            boolean z = arlmVar.b;
                            aihfVarCreateBuilder4.copyOnWrite();
                            attm attmVar = (attm) aihfVarCreateBuilder4.instance;
                            attmVar.b |= 1;
                            attmVar.c = z;
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar5 = (atty) aihfVarCreateBuilder.instance;
                            attm attmVar2 = (attm) aihfVarCreateBuilder4.build();
                            attmVar2.getClass();
                            attyVar5.d = attmVar2;
                            attyVar5.c = 4;
                            th = th2;
                            i2 = 2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 3:
                            i10 = i10;
                            i8 = i8;
                            armp armpVar = i11 == 4 ? (armp) arlpVar.d : armp.a;
                            jrq jrqVar2 = (jrq) attx.a.createBuilder();
                            String str2 = armpVar.b;
                            jrqVar2.copyOnWrite();
                            attx attxVar = (attx) jrqVar2.instance;
                            str2.getClass();
                            attxVar.b |= 1;
                            attxVar.c = str2;
                            jrqVar2.k(armpVar.c);
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar6 = (atty) aihfVarCreateBuilder.instance;
                            attx attxVar2 = (attx) jrqVar2.build();
                            attxVar2.getClass();
                            attyVar6.d = attxVar2;
                            attyVar6.c = 5;
                            th = th2;
                            i2 = 2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 4:
                            i10 = i10;
                            i8 = i8;
                            if (i11 == 5) {
                                try {
                                    armhVar = (armh) arlpVar.d;
                                } catch (aiik e) {
                                    c("runtime options setting parse failed.", e);
                                }
                            } else {
                                armhVar = armh.a;
                            }
                            attw attwVar = (attw) aihn.parseFrom(attw.a, armhVar.b, ExtensionRegistryLite.getGeneratedRegistry());
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar7 = (atty) aihfVarCreateBuilder.instance;
                            attwVar.getClass();
                            attyVar7.d = attwVar;
                            attyVar7.c = 7;
                            th = th2;
                            i2 = 2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 5:
                            i10 = i10;
                            arly arlyVar = i11 == 6 ? (arly) arlpVar.d : arly.a;
                            aihf aihfVarCreateBuilder5 = attq.a.createBuilder();
                            boolean z2 = arlyVar.b;
                            aihfVarCreateBuilder5.copyOnWrite();
                            attq attqVar = (attq) aihfVarCreateBuilder5.instance;
                            attqVar.b |= 1;
                            attqVar.c = z2;
                            attq attqVar2 = (attq) aihfVarCreateBuilder5.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar8 = (atty) aihfVarCreateBuilder.instance;
                            attqVar2.getClass();
                            attyVar8.d = attqVar2;
                            i8 = 8;
                            attyVar8.c = 8;
                            th = th2;
                            i2 = 2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 6:
                            if (i11 == i8) {
                                try {
                                    armfVar = (armf) arlpVar.d;
                                } catch (aiik e2) {
                                    e = e2;
                                    i10 = i10;
                                    c("mode setting parse failed", e);
                                    th = th2;
                                    i2 = 2;
                                    i8 = 8;
                                    attyVar = (atty) aihfVarCreateBuilder.build();
                                    if (attyVar != null) {
                                        jrqVar.l(attyVar);
                                    }
                                    i9 = i2;
                                    i8 = i8;
                                    th2 = th;
                                    i10 = i10;
                                    i7 = 10;
                                }
                            } else {
                                armfVar = armf.a;
                            }
                            armfVar.getClass();
                            aihf aihfVarCreateBuilder6 = attv.a.createBuilder();
                            String str3 = armfVar.b;
                            aihfVarCreateBuilder6.copyOnWrite();
                            attv attvVar = (attv) aihfVarCreateBuilder6.instance;
                            str3.getClass();
                            attvVar.b |= i10;
                            attvVar.c = str3;
                            Iterator it2 = armfVar.c.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    arme armeVar = (arme) it2.next();
                                    aihf aihfVarCreateBuilder7 = attu.a.createBuilder();
                                    String str4 = armeVar.b;
                                    aihfVarCreateBuilder7.copyOnWrite();
                                    i10 = i10;
                                    try {
                                        attu attuVar2 = (attu) aihfVarCreateBuilder7.instance;
                                        str4.getClass();
                                        attuVar2.b |= 1;
                                        attuVar2.c = str4;
                                        Iterator it3 = armeVar.c.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                armo armoVar = (armo) it3.next();
                                                aihf aihfVarCreateBuilder8 = attt.a.createBuilder();
                                                String str5 = armoVar.d;
                                                aihfVarCreateBuilder8.copyOnWrite();
                                                attt atttVar = (attt) aihfVarCreateBuilder8.instance;
                                                str5.getClass();
                                                atttVar.b |= 1;
                                                atttVar.e = str5;
                                                int i16 = armoVar.b;
                                                if (i16 != 0) {
                                                    switch (i16) {
                                                        case 2:
                                                            i3 = i10;
                                                            break;
                                                        case 3:
                                                            i3 = 2;
                                                            break;
                                                        case 4:
                                                            i3 = 3;
                                                            break;
                                                        case 5:
                                                            i3 = 4;
                                                            break;
                                                        case 6:
                                                            i3 = 5;
                                                            break;
                                                        case 7:
                                                            i3 = 6;
                                                            break;
                                                        case 8:
                                                            i3 = 7;
                                                            break;
                                                        case 9:
                                                            i3 = 8;
                                                            break;
                                                        default:
                                                            i3 = 0;
                                                            break;
                                                    }
                                                } else {
                                                    i3 = 9;
                                                }
                                                int i17 = i3 - 1;
                                                if (i3 == 0) {
                                                    throw th2;
                                                }
                                                switch (i17) {
                                                    case 0:
                                                        int iIntValue = i16 == 2 ? ((Integer) armoVar.c).intValue() : 0;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar2 = (attt) aihfVarCreateBuilder8.instance;
                                                        atttVar2.c = 2;
                                                        atttVar2.d = Integer.valueOf(iIntValue);
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar3 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar3.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar3);
                                                        break;
                                                    case 1:
                                                        float fFloatValue = i16 == 3 ? ((Float) armoVar.c).floatValue() : 0.0f;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar4 = (attt) aihfVarCreateBuilder8.instance;
                                                        atttVar4.c = 3;
                                                        atttVar4.d = Float.valueOf(fFloatValue);
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar5 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar5.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar5);
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue = i16 == 4 ? ((Boolean) armoVar.c).booleanValue() : false;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar6 = (attt) aihfVarCreateBuilder8.instance;
                                                        atttVar6.c = 4;
                                                        atttVar6.d = Boolean.valueOf(zBooleanValue);
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar7 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar7.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar7);
                                                        break;
                                                    case 3:
                                                        String str6 = i16 == 5 ? (String) armoVar.c : "";
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar8 = (attt) aihfVarCreateBuilder8.instance;
                                                        str6.getClass();
                                                        atttVar8.c = 5;
                                                        atttVar8.d = str6;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar9 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar9.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar9);
                                                        break;
                                                    case 4:
                                                        ahnj ahnjVar = (ahnj) aihn.parseFrom(ahnj.a, i16 == 6 ? (aigj) armoVar.c : aigj.d, ExtensionRegistryLite.getGeneratedRegistry());
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar10 = (attt) aihfVarCreateBuilder8.instance;
                                                        ahnjVar.getClass();
                                                        atttVar10.d = ahnjVar;
                                                        atttVar10.c = 6;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar11 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar11.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar11);
                                                        break;
                                                    case 5:
                                                        attl attlVarA = a(i16 == 7 ? (arlk) armoVar.c : arlk.a);
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar12 = (attt) aihfVarCreateBuilder8.instance;
                                                        attlVarA.getClass();
                                                        atttVar12.d = attlVarA;
                                                        atttVar12.c = 7;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar13 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar13.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar13);
                                                        break;
                                                    case 6:
                                                        atwa atwaVar = (atwa) aihn.parseFrom(atwa.a, i16 == 8 ? (aigj) armoVar.c : aigj.d, ExtensionRegistryLite.getGeneratedRegistry());
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar14 = (attt) aihfVarCreateBuilder8.instance;
                                                        atwaVar.getClass();
                                                        atttVar14.d = atwaVar;
                                                        atttVar14.c = 8;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar15 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar15.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar15);
                                                        break;
                                                    case 7:
                                                        atsq atsqVarD = d(i16 == 9 ? (arln) armoVar.c : arln.a);
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        attt atttVar16 = (attt) aihfVarCreateBuilder8.instance;
                                                        atsqVarD.getClass();
                                                        atttVar16.d = atsqVarD;
                                                        atttVar16.c = 9;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        attuVar = (attu) aihfVarCreateBuilder7.instance;
                                                        attt atttVar17 = (attt) aihfVarCreateBuilder8.build();
                                                        atttVar17.getClass();
                                                        aiieVar = attuVar.d;
                                                        if (!aiieVar.c()) {
                                                            attuVar.d = aihn.mutableCopy(aiieVar);
                                                        }
                                                        attuVar.d.add(atttVar17);
                                                        break;
                                                    default:
                                                        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "convertModeSetting", 297, "XenoEffectConverterHelper.java")).t("unknown ModeSetting value OneOf case");
                                                        obj = th2;
                                                        break;
                                                }
                                            } else {
                                                aihfVarCreateBuilder6.copyOnWrite();
                                                attv attvVar2 = (attv) aihfVarCreateBuilder6.instance;
                                                attu attuVar3 = (attu) aihfVarCreateBuilder7.build();
                                                attuVar3.getClass();
                                                aiie aiieVar2 = attvVar2.d;
                                                if (!aiieVar2.c()) {
                                                    attvVar2.d = aihn.mutableCopy(aiieVar2);
                                                }
                                                attvVar2.d.add(attuVar3);
                                                i10 = i10;
                                            }
                                        }
                                    } catch (aiik e3) {
                                        e = e3;
                                        c("mode setting parse failed", e);
                                    }
                                } else {
                                    i10 = i10;
                                    obj = (attv) aihfVarCreateBuilder6.build();
                                }
                            }
                            if (obj != null) {
                                aihfVarCreateBuilder.copyOnWrite();
                                atty attyVar9 = (atty) aihfVarCreateBuilder.instance;
                                attyVar9.d = obj;
                                attyVar9.c = 6;
                            }
                            th = th2;
                            i2 = 2;
                            i8 = 8;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        case 7:
                            aihf aihfVarCreateBuilder9 = attn.a.createBuilder();
                            arln arlnVar = (arlpVar.c == 9 ? (arlo) arlpVar.d : arlo.a).b;
                            if (arlnVar == null) {
                                arlnVar = arln.a;
                            }
                            atsq atsqVarD2 = d(arlnVar);
                            aihfVarCreateBuilder9.copyOnWrite();
                            attn attnVar = (attn) aihfVarCreateBuilder9.instance;
                            atsqVarD2.getClass();
                            attnVar.c = atsqVarD2;
                            attnVar.b |= i10;
                            aihfVarCreateBuilder.copyOnWrite();
                            atty attyVar10 = (atty) aihfVarCreateBuilder.instance;
                            attn attnVar2 = (attn) aihfVarCreateBuilder9.build();
                            attnVar2.getClass();
                            attyVar10.d = attnVar2;
                            attyVar10.c = i7;
                            i2 = i9;
                            th = th2;
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                        default:
                            i10 = i10;
                            i8 = i8;
                            i2 = i9;
                            th = th2;
                            c("unknown ControlInput OneOf case", th);
                            attyVar = (atty) aihfVarCreateBuilder.build();
                            if (attyVar != null) {
                                jrqVar.l(attyVar);
                            }
                            i9 = i2;
                            i8 = i8;
                            th2 = th;
                            i10 = i10;
                            i7 = 10;
                            break;
                    }
                }
                return (atup) jrqVar.build();
            }
            armc armcVar = (armc) it.next();
            armcVar.getClass();
            aihf aihfVarCreateBuilder10 = atul.a.createBuilder();
            if ((armcVar.b & 1) != 0) {
                String str7 = armcVar.e;
                aihfVarCreateBuilder10.copyOnWrite();
                atul atulVar2 = (atul) aihfVarCreateBuilder10.instance;
                str7.getClass();
                atulVar2.b |= 1;
                atulVar2.e = str7;
            }
            int i18 = armcVar.c;
            if (i18 != 0) {
                switch (i18) {
                    case 2:
                        i4 = 1;
                        break;
                    case 3:
                        i4 = 3;
                        break;
                    case 4:
                        i4 = 4;
                        break;
                    case 5:
                        i4 = 5;
                        break;
                    case 6:
                        i4 = 6;
                        break;
                    case 7:
                        i4 = 7;
                        break;
                    case 8:
                        i4 = 8;
                        break;
                    case 9:
                        i4 = 9;
                        break;
                    case 10:
                        i4 = 10;
                        break;
                    case 11:
                        i4 = 11;
                        break;
                    case 12:
                        i4 = 2;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
            } else {
                i4 = 12;
            }
            int i19 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            switch (i19) {
                case 0:
                    int iIntValue2 = i18 == 2 ? ((Integer) armcVar.d).intValue() : 0;
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar3 = (atul) aihfVarCreateBuilder10.instance;
                    atulVar3.c = 2;
                    atulVar3.d = Integer.valueOf(iIntValue2);
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 1:
                    long jLongValue = i18 == 12 ? ((Long) armcVar.d).longValue() : 0L;
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar4 = (atul) aihfVarCreateBuilder10.instance;
                    atulVar4.c = 11;
                    atulVar4.d = Long.valueOf(jLongValue);
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 2:
                    float fFloatValue2 = i18 == 3 ? ((Float) armcVar.d).floatValue() : 0.0f;
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar5 = (atul) aihfVarCreateBuilder10.instance;
                    atulVar5.c = 3;
                    atulVar5.d = Float.valueOf(fFloatValue2);
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 3:
                    boolean zBooleanValue2 = i18 == 4 ? ((Boolean) armcVar.d).booleanValue() : false;
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar6 = (atul) aihfVarCreateBuilder10.instance;
                    atulVar6.c = 4;
                    atulVar6.d = Boolean.valueOf(zBooleanValue2);
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 4:
                    String str8 = i18 == 5 ? (String) armcVar.d : "";
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar7 = (atul) aihfVarCreateBuilder10.instance;
                    str8.getClass();
                    atulVar7.c = 5;
                    atulVar7.d = str8;
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 5:
                    if (i18 == 6) {
                        try {
                            aigjVar = (aigj) armcVar.d;
                        } catch (aiik e4) {
                            ((agrc) ((agrc) ((agrc) a.b()).j(e4)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "convertXenoEffectInput", (char) 199, "XenoEffectConverterHelper.java")).t("Invalid Calculator Options ");
                            atulVar = null;
                        }
                    } else {
                        aigjVar = aigj.d;
                    }
                    ahnj ahnjVar2 = (ahnj) aihn.parseFrom(ahnj.a, aigjVar, ExtensionRegistryLite.getGeneratedRegistry());
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar8 = (atul) aihfVarCreateBuilder10.instance;
                    ahnjVar2.getClass();
                    atulVar8.d = ahnjVar2;
                    atulVar8.c = 6;
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 6:
                    attl attlVarA2 = a(i18 == 7 ? (arlk) armcVar.d : arlk.a);
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar9 = (atul) aihfVarCreateBuilder10.instance;
                    attlVarA2.getClass();
                    atulVar9.d = attlVarA2;
                    atulVar9.c = 7;
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 7:
                    arlr arlrVar = i18 == 8 ? (arlr) armcVar.d : arlr.a;
                    arlrVar.getClass();
                    aihf aihfVarCreateBuilder11 = atuc.a.createBuilder();
                    int i20 = arlrVar.b;
                    if (i20 == 0) {
                        i5 = 3;
                    } else if (i20 != 1) {
                        i5 = i20 != 3 ? 0 : 2;
                    } else {
                        i5 = 1;
                    }
                    int i21 = i5 - 1;
                    if (i5 == 0) {
                        throw null;
                    }
                    if (i21 != 0) {
                        if (i21 != 1) {
                            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "convertDynamicInput", 340, "XenoEffectConverterHelper.java")).t("Unset or unknown Input OneOf case for dynamic input");
                            atucVar = null;
                        } else {
                            atua atuaVar = atua.a;
                            aihfVarCreateBuilder11.copyOnWrite();
                            atuc atucVar2 = (atuc) aihfVarCreateBuilder11.instance;
                            atuaVar.getClass();
                            atucVar2.c = atuaVar;
                            atucVar2.b = 3;
                        }
                        if (atucVar == null) {
                            atulVar = null;
                        } else {
                            aihfVarCreateBuilder10.copyOnWrite();
                            atul atulVar10 = (atul) aihfVarCreateBuilder10.instance;
                            atulVar10.d = atucVar;
                            atulVar10.c = 8;
                            atulVar = (atul) aihfVarCreateBuilder10.build();
                        }
                        if (atulVar != null) {
                            jrqVar.m(atulVar);
                        }
                    } else {
                        attz attzVar = attz.a;
                        aihfVarCreateBuilder11.copyOnWrite();
                        atuc atucVar3 = (atuc) aihfVarCreateBuilder11.instance;
                        attzVar.getClass();
                        atucVar3.c = attzVar;
                        atucVar3.b = 1;
                    }
                    atucVar = (atuc) aihfVarCreateBuilder11.build();
                    if (atucVar == null) {
                        atulVar = null;
                    } else {
                        aihfVarCreateBuilder10.copyOnWrite();
                        atul atulVar11 = (atul) aihfVarCreateBuilder10.instance;
                        atulVar11.d = atucVar;
                        atulVar11.c = 8;
                        atulVar = (atul) aihfVarCreateBuilder10.build();
                    }
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                    break;
                case 8:
                    armb armbVar = i18 == 9 ? (armb) armcVar.d : armb.a;
                    armbVar.getClass();
                    aihf aihfVarCreateBuilder12 = atuk.a.createBuilder();
                    if ((armbVar.b & 1) != 0) {
                        atuh atuhVar = atuh.a;
                        aihfVarCreateBuilder12.copyOnWrite();
                        atuk atukVar = (atuk) aihfVarCreateBuilder12.instance;
                        atuhVar.getClass();
                        atukVar.c = atuhVar;
                        atukVar.b = 1;
                    }
                    atuk atukVar2 = (atuk) aihfVarCreateBuilder12.build();
                    aihfVarCreateBuilder10.copyOnWrite();
                    atul atulVar12 = (atul) aihfVarCreateBuilder10.instance;
                    atukVar2.getClass();
                    atulVar12.d = atukVar2;
                    atulVar12.c = 9;
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                case 9:
                    armr armrVar = i18 == 10 ? (armr) armcVar.d : armr.a;
                    armrVar.getClass();
                    aihf aihfVarCreateBuilder13 = atuo.a.createBuilder();
                    int i22 = armrVar.b;
                    if (i22 == 0) {
                        i6 = 3;
                    } else if (i22 != 1) {
                        i6 = i22 != 2 ? 0 : 2;
                    } else {
                        i6 = 1;
                    }
                    int i23 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i23 != 0) {
                        if (i23 != 1) {
                            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "convertUserInteractionValue", 376, "XenoEffectConverterHelper.java")).t("XenoEffectUserInteractionValue is not valid!");
                            atuoVar = null;
                        } else {
                            atum atumVar = atum.a;
                            aihfVarCreateBuilder13.copyOnWrite();
                            atuo atuoVar2 = (atuo) aihfVarCreateBuilder13.instance;
                            atumVar.getClass();
                            atuoVar2.c = atumVar;
                            atuoVar2.b = 2;
                        }
                        if (atuoVar != null) {
                            aihfVarCreateBuilder10.copyOnWrite();
                            atul atulVar13 = (atul) aihfVarCreateBuilder10.instance;
                            atulVar13.d = atuoVar;
                            atulVar13.c = 10;
                            atulVar = (atul) aihfVarCreateBuilder10.build();
                        } else {
                            atulVar = null;
                        }
                        if (atulVar != null) {
                            jrqVar.m(atulVar);
                        }
                    } else {
                        atun atunVar = atun.a;
                        aihfVarCreateBuilder13.copyOnWrite();
                        atuo atuoVar3 = (atuo) aihfVarCreateBuilder13.instance;
                        atunVar.getClass();
                        atuoVar3.c = atunVar;
                        atuoVar3.b = 1;
                    }
                    atuoVar = (atuo) aihfVarCreateBuilder13.build();
                    if (atuoVar != null) {
                        aihfVarCreateBuilder10.copyOnWrite();
                        atul atulVar14 = (atul) aihfVarCreateBuilder10.instance;
                        atulVar14.d = atuoVar;
                        atulVar14.c = 10;
                        atulVar = (atul) aihfVarCreateBuilder10.build();
                    } else {
                        atulVar = null;
                    }
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                    break;
                case 10:
                    arlt arltVar = i18 == 11 ? (arlt) armcVar.d : arlt.a;
                    arltVar.getClass();
                    aihf aihfVarCreateBuilder14 = atue.a.createBuilder();
                    try {
                        aihf aihfVarCreateBuilder15 = atud.a.createBuilder();
                        arls arlsVar = arltVar.b;
                        if (arlsVar == null) {
                            arlsVar = arls.a;
                        }
                        attf attfVar = (attf) aihn.parseFrom(attf.a, arlsVar.b.G(), ExtensionRegistryLite.getGeneratedRegistry());
                        aihfVarCreateBuilder15.copyOnWrite();
                        atud atudVar = (atud) aihfVarCreateBuilder15.instance;
                        attfVar.getClass();
                        atudVar.c = attfVar;
                        atudVar.b |= 1;
                        aihfVarCreateBuilder14.copyOnWrite();
                        atue atueVar = (atue) aihfVarCreateBuilder14.instance;
                        atud atudVar2 = (atud) aihfVarCreateBuilder15.build();
                        atudVar2.getClass();
                        atueVar.c = atudVar2;
                        atueVar.b |= 1;
                    } catch (aiik e5) {
                        c("parsing of the EventListProto failed.", e5);
                    }
                    atue atueVar2 = (atue) aihfVarCreateBuilder14.build();
                    if (atueVar2 != null) {
                        aihfVarCreateBuilder10.copyOnWrite();
                        atul atulVar15 = (atul) aihfVarCreateBuilder10.instance;
                        atulVar15.d = atueVar2;
                        atulVar15.c = 13;
                        atulVar = (atul) aihfVarCreateBuilder10.build();
                    } else {
                        atulVar = null;
                    }
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
                default:
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "convertXenoEffectInput", 231, "XenoEffectConverterHelper.java")).t("Unset or unknown Input OneOf case");
                    atulVar = (atul) aihfVarCreateBuilder10.build();
                    if (atulVar != null) {
                        jrqVar.m(atulVar);
                    }
                    break;
            }
        }
    }

    public static void c(String str, Throwable th) {
        typ.f(str);
        zvp.b(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]".concat(str), th == null ? new Exception() : th);
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/creation/effects/innertube/XenoEffectConverterHelper", "logErrorMessage", (char) 413, "XenoEffectConverterHelper.java")).w("%s", str);
    }

    private static atsq d(arln arlnVar) {
        arlnVar.getClass();
        aihf aihfVarCreateBuilder = atsq.a.createBuilder();
        double d = arlnVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        atsq atsqVar = (atsq) aihfVarCreateBuilder.instance;
        atsqVar.b |= 1;
        atsqVar.c = d;
        double d2 = arlnVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        atsq atsqVar2 = (atsq) aihfVarCreateBuilder.instance;
        atsqVar2.b |= 2;
        atsqVar2.d = d2;
        double d3 = arlnVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        atsq atsqVar3 = (atsq) aihfVarCreateBuilder.instance;
        atsqVar3.b |= 4;
        atsqVar3.e = d3;
        double d4 = arlnVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        atsq atsqVar4 = (atsq) aihfVarCreateBuilder.instance;
        atsqVar4.b |= 8;
        atsqVar4.f = d4;
        return (atsq) aihfVarCreateBuilder.build();
    }
}
