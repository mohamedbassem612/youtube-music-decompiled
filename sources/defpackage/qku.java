package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qku implements loo {
    @Override // defpackage.loo
    public final Object a(lpa lpaVar) {
        int i;
        qks qksVar;
        lla llaVar = (lla) lpaVar.f();
        aihf aihfVarCreateBuilder = qkr.a.createBuilder();
        String str = llaVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        qkr qkrVar = (qkr) aihfVarCreateBuilder.instance;
        str.getClass();
        int i2 = 1;
        qkrVar.b |= 1;
        qkrVar.c = str;
        String str2 = llaVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        qkr qkrVar2 = (qkr) aihfVarCreateBuilder.instance;
        str2.getClass();
        qkrVar2.b |= 4;
        qkrVar2.e = str2;
        boolean z = llaVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        qkr qkrVar3 = (qkr) aihfVarCreateBuilder.instance;
        qkrVar3.b |= 8;
        qkrVar3.h = z;
        long j = llaVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        qkr qkrVar4 = (qkr) aihfVarCreateBuilder.instance;
        qkrVar4.b |= 16;
        qkrVar4.i = j;
        byte[] bArr = llaVar.b;
        int i3 = 2;
        if (bArr != null) {
            aigj aigjVarV = aigj.v(bArr);
            aihfVarCreateBuilder.copyOnWrite();
            qkr qkrVar5 = (qkr) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            qkrVar5.b |= 2;
            qkrVar5.d = aigjVarV;
        }
        lkz[] lkzVarArr = llaVar.d;
        int length = lkzVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            lkz lkzVar = lkzVarArr[i4];
            llg[] llgVarArr = lkzVar.b;
            int length2 = llgVarArr.length;
            int i5 = 0;
            while (i5 < length2) {
                llg llgVar = llgVarArr[i5];
                int i6 = llgVar.g;
                if (i6 == i2) {
                    i = i3;
                    int i7 = i2;
                    aihf aihfVarCreateBuilder2 = qks.a.createBuilder();
                    String str3 = llgVar.a;
                    aihfVarCreateBuilder2.copyOnWrite();
                    qks qksVar2 = (qks) aihfVarCreateBuilder2.instance;
                    str3.getClass();
                    qksVar2.b |= 1;
                    qksVar2.e = str3;
                    i2 = i7;
                    if (i6 != i2) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j2 = llgVar.b;
                    aihfVarCreateBuilder2.copyOnWrite();
                    qks qksVar3 = (qks) aihfVarCreateBuilder2.instance;
                    qksVar3.c = i2;
                    qksVar3.d = Long.valueOf(j2);
                    qksVar = (qks) aihfVarCreateBuilder2.build();
                } else if (i6 != i3) {
                    if (i6 == 3) {
                        aihf aihfVarCreateBuilder3 = qks.a.createBuilder();
                        String str4 = llgVar.a;
                        aihfVarCreateBuilder3.copyOnWrite();
                        qks qksVar4 = (qks) aihfVarCreateBuilder3.instance;
                        str4.getClass();
                        qksVar4.b |= 1;
                        qksVar4.e = str4;
                        if (i6 != 3) {
                            throw new IllegalArgumentException("Not a double type");
                        }
                        double d = llgVar.d;
                        aihfVarCreateBuilder3.copyOnWrite();
                        qks qksVar5 = (qks) aihfVarCreateBuilder3.instance;
                        qksVar5.c = 3;
                        qksVar5.d = Double.valueOf(d);
                        qksVar = (qks) aihfVarCreateBuilder3.build();
                    } else if (i6 == 4) {
                        aihf aihfVarCreateBuilder4 = qks.a.createBuilder();
                        String str5 = llgVar.a;
                        aihfVarCreateBuilder4.copyOnWrite();
                        qks qksVar6 = (qks) aihfVarCreateBuilder4.instance;
                        str5.getClass();
                        qksVar6.b |= 1;
                        qksVar6.e = str5;
                        if (i6 != 4) {
                            throw new IllegalArgumentException("Not a String type");
                        }
                        String str6 = llgVar.e;
                        kro.l(str6);
                        aihfVarCreateBuilder4.copyOnWrite();
                        qks qksVar7 = (qks) aihfVarCreateBuilder4.instance;
                        qksVar7.c = 4;
                        qksVar7.d = str6;
                        qksVar = (qks) aihfVarCreateBuilder4.build();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalArgumentException(a.bR(i6, "Unrecognized flag type: "));
                        }
                        aihf aihfVarCreateBuilder5 = qks.a.createBuilder();
                        String str7 = llgVar.a;
                        aihfVarCreateBuilder5.copyOnWrite();
                        qks qksVar8 = (qks) aihfVarCreateBuilder5.instance;
                        str7.getClass();
                        qksVar8.b |= 1;
                        qksVar8.e = str7;
                        if (i6 != 5) {
                            throw new IllegalArgumentException("Not a bytes type");
                        }
                        byte[] bArr2 = llgVar.f;
                        kro.l(bArr2);
                        aigj aigjVarV2 = aigj.v(bArr2);
                        aihfVarCreateBuilder5.copyOnWrite();
                        qks qksVar9 = (qks) aihfVarCreateBuilder5.instance;
                        aigjVarV2.getClass();
                        qksVar9.c = 5;
                        qksVar9.d = aigjVarV2;
                        qksVar = (qks) aihfVarCreateBuilder5.build();
                    }
                    i2 = i2;
                    i = 2;
                } else {
                    int i8 = i2;
                    aihf aihfVarCreateBuilder6 = qks.a.createBuilder();
                    String str8 = llgVar.a;
                    aihfVarCreateBuilder6.copyOnWrite();
                    qks qksVar10 = (qks) aihfVarCreateBuilder6.instance;
                    str8.getClass();
                    qksVar10.b |= 1;
                    qksVar10.e = str8;
                    i = 2;
                    if (i6 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = llgVar.c;
                    aihfVarCreateBuilder6.copyOnWrite();
                    qks qksVar11 = (qks) aihfVarCreateBuilder6.instance;
                    qksVar11.c = 2;
                    qksVar11.d = Boolean.valueOf(z2);
                    qksVar = (qks) aihfVarCreateBuilder6.build();
                    i2 = i8;
                }
                aihfVarCreateBuilder.copyOnWrite();
                qkr qkrVar6 = (qkr) aihfVarCreateBuilder.instance;
                qksVar.getClass();
                aiie aiieVar = qkrVar6.f;
                if (!aiieVar.c()) {
                    qkrVar6.f = aihn.mutableCopy(aiieVar);
                }
                qkrVar6.f.add(qksVar);
                i5++;
                i3 = i;
            }
            int i9 = i3;
            String[] strArr = lkzVar.c;
            if (strArr != null) {
                for (String str9 : strArr) {
                    aihfVarCreateBuilder.copyOnWrite();
                    qkr qkrVar7 = (qkr) aihfVarCreateBuilder.instance;
                    str9.getClass();
                    aiie aiieVar2 = qkrVar7.g;
                    if (!aiieVar2.c()) {
                        qkrVar7.g = aihn.mutableCopy(aiieVar2);
                    }
                    qkrVar7.g.add(str9);
                }
            }
            i4++;
            i3 = i9;
        }
        return (qkr) aihfVarCreateBuilder.build();
    }
}
