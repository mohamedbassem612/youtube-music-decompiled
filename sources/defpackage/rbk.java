package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import app.rive.semantics.SemanticState;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbk {
    public static final /* synthetic */ int a = 0;
    private static final agkz b;

    static {
        rbm.c(rbk.class);
        b = agkz.q("https", "http");
    }

    private rbk() {
    }

    public static aueh a(quc qucVar, Context context) {
        aihf aihfVarCreateBuilder = aueh.a.createBuilder();
        agqr it = qucVar.b().iterator();
        while (it.hasNext()) {
            auen auenVarD = d((qup) it.next(), context);
            aihfVarCreateBuilder.copyOnWrite();
            aueh auehVar = (aueh) aihfVarCreateBuilder.instance;
            auenVarD.getClass();
            aiie aiieVar = auehVar.b;
            if (!aiieVar.c()) {
                auehVar.b = aihn.mutableCopy(aiieVar);
            }
            auehVar.b.add(auenVarD);
        }
        agqr it2 = qucVar.d().iterator();
        while (it2.hasNext()) {
            qxj qxjVar = (qxj) it2.next();
            qvu qvuVar = qxjVar.e;
            qvu qvuVar2 = qxjVar.f;
            aihf aihfVarCreateBuilder2 = aueo.a.createBuilder();
            if (qvuVar != null) {
                auen auenVarD2 = d(new nrc().f(qvuVar), context);
                aihfVarCreateBuilder2.copyOnWrite();
                aueo aueoVar = (aueo) aihfVarCreateBuilder2.instance;
                auenVarD2.getClass();
                aueoVar.c = auenVarD2;
                aueoVar.b |= 1;
            }
            if (qvuVar2 != null) {
                auen auenVarD3 = d(new nrc().f(qvuVar2), context);
                aihfVarCreateBuilder2.copyOnWrite();
                aueo aueoVar2 = (aueo) aihfVarCreateBuilder2.instance;
                auenVarD3.getClass();
                aueoVar2.d = auenVarD3;
                aueoVar2.b |= 2;
            }
            long millis = qxjVar.c.toMillis();
            aihfVarCreateBuilder2.copyOnWrite();
            aueo aueoVar3 = (aueo) aihfVarCreateBuilder2.instance;
            aueoVar3.b |= 4;
            aueoVar3.e = millis;
            aueo aueoVar4 = (aueo) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            aueh auehVar2 = (aueh) aihfVarCreateBuilder.instance;
            aueoVar4.getClass();
            aiie aiieVar2 = auehVar2.c;
            if (!aiieVar2.c()) {
                auehVar2.c = aihn.mutableCopy(aiieVar2);
            }
            auehVar2.c.add(aueoVar4);
        }
        return (aueh) aihfVarCreateBuilder.build();
    }

    public static auet b(quc qucVar, Context context) {
        aihf aihfVarCreateBuilder = auet.a.createBuilder();
        aueh auehVarA = a(qucVar, context);
        aihfVarCreateBuilder.copyOnWrite();
        auet auetVar = (auet) aihfVarCreateBuilder.instance;
        auehVarA.getClass();
        aiie aiieVar = auetVar.g;
        if (!aiieVar.c()) {
            auetVar.g = aihn.mutableCopy(aiieVar);
        }
        auetVar.g.add(auehVarA);
        return (auet) aihfVarCreateBuilder.build();
    }

    private static auei c(qwv qwvVar) {
        if (!qwvVar.e()) {
            return auei.a;
        }
        aihf aihfVarCreateBuilder = auei.a.createBuilder();
        qwvVar.d();
        qwu qwuVar = qwvVar.f;
        qwuVar.getClass();
        Iterable iterable = (Iterable) Collection.EL.stream(qwuVar.a()).map(new qzp(4)).collect(aghu.a);
        aihfVarCreateBuilder.copyOnWrite();
        auei aueiVar = (auei) aihfVarCreateBuilder.instance;
        aiie aiieVar = aueiVar.b;
        if (!aiieVar.c()) {
            aueiVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aueiVar.b);
        return (auei) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x02fa A[Catch: IOException -> 0x032b, IOException | RuntimeException -> 0x032d, TRY_ENTER, TryCatch #8 {IOException | RuntimeException -> 0x032d, blocks: (B:55:0x0269, B:58:0x028f, B:59:0x0292, B:62:0x02ad, B:68:0x02b7, B:69:0x02c6, B:80:0x02fa, B:81:0x02fd, B:89:0x0312, B:88:0x030f, B:96:0x031e, B:95:0x031b, B:103:0x032a, B:102:0x0327), top: B:138:0x0269 }] */
    private static auen d(qup qupVar, Context context) {
        audh audhVar;
        aueg auegVar;
        InputStream inputStreamC;
        byte[] bArr;
        boolean z;
        qus qusVar = qupVar.b;
        if (qusVar instanceof quq) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_AUDIO;
        } else if (qusVar instanceof quv) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_IMAGE;
        } else if (qusVar instanceof quw) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_SHAPE;
        } else if (qusVar instanceof qux) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE;
        } else if (qusVar instanceof quy) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_TEXT;
        } else if (qusVar instanceof quz) {
            audhVar = audh.MEDIA_ENGINE_SEGMENT_TYPE_VIDEO;
        } else {
            audhVar = qusVar instanceof qut ? audh.MEDIA_ENGINE_SEGMENT_TYPE_EMPTY : audh.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
        }
        aihf aihfVarCreateBuilder = auen.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auen auenVar = (auen) aihfVarCreateBuilder.instance;
        auenVar.d = audhVar.j;
        auenVar.b |= 2;
        Iterable$EL.forEach(qupVar.is(), new kjk(aihfVarCreateBuilder, 14));
        long millis = qupVar.d.toMillis();
        aihfVarCreateBuilder.copyOnWrite();
        auen auenVar2 = (auen) aihfVarCreateBuilder.instance;
        auenVar2.b |= SemanticState.Hidden;
        auenVar2.l = millis;
        int i = 8;
        if (audhVar == audh.MEDIA_ENGINE_SEGMENT_TYPE_VIDEO) {
            quz quzVar = (quz) qusVar;
            qxe qxeVar = quzVar.k;
            aihf aihfVarCreateBuilder2 = auer.a.createBuilder();
            long millis2 = quzVar.l.toMillis();
            aihfVarCreateBuilder2.copyOnWrite();
            auer auerVar = (auer) aihfVarCreateBuilder2.instance;
            auerVar.b |= 16;
            auerVar.g = millis2;
            if (qxeVar.e()) {
                int iB = qxeVar.b();
                aihfVarCreateBuilder2.copyOnWrite();
                auer auerVar2 = (auer) aihfVarCreateBuilder2.instance;
                auerVar2.b |= 1;
                auerVar2.c = iB;
                int iA = qxeVar.a();
                aihfVarCreateBuilder2.copyOnWrite();
                auer auerVar3 = (auer) aihfVarCreateBuilder2.instance;
                auerVar3.b |= 2;
                auerVar3.d = iA;
                qxeVar.d();
                qxd qxdVar = (qxd) qxeVar.f;
                qxdVar.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                auer auerVar4 = (auer) aihfVarCreateBuilder2.instance;
                auerVar4.b |= 4;
                auerVar4.e = qxdVar.e;
                long millis3 = qxeVar.f().toMillis();
                aihfVarCreateBuilder2.copyOnWrite();
                auer auerVar5 = (auer) aihfVarCreateBuilder2.instance;
                auerVar5.b |= 8;
                auerVar5.f = millis3;
            }
            auer auerVar6 = (auer) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar3 = (auen) aihfVarCreateBuilder.instance;
            auerVar6.getClass();
            auenVar3.f = auerVar6;
            auenVar3.b |= 4;
            float f = quzVar.n;
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar4 = (auen) aihfVarCreateBuilder.instance;
            auenVar4.b |= SemanticState.LiveRegion;
            auenVar4.m = f;
            auei aueiVarC = c(quzVar.k);
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar5 = (auen) aihfVarCreateBuilder.instance;
            aueiVarC.getClass();
            auenVar5.i = aueiVarC;
            auenVar5.b |= 32;
            quzVar.k.c();
            rjs.d();
        }
        if (audhVar == audh.MEDIA_ENGINE_SEGMENT_TYPE_AUDIO) {
            qur qurVar = (qur) qusVar;
            qwo qwoVar = qurVar.b;
            aihf aihfVarCreateBuilder3 = audw.a.createBuilder();
            long millis4 = qurVar.c.toMillis();
            aihfVarCreateBuilder3.copyOnWrite();
            audw audwVar = (audw) aihfVarCreateBuilder3.instance;
            audwVar.b |= 1;
            audwVar.c = millis4;
            if (qwoVar.e()) {
                qwoVar.d();
                qwn qwnVar = (qwn) qwoVar.f;
                qwnVar.getClass();
                Optional optionalB = qwnVar.b();
                if (true == optionalB.isPresent()) {
                    optionalB = ((qwz) optionalB.get()).b;
                }
                int iIntValue = ((Integer) optionalB.orElse(-1)).intValue();
                aihfVarCreateBuilder3.copyOnWrite();
                audw audwVar2 = (audw) aihfVarCreateBuilder3.instance;
                audwVar2.b |= 4;
                audwVar2.e = iIntValue;
                qwoVar.d();
                qwn qwnVar2 = (qwn) qwoVar.f;
                qwnVar2.getClass();
                Optional optionalB2 = qwnVar2.b();
                if (true == optionalB2.isPresent()) {
                    optionalB2 = ((qwz) optionalB2.get()).c;
                }
                qwn qwnVar3 = (qwn) qwoVar.f;
                qwnVar3.getClass();
                int iIntValue2 = ((Integer) optionalB2.orElse(Integer.valueOf(qwnVar3.c))).intValue();
                aihfVarCreateBuilder3.copyOnWrite();
                audw audwVar3 = (audw) aihfVarCreateBuilder3.instance;
                audwVar3.b |= 2;
                audwVar3.d = iIntValue2;
                boolean zContains = b.contains(qwoVar.a().getScheme());
                aihfVarCreateBuilder3.copyOnWrite();
                audw audwVar4 = (audw) aihfVarCreateBuilder3.instance;
                audwVar4.b |= 8;
                audwVar4.f = zContains;
            }
            audw audwVar5 = (audw) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar6 = (auen) aihfVarCreateBuilder.instance;
            audwVar5.getClass();
            auenVar6.g = audwVar5;
            auenVar6.b |= 8;
            float f2 = qurVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar7 = (auen) aihfVarCreateBuilder.instance;
            auenVar7.b |= SemanticState.LiveRegion;
            auenVar7.m = f2;
            auei aueiVarC2 = c(qurVar.b);
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar8 = (auen) aihfVarCreateBuilder.instance;
            aueiVarC2.getClass();
            auenVar8.i = aueiVarC2;
            auenVar8.b |= 32;
            qurVar.b.a();
            rjs.d();
        }
        if (audhVar == audh.MEDIA_ENGINE_SEGMENT_TYPE_IMAGE && context != null) {
            qwr qwrVar = ((quv) qusVar).k;
            if (qwrVar instanceof qwt) {
                qwt qwtVar = (qwt) qwrVar;
                if (qwtVar.c == null && rjs.d()) {
                    auegVar = aueg.a;
                } else {
                    if (qwtVar.c == null) {
                        rjs.c();
                        try {
                            InputStream inputStreamC2 = qol.c(context, ((qwt) qwrVar).a, ((qwt) qwrVar).a());
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamC2, null, options);
                                Size size = new Size(options.outWidth, options.outHeight);
                                if (inputStreamC2 != null) {
                                    inputStreamC2.close();
                                }
                                InputStream inputStreamC3 = qol.c(context, ((qwt) qwrVar).a, ((qwt) qwrVar).a());
                                try {
                                    int iJ = new bmu(inputStreamC3).j();
                                    if (inputStreamC3 != null) {
                                        inputStreamC3.close();
                                    }
                                    try {
                                        if (iJ != 6) {
                                            if (iJ == 8) {
                                            }
                                            int width = size.getWidth();
                                            int height = size.getHeight();
                                            inputStreamC = qol.c(context, ((qwt) qwrVar).a, ((qwt) qwrVar).a());
                                            bArr = new byte[6];
                                            inputStreamC.read(bArr);
                                            if (bArr[0] != 71 && bArr[1] == 73 && bArr[2] == 70) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (inputStreamC != null) {
                                                inputStreamC.close();
                                            }
                                            ((qwt) qwrVar).c = new qws(width, height, iJ, z);
                                        } else {
                                            i = iJ;
                                        }
                                        bArr = new byte[6];
                                        inputStreamC.read(bArr);
                                        if (bArr[0] != 71) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        if (inputStreamC != null) {
                                            inputStreamC.close();
                                        }
                                        ((qwt) qwrVar).c = new qws(width, height, iJ, z);
                                    } catch (Throwable th) {
                                        if (inputStreamC != null) {
                                            try {
                                                inputStreamC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                    size = new Size(size.getHeight(), size.getWidth());
                                    iJ = i;
                                    int width2 = size.getWidth();
                                    int height2 = size.getHeight();
                                    inputStreamC = qol.c(context, ((qwt) qwrVar).a, ((qwt) qwrVar).a());
                                } catch (Throwable th3) {
                                    if (inputStreamC3 != null) {
                                        try {
                                            inputStreamC3.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                if (inputStreamC2 != null) {
                                    try {
                                        inputStreamC2.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                }
                                throw th5;
                            }
                        } catch (IOException | RuntimeException e) {
                            rbc rbcVar = new rbc(qwt.d, rbd.e);
                            rbcVar.a = e;
                            rbcVar.c();
                            rbcVar.a("Failed to parse image metadata", new Object[0]);
                            qwtVar.c = qws.a;
                        }
                    }
                    aihf aihfVarCreateBuilder4 = aueg.a.createBuilder();
                    ahno.O(qwtVar.c != null);
                    qws qwsVar = qwtVar.c;
                    qwsVar.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aueg auegVar2 = (aueg) aihfVarCreateBuilder4.instance;
                    auegVar2.b |= 1;
                    auegVar2.c = qwsVar.b;
                    ahno.O(qwtVar.c != null);
                    qws qwsVar2 = qwtVar.c;
                    qwsVar2.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aueg auegVar3 = (aueg) aihfVarCreateBuilder4.instance;
                    auegVar3.b |= 2;
                    auegVar3.d = qwsVar2.c;
                    ahno.O(qwtVar.c != null);
                    qws qwsVar3 = qwtVar.c;
                    qwsVar3.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aueg auegVar4 = (aueg) aihfVarCreateBuilder4.instance;
                    auegVar4.b |= 4;
                    auegVar4.e = qwsVar3.d;
                    auegVar = (aueg) aihfVarCreateBuilder4.build();
                }
            } else {
                auegVar = aueg.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            auen auenVar9 = (auen) aihfVarCreateBuilder.instance;
            auegVar.getClass();
            auenVar9.h = auegVar;
            auenVar9.b |= 16;
            qwr qwrVar2 = ((quv) qupVar.b).k;
            if (qwrVar2 instanceof qwt) {
                Uri uri = ((qwt) qwrVar2).a;
                rjs.d();
            }
        }
        long millis5 = qupVar.c.toMillis();
        aihfVarCreateBuilder.copyOnWrite();
        auen auenVar10 = (auen) aihfVarCreateBuilder.instance;
        auenVar10.b |= SemanticState.Focused;
        auenVar10.k = millis5;
        boolean zIt = qupVar.it();
        aihfVarCreateBuilder.copyOnWrite();
        auen auenVar11 = (auen) aihfVarCreateBuilder.instance;
        auenVar11.b |= SemanticState.ReadOnly;
        auenVar11.n = zIt;
        return (auen) aihfVarCreateBuilder.build();
    }
}
