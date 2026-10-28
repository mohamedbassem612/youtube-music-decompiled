package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhk implements bgh {
    public static final bhk a = new bhk();

    @Override // defpackage.bgh
    public final /* synthetic */ Object a() {
        return new bhj(true);
    }

    @Override // defpackage.bgh
    public final Object b(InputStream inputStream) throws bdu {
        int i;
        try {
            bhc bhcVar = bhc.DEFAULT_INSTANCE;
            int i2 = bic.e;
            bib bibVar = new bib(inputStream);
            bil bilVarA = bil.a();
            bis bisVarL = bhcVar.l();
            try {
                try {
                    bjs bjsVarA = bjp.a.a(bisVarL);
                    Object bidVar = bibVar.d;
                    if (bidVar == null) {
                        bidVar = new bid(bibVar);
                    }
                    bjsVarA.f(bisVarL, (bid) bidVar, bilVarA);
                    bjsVarA.d(bisVarL);
                    if (bisVarL != null && !bis.t(bisVarL)) {
                        throw new bjx().a();
                    }
                    bhc bhcVar2 = (bhc) bisVarL;
                    bhcVar2.getClass();
                    bhj bhjVar = new bhj(false);
                    azv[] azvVarArr = (azv[]) Arrays.copyOf(new azv[0], 0);
                    azvVarArr.getClass();
                    bhjVar.d();
                    if (azvVarArr.length > 0) {
                        azv azvVar = azvVarArr[0];
                        throw null;
                    }
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(bhcVar2.preferences_);
                    mapUnmodifiableMap.getClass();
                    for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                        String str = (String) entry.getKey();
                        bhe bheVar = (bhe) entry.getValue();
                        str.getClass();
                        bheVar.getClass();
                        int i3 = bheVar.valueCase_;
                        switch (i3) {
                            case 0:
                                i = 9;
                                break;
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
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
                                i = 7;
                                break;
                            case 8:
                                i = 8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            throw new bdu("Value case is null.", null);
                        }
                        switch (i - 1) {
                            case 0:
                                bhjVar.e(azv.c(str), Boolean.valueOf(bheVar.valueCase_ == 1 ? ((Boolean) bheVar.value_).booleanValue() : false));
                                break;
                            case 1:
                                bhjVar.e(azv.d(str), Float.valueOf(bheVar.valueCase_ == 2 ? ((Float) bheVar.value_).floatValue() : 0.0f));
                                break;
                            case 2:
                                bhjVar.e(azv.e(str), Integer.valueOf(bheVar.valueCase_ == 3 ? ((Integer) bheVar.value_).intValue() : 0));
                                break;
                            case 3:
                                bhjVar.e(new bhi(str), Long.valueOf(i3 == 4 ? ((Long) bheVar.value_).longValue() : 0L));
                                break;
                            case 4:
                                bhjVar.e(new bhi(str), i3 == 5 ? (String) bheVar.value_ : "");
                                break;
                            case 5:
                                bhi bhiVar = new bhi(str);
                                biw biwVar = (i3 == 6 ? (bhd) bheVar.value_ : bhd.DEFAULT_INSTANCE).strings_;
                                biwVar.getClass();
                                bhjVar.e(bhiVar, atqq.aw(biwVar));
                                break;
                            case 6:
                                bhjVar.e(new bhi(str), Double.valueOf(i3 == 7 ? ((Double) bheVar.value_).doubleValue() : 0.0d));
                                break;
                            case 7:
                                bhjVar.e(new bhi(str), (i3 == 8 ? (bhy) bheVar.value_ : bhy.d).j());
                                break;
                            default:
                                throw new bdu("Value not set.", null);
                        }
                    }
                    return bhjVar.a();
                } catch (bjx e) {
                    throw e.a();
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof bja) {
                        throw ((bja) e2.getCause());
                    }
                    throw e2;
                }
            } catch (bja e3) {
                if (e3.a) {
                    throw new bja(e3);
                }
                throw e3;
            } catch (IOException e4) {
                if (e4.getCause() instanceof bja) {
                    throw ((bja) e4.getCause());
                }
                throw new bja(e4);
            }
        } catch (bja e5) {
            throw new bdu("Unable to parse preferences proto. Consider providing a CorruptionHandler to the DataStore factory to handle such scenarios.", e5);
        }
    }

    @Override // defpackage.bgh
    public final /* synthetic */ Object c(Object obj, OutputStream outputStream) throws IOException {
        bhe bheVar;
        Map mapC = ((bhj) obj).c();
        biq biqVarI = bhc.DEFAULT_INSTANCE.i();
        for (Map.Entry entry : mapC.entrySet()) {
            bhi bhiVar = (bhi) entry.getKey();
            Object value = entry.getValue();
            String str = bhiVar.a;
            if (value instanceof Boolean) {
                biq biqVarB = bhe.b();
                Boolean bool = (Boolean) value;
                bool.booleanValue();
                biqVarB.f();
                bhe bheVar2 = (bhe) biqVarB.b;
                bheVar2.valueCase_ = 1;
                bheVar2.value_ = bool;
                bis bisVarC = biqVarB.c();
                bisVarC.getClass();
                bheVar = (bhe) bisVarC;
            } else if (value instanceof Float) {
                biq biqVarB2 = bhe.b();
                float fFloatValue = ((Number) value).floatValue();
                biqVarB2.f();
                bhe bheVar3 = (bhe) biqVarB2.b;
                bheVar3.valueCase_ = 2;
                bheVar3.value_ = Float.valueOf(fFloatValue);
                bis bisVarC2 = biqVarB2.c();
                bisVarC2.getClass();
                bheVar = (bhe) bisVarC2;
            } else if (value instanceof Double) {
                biq biqVarB3 = bhe.b();
                double dDoubleValue = ((Number) value).doubleValue();
                biqVarB3.f();
                bhe bheVar4 = (bhe) biqVarB3.b;
                bheVar4.valueCase_ = 7;
                bheVar4.value_ = Double.valueOf(dDoubleValue);
                bis bisVarC3 = biqVarB3.c();
                bisVarC3.getClass();
                bheVar = (bhe) bisVarC3;
            } else if (value instanceof Integer) {
                biq biqVarB4 = bhe.b();
                int iIntValue = ((Number) value).intValue();
                biqVarB4.f();
                bhe bheVar5 = (bhe) biqVarB4.b;
                bheVar5.valueCase_ = 3;
                bheVar5.value_ = Integer.valueOf(iIntValue);
                bis bisVarC4 = biqVarB4.c();
                bisVarC4.getClass();
                bheVar = (bhe) bisVarC4;
            } else if (value instanceof Long) {
                biq biqVarB5 = bhe.b();
                long jLongValue = ((Number) value).longValue();
                biqVarB5.f();
                bhe bheVar6 = (bhe) biqVarB5.b;
                bheVar6.valueCase_ = 4;
                bheVar6.value_ = Long.valueOf(jLongValue);
                bis bisVarC5 = biqVarB5.c();
                bisVarC5.getClass();
                bheVar = (bhe) bisVarC5;
            } else if (value instanceof String) {
                biq biqVarB6 = bhe.b();
                String str2 = (String) value;
                biqVarB6.f();
                bhe bheVar7 = (bhe) biqVarB6.b;
                str2.getClass();
                bheVar7.valueCase_ = 5;
                bheVar7.value_ = str2;
                bis bisVarC6 = biqVarB6.c();
                bisVarC6.getClass();
                bheVar = (bhe) bisVarC6;
            } else if (value instanceof Set) {
                biq biqVarB7 = bhe.b();
                biq biqVarI2 = bhd.DEFAULT_INSTANCE.i();
                value.getClass();
                Set set = (Set) value;
                biqVarI2.f();
                bhd bhdVar = (bhd) biqVarI2.b;
                biw biwVar = bhdVar.strings_;
                if (!biwVar.c()) {
                    bhdVar.strings_ = biwVar.d(biwVar.size() << 1);
                }
                List list = bhdVar.strings_;
                byte[] bArr = bix.a;
                if (set instanceof bjd) {
                    List listA = ((bjd) set).a();
                    bjd bjdVar = (bjd) list;
                    int size = list.size();
                    for (Object obj2 : listA) {
                        if (obj2 == null) {
                            String str3 = "Element at index " + (bjdVar.size() - size) + " is null.";
                            int size2 = bjdVar.size();
                            while (true) {
                                size2--;
                                if (size2 < size) {
                                    throw new NullPointerException(str3);
                                }
                                bjdVar.remove(size2);
                            }
                        } else if (obj2 instanceof bhy) {
                            bjdVar.b();
                        } else if (obj2 instanceof byte[]) {
                            bhy.h((byte[]) obj2);
                            bjdVar.b();
                        } else {
                            bjdVar.add((String) obj2);
                        }
                    }
                } else if (set instanceof bjo) {
                    list.addAll(set);
                } else {
                    int size3 = set.size();
                    if (list instanceof ArrayList) {
                        ((ArrayList) list).ensureCapacity(list.size() + size3);
                    } else if (list instanceof bjq) {
                        bjq bjqVar = (bjq) list;
                        int size4 = list.size() + size3;
                        int length = bjqVar.b.length;
                        if (size4 > length) {
                            if (length == 0) {
                                bjqVar.b = new Object[Math.max(size4, 10)];
                            } else {
                                while (length < size4) {
                                    length = Math.max(((length * 3) / 2) + 1, 10);
                                }
                                bjqVar.b = Arrays.copyOf(bjqVar.b, length);
                            }
                        }
                    }
                    int size5 = list.size();
                    if ((set instanceof List) && (set instanceof RandomAccess)) {
                        List list2 = (List) set;
                        int size6 = list2.size();
                        for (int i = 0; i < size6; i++) {
                            Object obj3 = list2.get(i);
                            if (obj3 == null) {
                                rpi.C(list, size5);
                            }
                            list.add(obj3);
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (obj4 == null) {
                                rpi.C(list, size5);
                            }
                            list.add(obj4);
                        }
                    }
                }
                biqVarB7.f();
                bhe bheVar8 = (bhe) biqVarB7.b;
                bhd bhdVar2 = (bhd) biqVarI2.c();
                bhdVar2.getClass();
                bheVar8.value_ = bhdVar2;
                bheVar8.valueCase_ = 6;
                bis bisVarC7 = biqVarB7.c();
                bisVarC7.getClass();
                bheVar = (bhe) bisVarC7;
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(String.valueOf(value.getClass().getName())));
                }
                biq biqVarB8 = bhe.b();
                bhy bhyVarH = bhy.h((byte[]) value);
                biqVarB8.f();
                bhe bheVar9 = (bhe) biqVarB8.b;
                bhyVarH.getClass();
                bheVar9.valueCase_ = 8;
                bheVar9.value_ = bhyVarH;
                bis bisVarC8 = biqVarB8.c();
                bisVarC8.getClass();
                bheVar = (bhe) bisVarC8;
            }
            biqVarI.f();
            bhc bhcVar = (bhc) biqVarI.b;
            bjf bjfVar = bhcVar.preferences_;
            if (!bjfVar.b) {
                bhcVar.preferences_ = bjfVar.a();
            }
            bhcVar.preferences_.put(str, bheVar);
        }
        bhc bhcVar2 = (bhc) biqVarI.c();
        int iC = bhcVar2.c(null);
        if (iC > 4096) {
            iC = 4096;
        }
        big bigVar = new big(outputStream, iC);
        bhcVar2.r(bigVar);
        if (bigVar.a > 0) {
            bigVar.C();
        }
        return awmy.a;
    }
}
