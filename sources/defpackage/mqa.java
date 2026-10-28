package defpackage;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqa implements nvr {
    private final nuc a;
    private final Map b;
    private final Map c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public mqa(Map map, Map map2, agev agevVar, agev agevVar2, agev agevVar3, nuc nucVar) {
        this.a = nucVar;
        Boolean bool = Boolean.FALSE;
        this.d = ((Boolean) agevVar.e(bool)).booleanValue();
        this.e = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.f = ((Boolean) agevVar3.e(bool)).booleanValue();
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(Integer.valueOf(((nwr) entry.getValue()).a().a), (nwr) entry.getValue());
        }
        agkh agkhVar2 = new agkh(4);
        agqr it2 = ((agpk) ((agpn) map2).entrySet()).iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            agkhVar2.e(Integer.valueOf(((nwq) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
        }
        this.b = agkhVar.d(true);
        this.c = agkhVar2.d(true);
    }

    @Override // defpackage.nvr
    public final mep a() {
        return nem.ah;
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final void d(ntq ntqVar) {
        fgv fgvVarA = ntqVar.a();
        fgvVarA.m(1.0f);
        fgvVarA.r(true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x020a  */
    /* JADX WARN: Code duplicated, block: B:115:0x022b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:124:0x024f  */
    /* JADX WARN: Code duplicated, block: B:133:0x026b  */
    /* JADX WARN: Code duplicated, block: B:138:0x029f  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:157:0x0305  */
    /* JADX WARN: Code duplicated, block: B:159:0x0311  */
    /* JADX WARN: Code duplicated, block: B:161:0x031f  */
    /* JADX WARN: Code duplicated, block: B:163:0x032a  */
    /* JADX WARN: Code duplicated, block: B:165:0x033a  */
    /* JADX WARN: Code duplicated, block: B:186:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:202:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        float f;
        boolean z;
        float fI;
        double d;
        float fK;
        double d2;
        float fL;
        double d3;
        float fM;
        double d4;
        float fJ;
        boolean z2;
        int iN;
        Drawable drawable;
        ahto ahtoVar;
        mje mjeVar;
        nen nenVarR;
        int[] iArrAG;
        int length;
        int i;
        int i2;
        agkz agkzVar;
        Integer numValueOf;
        Pair pair;
        nwq nwqVar;
        agke agkeVarAF;
        int size;
        int i3;
        nen nenVar;
        nwr nwrVar;
        mqr mqrVar;
        nei neiVar;
        float fAp;
        float fAq;
        fgu fguVarK;
        nem nemVar = (nem) obj;
        fgv fgvVarA = ntqVar.a();
        DisplayMetrics displayMetrics = fhdVar.c().getDisplayMetrics();
        int iO = nemVar.o();
        float fH = nemVar.h();
        float f2 = 2.0f;
        float fMax = fH > 1.0f ? Math.max(0.0f, nemVar.g() - (fH / 2.0f)) : nemVar.g();
        boolean zBs = qnl.bs(fhdVar.a.getResources());
        nwp nwpVar = new nwp();
        if (iO == 0) {
            if (fH == 0.0f && fMax == 0.0f) {
                f2 = 2.0f;
                f = 0.0f;
            } else {
                iO = 0;
            }
            fI = nemVar.i();
            d = fI;
            if (d >= 0.0d && d < 1.0d) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_ALPHA, Float.valueOf(fI));
                fgvVarA.m(fI);
            }
            fK = nemVar.k();
            d2 = fK;
            if (d2 != 0.0d && d2 != 1.0d) {
                asmn asmnVar = asmn.DYNAMIC_PROP_TYPE_SCALE_X;
                Float fValueOf = Float.valueOf(fK);
                ntqVar.i(asmnVar, fValueOf);
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, fValueOf);
                fgvVarA.D(fK);
                fgvVarA.E(fK);
            }
            fL = nemVar.l();
            d3 = fL;
            if (d3 != 0.0d && d3 != 1.0d) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_X, Float.valueOf(fL));
                fgvVarA.D(fL);
            }
            fM = nemVar.m();
            d4 = fM;
            if (d4 != 0.0d && d4 != 1.0d) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, Float.valueOf(fM));
                fgvVarA.E(fM);
            }
            fJ = nemVar.j();
            if (fJ != 0.0d) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_ROTATION, Float.valueOf(fJ));
                fguVarK = fgvVarA.b.k();
                fguVarK.F().z(fJ);
                if (fJ == f) {
                    fguVarK.a = (byte) (fguVarK.a & (-17));
                } else {
                    fguVarK.a = (byte) (fguVarK.a | 16);
                }
            }
            if (nemVar.w()) {
                ndq ndqVarP = nemVar.p();
                fAp = ndqVarP.ap();
                fAq = ndqVarP.aq();
                if (fAp >= f || fAp > f) {
                    ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X, Float.valueOf(fAp));
                    float fApplyDimension = TypedValue.applyDimension(1, fAp, displayMetrics);
                    fgu fguVarK2 = fgvVarA.b.k();
                    fguVarK2.G();
                    fguVarK2.F().D(fApplyDimension);
                }
                if (fAq >= f || fAq > f) {
                    ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y, Float.valueOf(fAq));
                    float fApplyDimension2 = TypedValue.applyDimension(1, fAq, displayMetrics);
                    fgu fguVarK3 = fgvVarA.b.k();
                    fguVarK3.G();
                    fguVarK3.F().E(fApplyDimension2);
                }
            }
            if (fMax != f) {
                nwpVar.a = TypedValue.applyDimension(1, fMax, displayMetrics);
            }
            if (nemVar.t()) {
                nwpVar.c = nemVar.q();
            }
            boolean zEquals = "deprecated_option_force_clip_bounds".equals(str);
            if (this.f || !(fgvVarA instanceof nqc)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((this.d || zEquals) && !z2 && nemVar.u()) {
                fgvVarA.r(nemVar.s());
                if (nemVar.s() && nwpVar.a > f) {
                    mpz mpzVar = new mpz(((int) nwpVar.a) + ((int) (TypedValue.applyDimension(1, fH, displayMetrics) / f2)));
                    fgy fgyVar = fgvVarA.b;
                    fgyVar.k().F().x(mpzVar);
                    fgyVar.k().F().k(true);
                }
            }
            iN = nemVar.n();
            if (iN != 0) {
                mqrVar = new mqr();
                mqrVar.a = iN;
                mqrVar.b(nwpVar.a);
                neiVar = nwpVar.c;
                if (!Objects.equals(mqrVar.b, neiVar)) {
                    mqrVar.b = neiVar;
                    mqrVar.a();
                    mqrVar.invalidateSelf();
                }
                if (mqrVar.c != zBs) {
                    mqrVar.c = zBs;
                    mqrVar.a();
                    mqrVar.invalidateSelf();
                }
                nwpVar.d = mqrVar;
            }
            if (nemVar.v()) {
                nenVarR = nemVar.r();
                iArrAG = ksy.aG(nenVarR);
                length = iArrAG.length;
                i = 0;
                while (i < length) {
                    i2 = iArrAG[i];
                    agkzVar = mer.a;
                    numValueOf = Integer.valueOf(i2);
                    if (agkzVar.contains(numValueOf)) {
                        nwrVar = (nwr) this.b.get(numValueOf);
                        if (nwrVar == null) {
                            if (this.e) {
                                throw new nud(a.bR(i2, "Unknown core style properties extension: "));
                            }
                            throw new IllegalStateException(a.bR(i2, "NOT A PRODUCTION CRASH! ADL Migration Error: Please notify dalewu@. Unknown core style properties extension: "));
                        }
                        nenVarR.d(nwrVar.a());
                        nwrVar.b();
                    } else {
                        pair = (Pair) this.c.get(numValueOf);
                        if (pair != null) {
                            nwqVar = (nwq) pair.first;
                            agkeVarAF = ksy.aF(nenVarR, i2);
                            size = agkeVarAF.size();
                            i3 = 0;
                            while (i3 < size) {
                                ByteBuffer byteBuffer = (ByteBuffer) agkeVarAF.get(i3);
                                try {
                                    aiix aiixVar = (aiix) pair.second;
                                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                    nenVar = nenVarR;
                                    try {
                                        aigm aigmVarU = aigm.U(byteBuffer);
                                        Object objF = aiixVar.f(aigmVarU, generatedRegistry);
                                        try {
                                            aigmVarU.z(0);
                                            nwqVar.b(fhdVar, objF, nwpVar);
                                        } catch (aiik e) {
                                            throw e;
                                        }
                                    } catch (aiik e2) {
                                        e = e2;
                                        aiik aiikVar = e;
                                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                        aslh aslhVar = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                                        asncVar.d = aslhVar.I;
                                        asncVar.b |= 2;
                                        aihfVarCreateBuilder.cC(i2);
                                        this.a.g((asnc) aihfVarCreateBuilder.build(), nslVar, aiikVar, "Failed to set PB Style Property Extension in StylePropertiesConverterFlat.", new Object[0]);
                                        if (this.e) {
                                            throw new IllegalStateException(a.bR(i2, "NOT A PRODUCTION CRASH! ADL Migration Error: Please notify dalewu@. Failed to set PB Style Property Extension in StylePropertiesConverterFlat. Extension id: "), aiikVar);
                                        }
                                    }
                                } catch (aiik e3) {
                                    e = e3;
                                    nenVar = nenVarR;
                                }
                                i3++;
                                nenVarR = nenVar;
                            }
                        }
                    }
                    i++;
                    nenVarR = nenVarR;
                }
            }
            drawable = nwpVar.d;
            if (fgvVarA instanceof mjd) {
                float f3 = nwpVar.a;
                mjeVar = ((mjd) fgvVarA).a;
                mjeVar.r = f3;
                if (drawable != null) {
                    mjeVar.b = drawable;
                }
            } else if (drawable != null) {
                fgvVarA.o(drawable);
            }
            ahtoVar = nwpVar.e;
            if (ahtoVar != null) {
                fgvVarA.p(ahtoVar.j());
            }
        }
        ahto ahtoVar2 = new ahto(fhdVar);
        if (iO != 0) {
            ahtoVar2.m(iO);
            nwpVar.b = iO;
            f = 0.0f;
            ahto ahtoVar3 = nwpVar.e;
            if (ahtoVar3 != null) {
                ahtoVar3.m(iO);
            }
        } else {
            f = 0.0f;
        }
        if (fH != f) {
            ahtoVar2.k();
            ahtoVar2.n(((ayq) ahtoVar2.c).z(fH));
        }
        if (fMax != f) {
            if (nemVar.t()) {
                nei neiVarQ = nemVar.q();
                if (neiVarQ.aA() || (zBs ? neiVarQ.az() : neiVarQ.aC())) {
                    ahtoVar2.l(0, fMax);
                }
                if (neiVarQ.aB() || (zBs ? neiVarQ.aC() : neiVarQ.az())) {
                    ahtoVar2.l(1, fMax);
                }
                if (neiVarQ.aw() || (zBs ? neiVarQ.av() : neiVarQ.ay())) {
                    ahtoVar2.l(3, fMax);
                }
                if (neiVarQ.ax()) {
                    ahtoVar2.l(2, fMax);
                } else {
                    if (zBs) {
                        z = true;
                    } else {
                        if (neiVarQ.av()) {
                            zBs = false;
                        } else {
                            z = false;
                        }
                        ahtoVar2.l(2, fMax);
                    }
                    if (zBs && neiVarQ.ay()) {
                        zBs = z;
                        ahtoVar2.l(2, fMax);
                    } else {
                        zBs = z;
                    }
                }
            } else {
                ahtoVar2.k();
                int iZ = ((ayq) ahtoVar2.c).z(fMax);
                ahtoVar2.k();
                for (int i4 = 0; i4 < 4; i4++) {
                    ((fgp) ahtoVar2.a).a[i4] = iZ;
                }
            }
        }
        nwpVar.e = ahtoVar2;
        fI = nemVar.i();
        d = fI;
        if (d >= 0.0d) {
            ntqVar.i(asmn.DYNAMIC_PROP_TYPE_ALPHA, Float.valueOf(fI));
            fgvVarA.m(fI);
        }
        fK = nemVar.k();
        d2 = fK;
        if (d2 != 0.0d) {
            asmn asmnVar2 = asmn.DYNAMIC_PROP_TYPE_SCALE_X;
            Float fValueOf2 = Float.valueOf(fK);
            ntqVar.i(asmnVar2, fValueOf2);
            ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, fValueOf2);
            fgvVarA.D(fK);
            fgvVarA.E(fK);
        }
        fL = nemVar.l();
        d3 = fL;
        if (d3 != 0.0d) {
            ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_X, Float.valueOf(fL));
            fgvVarA.D(fL);
        }
        fM = nemVar.m();
        d4 = fM;
        if (d4 != 0.0d) {
            ntqVar.i(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, Float.valueOf(fM));
            fgvVarA.E(fM);
        }
        fJ = nemVar.j();
        if (fJ != 0.0d) {
            ntqVar.i(asmn.DYNAMIC_PROP_TYPE_ROTATION, Float.valueOf(fJ));
            fguVarK = fgvVarA.b.k();
            fguVarK.F().z(fJ);
            if (fJ == f) {
                fguVarK.a = (byte) (fguVarK.a & (-17));
            } else {
                fguVarK.a = (byte) (fguVarK.a | 16);
            }
        }
        if (nemVar.w()) {
            ndq ndqVarP2 = nemVar.p();
            fAp = ndqVarP2.ap();
            fAq = ndqVarP2.aq();
            if (fAp >= f) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X, Float.valueOf(fAp));
                float fApplyDimension3 = TypedValue.applyDimension(1, fAp, displayMetrics);
                fgu fguVarK4 = fgvVarA.b.k();
                fguVarK4.G();
                fguVarK4.F().D(fApplyDimension3);
            } else {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X, Float.valueOf(fAp));
                float fApplyDimension4 = TypedValue.applyDimension(1, fAp, displayMetrics);
                fgu fguVarK5 = fgvVarA.b.k();
                fguVarK5.G();
                fguVarK5.F().D(fApplyDimension4);
            }
            if (fAq >= f) {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y, Float.valueOf(fAq));
                float fApplyDimension5 = TypedValue.applyDimension(1, fAq, displayMetrics);
                fgu fguVarK6 = fgvVarA.b.k();
                fguVarK6.G();
                fguVarK6.F().E(fApplyDimension5);
            } else {
                ntqVar.i(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y, Float.valueOf(fAq));
                float fApplyDimension6 = TypedValue.applyDimension(1, fAq, displayMetrics);
                fgu fguVarK7 = fgvVarA.b.k();
                fguVarK7.G();
                fguVarK7.F().E(fApplyDimension6);
            }
        }
        if (fMax != f) {
            nwpVar.a = TypedValue.applyDimension(1, fMax, displayMetrics);
        }
        if (nemVar.t()) {
            nwpVar.c = nemVar.q();
        }
        boolean zEquals2 = "deprecated_option_force_clip_bounds".equals(str);
        if (this.f) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (this.d) {
            fgvVarA.r(nemVar.s());
            if (nemVar.s()) {
                mpz mpzVar2 = new mpz(((int) nwpVar.a) + ((int) (TypedValue.applyDimension(1, fH, displayMetrics) / f2)));
                fgy fgyVar2 = fgvVarA.b;
                fgyVar2.k().F().x(mpzVar2);
                fgyVar2.k().F().k(true);
            }
        } else {
            fgvVarA.r(nemVar.s());
            if (nemVar.s()) {
                mpz mpzVar3 = new mpz(((int) nwpVar.a) + ((int) (TypedValue.applyDimension(1, fH, displayMetrics) / f2)));
                fgy fgyVar3 = fgvVarA.b;
                fgyVar3.k().F().x(mpzVar3);
                fgyVar3.k().F().k(true);
            }
        }
        iN = nemVar.n();
        if (iN != 0) {
            mqrVar = new mqr();
            mqrVar.a = iN;
            mqrVar.b(nwpVar.a);
            neiVar = nwpVar.c;
            if (!Objects.equals(mqrVar.b, neiVar)) {
                mqrVar.b = neiVar;
                mqrVar.a();
                mqrVar.invalidateSelf();
            }
            if (mqrVar.c != zBs) {
                mqrVar.c = zBs;
                mqrVar.a();
                mqrVar.invalidateSelf();
            }
            nwpVar.d = mqrVar;
        }
        if (nemVar.v()) {
            nenVarR = nemVar.r();
            iArrAG = ksy.aG(nenVarR);
            length = iArrAG.length;
            i = 0;
            while (i < length) {
                i2 = iArrAG[i];
                agkzVar = mer.a;
                numValueOf = Integer.valueOf(i2);
                if (agkzVar.contains(numValueOf)) {
                    nwrVar = (nwr) this.b.get(numValueOf);
                    if (nwrVar == null) {
                        if (this.e) {
                            throw new nud(a.bR(i2, "Unknown core style properties extension: "));
                        }
                        throw new IllegalStateException(a.bR(i2, "NOT A PRODUCTION CRASH! ADL Migration Error: Please notify dalewu@. Unknown core style properties extension: "));
                    }
                    nenVarR.d(nwrVar.a());
                    nwrVar.b();
                } else {
                    pair = (Pair) this.c.get(numValueOf);
                    if (pair != null) {
                        nwqVar = (nwq) pair.first;
                        agkeVarAF = ksy.aF(nenVarR, i2);
                        size = agkeVarAF.size();
                        i3 = 0;
                        while (i3 < size) {
                            ByteBuffer byteBuffer2 = (ByteBuffer) agkeVarAF.get(i3);
                            aiix aiixVar2 = (aiix) pair.second;
                            ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                            nenVar = nenVarR;
                            aigm aigmVarU2 = aigm.U(byteBuffer2);
                            Object objF2 = aiixVar2.f(aigmVarU2, generatedRegistry2);
                            aigmVarU2.z(0);
                            nwqVar.b(fhdVar, objF2, nwpVar);
                            i3++;
                            nenVarR = nenVar;
                        }
                    }
                }
                i++;
                nenVarR = nenVarR;
            }
        }
        drawable = nwpVar.d;
        if (fgvVarA instanceof mjd) {
            float f4 = nwpVar.a;
            mjeVar = ((mjd) fgvVarA).a;
            mjeVar.r = f4;
            if (drawable != null) {
                mjeVar.b = drawable;
            }
        } else if (drawable != null) {
            fgvVarA.o(drawable);
        }
        ahtoVar = nwpVar.e;
        if (ahtoVar != null) {
            fgvVarA.p(ahtoVar.j());
        }
    }
}
