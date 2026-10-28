package defpackage;

import androidx.car.app.model.Alert;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aiiv implements aijg {
    private final MessageLite a;
    private final aijs b;
    private final boolean c;

    public aiiv(aijs aijsVar, MessageLite messageLite) {
        this.b = aijsVar;
        this.c = messageLite instanceof aihi;
        this.a = messageLite;
    }

    @Override // defpackage.aijg
    public final int a(Object obj) {
        int iJ;
        int iM;
        int iNumberOfLeadingZeros;
        aijt aijtVarC = aijs.c(obj);
        int iM2 = aijtVarC.e;
        if (iM2 == -1) {
            iM2 = 0;
            for (int i = 0; i < aijtVarC.b; i++) {
                iM2 += aigs.M(2, aijtVarC.c[i] >>> 3) + 2 + aigs.H(3, (aigj) aijtVarC.d[i]);
            }
            aijtVarC.e = iM2;
        }
        if (!this.c) {
            return iM2;
        }
        aijl aijlVar = ahng.aT(obj).b;
        int size = aijlVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            aiji aijiVar = (aiji) aijlVar.a(i3);
            aihk aihkVar = aijiVar.c;
            Object obj2 = aijiVar.a;
            if (aihkVar.a() != aikb.i || aihkVar.d || aihkVar.e) {
                iJ = aiha.j(aihkVar, obj2);
            } else {
                if (obj2 instanceof aiii) {
                    iM = aigs.M(2, aihkVar.b) + 2;
                    iNumberOfLeadingZeros = 1 + ((aiii) obj2).a();
                } else {
                    iM = aigs.M(2, aihkVar.b) + 2;
                    int serializedSize = ((MessageLite) obj2).getSerializedSize();
                    iNumberOfLeadingZeros = 1 + ((352 - (Integer.numberOfLeadingZeros(serializedSize) * 9)) >>> 6) + serializedSize;
                }
                iJ = iM + iNumberOfLeadingZeros;
            }
            i2 += iJ;
        }
        return iM2 + i2;
    }

    @Override // defpackage.aijg
    public final int b(Object obj) {
        int iHashCode = aijs.c(obj).hashCode();
        return this.c ? (iHashCode * 53) + ahng.aT(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.aijg
    public final Object e() {
        MessageLite messageLite = this.a;
        return messageLite instanceof aihn ? ((aihn) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // defpackage.aijg
    public final void g(Object obj) {
        aijs.g(obj);
        ahng.aV(obj);
    }

    @Override // defpackage.aijg
    public final void h(Object obj, Object obj2) {
        aijs aijsVar = aijh.a;
        aijs.e(obj, aijs.d(aijs.c(obj), aijs.c(obj2)));
        if (this.c) {
            aijh.k(obj, obj2);
        }
    }

    @Override // defpackage.aijg
    public final void i(Object obj, aign aignVar, ExtensionRegistryLite extensionRegistryLite) {
        boolean zO;
        aijt aijtVarF = aijs.f(obj);
        aiha aihaVarA = ((aihi) obj).a();
        aijs aijsVar = this.b;
        do {
            try {
                int iC = aignVar.c();
                if (iC == Integer.MAX_VALUE) {
                    break;
                }
                int i = aignVar.b;
                zO = true;
                if (i == 11) {
                    aihl aihlVarA = null;
                    aigj aigjVarO = null;
                    int i2 = 0;
                    for (int i3 = Alert.DURATION_SHOW_INDEFINITELY; aignVar.c() != i3; i3 = Alert.DURATION_SHOW_INDEFINITELY) {
                        int i4 = aignVar.b;
                        if (i4 != 16) {
                            if (i4 != 26) {
                                if (i4 == 12 || !aignVar.O()) {
                                    break;
                                }
                            } else if (aihlVarA != null) {
                                ahng.aU(aignVar, aihlVarA, extensionRegistryLite, aihaVarA);
                            } else {
                                aigjVarO = aignVar.o();
                            }
                        } else {
                            i2 = aignVar.i();
                            aihlVarA = extensionRegistryLite.a(this.a, i2);
                        }
                    }
                    if (aignVar.b != 12) {
                        throw new aiik("Protocol message end-group tag did not match expected tag.");
                    }
                    if (aigjVarO != null) {
                        if (aihlVarA != null) {
                            aigm aigmVar = aignVar.a;
                            int i5 = ((aigmVar.i - aigmVar.g) - aigmVar.h) - 1;
                            if (i5 < 0) {
                                throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                            }
                            aigm aigmVarG = aigjVarO.g();
                            aigmVarG.i = i5;
                            aiir aiirVarNewBuilderForType = aihlVarA.c.newBuilderForType();
                            aiirVarNewBuilderForType.mergeFrom(aigmVarG, extensionRegistryLite);
                            aihaVarA.m(aihlVarA.d, aiirVarNewBuilderForType.buildPartial());
                            aigmVarG.z(0);
                        } else {
                            aijtVarF.f((i2 << 3) | 2, aigjVarO);
                        }
                    }
                } else if ((i & 7) == 2) {
                    aihl aihlVarA2 = extensionRegistryLite.a(this.a, i >>> 3);
                    if (aihlVarA2 != null) {
                        ahng.aU(aignVar, aihlVarA2, extensionRegistryLite, aihaVarA);
                    } else {
                        zO = aijsVar.a(aijtVarF, aignVar, 0);
                    }
                } else {
                    zO = aignVar.O();
                }
            } catch (Throwable th) {
                aijs.e(obj, aijtVarF);
                throw th;
            }
        } while (zO);
        aijs.e(obj, aijtVarF);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[EDGE_INSN: B:52:0x00bd->B:32:0x00bd BREAK  A[LOOP:1: B:18:0x006b->B:55:0x006b], SYNTHETIC] */
    @Override // defpackage.aijg
    public final void j(Object obj, byte[] bArr, int i, int i2, aifw aifwVar) throws aiik {
        aihn aihnVar = (aihn) obj;
        aijt aijtVar = aihnVar.unknownFields;
        if (aijtVar == aijt.a) {
            aijtVar = new aijt();
            aihnVar.unknownFields = aijtVar;
        }
        aijt aijtVar2 = aijtVar;
        aiha aihaVarA = ((aihi) obj).a();
        int iY = i;
        aihl aihlVar = null;
        while (iY < i2) {
            aihl aihlVarA = aihlVar;
            int iS = aifx.s(bArr, iY, aifwVar);
            int i3 = aifwVar.a;
            if (i3 == 11) {
                int i4 = 0;
                aigj aigjVar = null;
                while (iS < i2) {
                    iS = aifx.s(bArr, iS, aifwVar);
                    int i5 = aifwVar.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iS = aifx.y(i5, bArr, iS, i2, aifwVar);
                        } else {
                            iS = aifx.s(bArr, iS, aifwVar);
                            i4 = aifwVar.a;
                            aihlVarA = aifwVar.d.a(this.a, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (aihlVarA != null) {
                                iS = aifx.e(aiiz.a.b(((aihn) aihlVarA.c).getClass()), bArr, iS, i2, aifwVar);
                                aihaVarA.m(aihlVarA.d, aifwVar.c);
                            } else if (i7 == 2) {
                                iS = aifx.a(bArr, iS, aifwVar);
                                aigjVar = (aigj) aifwVar.c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iS = aifx.y(i5, bArr, iS, i2, aifwVar);
                        }
                    }
                }
                if (aigjVar != null) {
                    aijtVar2.f((i4 << 3) | 2, aigjVar);
                }
                iY = iS;
            } else if ((i3 & 7) == 2) {
                aihlVarA = aifwVar.d.a(this.a, i3 >>> 3);
                if (aihlVarA != null) {
                    iY = aifx.e(aiiz.a.b(((aihn) aihlVarA.c).getClass()), bArr, iS, i2, aifwVar);
                    aihaVarA.m(aihlVarA.d, aifwVar.c);
                } else {
                    iY = aifx.r(i3, bArr, iS, i2, aijtVar2, aifwVar);
                }
            } else {
                iY = aifx.y(i3, bArr, iS, i2, aifwVar);
            }
            aihlVar = aihlVarA;
        }
        if (iY != i2) {
            throw new aiik("Failed to parse the message.");
        }
    }

    @Override // defpackage.aijg
    public final boolean k(Object obj, Object obj2) {
        if (!aijs.c(obj).equals(aijs.c(obj2))) {
            return false;
        }
        if (this.c) {
            return ahng.aT(obj).equals(ahng.aT(obj2));
        }
        return true;
    }

    @Override // defpackage.aijg
    public final boolean l(Object obj) {
        return ahng.aT(obj).i();
    }

    @Override // defpackage.aijg
    public final void m(Object obj, ahud ahudVar) {
        aigj aigjVar;
        Iterator itE = ahng.aT(obj).e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            aihk aihkVar = (aihk) entry.getKey();
            if (aihkVar.a() != aikb.i || aihkVar.d || aihkVar.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof aiig) {
                int i = aihkVar.b;
                aiii aiiiVar = (aiii) ((aiig) entry).a.getValue();
                if (aiiiVar.a != null) {
                    aigjVar = aiiiVar.a;
                } else {
                    synchronized (aiiiVar) {
                        if (aiiiVar.a != null) {
                            aigjVar = aiiiVar.a;
                        } else {
                            aiiiVar.a = aiiiVar.b.toByteString();
                            aigjVar = aiiiVar.a;
                        }
                    }
                }
                ahudVar.G(i, aigjVar);
            } else {
                ahudVar.G(aihkVar.b, entry.getValue());
            }
        }
        aijt aijtVarC = aijs.c(obj);
        for (int i2 = 0; i2 < aijtVarC.b; i2++) {
            ahudVar.G(aijtVarC.c[i2] >>> 3, aijtVarC.d[i2]);
        }
    }
}
