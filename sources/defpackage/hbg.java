package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbg implements mlc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hbg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Type inference failed for: r0v12, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, zsl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, nuc] */
    @Override // defpackage.mlc
    public final fgv a(fhd fhdVar, nsl nslVar, MessageLite messageLite, String str, List list) {
        CommandOuterClass$Command defaultInstance;
        CommandOuterClass$Command defaultInstance2;
        CommandOuterClass$Command defaultInstance3;
        int iAV;
        int i;
        adrj adrhVar;
        asnk asnkVar;
        int iIntValue;
        asnk asnkVar2;
        CommandOuterClass$Command defaultInstance4;
        int iAV2;
        int i2 = this.$cid;
        CommandOuterClass$Command defaultInstance5 = null;
        nxsVar = null;
        nxs nxsVar = null;
        int i3 = 1;
        if (i2 == 0) {
            assv assvVar = (assv) messageLite;
            int i4 = (assvVar.c & 2) != 0 ? assvVar.g : 1;
            int i5 = assvVar.d;
            int iIntValue2 = (i5 == 2 && i5 == 2) ? ((Integer) assvVar.e).intValue() : 0;
            int i6 = assvVar.c;
            boolean z = (i6 & 16) == 0 || assvVar.h;
            if ((i6 & 32) != 0) {
                defaultInstance = assvVar.i;
                if (defaultInstance == null) {
                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                }
            } else {
                defaultInstance = null;
            }
            if ((assvVar.c & SemanticState.Hidden) != 0) {
                defaultInstance2 = assvVar.l;
                if (defaultInstance2 == null) {
                    defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                }
            } else {
                defaultInstance2 = null;
            }
            if ((assvVar.c & SemanticState.LiveRegion) != 0) {
                defaultInstance3 = assvVar.m;
                if (defaultInstance3 == null) {
                    defaultInstance3 = CommandOuterClass$Command.getDefaultInstance();
                }
            } else {
                defaultInstance3 = null;
            }
            int i7 = assvVar.c;
            String str2 = (i7 & 64) != 0 ? assvVar.j : null;
            Optional optionalOf = (i7 & 1) != 0 ? Optional.of(Integer.valueOf(assvVar.f)) : Optional.empty();
            if ((assvVar.c & SemanticState.Focused) == 0 || (iAV = a.aV(assvVar.k)) == 0) {
                iAV = 1;
            }
            Object obj = this.a;
            boolean z2 = assvVar.n;
            adcl adclVar = new adcl(fhdVar, new adcm());
            adcm adcmVar = adclVar.a;
            adcmVar.r = Integer.valueOf(i4 - 1);
            BitSet bitSet = adclVar.d;
            bitSet.set(4);
            adcmVar.d = Integer.valueOf(iIntValue2);
            bitSet.set(1);
            adcmVar.g = Boolean.valueOf(z);
            adcn adcnVar = (adcn) obj;
            adcmVar.c = adcnVar.a;
            bitSet.set(0);
            adcmVar.s = defaultInstance;
            adcmVar.t = defaultInstance2;
            adcmVar.u = defaultInstance3;
            adcmVar.q = adcnVar.b;
            bitSet.set(3);
            adcmVar.a = str2;
            adcmVar.b = optionalOf;
            adcmVar.v = iAV;
            adcmVar.f = z2;
            bitSet.set(2);
            adcmVar.e = adcnVar.c;
            return adclVar;
        }
        if (i2 == 1) {
            assy assyVar = (assy) messageLite;
            zpc zpcVar = new zpc(fhdVar, new zpg());
            zpg zpgVar = zpcVar.a;
            zph zphVar = (zph) this.a;
            zpgVar.c = zphVar.a;
            BitSet bitSet2 = zpcVar.d;
            bitSet2.set(2);
            zpgVar.y = assyVar;
            bitSet2.set(19);
            CommandOuterClass$Command defaultInstance6 = assyVar.g;
            if (defaultInstance6 == null) {
                defaultInstance6 = CommandOuterClass$Command.getDefaultInstance();
            }
            zpgVar.v = defaultInstance6;
            bitSet2.set(13);
            CommandOuterClass$Command defaultInstance7 = assyVar.h;
            if (defaultInstance7 == null) {
                defaultInstance7 = CommandOuterClass$Command.getDefaultInstance();
            }
            zpgVar.w = defaultInstance7;
            bitSet2.set(14);
            CommandOuterClass$Command defaultInstance8 = assyVar.i;
            if (defaultInstance8 == null) {
                defaultInstance8 = CommandOuterClass$Command.getDefaultInstance();
            }
            zpgVar.u = defaultInstance8;
            bitSet2.set(12);
            CommandOuterClass$Command defaultInstance9 = assyVar.j;
            if (defaultInstance9 == null) {
                defaultInstance9 = CommandOuterClass$Command.getDefaultInstance();
            }
            zpgVar.x = defaultInstance9;
            bitSet2.set(15);
            zpgVar.z = zphVar.b;
            bitSet2.set(21);
            zpgVar.t = zphVar.c;
            bitSet2.set(10);
            zpgVar.a = zphVar.d;
            bitSet2.set(0);
            zpgVar.d = nslVar;
            bitSet2.set(3);
            zpgVar.F = zphVar.q;
            bitSet2.set(16);
            zpgVar.C = zphVar.n;
            bitSet2.set(18);
            zpgVar.A = zphVar.e;
            bitSet2.set(22);
            zpgVar.E = zphVar.p;
            bitSet2.set(20);
            zpgVar.s = zphVar.f;
            bitSet2.set(9);
            zpgVar.g = zphVar.g;
            bitSet2.set(6);
            zpgVar.q = zphVar.h;
            bitSet2.set(7);
            zpgVar.r = zphVar.i;
            bitSet2.set(8);
            zpgVar.b = zphVar.j;
            bitSet2.set(1);
            zpgVar.B = zphVar.k;
            bitSet2.set(23);
            zpgVar.D = zphVar.o;
            bitSet2.set(17);
            zpgVar.G = zphVar.r;
            bitSet2.set(11);
            zpgVar.f = ((Boolean) zphVar.l.orElse(Boolean.FALSE)).booleanValue();
            bitSet2.set(5);
            zpgVar.e = ((Long) zphVar.m.orElse(0L)).longValue();
            bitSet2.set(4);
            return zpcVar;
        }
        if (i2 == 2) {
            asnt asntVar = (asnt) messageLite;
            if ((asntVar.c & 1) == 0) {
                throw new nud("ImageZoomType.image missing");
            }
            asnm asnmVar = asntVar.d;
            if (asnmVar == null) {
                asnmVar = asnm.a;
            }
            Object obj2 = this.a;
            int iBt = a.bt(asnmVar.f);
            adet adetVar = (adet) obj2;
            ?? r10 = adetVar.a;
            if (iBt == 0 || iBt != 5) {
                asnm asnmVar2 = asntVar.d;
                if (asnmVar2 == null) {
                    asnmVar2 = asnm.a;
                }
                int iBt2 = a.bt(asnmVar2.f);
                if (iBt2 != 0 && iBt2 == 4) {
                    nxsVar = new nxs(null, null, r10, asntVar);
                }
            } else {
                nxsVar = new nxs(null, null, r10, asntVar);
            }
            Object obj3 = adetVar.c;
            ?? r9 = adetVar.b;
            adep adepVar = new adep(fhdVar, new ades());
            ades adesVar = adepVar.a;
            adesVar.y = asntVar;
            BitSet bitSet3 = adepVar.d;
            bitSet3.set(14);
            adesVar.g = r9;
            bitSet3.set(5);
            adesVar.t = aext.m((asntVar.c & SemanticState.ReadOnly) != 0, obj3);
            bitSet3.set(10);
            asnq asnqVar = asntVar.l;
            if (asnqVar == null) {
                asnqVar = asnq.a;
            }
            ?? r4 = adetVar.i;
            Object obj4 = adetVar.j;
            ?? r13 = adetVar.h;
            ?? r14 = adetVar.g;
            ?? r15 = adetVar.f;
            ?? r7 = adetVar.e;
            ?? r0 = adetVar.d;
            adesVar.q = asnqVar;
            bitSet3.set(7);
            adesVar.r = r0;
            bitSet3.set(8);
            adesVar.w = r7;
            bitSet3.set(12);
            adesVar.u = r15;
            bitSet3.set(11);
            adesVar.b = r14;
            bitSet3.set(0);
            adesVar.f = true;
            bitSet3.set(4);
            adesVar.x = true;
            bitSet3.set(13);
            adesVar.e = nslVar;
            bitSet3.set(3);
            adesVar.d = r10;
            bitSet3.set(2);
            adesVar.a = nxsVar;
            adesVar.v = r13;
            adesVar.z = (ci) obj4;
            bitSet3.set(6);
            adesVar.c = r4;
            bitSet3.set(1);
            adesVar.s = nslVar.j;
            bitSet3.set(9);
            return adepVar;
        }
        if (i2 != 3) {
            astb astbVar = (astb) messageLite;
            adcx adcxVar = new adcx(fhdVar, new adcz());
            adcz adczVar = adcxVar.a;
            adczVar.b = this.a;
            BitSet bitSet4 = adcxVar.d;
            bitSet4.set(1);
            CommandOuterClass$Command defaultInstance10 = astbVar.d;
            if (defaultInstance10 == null) {
                defaultInstance10 = CommandOuterClass$Command.getDefaultInstance();
            }
            adczVar.e = defaultInstance10;
            bitSet4.set(4);
            CommandOuterClass$Command defaultInstance11 = astbVar.c;
            if (defaultInstance11 == null) {
                defaultInstance11 = CommandOuterClass$Command.getDefaultInstance();
            }
            adczVar.c = defaultInstance11;
            bitSet4.set(2);
            CommandOuterClass$Command defaultInstance12 = astbVar.e;
            if (defaultInstance12 == null) {
                defaultInstance12 = CommandOuterClass$Command.getDefaultInstance();
            }
            adczVar.f = defaultInstance12;
            bitSet4.set(5);
            CommandOuterClass$Command defaultInstance13 = astbVar.f;
            if (defaultInstance13 == null) {
                defaultInstance13 = CommandOuterClass$Command.getDefaultInstance();
            }
            adczVar.d = defaultInstance13;
            bitSet4.set(3);
            adczVar.a = list;
            bitSet4.set(0);
            return adcxVar;
        }
        assq assqVar = (assq) messageLite;
        assr assrVar = assqVar.d;
        if (assrVar == null) {
            assrVar = assr.a;
        }
        assrVar.getClass();
        Context context = fhdVar.a;
        context.getClass();
        vlv vlvVar = vlv.a;
        int i8 = assrVar.c;
        if (i8 == 1) {
            String str3 = i8 == 1 ? (String) assrVar.d : "";
            str3.getClass();
            if (str3.length() > 0) {
                String str4 = assrVar.c == 1 ? (String) assrVar.d : "";
                str4.getClass();
                adrhVar = new adri(str4);
                i3 = 1;
            } else {
                i = assrVar.c;
                if (i != 2) {
                    if (i == 2) {
                        asnkVar = (asnk) assrVar.d;
                    } else {
                        asnkVar = asnk.a;
                    }
                    String str5 = asnkVar.c;
                    str5.getClass();
                    iIntValue = ((Number) vlvVar.invoke(context, str5)).intValue();
                    if (iIntValue != 0) {
                        i3 = 1;
                        adrhVar = new adrh(iIntValue);
                    } else {
                        agrc agrcVar = (agrc) vlw.a.c().k("com/google/android/libraries/youtube/elementscomponents/riveanimation/RiveAnimationConverter", "toRiveSource", 56, "RiveAnimationConverter.kt");
                        if (assrVar.c == 2) {
                            asnkVar2 = (asnk) assrVar.d;
                        } else {
                            asnkVar2 = asnk.a;
                        }
                        agrcVar.w("Failed to resolve Rive raw resource: %s", asnkVar2.c);
                    }
                }
                adrhVar = null;
            }
        } else {
            i = assrVar.c;
            if (i != 2) {
                if (i == 2) {
                    asnkVar = (asnk) assrVar.d;
                } else {
                    asnkVar = asnk.a;
                }
                String str6 = asnkVar.c;
                str6.getClass();
                iIntValue = ((Number) vlvVar.invoke(context, str6)).intValue();
                if (iIntValue != 0) {
                    i3 = 1;
                    adrhVar = new adrh(iIntValue);
                } else {
                    agrc agrcVar2 = (agrc) vlw.a.c().k("com/google/android/libraries/youtube/elementscomponents/riveanimation/RiveAnimationConverter", "toRiveSource", 56, "RiveAnimationConverter.kt");
                    if (assrVar.c == 2) {
                        asnkVar2 = (asnk) assrVar.d;
                    } else {
                        asnkVar2 = asnk.a;
                    }
                    agrcVar2.w("Failed to resolve Rive raw resource: %s", asnkVar2.c);
                }
            }
            adrhVar = null;
        }
        if ((assqVar.c & 8) != 0) {
            defaultInstance4 = assqVar.g;
            if (defaultInstance4 == null) {
                defaultInstance4 = CommandOuterClass$Command.getDefaultInstance();
            }
        } else {
            defaultInstance4 = null;
        }
        if ((assqVar.c & 4) != 0 && (defaultInstance5 = assqVar.f) == null) {
            defaultInstance5 = CommandOuterClass$Command.getDefaultInstance();
        }
        if ((assqVar.c & 2) != 0) {
            iAV2 = a.aV(assqVar.e);
            if (iAV2 == 0) {
                iAV2 = i3;
            }
        } else {
            iAV2 = 0;
        }
        ?? r1 = this.a;
        vls vlsVar = new vls(fhdVar, new vlt());
        vlt vltVar = vlsVar.a;
        vltVar.e = assrVar;
        vlsVar.d.set(0);
        vltVar.f = adrhVar;
        vltVar.g = iAV2;
        vltVar.d = defaultInstance4;
        vltVar.c = defaultInstance5;
        vltVar.a = r1;
        vltVar.b = nslVar.x;
        if (str != null) {
            vlsVar.z(str);
        }
        return vlsVar;
    }
}
