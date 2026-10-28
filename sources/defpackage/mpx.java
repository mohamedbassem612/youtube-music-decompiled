package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.converters.properties.ClassPropertiesConverter;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpx implements nvp {
    private static final agkz a = agkz.u(224886694, 287553821, Integer.valueOf(asri.b.a()), Integer.valueOf(asnw.b.a()), 316055719, 268941992, 258411896, 338763089, 351165658);
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final Map d;
    private final ClassPropertiesConverter e;
    private final agkz f;
    private final nuc g;
    private final agev h;
    private final boolean i;

    public mpx(List list, List list2, List list3, nuc nucVar, agev agevVar, agev agevVar2) {
        this.g = nucVar;
        this.h = agevVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nvr nvrVar = (nvr) it.next();
            this.b.put(nvrVar.a().a, nvrVar);
        }
        agqs agqsVarListIterator = ((agke) list2).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            nvr nvrVar2 = (nvr) agqsVarListIterator.next();
            this.c.put(nvrVar2.a().a, nvrVar2);
        }
        HashSet hashSet = new HashSet();
        agkx agkxVar = new agkx();
        int i = ((agpi) list3).d;
        for (int i2 = 0; i2 < i; i2++) {
            int iA = ((nvq) list3.get(i2)).a().a();
            Integer numValueOf = Integer.valueOf(iA);
            if (!hashSet.add(numValueOf)) {
                agkxVar.c(numValueOf);
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihfVarCreateBuilder.cC(iA);
                nucVar.b((asnc) aihfVarCreateBuilder.build(), "Multiple property converters found and will be removed for extension.", new Object[0]);
            }
        }
        agkz agkzVarG = agkxVar.g();
        this.f = agkzVarG;
        agkh agkhVar = new agkh(4);
        agqs agqsVarListIterator2 = ((agke) list3).listIterator(0);
        while (agqsVarListIterator2.hasNext()) {
            nvq nvqVar = (nvq) agqsVarListIterator2.next();
            Integer numValueOf2 = Integer.valueOf(nvqVar.a().a());
            if (!agkzVarG.contains(numValueOf2)) {
                agkhVar.e(numValueOf2, nvqVar);
            }
        }
        this.d = agkhVar.d(true);
        this.i = ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue();
        this.e = new ClassPropertiesConverter(nucVar);
    }

    private final void c(fhd fhdVar, nsl nslVar, String str, nds ndsVar, ntq ntqVar, SparseArray sparseArray, nru nruVar, int[] iArr) {
        nvr nvrVar;
        mep mepVar = nbl.T;
        if (ndsVar.e(mepVar)) {
        }
        for (int i : iArr) {
            if (mer.a(i) && (nvrVar = (nvr) sparseArray.get(i)) != null) {
                try {
                    nvrVar.e(fhdVar, nslVar, str, ndsVar.d(nvrVar.a()), ntqVar, nruVar);
                } catch (Exception e) {
                    d(e, nslVar);
                    if (this.i) {
                        throw new IllegalStateException(a.bP(i, "THIS IS NOT A PRODUCTION CRASH!\nConverter for property ", " threw an exception."), e);
                    }
                }
            }
        }
    }

    private final void d(Exception exc, nsl nslVar) {
        this.g.f(aslh.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, nslVar, exc, "Property error", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0315  */
    /* JADX WARN: Code duplicated, block: B:111:0x0345  */
    /* JADX WARN: Type inference failed for: r0v20, types: [agex, java.lang.Object] */
    @Override // defpackage.nvp
    public final void a(fhd fhdVar, nsl nslVar, String str, nds ndsVar, ntq ntqVar, nru nruVar) {
        int i;
        long j;
        int iA;
        int iA2;
        mew mewVar;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iBg;
        mew mewVar2;
        if (ndsVar != null) {
            myq myqVar = (myq) ndsVar.d(myq.F);
            int i7 = 2;
            if (myqVar != null && myqVar.h()) {
                ClassPropertiesConverter classPropertiesConverter = this.e;
                String str2 = nslVar.C;
                if (str2 == null) {
                    classPropertiesConverter.a.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Failed to get getStylesheetId from conversionContext.", new Object[0]);
                } else {
                    String str3 = nslVar.D;
                    if (ahno.aa(str3)) {
                        classPropertiesConverter.a.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Failed to get activeThemeKey from conversionContext.", new Object[0]);
                    } else if (myqVar.h()) {
                        long[] jArrNativeResolveStyle = classPropertiesConverter.nativeResolveStyle(str2, str3, myqVar.g());
                        fgv fgvVarA = ntqVar.a();
                        long j3 = jArrNativeResolveStyle[0];
                        UpbArena upbArenaA = UpbArena.a(jArrNativeResolveStyle[1]);
                        if (j3 != 0) {
                            mew mewVar3 = new mew(new UpbMessage(j3, atej.a, upbArenaA));
                            float f = fhdVar.c().getDisplayMetrics().density;
                            long j4 = mewVar3.c;
                            long jPeekLong = Memory.peekLong(184 + j4, false);
                            if ((jPeekLong & 4) != 0) {
                                fgvVarA.L(rpi.p(Float.intBitsToFloat(Memory.peekInt(j4 + 16, false)) * f));
                            }
                            if ((8 & jPeekLong) != 0) {
                                fgvVarA.y(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 20, false)));
                            }
                            if ((jPeekLong & 16) != 0) {
                                fgvVarA.X(rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 24, false)) * f));
                            }
                            if ((jPeekLong & 32) != 0) {
                                fgvVarA.W(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 28, false)));
                            }
                            if ((jPeekLong & 64) != 0) {
                                fgvVarA.Q(3, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 32, false)) * f));
                            }
                            if ((256 & jPeekLong) != 0) {
                                fgvVarA.Q(1, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 40, false)) * f));
                            }
                            if ((1024 & jPeekLong) != 0) {
                                fgvVarA.Q(2, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 48, false)) * f));
                            }
                            if ((4096 & jPeekLong) != 0) {
                                fgvVarA.Q(4, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 56, false)) * f));
                            }
                            if ((16384 & jPeekLong) != 0) {
                                fgvVarA.M(3, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 64, false)) * f));
                            }
                            if ((65536 & jPeekLong) != 0) {
                                fgvVarA.M(1, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 72, false)) * f));
                            }
                            if ((262144 & jPeekLong) != 0) {
                                fgvVarA.M(2, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 80, false)) * f));
                            }
                            if ((1048576 & jPeekLong) != 0) {
                                fgvVarA.M(4, rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 88, false)) * f));
                            }
                            if ((4194304 & jPeekLong) != 0) {
                                fgvVarA.C(rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 96, false)) * f));
                            }
                            if ((8388608 & jPeekLong) != 0) {
                                fgvVarA.B(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 100, false)));
                            }
                            if ((16777216 & jPeekLong) != 0) {
                                fgvVarA.O(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 104, false)));
                            }
                            if ((33554432 & jPeekLong) != 0) {
                                long j5 = mewVar3.c;
                                fgvVarA.P((Memory.peekByte(j5 + 11) & 1) != 0 ? Float.intBitsToFloat(Memory.peekInt(j5 + 108, false)) : 1.0f);
                            }
                            fgvVarA.U(2);
                            if ((68719476736L & jPeekLong) != 0) {
                                fgvVarA.v(rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 152, false)) * f));
                            }
                            if ((137438953472L & jPeekLong) != 0) {
                                fgvVarA.u(Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 156, false)));
                            }
                            float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(mewVar3.c + 112, false));
                            if (fIntBitsToFloat > 0.0f) {
                                fgvVarA.n(fIntBitsToFloat);
                            }
                            if ((274877906944L & jPeekLong) != 0) {
                                int iBg2 = a.bg(Memory.peekInt(mewVar3.c + 160, false));
                                if (iBg2 == 0) {
                                    iBg2 = 1;
                                }
                                int iA3 = ClassPropertiesConverter.a(iBg2);
                                if (iA3 != 0) {
                                    fgvVarA.l(iA3);
                                }
                            }
                            boolean z = fgvVarA instanceof mjd;
                            if (z || (fgvVarA instanceof mmg)) {
                                fgvVarA.s();
                                j = jPeekLong;
                                if ((jPeekLong & 34359738368L) == 0) {
                                    iA = 0;
                                } else {
                                    int iBg3 = a.bg(Memory.peekInt(mewVar3.c + 148, false));
                                    if (iBg3 == 0) {
                                        iBg3 = 1;
                                    }
                                    if (iBg3 != 1) {
                                        iA = ClassPropertiesConverter.a(iBg3);
                                    } else {
                                        iA = 0;
                                    }
                                }
                                if ((j & 1099511627776L) != 0) {
                                    long j6 = mewVar3.c;
                                    if ((Memory.peekByte(j6 + 12) & 128) == 0 || (iBg = a.bg(Memory.peekInt(j6 + 168, false))) == 0) {
                                        iBg = 6;
                                    }
                                    if (iBg != 1) {
                                        iA2 = ClassPropertiesConverter.a(iBg);
                                    } else {
                                        iA2 = 0;
                                    }
                                } else {
                                    iA2 = 0;
                                }
                                long j7 = mewVar3.c;
                                mewVar = mewVar3;
                                int iPeekInt = Memory.peekInt(j7 + 140, false);
                                if (iPeekInt == 0) {
                                    j2 = j7;
                                    i2 = 1;
                                } else if (iPeekInt == 1) {
                                    j2 = j7;
                                    i2 = 2;
                                } else if (iPeekInt != 2) {
                                    j2 = j7;
                                    if (iPeekInt != 3) {
                                        i2 = iPeekInt != 4 ? 0 : 5;
                                    } else {
                                        i2 = 4;
                                    }
                                } else {
                                    j2 = j7;
                                    i2 = 3;
                                }
                                if (i2 == 0) {
                                    i2 = 1;
                                }
                                int i8 = i2 - 1;
                                if (i8 == 0) {
                                    i3 = 0;
                                } else if (i8 == 1) {
                                    i3 = 3;
                                } else if (i8 != 2) {
                                    i3 = i8 != 3 ? 2 : 1;
                                } else {
                                    i3 = 4;
                                }
                                int i9 = iA;
                                int iPeekInt2 = Memory.peekInt(j2 + 164, false);
                                if (iPeekInt2 == 0) {
                                    i4 = 1;
                                } else if (iPeekInt2 == 1) {
                                    i4 = 2;
                                } else if (iPeekInt2 != 2) {
                                    i4 = iPeekInt2 != 3 ? 0 : 4;
                                } else {
                                    i4 = 3;
                                }
                                if (i4 == 0) {
                                    i4 = 1;
                                }
                                int i10 = i4 - 1;
                                if (i10 == 0) {
                                    i5 = 0;
                                } else if (i10 != 1) {
                                    i5 = i10 != 2 ? 3 : 2;
                                } else {
                                    i5 = 1;
                                }
                                int i11 = i5;
                                switch (Memory.peekInt(j2 + 144, false)) {
                                    case 0:
                                        i6 = 1;
                                        break;
                                    case 1:
                                        i6 = 2;
                                        break;
                                    case 2:
                                        i6 = 3;
                                        break;
                                    case 3:
                                        i6 = 4;
                                        break;
                                    case 4:
                                        i6 = 5;
                                        break;
                                    case 5:
                                        i6 = 6;
                                        break;
                                    case 6:
                                        i6 = 7;
                                        break;
                                    default:
                                        i6 = 0;
                                        break;
                                }
                                if (i6 == 0) {
                                    i6 = 1;
                                }
                                int i12 = i6 - 1;
                                int i13 = 1;
                                if (i12 != 0 && i12 != 1) {
                                    i13 = 3;
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            i13 = 4;
                                            if (i12 != 4) {
                                                i13 = i12 != 5 ? 6 : 5;
                                            }
                                        } else {
                                            i13 = 2;
                                        }
                                    }
                                }
                                if (z) {
                                    mjd mjdVar = (mjd) fgvVarA;
                                    if (i9 != 0) {
                                        mjdVar.d(i9);
                                    }
                                    if (i11 != 0) {
                                        mjdVar.h(i11);
                                    }
                                    mjdVar.f(i13);
                                    if (iA2 != 0) {
                                        mjdVar.c(iA2);
                                    }
                                    if (i3 != 0) {
                                        mjdVar.i(i3);
                                    }
                                } else {
                                    mmg mmgVar = (mmg) fgvVarA;
                                    if (i9 != 0) {
                                        mmgVar.c(i9);
                                    }
                                    if (i11 != 0) {
                                        mmgVar.f(i11);
                                    }
                                    mmgVar.e(i13);
                                    if (iA2 != 0) {
                                        mmgVar.b(iA2);
                                    }
                                    if (i3 != 0) {
                                        mmgVar.g(i3);
                                    }
                                }
                            } else {
                                mewVar = mewVar3;
                                j = jPeekLong;
                            }
                            fgvVarA.A(fwl.INHERIT);
                            if ((j & 2199023255552L) != 0) {
                                mqr mqrVar = new mqr();
                                mewVar2 = mewVar;
                                mqrVar.a = Memory.peekInt(mewVar2.c + 172, false);
                                fgvVarA.o(mqrVar);
                            } else {
                                mewVar2 = mewVar;
                            }
                            if ((j & 4398046511104L) != 0) {
                                ahto ahtoVar = new ahto(fhdVar);
                                ahtoVar.n(rpi.p(Float.intBitsToFloat(Memory.peekInt(mewVar2.c + 176, false)) * f));
                                fgvVarA.p(ahtoVar.j());
                            }
                        }
                    } else {
                        classPropertiesConverter.a.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Missing className from classProperties.", new Object[0]);
                    }
                }
            }
            int[] iArrAG = ksy.aG(ndsVar);
            c(fhdVar, nslVar, str, ndsVar, ntqVar, this.b, nruVar, iArrAG);
            nsl nslVar2 = nslVar;
            c(fhdVar, nslVar2, str, ndsVar, ntqVar, this.c, nruVar, iArrAG);
            int length = iArrAG.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = iArrAG[i14];
                if (i15 == 503223997 || mer.a(i15)) {
                    i = i7;
                } else {
                    Map map = this.d;
                    Integer numValueOf = Integer.valueOf(i15);
                    nvq nvqVar = (nvq) map.get(numValueOf);
                    if (nvqVar != null) {
                        try {
                            agke agkeVarAF = ksy.aF(ndsVar, i15);
                            int size = agkeVarAF.size();
                            int i16 = 0;
                            while (i16 < size) {
                                ByteBuffer byteBuffer = (ByteBuffer) agkeVarAF.get(i16);
                                aiix parserForType = ((aihl) nvqVar.a()).c.getParserForType();
                                i = i7;
                                try {
                                    try {
                                        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                        aigm aigmVarU = aigm.U(byteBuffer);
                                        Object objF = parserForType.f(aigmVarU, generatedRegistry);
                                        try {
                                            aigmVarU.z(0);
                                            nvqVar.c(fhdVar, nslVar2, objF, ntqVar);
                                            i16++;
                                            i7 = i;
                                        } catch (aiik e) {
                                            throw e;
                                        }
                                    } catch (aiik e2) {
                                        e = e2;
                                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                        aslh aslhVar = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                                        asncVar.d = aslhVar.I;
                                        asncVar.b |= 2;
                                        aihfVarCreateBuilder.cC(i15);
                                        this.g.g((asnc) aihfVarCreateBuilder.build(), nslVar, e, "Failed to set PB Property Extension in PropertiesConverterFlat.", new Object[0]);
                                        i14++;
                                        nslVar2 = nslVar;
                                        i7 = i;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    d(e, nslVar2);
                                    if (this.i) {
                                        throw new RuntimeException(a.bP(i15, "THIS IS NOT A PRODUCTION CRASH!\nConverter for property ", " threw an exception."), e);
                                    }
                                    i14++;
                                    nslVar2 = nslVar;
                                    i7 = i;
                                }
                            }
                        } catch (aiik e4) {
                            e = e4;
                            i = i7;
                        } catch (Exception e5) {
                            e = e5;
                            i = i7;
                        }
                    } else if (!a.contains(numValueOf) && !((agfa) this.h).a.a(numValueOf)) {
                        if (this.f.contains(numValueOf)) {
                            aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                            aslh aslhVar2 = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                            aihfVarCreateBuilder2.copyOnWrite();
                            asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
                            asncVar2.d = aslhVar2.I;
                            asncVar2.b |= i7;
                            aihfVarCreateBuilder2.cC(i15);
                            this.g.d((asnc) aihfVarCreateBuilder2.build(), nslVar2, "No proto converter found for extension due to having duplicate converter bindings.", new Object[0]);
                        } else {
                            aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                            aslh aslhVar3 = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                            asncVar3.d = aslhVar3.I;
                            asncVar3.b |= i7;
                            aihfVarCreateBuilder3.cC(i15);
                            this.g.d((asnc) aihfVarCreateBuilder3.build(), nslVar2, "No proto converter found for extension.", new Object[0]);
                        }
                    }
                    i = i7;
                }
                i14++;
                nslVar2 = nslVar;
                i7 = i;
            }
        }
    }

    @Override // defpackage.nvp
    public final void b(ntq ntqVar) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((nvr) sparseArray.get(sparseArray.keyAt(i))).d(ntqVar);
            i++;
        }
    }
}
